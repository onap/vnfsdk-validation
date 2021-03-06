/*
 * Copyright 2021 Nokia
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
package org.onap.cvc.csar.oclip;

import org.onap.cli.fw.cmd.OnapCommand;
import org.onap.cli.fw.error.OnapCommandException;
import org.onap.cvc.csar.CSARArchive;

import java.util.List;

public class Command {
    private final OnapCommand cmd;

    public Command(OnapCommand cmd) {
        this.cmd = cmd;
    }

    public List<CSARArchive.CSARError> run() throws OnapCommandException {
        cmd.execute();
        return (List<CSARArchive.CSARError>) cmd.getResult().getOutput();
    }

    public String getDescription() {
        return cmd.getDescription();
    }

    public String getRelease(){
        return cmd.getInfo().getMetadata().getOrDefault("release","unknown");
    }
}
