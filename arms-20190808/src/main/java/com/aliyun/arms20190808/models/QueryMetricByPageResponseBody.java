// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricByPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <br>
     * <p>*   2XX: The request was successful.</p>
     * <p>*   3XX: A redirection message was returned.</p>
     * <p>*   4XX: The request was invalid.</p>
     * <p>*   5XX: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public QueryMetricByPageResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryMetricByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricByPageResponseBody self = new QueryMetricByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMetricByPageResponseBody setData(QueryMetricByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMetricByPageResponseBodyData getData() {
        return this.data;
    }

    public QueryMetricByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMetricByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMetricByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMetricByPageResponseBodyData extends TeaModel {
        /**
         * <p>The data entries returned.</p>
         */
        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryMetricByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricByPageResponseBodyData self = new QueryMetricByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMetricByPageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public QueryMetricByPageResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryMetricByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMetricByPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
