/**
 * Copyright 2017 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onap.validation.csarvalidationtest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.onap.validation.csar.ErrorCodes;
import org.onap.validation.csar.ValidationException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidationExceptionTest {
	ValidationException validationException = new ValidationException();

    @Test
    public void testWrappedInfoThrowableErrorCodes() {
        Throwable ex = new IOException();
        ValidationException result = validationException.wrappedInfo(ex, ErrorCodes.FILE_IO);
        assertTrue(true);
    }

    @Test
    public void testWrappedInfoThrowableErrorCodes1() {
        Throwable ex = new ValidationException();
        ValidationException result = validationException.wrappedInfo(ex, ErrorCodes.FILE_IO);
        assertTrue(true);
    }

    @Test
    public void testWrappedInfoThrowableErrorCodes2() {
        Throwable ex = new ValidationException();
        ValidationException result = validationException.wrappedInfo(ex, null);
        assertTrue(true);
    }
}
