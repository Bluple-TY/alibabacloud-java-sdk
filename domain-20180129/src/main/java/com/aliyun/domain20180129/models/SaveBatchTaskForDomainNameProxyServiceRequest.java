// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForDomainNameProxyServiceRequest extends TeaModel {
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForDomainNameProxyServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForDomainNameProxyServiceRequest self = new SaveBatchTaskForDomainNameProxyServiceRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForDomainNameProxyServiceRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForDomainNameProxyServiceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForDomainNameProxyServiceRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public SaveBatchTaskForDomainNameProxyServiceRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
