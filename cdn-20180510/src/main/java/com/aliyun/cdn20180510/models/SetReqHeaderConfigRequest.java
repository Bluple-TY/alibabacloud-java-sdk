// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqHeaderConfigRequest extends TeaModel {
    // The ID of the configuration.
    @NameInMap("ConfigId")
    public Long configId;

    // The accelerated domain names. You can specify one or more domain names and separate them with commas (,).
    @NameInMap("DomainName")
    public String domainName;

    // The parameter of the custom header.
    @NameInMap("Key")
    public String key;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The value of the custom parameter.
    @NameInMap("Value")
    public String value;

    public static SetReqHeaderConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetReqHeaderConfigRequest self = new SetReqHeaderConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetReqHeaderConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetReqHeaderConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetReqHeaderConfigRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetReqHeaderConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetReqHeaderConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetReqHeaderConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
