// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterRequest self = new DeleteClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
