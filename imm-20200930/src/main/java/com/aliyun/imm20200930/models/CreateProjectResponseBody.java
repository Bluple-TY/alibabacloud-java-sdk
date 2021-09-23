// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    // 本次请求的唯一 ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Project")
    public Project project;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponseBody setProject(Project project) {
        this.project = project;
        return this;
    }
    public Project getProject() {
        return this.project;
    }

}
