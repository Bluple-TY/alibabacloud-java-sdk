// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class JudgeXingTianBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JudgeXingTianBusinessResponseBody body;

    public static JudgeXingTianBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeXingTianBusinessResponse self = new JudgeXingTianBusinessResponse();
        return TeaModel.build(map, self);
    }

    public JudgeXingTianBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JudgeXingTianBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JudgeXingTianBusinessResponse setBody(JudgeXingTianBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public JudgeXingTianBusinessResponseBody getBody() {
        return this.body;
    }

}
