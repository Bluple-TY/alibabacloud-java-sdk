// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeviceControlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeviceControlResponseBodyResult result;

    public static DeviceControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlResponseBody self = new DeviceControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeviceControlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeviceControlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeviceControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeviceControlResponseBody setResult(DeviceControlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeviceControlResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeviceControlResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static DeviceControlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeviceControlResponseBodyResult self = new DeviceControlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeviceControlResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
