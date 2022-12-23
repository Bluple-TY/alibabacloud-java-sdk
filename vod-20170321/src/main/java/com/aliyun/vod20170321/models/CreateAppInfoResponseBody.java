// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoResponseBody extends TeaModel {
    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoResponseBody self = new CreateAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppInfoResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
