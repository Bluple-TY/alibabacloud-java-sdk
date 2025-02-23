// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebootDesktopsRequest extends TeaModel {
    // The IDs of the cloud desktops. You can specify 1 to 100 cloud desktop IDs.
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static RebootDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsRequest self = new RebootDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RebootDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
