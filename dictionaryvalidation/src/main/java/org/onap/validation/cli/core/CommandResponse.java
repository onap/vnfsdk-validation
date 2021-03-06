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
package org.onap.validation.cli.core;

public class CommandResponse<T> {

    private final T result;
    private final CommandStatus commandStatus;

    public CommandResponse(T result, CommandStatus commandStatus) {
        this.result = result;
        this.commandStatus = commandStatus;
    }

    public T getResult() {
        return result;
    }

    public CommandStatus getCommandStatus() {
        return commandStatus;
    }

    public enum CommandStatus {
        PASS, FAILED
    }

    @Override
    public String toString() {
        return "CommandResponse{" +
                "result=" + result +
                ", commandStatus=" + commandStatus +
                '}';
    }
}
