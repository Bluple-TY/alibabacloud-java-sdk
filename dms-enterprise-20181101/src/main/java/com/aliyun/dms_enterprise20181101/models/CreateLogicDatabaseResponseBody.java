// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLogicDatabaseResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogicDbId")
    public Long logicDbId;

    public static CreateLogicDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicDatabaseResponseBody self = new CreateLogicDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLogicDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLogicDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLogicDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLogicDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateLogicDatabaseResponseBody setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

}
