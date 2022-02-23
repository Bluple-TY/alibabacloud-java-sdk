// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoResponse extends TeaModel {
    @NameInMap("BeginDay")
    @Validation(required = true)
    public String beginDay;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    @NameInMap("DeviceId")
    @Validation(required = true)
    public String deviceId;

    @NameInMap("ExpiredDay")
    @Validation(required = true)
    public String expiredDay;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserDeviceId")
    @Validation(required = true)
    public String userDeviceId;

    public static ModifyDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoResponse self = new ModifyDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceInfoResponse setBeginDay(String beginDay) {
        this.beginDay = beginDay;
        return this;
    }
    public String getBeginDay() {
        return this.beginDay;
    }

    public ModifyDeviceInfoResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ModifyDeviceInfoResponse setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ModifyDeviceInfoResponse setExpiredDay(String expiredDay) {
        this.expiredDay = expiredDay;
        return this;
    }
    public String getExpiredDay() {
        return this.expiredDay;
    }

    public ModifyDeviceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDeviceInfoResponse setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
