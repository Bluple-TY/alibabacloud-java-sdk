// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CloneExperimentRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Args")
    public String args;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static CloneExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentRequest self = new CloneExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CloneExperimentRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CloneExperimentRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public CloneExperimentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CloneExperimentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
