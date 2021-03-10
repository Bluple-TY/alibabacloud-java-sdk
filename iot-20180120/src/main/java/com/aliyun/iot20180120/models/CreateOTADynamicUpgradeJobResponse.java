// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateOTADynamicUpgradeJobResponseData data;

    public static CreateOTADynamicUpgradeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTADynamicUpgradeJobResponse self = new CreateOTADynamicUpgradeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTADynamicUpgradeJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTADynamicUpgradeJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOTADynamicUpgradeJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTADynamicUpgradeJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTADynamicUpgradeJobResponse setData(CreateOTADynamicUpgradeJobResponseData data) {
        this.data = data;
        return this;
    }
    public CreateOTADynamicUpgradeJobResponseData getData() {
        return this.data;
    }

    public static class CreateOTADynamicUpgradeJobResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        public static CreateOTADynamicUpgradeJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTADynamicUpgradeJobResponseData self = new CreateOTADynamicUpgradeJobResponseData();
            return TeaModel.build(map, self);
        }

        public CreateOTADynamicUpgradeJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTADynamicUpgradeJobResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
