// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateHumanAnimeStyleVideoResponseBody body;

    public static GenerateHumanAnimeStyleVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleVideoResponse self = new GenerateHumanAnimeStyleVideoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateHumanAnimeStyleVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateHumanAnimeStyleVideoResponse setBody(GenerateHumanAnimeStyleVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateHumanAnimeStyleVideoResponseBody getBody() {
        return this.body;
    }

}
