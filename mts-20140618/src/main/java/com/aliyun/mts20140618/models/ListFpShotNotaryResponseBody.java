// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotNotaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FpShotNotaryList")
    public ListFpShotNotaryResponseBodyFpShotNotaryList fpShotNotaryList;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    public static ListFpShotNotaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotNotaryResponseBody self = new ListFpShotNotaryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFpShotNotaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFpShotNotaryResponseBody setFpShotNotaryList(ListFpShotNotaryResponseBodyFpShotNotaryList fpShotNotaryList) {
        this.fpShotNotaryList = fpShotNotaryList;
        return this;
    }
    public ListFpShotNotaryResponseBodyFpShotNotaryList getFpShotNotaryList() {
        return this.fpShotNotaryList;
    }

    public ListFpShotNotaryResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static class ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("TxHash")
        public String txHash;

        @NameInMap("TransactionId")
        public String transactionId;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("Detail")
        public String detail;

        public static ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary self = new ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary();
            return TeaModel.build(map, self);
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setTxHash(String txHash) {
            this.txHash = txHash;
            return this;
        }
        public String getTxHash() {
            return this.txHash;
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class ListFpShotNotaryResponseBodyFpShotNotaryList extends TeaModel {
        @NameInMap("FpShotNotary")
        public java.util.List<ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary> fpShotNotary;

        public static ListFpShotNotaryResponseBodyFpShotNotaryList build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotNotaryResponseBodyFpShotNotaryList self = new ListFpShotNotaryResponseBodyFpShotNotaryList();
            return TeaModel.build(map, self);
        }

        public ListFpShotNotaryResponseBodyFpShotNotaryList setFpShotNotary(java.util.List<ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary> fpShotNotary) {
            this.fpShotNotary = fpShotNotary;
            return this;
        }
        public java.util.List<ListFpShotNotaryResponseBodyFpShotNotaryListFpShotNotary> getFpShotNotary() {
            return this.fpShotNotary;
        }

    }

}
