// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryRawDataResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static QueryRawDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRawDataResponseBody self = new QueryRawDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRawDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRawDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRawDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRawDataResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
