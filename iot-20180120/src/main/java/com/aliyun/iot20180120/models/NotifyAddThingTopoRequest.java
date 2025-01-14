// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoRequest extends TeaModel {
    @NameInMap("DeviceListStr")
    public String deviceListStr;

    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    @NameInMap("GwIotId")
    public String gwIotId;

    @NameInMap("GwProductKey")
    public String gwProductKey;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static NotifyAddThingTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoRequest self = new NotifyAddThingTopoRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoRequest setDeviceListStr(String deviceListStr) {
        this.deviceListStr = deviceListStr;
        return this;
    }
    public String getDeviceListStr() {
        return this.deviceListStr;
    }

    public NotifyAddThingTopoRequest setGwDeviceName(String gwDeviceName) {
        this.gwDeviceName = gwDeviceName;
        return this;
    }
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    public NotifyAddThingTopoRequest setGwIotId(String gwIotId) {
        this.gwIotId = gwIotId;
        return this;
    }
    public String getGwIotId() {
        return this.gwIotId;
    }

    public NotifyAddThingTopoRequest setGwProductKey(String gwProductKey) {
        this.gwProductKey = gwProductKey;
        return this;
    }
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    public NotifyAddThingTopoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
