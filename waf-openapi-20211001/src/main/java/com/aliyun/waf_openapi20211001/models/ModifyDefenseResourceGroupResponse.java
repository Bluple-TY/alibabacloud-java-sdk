// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDefenseResourceGroupResponseBody body;

    public static ModifyDefenseResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceGroupResponse self = new ModifyDefenseResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseResourceGroupResponse setBody(ModifyDefenseResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

}
