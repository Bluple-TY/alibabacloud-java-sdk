// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public Boolean data;

    public static SetResellerUserAlarmThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserAlarmThresholdResponseBody self = new SetResellerUserAlarmThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public SetResellerUserAlarmThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetResellerUserAlarmThresholdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetResellerUserAlarmThresholdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetResellerUserAlarmThresholdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetResellerUserAlarmThresholdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
