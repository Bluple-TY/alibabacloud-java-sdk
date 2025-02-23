// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateRemediationsResponseBody extends TeaModel {
    @NameInMap("RemediationDeleteResults")
    public java.util.List<DeleteAggregateRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAggregateRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateRemediationsResponseBody self = new DeleteAggregateRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateRemediationsResponseBody setRemediationDeleteResults(java.util.List<DeleteAggregateRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults) {
        this.remediationDeleteResults = remediationDeleteResults;
        return this;
    }
    public java.util.List<DeleteAggregateRemediationsResponseBodyRemediationDeleteResults> getRemediationDeleteResults() {
        return this.remediationDeleteResults;
    }

    public DeleteAggregateRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAggregateRemediationsResponseBodyRemediationDeleteResults extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("RemediationId")
        public String remediationId;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteAggregateRemediationsResponseBodyRemediationDeleteResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregateRemediationsResponseBodyRemediationDeleteResults self = new DeleteAggregateRemediationsResponseBodyRemediationDeleteResults();
            return TeaModel.build(map, self);
        }

        public DeleteAggregateRemediationsResponseBodyRemediationDeleteResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteAggregateRemediationsResponseBodyRemediationDeleteResults setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public DeleteAggregateRemediationsResponseBodyRemediationDeleteResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
