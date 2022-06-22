// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleDeleteRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelDegradeRuleDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleDeleteRequest self = new SentinelDegradeRuleDeleteRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleDeleteRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDegradeRuleDeleteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelDegradeRuleDeleteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
