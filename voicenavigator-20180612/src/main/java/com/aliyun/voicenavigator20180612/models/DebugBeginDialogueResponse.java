// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugBeginDialogueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DebugBeginDialogueResponseBody body;

    public static DebugBeginDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugBeginDialogueResponse self = new DebugBeginDialogueResponse();
        return TeaModel.build(map, self);
    }

    public DebugBeginDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugBeginDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DebugBeginDialogueResponse setBody(DebugBeginDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugBeginDialogueResponseBody getBody() {
        return this.body;
    }

}
