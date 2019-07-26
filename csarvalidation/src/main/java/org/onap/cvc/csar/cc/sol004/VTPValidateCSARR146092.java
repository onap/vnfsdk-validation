/*
 * Copyright 2019 Nokia
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.onap.cvc.csar.cc.sol004;


import org.onap.cli.fw.schema.OnapCommandSchema;
import org.onap.cvc.csar.CSARArchive;
import org.onap.cvc.csar.PnfCSARError;
import org.onap.cvc.csar.PnfCSARError.PnfCSARErrorEntryMissing;
import org.onap.cvc.csar.cc.VTPValidateCSARBase;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@OnapCommandSchema(schema = "vtp-validate-csar-r146092.yaml")
public class VTPValidateCSARR146092 extends VTPValidateCSARBase {

    private static final int UNKNOWN_LINE_NUMBER = -1;
    private static final String SOURCE_ELEMENT_TAG = "Source";

    private static class MissingSourceElementUnderAttributeError extends PnfCSARError {
        private MissingSourceElementUnderAttributeError(String attributeName, String fileName) {
            super("0x2002",
                    String.format("Missing. Entry [%s under %s]", SOURCE_ELEMENT_TAG, attributeName),
                    UNKNOWN_LINE_NUMBER,
                    fileName);
        }
    }

    private static class InvalidPathToFileError extends PnfCSARError {
        private InvalidPathToFileError(String attributeName, String pathToSourceFile, String fileName) {
            super("0x2002",
                    String.format("Invalid. Entry [%s under %s has invalid '%s' path]", SOURCE_ELEMENT_TAG, attributeName, pathToSourceFile),
                    UNKNOWN_LINE_NUMBER,
                    fileName);
        }
    }

    @Override
    protected void validateCSAR(CSARArchive csar) {
        if(csar.getManifest().isNonManoAvailable()) {
            Optional<ValidateNonManoSection> validateNonManoSection = ValidateNonManoSection.getInstance(csar);
            if(validateNonManoSection.isPresent()) {
                List<CSARArchive.CSARError> csarErrors = validateNonManoSection.get().validate();
                this.errors.addAll(csarErrors);
            }
        }
    }


    private static class ValidateNonManoSection {
        private final CSARArchive csar;
        private final String fileName;
        private final Map<String, Map<String, List<String>>> nonMano;
        private final List<CSARArchive.CSARError> errors = new ArrayList<>();

        private ValidateNonManoSection(CSARArchive csar, String fileName, Map<String, Map<String, List<String>>> nonMano) {
            this.csar = csar;
            this.fileName = fileName;
            this.nonMano = nonMano;
        }

        static Optional<ValidateNonManoSection> getInstance(CSARArchive csar) {
            final File manifestMfFile = csar.getManifestMfFile();
            if(manifestMfFile == null){
                return Optional.empty();
            }
            final String fileName = manifestMfFile.getName();
            final Map<String, Map<String, List<String>>> nonMano = csar.getManifest().getNonMano();
            return Optional.of(new ValidateNonManoSection(csar, fileName,nonMano));
        }

        public List<CSARArchive.CSARError> validate() {

            List<String> attributeNames = Arrays.asList(
                    "onap_ves_events",
                    "onap_pm_dictionary",
                    "onap_yang_modules",
                    "onap_others"
            );

            for (String attributeName : attributeNames) {
                validateAttribute(attributeName);
            }

            return this.errors;
        }

        private void validateAttribute(String attributeName) {
            Set<String> nonManoAttributes = this.nonMano.keySet();
            if (!nonManoAttributes.contains(attributeName)) {
                this.errors.add(new PnfCSARErrorEntryMissing(
                        attributeName,
                        this.fileName,
                        UNKNOWN_LINE_NUMBER)
                );
            } else {
                validateSourceElementsUnderAttribute(attributeName);
            }
        }

        private void validateSourceElementsUnderAttribute(String attributeName) {

            Map<String, List<String>> attributeElements = this.nonMano.get(attributeName);
            Set<String> attributeElementNames = attributeElements.keySet();

            if (!attributeElementNames.contains(SOURCE_ELEMENT_TAG)) {
                this.errors.add(new MissingSourceElementUnderAttributeError(attributeName, this.fileName));
            } else {
                validateThatSourceFileExists(attributeName, attributeElements);
            }
        }

        private void validateThatSourceFileExists(String attributeName, Map<String, List<String>> attributeElements) {
            for (String pathToFile : attributeElements.get(SOURCE_ELEMENT_TAG)) {
                File fileFromCsar = this.csar.getFileFromCsar(pathToFile);
                if (!fileFromCsar.exists()) {
                    this.errors.add(
                            new InvalidPathToFileError(attributeName,
                                    pathToFile, this.fileName)
                    );
                }
            }
        }
    }

    @Override
    protected String getVnfReqsNo() {
        return "R146092";
    }


}
