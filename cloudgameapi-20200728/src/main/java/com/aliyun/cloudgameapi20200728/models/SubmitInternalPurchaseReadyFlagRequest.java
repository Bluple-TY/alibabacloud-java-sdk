// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseReadyFlagRequest extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("ChargeDate")
    public String chargeDate;

    @NameInMap("OrderTotalCount")
    public Integer orderTotalCount;

    @NameInMap("BatchInfoList")
    public java.util.List<SubmitInternalPurchaseReadyFlagRequestBatchInfoList> batchInfoList;

    public static SubmitInternalPurchaseReadyFlagRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseReadyFlagRequest self = new SubmitInternalPurchaseReadyFlagRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseReadyFlagRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SubmitInternalPurchaseReadyFlagRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public SubmitInternalPurchaseReadyFlagRequest setChargeDate(String chargeDate) {
        this.chargeDate = chargeDate;
        return this;
    }
    public String getChargeDate() {
        return this.chargeDate;
    }

    public SubmitInternalPurchaseReadyFlagRequest setOrderTotalCount(Integer orderTotalCount) {
        this.orderTotalCount = orderTotalCount;
        return this;
    }
    public Integer getOrderTotalCount() {
        return this.orderTotalCount;
    }

    public SubmitInternalPurchaseReadyFlagRequest setBatchInfoList(java.util.List<SubmitInternalPurchaseReadyFlagRequestBatchInfoList> batchInfoList) {
        this.batchInfoList = batchInfoList;
        return this;
    }
    public java.util.List<SubmitInternalPurchaseReadyFlagRequestBatchInfoList> getBatchInfoList() {
        return this.batchInfoList;
    }

    public static class SubmitInternalPurchaseReadyFlagRequestBatchInfoList extends TeaModel {
        @NameInMap("BatchSize")
        public Integer batchSize;

        @NameInMap("BatchNumbers")
        public String batchNumbers;

        public static SubmitInternalPurchaseReadyFlagRequestBatchInfoList build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseReadyFlagRequestBatchInfoList self = new SubmitInternalPurchaseReadyFlagRequestBatchInfoList();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseReadyFlagRequestBatchInfoList setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public SubmitInternalPurchaseReadyFlagRequestBatchInfoList setBatchNumbers(String batchNumbers) {
            this.batchNumbers = batchNumbers;
            return this;
        }
        public String getBatchNumbers() {
            return this.batchNumbers;
        }

    }

}
