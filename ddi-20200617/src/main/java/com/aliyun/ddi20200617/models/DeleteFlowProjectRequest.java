// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteFlowProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectRequest self = new DeleteFlowProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteFlowProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
