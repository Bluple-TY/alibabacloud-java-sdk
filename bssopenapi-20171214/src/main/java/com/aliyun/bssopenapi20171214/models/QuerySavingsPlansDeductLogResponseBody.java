// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySavingsPlansDeductLogResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySavingsPlansDeductLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDeductLogResponseBody self = new QuerySavingsPlansDeductLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDeductLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingsPlansDeductLogResponseBody setData(QuerySavingsPlansDeductLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansDeductLogResponseBodyData getData() {
        return this.data;
    }

    public QuerySavingsPlansDeductLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansDeductLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingsPlansDeductLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySavingsPlansDeductLogResponseBodyDataItems extends TeaModel {
        @NameInMap("BillModule")
        public String billModule;

        @NameInMap("DeductCommodity")
        public String deductCommodity;

        @NameInMap("DeductFee")
        public String deductFee;

        @NameInMap("DeductInstanceId")
        public String deductInstanceId;

        @NameInMap("DeductRate")
        public String deductRate;

        @NameInMap("DiscountRate")
        public String discountRate;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("SavingsType")
        public String savingsType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UserId")
        public Long userId;

        public static QuerySavingsPlansDeductLogResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDeductLogResponseBodyDataItems self = new QuerySavingsPlansDeductLogResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setBillModule(String billModule) {
            this.billModule = billModule;
            return this;
        }
        public String getBillModule() {
            return this.billModule;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductCommodity(String deductCommodity) {
            this.deductCommodity = deductCommodity;
            return this;
        }
        public String getDeductCommodity() {
            return this.deductCommodity;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductFee(String deductFee) {
            this.deductFee = deductFee;
            return this;
        }
        public String getDeductFee() {
            return this.deductFee;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductInstanceId(String deductInstanceId) {
            this.deductInstanceId = deductInstanceId;
            return this;
        }
        public String getDeductInstanceId() {
            return this.deductInstanceId;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductRate(String deductRate) {
            this.deductRate = deductRate;
            return this;
        }
        public String getDeductRate() {
            return this.deductRate;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDiscountRate(String discountRate) {
            this.discountRate = discountRate;
            return this;
        }
        public String getDiscountRate() {
            return this.discountRate;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setSavingsType(String savingsType) {
            this.savingsType = savingsType;
            return this;
        }
        public String getSavingsType() {
            return this.savingsType;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class QuerySavingsPlansDeductLogResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> items;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySavingsPlansDeductLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDeductLogResponseBodyData self = new QuerySavingsPlansDeductLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDeductLogResponseBodyData setItems(java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QuerySavingsPlansDeductLogResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySavingsPlansDeductLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingsPlansDeductLogResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
