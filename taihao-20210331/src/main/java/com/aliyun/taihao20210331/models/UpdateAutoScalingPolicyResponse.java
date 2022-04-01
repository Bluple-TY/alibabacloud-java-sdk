// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoScalingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BooleanResponse body;

    public static UpdateAutoScalingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScalingPolicyResponse self = new UpdateAutoScalingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScalingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoScalingPolicyResponse setBody(BooleanResponse body) {
        this.body = body;
        return this;
    }
    public BooleanResponse getBody() {
        return this.body;
    }

}
