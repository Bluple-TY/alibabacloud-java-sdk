// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteProductImageResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 业务数据
    @NameInMap("Data")
    public String data;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    public static DeleteProductImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductImageResponseBody self = new DeleteProductImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteProductImageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteProductImageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteProductImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteProductImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProductImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}