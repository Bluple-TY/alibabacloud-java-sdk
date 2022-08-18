// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductComponentVersionRequest extends TeaModel {
    @NameInMap("componentOrchestrationValues")
    public String componentOrchestrationValues;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("newComponentVersionUID")
    public String newComponentVersionUID;

    @NameInMap("releaseName")
    public String releaseName;

    public static UpdateProductComponentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentVersionRequest self = new UpdateProductComponentVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentVersionRequest setComponentOrchestrationValues(String componentOrchestrationValues) {
        this.componentOrchestrationValues = componentOrchestrationValues;
        return this;
    }
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    public UpdateProductComponentVersionRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateProductComponentVersionRequest setNewComponentVersionUID(String newComponentVersionUID) {
        this.newComponentVersionUID = newComponentVersionUID;
        return this;
    }
    public String getNewComponentVersionUID() {
        return this.newComponentVersionUID;
    }

    public UpdateProductComponentVersionRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
