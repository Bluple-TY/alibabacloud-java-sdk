// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CancelComputeTaskByBcIdResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 逻辑删除操作是否成功
    @NameInMap("Data")
    public Boolean data;

    // 消息描述
    @NameInMap("Msg")
    public String msg;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // http请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static CancelComputeTaskByBcIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelComputeTaskByBcIdResponseBody self = new CancelComputeTaskByBcIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelComputeTaskByBcIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelComputeTaskByBcIdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CancelComputeTaskByBcIdResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CancelComputeTaskByBcIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelComputeTaskByBcIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
