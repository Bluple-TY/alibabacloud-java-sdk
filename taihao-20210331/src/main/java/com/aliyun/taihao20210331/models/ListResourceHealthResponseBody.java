// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListResourceHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthResponseBody self = new ListResourceHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListResourceHealthResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListResourceHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResourceHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceHealthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        // 应用名
        @NameInMap("applicationName")
        public String applicationName;

        // 组件健康状态
        @NameInMap("childHealthStatusSummary")
        public HealthSummary childHealthStatusSummary;

        // 组件名
        @NameInMap("componentName")
        public String componentName;

        // 健康信息
        @NameInMap("healthMessage")
        public String healthMessage;

        // 健康状态
        @NameInMap("healthStatus")
        public String healthStatus;

        // 节点id
        @NameInMap("nodeId")
        public String nodeId;

        // 节点名称
        @NameInMap("nodeName")
        public String nodeName;

        // 汇报时间
        @NameInMap("reportTime")
        public Long reportTime;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Items setChildHealthStatusSummary(HealthSummary childHealthStatusSummary) {
            this.childHealthStatusSummary = childHealthStatusSummary;
            return this;
        }
        public HealthSummary getChildHealthStatusSummary() {
            return this.childHealthStatusSummary;
        }

        public Items setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public Items setHealthMessage(String healthMessage) {
            this.healthMessage = healthMessage;
            return this;
        }
        public String getHealthMessage() {
            return this.healthMessage;
        }

        public Items setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public Items setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public Items setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public Items setReportTime(Long reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public Long getReportTime() {
            return this.reportTime;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
