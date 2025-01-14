// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleActionResponseBody extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRuleActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleActionResponseBody self = new CreateRuleActionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRuleActionResponseBody setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public CreateRuleActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRuleActionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRuleActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRuleActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
