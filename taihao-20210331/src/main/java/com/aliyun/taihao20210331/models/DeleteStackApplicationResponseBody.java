// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteStackApplicationResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static DeleteStackApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackApplicationResponseBody self = new DeleteStackApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStackApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteStackApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteStackApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStackApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
