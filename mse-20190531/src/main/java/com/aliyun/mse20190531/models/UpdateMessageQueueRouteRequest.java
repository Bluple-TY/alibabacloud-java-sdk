// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMessageQueueRouteRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // Specifies whether the canary release for messaging feature is enabled for the application. Valid values:
    // 
    // *   `true`: enabled
    // *   `false`: disabled
    @NameInMap("Enable")
    public Boolean enable;

    // The side for message filtering when the canary release for messaging feature is enabled.
    @NameInMap("FilterSide")
    public String filterSide;

    // The region ID.
    @NameInMap("Region")
    public String region;

    // The tag that is negligible for the untagged environment of the application.
    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static UpdateMessageQueueRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageQueueRouteRequest self = new UpdateMessageQueueRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageQueueRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateMessageQueueRouteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageQueueRouteRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateMessageQueueRouteRequest setFilterSide(String filterSide) {
        this.filterSide = filterSide;
        return this;
    }
    public String getFilterSide() {
        return this.filterSide;
    }

    public UpdateMessageQueueRouteRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMessageQueueRouteRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
