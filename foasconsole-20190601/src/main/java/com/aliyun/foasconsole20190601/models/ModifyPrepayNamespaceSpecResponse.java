// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPrepayNamespaceSpecResponseBody body;

    public static ModifyPrepayNamespaceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecResponse self = new ModifyPrepayNamespaceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrepayNamespaceSpecResponse setBody(ModifyPrepayNamespaceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrepayNamespaceSpecResponseBody getBody() {
        return this.body;
    }

}
