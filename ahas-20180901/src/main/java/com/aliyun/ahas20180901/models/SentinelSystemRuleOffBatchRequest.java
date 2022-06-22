// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleOffBatchRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelSystemRuleOffBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleOffBatchRequest self = new SentinelSystemRuleOffBatchRequest();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleOffBatchRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelSystemRuleOffBatchRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public SentinelSystemRuleOffBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelSystemRuleOffBatchRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
