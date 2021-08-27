// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipNotifyPaidResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("message")
    public String message;

    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static EipNotifyPaidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EipNotifyPaidResponseBody self = new EipNotifyPaidResponseBody();
        return TeaModel.build(map, self);
    }

    public EipNotifyPaidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EipNotifyPaidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EipNotifyPaidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EipNotifyPaidResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EipNotifyPaidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
