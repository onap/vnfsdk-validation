/*
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

package org.onap.cvc.csar.cc.sol001;

import org.onap.cli.fw.schema.OnapCommandSchema;
import org.onap.cvc.csar.CSARArchive;
import org.onap.cvc.csar.cc.VTPValidateCSARBase;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.util.Map;

@OnapCommandSchema(schema = "vtp-validate-csar-r54356.yaml")
public class VTPValidateCSARR54356 extends VTPValidateCSARBase {
    private static final String SET_CODE = "0x1000";
    public static class CSARErrorEntryMissingDefinitionYamldatatypesL3AddressData extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesL3AddressData(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesAddressData extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesAddressData(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVirtualNetworkInterfaceRequirements extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVirtualNetworkInterfaceRequirements(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesConnectivityType extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesConnectivityType(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesRequestedAdditionalCapability extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesRequestedAdditionalCapability(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVirtualMemory extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVirtualMemory(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVirtualCpu extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVirtualCpu(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVirtualCpuPinning extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVirtualCpuPinning(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVnfcConfigurableProperties extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVnfcConfigurableProperties(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVduProfile extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVduProfile(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVlProfile extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVlProfile(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesInstantiationLevel extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesInstantiationLevel(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVduLevel extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVduLevel(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesScaleInfo extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesScaleInfo(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesinjectFile extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesinjectFile(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesScalingAspect extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesScalingAspect(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesLinkBitRateRequirements extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesLinkBitRateRequirements(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesQos extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesQos(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesCpProtocolData extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesCpProtocolData(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVnfConfigurableProperties extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVnfConfigurableProperties(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVnfAdditionalConfigurableProperties extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVnfAdditionalConfigurableProperties(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributes extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributes(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributesExtensions extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributesExtensions(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    public static class CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributesMetadata extends CSARArchive.CSARErrorEntryMissing {
        public CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributesMetadata(String defYaml, String entry) {
            super(entry, defYaml);
            this.setCode( SET_CODE);
        }
    }

    @Override
    protected void validateCSAR(CSARArchive csar) throws Exception {
        try (FileInputStream ipStream = new FileInputStream(csar.getDefinitionYamlFile())) {
            Map<String, ?> yaml = (Map<String, ?>) new Yaml().load(ipStream);
            yaml = (Map<String, ?>) yaml.get("topology_template");
            Map<String, ?> nodeTmpls = (Map<String, ?>) yaml.get("node_templates");

            boolean []vlExist = new boolean[30];

            for (Object nodeO : nodeTmpls.values()) {
                Map<String, ?> node = (Map<String, ?>) nodeO;
                if (node.containsKey("type")) {
                    String type = (String) node.get("type");
                    if ("tosca.datatypes.nfv.L3AddressData".equalsIgnoreCase(type)) {
                        vlExist[0] = true;

                    }

                    if ("tosca.datatypes.nfv.AddressData".equalsIgnoreCase(type)) {
                        vlExist[1] = true;

                    }

                    if ("tosca.datatypes.nfv.VirtualNetworkInterfaceRequirements".equalsIgnoreCase(type)) {
                        vlExist[2] = true;

                    }

                    if ("tosca.datatypes.nfv.ConnectivityType".equalsIgnoreCase(type)) {
                        vlExist[3] = true;

                    }

                    if ("tosca.datatypes.nfv.RequestedAdditionalCapability".equalsIgnoreCase(type)) {
                        vlExist[4] = true;

                    }

                    if ("tosca.datatypes.nfv.VirtualMemory".equalsIgnoreCase(type)) {
                        vlExist[5] = true;

                    }

                    if ("tosca.datatypes.nfv.VirtualCpu".equalsIgnoreCase(type)) {
                        vlExist[6] = true;

                    }

                    if ("tosca.datatypes.nfv.VirtualCpuPinning".equalsIgnoreCase(type)) {
                        vlExist[7] = true;

                    }

                    if ("tosca.datatypes.nfv.VnfcConfigurableProperties".equalsIgnoreCase(type)) {
                        vlExist[8] = true;

                    }

                    if ("tosca.datatypes.nfv.VduProfile".equalsIgnoreCase(type)) {
                        vlExist[9] = true;

                    }

                    if ("tosca.datatypes.nfv.VlProfile".equalsIgnoreCase(type)) {
                        vlExist[10] = true;

                    }

                    if ("tosca.datatypes.nfv.InstantiationLevel".equalsIgnoreCase(type)) {
                        vlExist[11] = true;

                    }

                    if ("tosca.datatypes.nfv.VduLevel".equalsIgnoreCase(type)) {
                        vlExist[12] = true;

                    }
                    if ("tosca.datatypes.nfv.ScaleInfo".equalsIgnoreCase(type)) {
                        vlExist[13] = true;

                    }
                    if ("tosca.datatypes.nfv.injectFile".equalsIgnoreCase(type)) {
                        vlExist[14] = true;

                    }

                    if ("tosca.datatypes.nfv.ScalingAspect".equalsIgnoreCase(type)) {
                        vlExist[15] = true;

                    }

                    if ("tosca.datatypes.nfv.LinkBitRateRequirements".equalsIgnoreCase(type)) {
                        vlExist[16] = true;

                    }

                    if ("tosca.datatypes.nfv.Qos".equalsIgnoreCase(type)) {
                        vlExist[17] = true;

                    }

                    if ("tosca.datatypes.nfv.CpProtocolData".equalsIgnoreCase(type)) {
                        vlExist[18] = true;

                    }

                    if ("tosca.datatypes.nfv.VnfConfigurableProperties".equalsIgnoreCase(type)) {
                        vlExist[19] = true;

                    }

                    if ("tosca.datatypes.nfv.VnfAdditionalConfigurableProperties".equalsIgnoreCase(type)) {
                        vlExist[20] = true;

                    }

                    if ("tosca.datatypes.nfv.VnfInfoModifiableAttributes".equalsIgnoreCase(type)) {
                        vlExist[21] = true;

                    }

                    if ("tosca.datatypes.nfv.VnfInfoModifiableAttributesExtensions".equalsIgnoreCase(type)) {
                        vlExist[22] = true;

                    }
                    if ("tosca.datatypes.nfv.VnfInfoModifiableAttributesMetadata".equalsIgnoreCase(type)) {
                        vlExist[23] = true;

                    }

                }
            }

            if (!vlExist[0])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesL3AddressData(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes L3AddressData"));


            if (!vlExist[1])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesAddressData(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes AddressData"));

            if (!vlExist[2])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVirtualNetworkInterfaceRequirements(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VirtualNetworkInterfaceRequirements"));

            if (!vlExist[3])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesConnectivityType(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes ConnectivityType"));

            if (!vlExist[4])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesRequestedAdditionalCapability(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes RequestedAdditionalCapability"));

            if (!vlExist[5])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVirtualMemory(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VirtualMemory"));

            if (!vlExist[6])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVirtualCpu(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VirtualCpu"));

            if (!vlExist[7])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVirtualCpuPinning(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VirtualCpuPinning"));

            if (!vlExist[8])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVnfcConfigurableProperties(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VnfcConfigurableProperties"));

            if (!vlExist[9])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVduProfile(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VduProfile"));

            if (!vlExist[10])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVlProfile(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VlProfile"));

            if (!vlExist[11])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesInstantiationLevel(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes InstantiationLevel"));

            if (!vlExist[12])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVduLevel(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VduLevel"));

            if (!vlExist[13])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesScaleInfo(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes ScaleInfo"));

            if (!vlExist[14])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesinjectFile(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes injectFile"));

            if (!vlExist[15])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesScalingAspect(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes ScalingAspect"));

            if (!vlExist[16])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesLinkBitRateRequirements(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes LinkBitRateRequirements"));

            if (!vlExist[17])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesQos(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes Qos"));

            if (!vlExist[18])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesCpProtocolData(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes CpProtocolData"));

            if (!vlExist[19])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVnfConfigurableProperties(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VnfConfigurableProperties"));

            if (!vlExist[20])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVnfAdditionalConfigurableProperties(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VnfAdditionalConfigurableProperties"));

            if (!vlExist[21])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributes(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VnfInfoModifiableAttributes"));

            if (!vlExist[22])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributesExtensions(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VnfInfoModifiableAttributesExtensions"));

            if (!vlExist[23])
                this.errors.add(new CSARErrorEntryMissingDefinitionYamldatatypesVnfInfoModifiableAttributesMetadata(
                        csar.getDefinitionYamlFile().getName(),
                        "datatypes VnfInfoModifiableAttributesMetadata"));
        }
    }

    @Override
    protected String getVnfReqsNo() {
        return "R54356";
    }

}
