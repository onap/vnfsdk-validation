/*
 * Copyright 2020 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.onap.validation.yaml;

import org.onap.validation.yaml.error.SchemaValidationError;
import org.onap.validation.yaml.error.YamlDocumentValidationError;
import org.onap.validation.yaml.exception.YamlProcessingException;
import org.onap.validation.yaml.model.YamlDocument;
import org.onap.validation.yaml.model.YamlDocumentFactory;
import org.onap.validation.yaml.schema.YamlSchema;
import org.onap.validation.yaml.schema.YamlSchemaFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class YamlContentValidator {

    private static final int FIRST_DOCUMENT_INDEX = 1;
    private static final YamlLoader YAML_LOADER = new YamlLoader(new YamlDocumentFactory());

    public List<YamlDocumentValidationError> validate(String pathToFile)
            throws YamlProcessingException {
        List<YamlDocument> documents = YAML_LOADER.loadMultiDocumentYamlFile(pathToFile);
        return getYamlDocumentValidationErrors(documents);
    }

    public List<YamlDocumentValidationError> validate(byte[] yamlWithSchema)
            throws YamlProcessingException {
        List<YamlDocument> documents = YAML_LOADER.loadMultiDocumentYaml(yamlWithSchema);
        return getYamlDocumentValidationErrors(documents);
    }

    private List<YamlDocumentValidationError> getYamlDocumentValidationErrors(List<YamlDocument> documents) throws YamlProcessingException {
        if (documents.isEmpty()) {
            throw new YamlProcessingException("Dictionary YAML file is empty");
        } else {
            return validateDocuments(documents);
        }
    }

    private List<YamlDocumentValidationError> validateDocuments(List<YamlDocument> documents)
            throws YamlProcessingException {

        List<YamlDocumentValidationError> yamlFileValidationErrors = new ArrayList<>();
        YamlSchema schema = extractSchema(documents);
        YamlValidator validator = new YamlValidator(schema);

        for (int index = FIRST_DOCUMENT_INDEX; index < documents.size(); index++) {
            List<SchemaValidationError> validationErrors = validator.validate(documents.get(index));
            yamlFileValidationErrors.addAll(transformErrors(index, validationErrors));
        }

        return yamlFileValidationErrors;
    }

    private List<YamlDocumentValidationError> transformErrors(int index, List<SchemaValidationError> validationErrors) {
        return validationErrors
                .stream()
                .map(error -> new YamlDocumentValidationError(index, error.getPath(), error.getMessage()))
                .collect(Collectors.toList());
    }

    private YamlSchema extractSchema(List<YamlDocument> documents) throws YamlProcessingException {
        return new YamlSchemaFactory().createTreeStructuredYamlSchema(documents.get(0));
    }

}
