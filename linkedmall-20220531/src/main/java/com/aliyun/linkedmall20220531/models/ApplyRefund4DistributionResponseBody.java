// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyRefund4DistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ApplyRefund4DistributionResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ApplyRefund4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefund4DistributionResponseBody self = new ApplyRefund4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyRefund4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyRefund4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ApplyRefund4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyRefund4DistributionResponseBody setModel(ApplyRefund4DistributionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ApplyRefund4DistributionResponseBodyModel getModel() {
        return this.model;
    }

    public ApplyRefund4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ApplyRefund4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ApplyRefund4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRefund4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ApplyRefund4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ApplyRefund4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyRefund4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ApplyRefund4DistributionResponseBodyModel extends TeaModel {
        @NameInMap("DisputeId")
        public Long disputeId;

        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        @NameInMap("DisputeType")
        public Integer disputeType;

        @NameInMap("SubDistributionOrderId")
        public String subDistributionOrderId;

        public static ApplyRefund4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefund4DistributionResponseBodyModel self = new ApplyRefund4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ApplyRefund4DistributionResponseBodyModel setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public ApplyRefund4DistributionResponseBodyModel setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public ApplyRefund4DistributionResponseBodyModel setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ApplyRefund4DistributionResponseBodyModel setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

    public static class InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        @NameInMap("MinRefundFee")
        public Long minRefundFee;

        public static InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData self = new InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData setMaxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Long getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData setMinRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Long getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitApplyRefund4DistributionResponseBodyModelRefundReasonList extends TeaModel {
        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        @NameInMap("ReasonTextId")
        public String reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static InitApplyRefund4DistributionResponseBodyModelRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefund4DistributionResponseBodyModelRefundReasonList self = new InitApplyRefund4DistributionResponseBodyModelRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitApplyRefund4DistributionResponseBodyModelRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitApplyRefund4DistributionResponseBodyModelRefundReasonList setReasonTextId(String reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public String getReasonTextId() {
            return this.reasonTextId;
        }

        public InitApplyRefund4DistributionResponseBodyModelRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitApplyRefund4DistributionResponseBodyModelRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitApplyRefund4DistributionResponseBodyModel extends TeaModel {
        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        @NameInMap("MainOrderRefund")
        public Boolean mainOrderRefund;

        @NameInMap("MaxRefundFeeData")
        public InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData maxRefundFeeData;

        @NameInMap("RefundReasonList")
        public java.util.List<InitApplyRefund4DistributionResponseBodyModelRefundReasonList> refundReasonList;

        @NameInMap("SubDistributionOrderId")
        public String subDistributionOrderId;

        public static InitApplyRefund4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefund4DistributionResponseBodyModel self = new InitApplyRefund4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public InitApplyRefund4DistributionResponseBodyModel setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitApplyRefund4DistributionResponseBodyModel setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitApplyRefund4DistributionResponseBodyModel setMaxRefundFeeData(InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitApplyRefund4DistributionResponseBodyModelMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public InitApplyRefund4DistributionResponseBodyModel setRefundReasonList(java.util.List<InitApplyRefund4DistributionResponseBodyModelRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitApplyRefund4DistributionResponseBodyModelRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

        public InitApplyRefund4DistributionResponseBodyModel setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

}
