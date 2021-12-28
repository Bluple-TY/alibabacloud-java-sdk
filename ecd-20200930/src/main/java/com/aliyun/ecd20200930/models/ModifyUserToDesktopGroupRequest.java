// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyUserToDesktopGroupRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("NewEndUserIds")
    public java.util.List<String> newEndUserIds;

    @NameInMap("OldEndUserIds")
    public java.util.List<String> oldEndUserIds;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyUserToDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserToDesktopGroupRequest self = new ModifyUserToDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserToDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public ModifyUserToDesktopGroupRequest setNewEndUserIds(java.util.List<String> newEndUserIds) {
        this.newEndUserIds = newEndUserIds;
        return this;
    }
    public java.util.List<String> getNewEndUserIds() {
        return this.newEndUserIds;
    }

    public ModifyUserToDesktopGroupRequest setOldEndUserIds(java.util.List<String> oldEndUserIds) {
        this.oldEndUserIds = oldEndUserIds;
        return this;
    }
    public java.util.List<String> getOldEndUserIds() {
        return this.oldEndUserIds;
    }

    public ModifyUserToDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
