// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountDescription")
    public String accountDescription;

    public static ModifyAccountDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionRequest self = new ModifyAccountDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAccountDescriptionRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountDescriptionRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

}
