// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupRestoreCountResponseBody extends TeaModel {
    @NameInMap("BackupRestoreCount")
    public DescribeBackupRestoreCountResponseBodyBackupRestoreCount backupRestoreCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupRestoreCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupRestoreCountResponseBody self = new DescribeBackupRestoreCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupRestoreCountResponseBody setBackupRestoreCount(DescribeBackupRestoreCountResponseBodyBackupRestoreCount backupRestoreCount) {
        this.backupRestoreCount = backupRestoreCount;
        return this;
    }
    public DescribeBackupRestoreCountResponseBodyBackupRestoreCount getBackupRestoreCount() {
        return this.backupRestoreCount;
    }

    public DescribeBackupRestoreCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupRestoreCountResponseBodyBackupRestoreCount extends TeaModel {
        @NameInMap("Recovering")
        public Integer recovering;

        @NameInMap("Total")
        public Integer total;

        public static DescribeBackupRestoreCountResponseBodyBackupRestoreCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupRestoreCountResponseBodyBackupRestoreCount self = new DescribeBackupRestoreCountResponseBodyBackupRestoreCount();
            return TeaModel.build(map, self);
        }

        public DescribeBackupRestoreCountResponseBodyBackupRestoreCount setRecovering(Integer recovering) {
            this.recovering = recovering;
            return this;
        }
        public Integer getRecovering() {
            return this.recovering;
        }

        public DescribeBackupRestoreCountResponseBodyBackupRestoreCount setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
