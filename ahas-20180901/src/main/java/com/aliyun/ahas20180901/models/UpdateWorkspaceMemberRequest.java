// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceMemberRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Args")
    public String args;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static UpdateWorkspaceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceMemberRequest self = new UpdateWorkspaceMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceMemberRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateWorkspaceMemberRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public UpdateWorkspaceMemberRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateWorkspaceMemberRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}