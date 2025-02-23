// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class InitSmartVerifyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public InitSmartVerifyResponseResultObject resultObject;

    public static InitSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitSmartVerifyResponse self = new InitSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitSmartVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitSmartVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitSmartVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitSmartVerifyResponse setResultObject(InitSmartVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitSmartVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitSmartVerifyResponseResultObject extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        public static InitSmartVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitSmartVerifyResponseResultObject self = new InitSmartVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public InitSmartVerifyResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
