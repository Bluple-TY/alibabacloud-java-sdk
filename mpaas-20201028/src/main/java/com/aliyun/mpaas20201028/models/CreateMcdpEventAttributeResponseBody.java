// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpEventAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMcdpEventAttributeResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcdpEventAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpEventAttributeResponseBody self = new CreateMcdpEventAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcdpEventAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcdpEventAttributeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcdpEventAttributeResponseBody setResultContent(CreateMcdpEventAttributeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMcdpEventAttributeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMcdpEventAttributeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcdpEventAttributeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcdpEventAttributeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMcdpEventAttributeResponseBodyResultContent self = new CreateMcdpEventAttributeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMcdpEventAttributeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateMcdpEventAttributeResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateMcdpEventAttributeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateMcdpEventAttributeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
