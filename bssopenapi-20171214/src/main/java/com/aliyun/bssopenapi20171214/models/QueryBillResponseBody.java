// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryBillResponseBodyData data;

    public static QueryBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBillResponseBody self = new QueryBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBillResponseBody setData(QueryBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBillResponseBodyData getData() {
        return this.data;
    }

    public static class QueryBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("RecordID")
        public String recordID;

        @NameInMap("Item")
        public String item;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("UsageStartTime")
        public String usageStartTime;

        @NameInMap("UsageEndTime")
        public String usageEndTime;

        @NameInMap("PaymentTime")
        public String paymentTime;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        @NameInMap("Tax")
        public Float tax;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        @NameInMap("Status")
        public String status;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("PaymentTransactionID")
        public String paymentTransactionID;

        @NameInMap("RoundDownDiscount")
        public String roundDownDiscount;

        @NameInMap("SubOrderId")
        public String subOrderId;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("CommodityCode")
        public String commodityCode;

        public static QueryBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillResponseBodyDataItemsItem self = new QueryBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryBillResponseBodyDataItemsItem setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QueryBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryBillResponseBodyDataItemsItem setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

        public QueryBillResponseBodyDataItemsItem setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public QueryBillResponseBodyDataItemsItem setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QueryBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QueryBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryBillResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryBillResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryBillResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryBillResponseBodyDataItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBillResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryBillResponseBodyDataItemsItem setPaymentTransactionID(String paymentTransactionID) {
            this.paymentTransactionID = paymentTransactionID;
            return this;
        }
        public String getPaymentTransactionID() {
            return this.paymentTransactionID;
        }

        public QueryBillResponseBodyDataItemsItem setRoundDownDiscount(String roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public QueryBillResponseBodyDataItemsItem setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public QueryBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

    }

    public static class QueryBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryBillResponseBodyDataItemsItem> item;

        public static QueryBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillResponseBodyDataItems self = new QueryBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryBillResponseBodyDataItems setItem(java.util.List<QueryBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryBillResponseBodyData extends TeaModel {
        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public QueryBillResponseBodyDataItems items;

        public static QueryBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillResponseBodyData self = new QueryBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryBillResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryBillResponseBodyData setItems(QueryBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryBillResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
