// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAccountsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("AccountName")
    public String accountName;

    public static DescribeAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsRequest self = new DescribeAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAccountsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
