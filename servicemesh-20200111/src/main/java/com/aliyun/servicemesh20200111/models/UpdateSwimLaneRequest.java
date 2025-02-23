// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServicesList")
    public String servicesList;

    @NameInMap("SwimLaneName")
    public String swimLaneName;

    public static UpdateSwimLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneRequest self = new UpdateSwimLaneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateSwimLaneRequest setLabelSelectorKey(String labelSelectorKey) {
        this.labelSelectorKey = labelSelectorKey;
        return this;
    }
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    public UpdateSwimLaneRequest setLabelSelectorValue(String labelSelectorValue) {
        this.labelSelectorValue = labelSelectorValue;
        return this;
    }
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    public UpdateSwimLaneRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateSwimLaneRequest setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

    public UpdateSwimLaneRequest setSwimLaneName(String swimLaneName) {
        this.swimLaneName = swimLaneName;
        return this;
    }
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

}
