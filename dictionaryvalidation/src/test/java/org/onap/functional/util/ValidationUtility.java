/*
 * Copyright 2020 Nokia
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
 */

package org.onap.functional.util;

import com.google.gson.Gson;
import org.onap.cli.fw.output.OnapCommandResult;


import static org.assertj.core.api.Assertions.assertThat;


public final class ValidationUtility {

    private static final int NO_ERROR_CODE = 0;
    public static final int ERROR_CODE = 1;

    private ValidationUtility(){}

    public static final String OPERATION_STATUS_PASS = "PASS";
    public static final String OPERATION_STATUS_FAILED = "FAILED";

    public static <T> T getCliCommandValidationResult(OnapCliWrapper cli, Class<T> clazz) {
        final OnapCommandResult onapCommandResult = cli.getCommandResult();
        final String json = onapCommandResult.getOutput().toString();
        return new Gson().fromJson(json, clazz);
    }

    public static void verifyThatOperationFinishedWithoutAnyError(OnapCliWrapper cli) {
        assertThat(cli.getExitCode()).isEqualTo(NO_ERROR_CODE);
    }

    public static void verifyThatOperationFinishedWithError(OnapCliWrapper cli) {
        assertThat(cli.getExitCode()).isEqualTo(ERROR_CODE);
    }
}
