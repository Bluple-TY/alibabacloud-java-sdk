// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Line")
    public String line;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("RR")
    public String RR;

    @NameInMap("TTL")
    public Long TTL;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Value")
    public String value;

    public static AddDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordRequest self = new AddDomainRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDomainRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public AddDomainRecordRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public AddDomainRecordRequest setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public AddDomainRecordRequest setTTL(Long TTL) {
        this.TTL = TTL;
        return this;
    }
    public Long getTTL() {
        return this.TTL;
    }

    public AddDomainRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddDomainRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public AddDomainRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
