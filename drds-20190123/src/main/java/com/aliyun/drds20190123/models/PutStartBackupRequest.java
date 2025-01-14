// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutStartBackupRequest extends TeaModel {
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    @NameInMap("BackupLevel")
    public String backupLevel;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static PutStartBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutStartBackupRequest self = new PutStartBackupRequest();
        return TeaModel.build(map, self);
    }

    public PutStartBackupRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public PutStartBackupRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public PutStartBackupRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public PutStartBackupRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
