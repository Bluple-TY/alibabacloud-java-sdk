// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetAsyncTaskStatusResponseBody extends TeaModel {
    /**
     * <p>Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskStatus")
    public TaskStatus taskStatus;

    public static GetAsyncTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskStatusResponseBody self = new GetAsyncTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAsyncTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAsyncTaskStatusResponseBody setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public TaskStatus getTaskStatus() {
        return this.taskStatus;
    }

}
