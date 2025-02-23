// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTriggerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Triggers")
    public java.util.List<ListRepoTriggerResponseBodyTriggers> triggers;

    public static ListRepoTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTriggerResponseBody self = new ListRepoTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoTriggerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoTriggerResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoTriggerResponseBody setTriggers(java.util.List<ListRepoTriggerResponseBodyTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<ListRepoTriggerResponseBodyTriggers> getTriggers() {
        return this.triggers;
    }

    public static class ListRepoTriggerResponseBodyTriggers extends TeaModel {
        @NameInMap("RepoEvent")
        public String repoEvent;

        @NameInMap("TriggerId")
        public String triggerId;

        @NameInMap("TriggerName")
        public String triggerName;

        @NameInMap("TriggerTag")
        public String triggerTag;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("TriggerUrl")
        public String triggerUrl;

        public static ListRepoTriggerResponseBodyTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListRepoTriggerResponseBodyTriggers self = new ListRepoTriggerResponseBodyTriggers();
            return TeaModel.build(map, self);
        }

        public ListRepoTriggerResponseBodyTriggers setRepoEvent(String repoEvent) {
            this.repoEvent = repoEvent;
            return this;
        }
        public String getRepoEvent() {
            return this.repoEvent;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }
        public String getTriggerId() {
            return this.triggerId;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public String getTriggerName() {
            return this.triggerName;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerTag(String triggerTag) {
            this.triggerTag = triggerTag;
            return this;
        }
        public String getTriggerTag() {
            return this.triggerTag;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerUrl(String triggerUrl) {
            this.triggerUrl = triggerUrl;
            return this;
        }
        public String getTriggerUrl() {
            return this.triggerUrl;
        }

    }

}
