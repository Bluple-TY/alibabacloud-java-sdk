// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ModifyWirelessCloudConnectorFeatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWirelessCloudConnectorFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWirelessCloudConnectorFeatureResponseBody self = new ModifyWirelessCloudConnectorFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWirelessCloudConnectorFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
