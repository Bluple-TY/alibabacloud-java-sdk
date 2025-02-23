// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeInclinedTablesResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeInclinedTablesResponseBodyItems items;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeInclinedTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedTablesResponseBody self = new DescribeInclinedTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedTablesResponseBody setItems(DescribeInclinedTablesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeInclinedTablesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeInclinedTablesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInclinedTablesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInclinedTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInclinedTablesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInclinedTablesResponseBodyItemsTable extends TeaModel {
        @NameInMap("IsIncline")
        public Boolean isIncline;

        @NameInMap("Name")
        public String name;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Type")
        public String type;

        public static DescribeInclinedTablesResponseBodyItemsTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyItemsTable self = new DescribeInclinedTablesResponseBodyItemsTable();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyItemsTable setIsIncline(Boolean isIncline) {
            this.isIncline = isIncline;
            return this;
        }
        public Boolean getIsIncline() {
            return this.isIncline;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInclinedTablesResponseBodyItems extends TeaModel {
        @NameInMap("Table")
        public java.util.List<DescribeInclinedTablesResponseBodyItemsTable> table;

        public static DescribeInclinedTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyItems self = new DescribeInclinedTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyItems setTable(java.util.List<DescribeInclinedTablesResponseBodyItemsTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeInclinedTablesResponseBodyItemsTable> getTable() {
            return this.table;
        }

    }

}
