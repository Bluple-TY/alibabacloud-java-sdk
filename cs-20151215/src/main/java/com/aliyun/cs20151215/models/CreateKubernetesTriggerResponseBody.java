// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerResponseBody extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("id")
    public String id;

    @NameInMap("project_id")
    public String projectId;

    @NameInMap("type")
    public String type;

    public static CreateKubernetesTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerResponseBody self = new CreateKubernetesTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKubernetesTriggerResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateKubernetesTriggerResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateKubernetesTriggerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateKubernetesTriggerResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateKubernetesTriggerResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
