// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteLogstashRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("deleteType")
    public String deleteType;

    public static DeleteLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogstashRequest self = new DeleteLogstashRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteLogstashRequest setDeleteType(String deleteType) {
        this.deleteType = deleteType;
        return this;
    }
    public String getDeleteType() {
        return this.deleteType;
    }

}
