// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    public static DeleteDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRequest self = new DeleteDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
