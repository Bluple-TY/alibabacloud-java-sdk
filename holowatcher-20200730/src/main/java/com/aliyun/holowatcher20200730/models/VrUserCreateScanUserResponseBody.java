// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class VrUserCreateScanUserResponseBody extends TeaModel {
    // async
    @NameInMap("Async")
    public Boolean async;

    // resultObj
    @NameInMap("ResultObj")
    public java.util.Map<String, ?> resultObj;

    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // retry
    @NameInMap("Retry")
    public Boolean retry;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // asyncToken
    @NameInMap("AsyncToken")
    public String asyncToken;

    public static VrUserCreateScanUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VrUserCreateScanUserResponseBody self = new VrUserCreateScanUserResponseBody();
        return TeaModel.build(map, self);
    }

    public VrUserCreateScanUserResponseBody setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public VrUserCreateScanUserResponseBody setResultObj(java.util.Map<String, ?> resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public java.util.Map<String, ?> getResultObj() {
        return this.resultObj;
    }

    public VrUserCreateScanUserResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public VrUserCreateScanUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VrUserCreateScanUserResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public VrUserCreateScanUserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public VrUserCreateScanUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VrUserCreateScanUserResponseBody setAsyncToken(String asyncToken) {
        this.asyncToken = asyncToken;
        return this;
    }
    public String getAsyncToken() {
        return this.asyncToken;
    }

}
