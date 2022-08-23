// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApRadioConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveApRadioConfigResponseBody body;

    public static SaveApRadioConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApRadioConfigResponse self = new SaveApRadioConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApRadioConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApRadioConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveApRadioConfigResponse setBody(SaveApRadioConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApRadioConfigResponseBody getBody() {
        return this.body;
    }

}
