// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteServiceEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceEntryResponseBody body;

    public static DeleteServiceEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceEntryResponse self = new DeleteServiceEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceEntryResponse setBody(DeleteServiceEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceEntryResponseBody getBody() {
        return this.body;
    }

}
