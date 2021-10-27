// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveRoomResponseBody body;

    public static DeleteLiveRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRoomResponse self = new DeleteLiveRoomResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRoomResponse setBody(DeleteLiveRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRoomResponseBody getBody() {
        return this.body;
    }

}
