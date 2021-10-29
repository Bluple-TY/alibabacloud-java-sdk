// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAllSqlConcurrencyControlRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DisableAllSqlConcurrencyControlRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAllSqlConcurrencyControlRulesResponseBody self = new DisableAllSqlConcurrencyControlRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAllSqlConcurrencyControlRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableAllSqlConcurrencyControlRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DisableAllSqlConcurrencyControlRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableAllSqlConcurrencyControlRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableAllSqlConcurrencyControlRulesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
