// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSnapshotsResponseBody body;

    public static ListSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponse self = new ListSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotsResponse setBody(ListSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotsResponseBody getBody() {
        return this.body;
    }

}
