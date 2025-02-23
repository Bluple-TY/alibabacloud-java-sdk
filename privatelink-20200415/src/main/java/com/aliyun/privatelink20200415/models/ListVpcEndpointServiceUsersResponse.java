// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointServiceUsersResponseBody body;

    public static ListVpcEndpointServiceUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceUsersResponse self = new ListVpcEndpointServiceUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointServiceUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcEndpointServiceUsersResponse setBody(ListVpcEndpointServiceUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointServiceUsersResponseBody getBody() {
        return this.body;
    }

}
