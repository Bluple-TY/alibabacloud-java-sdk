// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryCostUnitResponseBodyData data;

    public static QueryCostUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResponseBody self = new QueryCostUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCostUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCostUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCostUnitResponseBody setData(QueryCostUnitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCostUnitResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCostUnitResponseBodyDataCostUnitDtoList extends TeaModel {
        @NameInMap("UnitId")
        public Long unitId;

        @NameInMap("ParentUnitId")
        public Long parentUnitId;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("UnitName")
        public String unitName;

        public static QueryCostUnitResponseBodyDataCostUnitDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseBodyDataCostUnitDtoList self = new QueryCostUnitResponseBodyDataCostUnitDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class QueryCostUnitResponseBodyData extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("CostUnitDtoList")
        public java.util.List<QueryCostUnitResponseBodyDataCostUnitDtoList> costUnitDtoList;

        public static QueryCostUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseBodyData self = new QueryCostUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryCostUnitResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCostUnitResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryCostUnitResponseBodyData setCostUnitDtoList(java.util.List<QueryCostUnitResponseBodyDataCostUnitDtoList> costUnitDtoList) {
            this.costUnitDtoList = costUnitDtoList;
            return this;
        }
        public java.util.List<QueryCostUnitResponseBodyDataCostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

    }

}
