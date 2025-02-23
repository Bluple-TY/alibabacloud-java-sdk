// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessageMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMessageMetricsResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListMessageMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageMetricsResponseBody self = new ListMessageMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageMetricsResponseBody setData(ListMessageMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMessageMetricsResponseBodyData getData() {
        return this.data;
    }

    public ListMessageMetricsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListMessageMetricsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMessageMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMessageMetricsResponseBodyDataMetrics extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Fail")
        public Integer fail;

        @NameInMap("Pending")
        public Integer pending;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Success")
        public Integer success;

        @NameInMap("Total")
        public Integer total;

        public static ListMessageMetricsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListMessageMetricsResponseBodyDataMetrics self = new ListMessageMetricsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public ListMessageMetricsResponseBodyDataMetrics setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListMessageMetricsResponseBodyDataMetrics setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public ListMessageMetricsResponseBodyDataMetrics setPending(Integer pending) {
            this.pending = pending;
            return this;
        }
        public Integer getPending() {
            return this.pending;
        }

        public ListMessageMetricsResponseBodyDataMetrics setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ListMessageMetricsResponseBodyDataMetrics setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

        public ListMessageMetricsResponseBodyDataMetrics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListMessageMetricsResponseBodyData extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<ListMessageMetricsResponseBodyDataMetrics> metrics;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMessageMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessageMetricsResponseBodyData self = new ListMessageMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessageMetricsResponseBodyData setMetrics(java.util.List<ListMessageMetricsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListMessageMetricsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public ListMessageMetricsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMessageMetricsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMessageMetricsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
