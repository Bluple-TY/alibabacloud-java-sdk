// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartCollectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static StartCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCollectorRequest self = new StartCollectorRequest();
        return TeaModel.build(map, self);
    }

    public StartCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
