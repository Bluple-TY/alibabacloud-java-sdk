// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelChangeModelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Integer data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelChangeModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelChangeModelResponseBody self = new SentinelChangeModelResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelChangeModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelChangeModelResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public SentinelChangeModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelChangeModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelChangeModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
