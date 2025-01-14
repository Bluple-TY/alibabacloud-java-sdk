// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateTemplateResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponseBody self = new CreateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateResponseBody setData(CreateTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateTemplateResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTemplateResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SignatureId")
        public String signatureId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static CreateTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateResponseBodyData self = new CreateTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTemplateResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTemplateResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTemplateResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateTemplateResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public CreateTemplateResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateTemplateResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateTemplateResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
