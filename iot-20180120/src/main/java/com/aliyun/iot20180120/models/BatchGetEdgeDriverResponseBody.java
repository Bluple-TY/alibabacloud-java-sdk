// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DriverList")
    public java.util.List<BatchGetEdgeDriverResponseBodyDriverList> driverList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetEdgeDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeDriverResponseBody self = new BatchGetEdgeDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeDriverResponseBody setDriverList(java.util.List<BatchGetEdgeDriverResponseBodyDriverList> driverList) {
        this.driverList = driverList;
        return this;
    }
    public java.util.List<BatchGetEdgeDriverResponseBodyDriverList> getDriverList() {
        return this.driverList;
    }

    public BatchGetEdgeDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeDriverResponseBodyDriverList extends TeaModel {
        @NameInMap("CpuArch")
        public String cpuArch;

        @NameInMap("DriverId")
        public String driverId;

        @NameInMap("DriverName")
        public String driverName;

        @NameInMap("DriverProtocol")
        public String driverProtocol;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("IsBuiltIn")
        public Boolean isBuiltIn;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("Type")
        public Integer type;

        public static BatchGetEdgeDriverResponseBodyDriverList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeDriverResponseBodyDriverList self = new BatchGetEdgeDriverResponseBodyDriverList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeDriverResponseBodyDriverList setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setDriverName(String driverName) {
            this.driverName = driverName;
            return this;
        }
        public String getDriverName() {
            return this.driverName;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setDriverProtocol(String driverProtocol) {
            this.driverProtocol = driverProtocol;
            return this;
        }
        public String getDriverProtocol() {
            return this.driverProtocol;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setIsBuiltIn(Boolean isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            return this;
        }
        public Boolean getIsBuiltIn() {
            return this.isBuiltIn;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public BatchGetEdgeDriverResponseBodyDriverList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
