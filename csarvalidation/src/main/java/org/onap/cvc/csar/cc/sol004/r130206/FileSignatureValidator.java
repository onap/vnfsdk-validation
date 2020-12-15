package org.onap.cvc.csar.cc.sol004.r130206;

import org.onap.cvc.csar.parser.ManifestFileModel;
import org.onap.cvc.csar.parser.ManifestFileSplitter;
import org.onap.cvc.csar.security.CmsSignatureData;
import org.onap.cvc.csar.security.CmsSignatureDataFactory;
import org.onap.cvc.csar.security.CmsSignatureLoadingException;
import org.onap.cvc.csar.security.CmsSignatureValidator;
import org.onap.cvc.csar.security.CmsSignatureValidatorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FileSignatureValidator {

    private static final Logger LOG = LoggerFactory.getLogger(FileSignatureValidator.class);

    private final ManifestFileSplitter manifestFileSplitter = new ManifestFileSplitter();
    private final CmsSignatureValidator cmsSignatureValidator = new CmsSignatureValidator();
    private final CmsSignatureDataFactory cmsSignatureDataFactory = new CmsSignatureDataFactory();

    CmsSignatureData createSignatureDataForManifestFile(File manifestFile) throws CmsSignatureLoadingException {
        ManifestFileModel mf = manifestFileSplitter.split(manifestFile);
        return cmsSignatureDataFactory.createForFirstSigner(
            toBytes(mf.getCMS(), mf.getNewLine()),
            toBytes(mf.getData(), mf.getNewLine())
        );
    }

    CmsSignatureData createSignatureData(Path filePath, Path cmsFilePath, Path certFilePath) throws CmsSignatureLoadingException, IOException {
        CmsSignatureData signatureData = cmsSignatureDataFactory.createForFirstSigner(
            Files.readAllBytes(cmsFilePath),
            Files.readAllBytes(filePath)
        );
        signatureData.loadCertificate(certFilePath);
        return signatureData;
    }

    boolean isValid(CmsSignatureData signatureData) {
        try {
            return cmsSignatureValidator.verifySignedData(signatureData);
        } catch (CmsSignatureValidatorException e) {
            LOG.error("Unable to verify signed data!", e);
            return false;
        }
    }

    private byte[] toBytes(List<String> data, String newLine) {
        final String updatedData = data.stream().map(it -> it + newLine).collect(Collectors.joining());
        return updatedData.getBytes(Charset.defaultCharset());
    }

}
