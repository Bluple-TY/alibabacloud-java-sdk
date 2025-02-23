// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskExecutions")
    public java.util.List<ListTaskExecutionsResponseBodyTaskExecutions> taskExecutions;

    public static ListTaskExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionsResponseBody self = new ListTaskExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTaskExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskExecutionsResponseBody setTaskExecutions(java.util.List<ListTaskExecutionsResponseBodyTaskExecutions> taskExecutions) {
        this.taskExecutions = taskExecutions;
        return this;
    }
    public java.util.List<ListTaskExecutionsResponseBodyTaskExecutions> getTaskExecutions() {
        return this.taskExecutions;
    }

    public static class ListTaskExecutionsResponseBodyTaskExecutions extends TeaModel {
        @NameInMap("ChildExecutionId")
        public String childExecutionId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("ExtraData")
        public java.util.Map<String, ?> extraData;

        @NameInMap("Loop")
        public java.util.Map<String, ?> loop;

        @NameInMap("LoopBatchNumber")
        public Integer loopBatchNumber;

        @NameInMap("LoopItem")
        public String loopItem;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("ParentTaskExecutionId")
        public String parentTaskExecutionId;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListTaskExecutionsResponseBodyTaskExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListTaskExecutionsResponseBodyTaskExecutions self = new ListTaskExecutionsResponseBodyTaskExecutions();
            return TeaModel.build(map, self);
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setChildExecutionId(String childExecutionId) {
            this.childExecutionId = childExecutionId;
            return this;
        }
        public String getChildExecutionId() {
            return this.childExecutionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setExtraData(java.util.Map<String, ?> extraData) {
            this.extraData = extraData;
            return this;
        }
        public java.util.Map<String, ?> getExtraData() {
            return this.extraData;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setLoop(java.util.Map<String, ?> loop) {
            this.loop = loop;
            return this;
        }
        public java.util.Map<String, ?> getLoop() {
            return this.loop;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setLoopBatchNumber(Integer loopBatchNumber) {
            this.loopBatchNumber = loopBatchNumber;
            return this;
        }
        public Integer getLoopBatchNumber() {
            return this.loopBatchNumber;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setLoopItem(String loopItem) {
            this.loopItem = loopItem;
            return this;
        }
        public String getLoopItem() {
            return this.loopItem;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setParentTaskExecutionId(String parentTaskExecutionId) {
            this.parentTaskExecutionId = parentTaskExecutionId;
            return this;
        }
        public String getParentTaskExecutionId() {
            return this.parentTaskExecutionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTaskExecutionsResponseBodyTaskExecutions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
