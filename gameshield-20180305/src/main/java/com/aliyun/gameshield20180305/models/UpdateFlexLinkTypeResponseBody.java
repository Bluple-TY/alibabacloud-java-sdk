// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexLinkTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static UpdateFlexLinkTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexLinkTypeResponseBody self = new UpdateFlexLinkTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlexLinkTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFlexLinkTypeResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

}
