// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDriverConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DriverConfigList")
    public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList> driverConfigList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetEdgeInstanceDriverConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDriverConfigsResponseBody self = new BatchGetEdgeInstanceDriverConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setDriverConfigList(java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList> driverConfigList) {
        this.driverConfigList = driverConfigList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList> getDriverConfigList() {
        return this.driverConfigList;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Format")
        public String format;

        @NameInMap("Key")
        public String key;

        public static BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList self = new BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList extends TeaModel {
        @NameInMap("ConfigList")
        public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList> configList;

        @NameInMap("DriverId")
        public String driverId;

        public static BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList self = new BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList setConfigList(java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList> getConfigList() {
            return this.configList;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

    }

}
