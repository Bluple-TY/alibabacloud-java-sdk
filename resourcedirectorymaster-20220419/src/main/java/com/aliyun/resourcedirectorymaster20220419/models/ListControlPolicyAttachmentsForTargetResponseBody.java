// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListControlPolicyAttachmentsForTargetResponseBody extends TeaModel {
    @NameInMap("ControlPolicyAttachments")
    public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments controlPolicyAttachments;

    @NameInMap("RequestId")
    public String requestId;

    public static ListControlPolicyAttachmentsForTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListControlPolicyAttachmentsForTargetResponseBody self = new ListControlPolicyAttachmentsForTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListControlPolicyAttachmentsForTargetResponseBody setControlPolicyAttachments(ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments controlPolicyAttachments) {
        this.controlPolicyAttachments = controlPolicyAttachments;
        return this;
    }
    public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments getControlPolicyAttachments() {
        return this.controlPolicyAttachments;
    }

    public ListControlPolicyAttachmentsForTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment extends TeaModel {
        @NameInMap("AttachDate")
        public String attachDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectScope")
        public String effectScope;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        public static ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment self = new ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment();
            return TeaModel.build(map, self);
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setEffectScope(String effectScope) {
            this.effectScope = effectScope;
            return this;
        }
        public String getEffectScope() {
            return this.effectScope;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments extends TeaModel {
        @NameInMap("ControlPolicyAttachment")
        public java.util.List<ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment> controlPolicyAttachment;

        public static ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments self = new ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments();
            return TeaModel.build(map, self);
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments setControlPolicyAttachment(java.util.List<ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment> controlPolicyAttachment) {
            this.controlPolicyAttachment = controlPolicyAttachment;
            return this;
        }
        public java.util.List<ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment> getControlPolicyAttachment() {
            return this.controlPolicyAttachment;
        }

    }

}
