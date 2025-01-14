// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetHistogramsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<GetHistogramsResponseBody> body;

    public static GetHistogramsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsResponse self = new GetHistogramsResponse();
        return TeaModel.build(map, self);
    }

    public GetHistogramsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistogramsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistogramsResponse setBody(java.util.List<GetHistogramsResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<GetHistogramsResponseBody> getBody() {
        return this.body;
    }

    public static class GetHistogramsResponseBody extends TeaModel {
        @NameInMap("from")
        public Long from;

        @NameInMap("to")
        public Long to;

        @NameInMap("count")
        public Long count;

        @NameInMap("progress")
        public String progress;

        public static GetHistogramsResponseBody build(java.util.Map<String, ?> map) throws Exception {
            GetHistogramsResponseBody self = new GetHistogramsResponseBody();
            return TeaModel.build(map, self);
        }

        public GetHistogramsResponseBody setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public GetHistogramsResponseBody setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

        public GetHistogramsResponseBody setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetHistogramsResponseBody setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
