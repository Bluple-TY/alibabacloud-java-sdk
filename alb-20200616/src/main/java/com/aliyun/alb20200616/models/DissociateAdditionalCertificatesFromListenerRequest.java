// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerRequest extends TeaModel {
    @NameInMap("Certificates")
    public java.util.List<DissociateAdditionalCertificatesFromListenerRequestCertificates> certificates;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ListenerId")
    public String listenerId;

    public static DissociateAdditionalCertificatesFromListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerRequest self = new DissociateAdditionalCertificatesFromListenerRequest();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerRequest setCertificates(java.util.List<DissociateAdditionalCertificatesFromListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<DissociateAdditionalCertificatesFromListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public static class DissociateAdditionalCertificatesFromListenerRequestCertificates extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        public static DissociateAdditionalCertificatesFromListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            DissociateAdditionalCertificatesFromListenerRequestCertificates self = new DissociateAdditionalCertificatesFromListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public DissociateAdditionalCertificatesFromListenerRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

}
