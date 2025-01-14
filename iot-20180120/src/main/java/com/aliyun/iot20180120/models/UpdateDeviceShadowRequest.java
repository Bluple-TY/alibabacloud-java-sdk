// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceShadowRequest extends TeaModel {
    @NameInMap("DeltaUpdate")
    public Boolean deltaUpdate;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ShadowMessage")
    public String shadowMessage;

    public static UpdateDeviceShadowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceShadowRequest self = new UpdateDeviceShadowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceShadowRequest setDeltaUpdate(Boolean deltaUpdate) {
        this.deltaUpdate = deltaUpdate;
        return this;
    }
    public Boolean getDeltaUpdate() {
        return this.deltaUpdate;
    }

    public UpdateDeviceShadowRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateDeviceShadowRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateDeviceShadowRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateDeviceShadowRequest setShadowMessage(String shadowMessage) {
        this.shadowMessage = shadowMessage;
        return this;
    }
    public String getShadowMessage() {
        return this.shadowMessage;
    }

}
