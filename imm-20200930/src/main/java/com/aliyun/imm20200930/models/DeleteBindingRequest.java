// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteBindingRequest extends TeaModel {
    @NameInMap("Cleanup")
    public Boolean cleanup;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("URI")
    public String URI;

    public static DeleteBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingRequest self = new DeleteBindingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBindingRequest setCleanup(Boolean cleanup) {
        this.cleanup = cleanup;
        return this;
    }
    public Boolean getCleanup() {
        return this.cleanup;
    }

    public DeleteBindingRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DeleteBindingRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteBindingRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
