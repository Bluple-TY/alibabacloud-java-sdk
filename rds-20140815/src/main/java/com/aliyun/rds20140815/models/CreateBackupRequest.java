// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupStrategy")
    public String backupStrategy;

    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupRequest self = new CreateBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public CreateBackupRequest setBackupStrategy(String backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }
    public String getBackupStrategy() {
        return this.backupStrategy;
    }

    public CreateBackupRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateBackupRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateBackupRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateBackupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
