// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDBInstanceIPArrayListResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceIPArrayListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListResponseBody self = new DescribeDBInstanceIPArrayListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListResponseBody setItems(DescribeDBInstanceIPArrayListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceIPArrayListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceIPArrayListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray extends TeaModel {
        @NameInMap("DBInstanceIPArrayAttribute")
        public String DBInstanceIPArrayAttribute;

        @NameInMap("DBInstanceIPArrayName")
        public String DBInstanceIPArrayName;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray self = new DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }
        public String getDBInstanceIPArrayAttribute() {
            return this.DBInstanceIPArrayAttribute;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }
        public String getDBInstanceIPArrayName() {
            return this.DBInstanceIPArrayName;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeDBInstanceIPArrayListResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceIPArray")
        public java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray;

        public static DescribeDBInstanceIPArrayListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseBodyItems self = new DescribeDBInstanceIPArrayListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIPArrayListResponseBodyItems setDBInstanceIPArray(java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray) {
            this.DBInstanceIPArray = DBInstanceIPArray;
            return this;
        }
        public java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

    }

}
