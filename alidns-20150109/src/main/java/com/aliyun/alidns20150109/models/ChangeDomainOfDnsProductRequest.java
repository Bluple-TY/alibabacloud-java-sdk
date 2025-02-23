// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NewDomain")
    public String newDomain;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ChangeDomainOfDnsProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductRequest self = new ChangeDomainOfDnsProductRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public ChangeDomainOfDnsProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeDomainOfDnsProductRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ChangeDomainOfDnsProductRequest setNewDomain(String newDomain) {
        this.newDomain = newDomain;
        return this;
    }
    public String getNewDomain() {
        return this.newDomain;
    }

    public ChangeDomainOfDnsProductRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
