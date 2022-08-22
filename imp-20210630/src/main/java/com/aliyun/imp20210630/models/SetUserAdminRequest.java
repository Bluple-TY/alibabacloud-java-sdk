// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SetUserAdminRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static SetUserAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserAdminRequest self = new SetUserAdminRequest();
        return TeaModel.build(map, self);
    }

    public SetUserAdminRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetUserAdminRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SetUserAdminRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
