// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteHubClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHubClusterResponseBody self = new DeleteHubClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHubClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHubClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHubClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
