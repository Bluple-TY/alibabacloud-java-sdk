// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosPolicyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody body;

    public static UpdateCenInterRegionTrafficQosPolicyAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCenInterRegionTrafficQosPolicyAttributeResponse self = new UpdateCenInterRegionTrafficQosPolicyAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse setBody(UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody getBody() {
        return this.body;
    }

}
