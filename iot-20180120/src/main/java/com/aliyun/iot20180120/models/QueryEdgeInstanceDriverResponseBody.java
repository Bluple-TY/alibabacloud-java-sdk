// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEdgeInstanceDriverResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDriverResponseBody self = new QueryEdgeInstanceDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDriverResponseBody setData(QueryEdgeInstanceDriverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDriverResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceDriverResponseBodyDataDriverList extends TeaModel {
        @NameInMap("DriverId")
        public String driverId;

        @NameInMap("DriverVersion")
        public String driverVersion;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OrderId")
        public String orderId;

        public static QueryEdgeInstanceDriverResponseBodyDataDriverList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDriverResponseBodyDataDriverList self = new QueryEdgeInstanceDriverResponseBodyDataDriverList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class QueryEdgeInstanceDriverResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DriverList")
        public java.util.List<QueryEdgeInstanceDriverResponseBodyDataDriverList> driverList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceDriverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDriverResponseBodyData self = new QueryEdgeInstanceDriverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDriverResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDriverResponseBodyData setDriverList(java.util.List<QueryEdgeInstanceDriverResponseBodyDataDriverList> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDriverResponseBodyDataDriverList> getDriverList() {
            return this.driverList;
        }

        public QueryEdgeInstanceDriverResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDriverResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
