// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHCertificateWithExtensionResponseBody extends TeaModel {
    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("CertificateChain")
    public String certificateChain;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWHCertificateWithExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWHCertificateWithExtensionResponseBody self = new CreateWHCertificateWithExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWHCertificateWithExtensionResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateWHCertificateWithExtensionResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateWHCertificateWithExtensionResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateWHCertificateWithExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
