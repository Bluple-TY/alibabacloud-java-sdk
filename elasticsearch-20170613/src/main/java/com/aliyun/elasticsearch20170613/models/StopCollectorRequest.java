// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopCollectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static StopCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCollectorRequest self = new StopCollectorRequest();
        return TeaModel.build(map, self);
    }

    public StopCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
