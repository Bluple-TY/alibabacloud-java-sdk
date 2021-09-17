// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListXsInstancesResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("CommodityInstances")
    public java.util.List<ListXsInstancesResponseBodyCommodityInstances> commodityInstances;

    public static ListXsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListXsInstancesResponseBody self = new ListXsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListXsInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListXsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListXsInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListXsInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListXsInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListXsInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListXsInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListXsInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListXsInstancesResponseBody setCommodityInstances(java.util.List<ListXsInstancesResponseBodyCommodityInstances> commodityInstances) {
        this.commodityInstances = commodityInstances;
        return this;
    }
    public java.util.List<ListXsInstancesResponseBodyCommodityInstances> getCommodityInstances() {
        return this.commodityInstances;
    }

    public static class ListXsInstancesResponseBodyCommodityInstancesAdministrator extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("UserName")
        public String userName;

        public static ListXsInstancesResponseBodyCommodityInstancesAdministrator build(java.util.Map<String, ?> map) throws Exception {
            ListXsInstancesResponseBodyCommodityInstancesAdministrator self = new ListXsInstancesResponseBodyCommodityInstancesAdministrator();
            return TeaModel.build(map, self);
        }

        public ListXsInstancesResponseBodyCommodityInstancesAdministrator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListXsInstancesResponseBodyCommodityInstancesAdministrator setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListXsInstancesResponseBodyCommodityInstances extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("HotlineSeatNum")
        public Integer hotlineSeatNum;

        @NameInMap("StartData")
        public String startData;

        @NameInMap("HadSTS")
        public Boolean hadSTS;

        @NameInMap("ProdLevel")
        public String prodLevel;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Chargetype")
        public String chargetype;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("OnlineSeatNum")
        public Integer onlineSeatNum;

        @NameInMap("Administrator")
        public ListXsInstancesResponseBodyCommodityInstancesAdministrator administrator;

        public static ListXsInstancesResponseBodyCommodityInstances build(java.util.Map<String, ?> map) throws Exception {
            ListXsInstancesResponseBodyCommodityInstances self = new ListXsInstancesResponseBodyCommodityInstances();
            return TeaModel.build(map, self);
        }

        public ListXsInstancesResponseBodyCommodityInstances setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListXsInstancesResponseBodyCommodityInstances setHotlineSeatNum(Integer hotlineSeatNum) {
            this.hotlineSeatNum = hotlineSeatNum;
            return this;
        }
        public Integer getHotlineSeatNum() {
            return this.hotlineSeatNum;
        }

        public ListXsInstancesResponseBodyCommodityInstances setStartData(String startData) {
            this.startData = startData;
            return this;
        }
        public String getStartData() {
            return this.startData;
        }

        public ListXsInstancesResponseBodyCommodityInstances setHadSTS(Boolean hadSTS) {
            this.hadSTS = hadSTS;
            return this;
        }
        public Boolean getHadSTS() {
            return this.hadSTS;
        }

        public ListXsInstancesResponseBodyCommodityInstances setProdLevel(String prodLevel) {
            this.prodLevel = prodLevel;
            return this;
        }
        public String getProdLevel() {
            return this.prodLevel;
        }

        public ListXsInstancesResponseBodyCommodityInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListXsInstancesResponseBodyCommodityInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListXsInstancesResponseBodyCommodityInstances setChargetype(String chargetype) {
            this.chargetype = chargetype;
            return this;
        }
        public String getChargetype() {
            return this.chargetype;
        }

        public ListXsInstancesResponseBodyCommodityInstances setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListXsInstancesResponseBodyCommodityInstances setOnlineSeatNum(Integer onlineSeatNum) {
            this.onlineSeatNum = onlineSeatNum;
            return this;
        }
        public Integer getOnlineSeatNum() {
            return this.onlineSeatNum;
        }

        public ListXsInstancesResponseBodyCommodityInstances setAdministrator(ListXsInstancesResponseBodyCommodityInstancesAdministrator administrator) {
            this.administrator = administrator;
            return this;
        }
        public ListXsInstancesResponseBodyCommodityInstancesAdministrator getAdministrator() {
            return this.administrator;
        }

    }

}
