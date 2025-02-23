// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyEntitlementRequest extends TeaModel {
    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The usernames of users. You can specify up to 100 usernames.
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyEntitlementRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEntitlementRequest self = new ModifyEntitlementRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEntitlementRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyEntitlementRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ModifyEntitlementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
