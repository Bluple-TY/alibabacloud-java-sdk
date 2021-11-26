// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RescaleApplicationResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RescaleApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationResponseBody self = new RescaleApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RescaleApplicationResponseBody setData(RescaleApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RescaleApplicationResponseBodyData getData() {
        return this.data;
    }

    public RescaleApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RescaleApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RescaleApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RescaleApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RescaleApplicationResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static RescaleApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RescaleApplicationResponseBodyData self = new RescaleApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RescaleApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
