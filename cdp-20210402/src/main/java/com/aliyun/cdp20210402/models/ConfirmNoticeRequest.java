// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ConfirmNoticeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfirmNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNoticeRequest self = new ConfirmNoticeRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmNoticeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
