/*
 *Copyright 2020 Nokia
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
package org.onap.validation.cli.command.validate;

import org.onap.validation.yaml.error.YamlDocumentValidationError;

import java.util.Collections;
import java.util.List;

public class ResponseModel {

    private final String file;
    private final ResponseStatus status;
    private final List<YamlDocumentValidationError> errors;

    public ResponseModel(String file, ResponseStatus status, List<YamlDocumentValidationError> errors) {
        this.file = file;
        this.status = status;
        this.errors = errors;
    }

    public String getFile() {
        return file;
    }

    public List<YamlDocumentValidationError> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public enum ResponseStatus {
        PASS, FAILED
    }
}
