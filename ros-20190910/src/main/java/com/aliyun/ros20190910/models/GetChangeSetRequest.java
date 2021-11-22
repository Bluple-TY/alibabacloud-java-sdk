// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetRequest extends TeaModel {
    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShowTemplate")
    public Boolean showTemplate;

    public static GetChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetRequest self = new GetChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeSetRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetChangeSetRequest setShowTemplate(Boolean showTemplate) {
        this.showTemplate = showTemplate;
        return this;
    }
    public Boolean getShowTemplate() {
        return this.showTemplate;
    }

}
