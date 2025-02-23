// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupResponseBody extends TeaModel {
    // The modification results.
    @NameInMap("ModifyResults")
    public java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> modifyResults;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopsPolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopsPolicyGroupResponseBody self = new ModifyDesktopsPolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopsPolicyGroupResponseBody setModifyResults(java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> modifyResults) {
        this.modifyResults = modifyResults;
        return this;
    }
    public java.util.List<ModifyDesktopsPolicyGroupResponseBodyModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    public ModifyDesktopsPolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDesktopsPolicyGroupResponseBodyModifyResults extends TeaModel {
        // The result of the modification. A value of success indicates that the policy is modified. If the policy failed to be modified, an error message is returned.
        @NameInMap("Code")
        public String code;

        // The ID of the cloud desktop.
        @NameInMap("DesktopId")
        public String desktopId;

        // The error message returned if the request failed. This parameter is not returned if the value of Code is success.``
        @NameInMap("Message")
        public String message;

        public static ModifyDesktopsPolicyGroupResponseBodyModifyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopsPolicyGroupResponseBodyModifyResults self = new ModifyDesktopsPolicyGroupResponseBodyModifyResults();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyDesktopsPolicyGroupResponseBodyModifyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
