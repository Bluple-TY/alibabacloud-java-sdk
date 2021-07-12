// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateServiceEntryAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceEntryAttributeResponseBody body;

    public static UpdateServiceEntryAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEntryAttributeResponse self = new UpdateServiceEntryAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEntryAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceEntryAttributeResponse setBody(UpdateServiceEntryAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceEntryAttributeResponseBody getBody() {
        return this.body;
    }

}
