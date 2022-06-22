// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceLatestExceptionsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    public static ResourceLatestExceptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResourceLatestExceptionsRequest self = new ResourceLatestExceptionsRequest();
        return TeaModel.build(map, self);
    }

    public ResourceLatestExceptionsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ResourceLatestExceptionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ResourceLatestExceptionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResourceLatestExceptionsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ResourceLatestExceptionsRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
