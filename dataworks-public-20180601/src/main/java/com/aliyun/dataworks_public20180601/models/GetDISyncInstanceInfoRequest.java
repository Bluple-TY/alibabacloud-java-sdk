// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetDISyncInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoRequest self = new GetDISyncInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetDISyncInstanceInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
