// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceDesiredPropertyRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Items")
    @Validation(required = true)
    public String items;

    @NameInMap("Versions")
    @Validation(required = true)
    public String versions;

    public static SetDeviceDesiredPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceDesiredPropertyRequest self = new SetDeviceDesiredPropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceDesiredPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDeviceDesiredPropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDeviceDesiredPropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SetDeviceDesiredPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SetDeviceDesiredPropertyRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public SetDeviceDesiredPropertyRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
