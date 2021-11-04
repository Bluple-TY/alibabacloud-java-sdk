// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCensorPipelineListResponseBody extends TeaModel {
    @NameInMap("NonExistIds")
    public QueryCensorPipelineListResponseBodyNonExistIds nonExistIds;

    @NameInMap("PipelineList")
    public QueryCensorPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCensorPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCensorPipelineListResponseBody self = new QueryCensorPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCensorPipelineListResponseBody setNonExistIds(QueryCensorPipelineListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryCensorPipelineListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryCensorPipelineListResponseBody setPipelineList(QueryCensorPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryCensorPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryCensorPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCensorPipelineListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryCensorPipelineListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorPipelineListResponseBodyNonExistIds self = new QueryCensorPipelineListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryCensorPipelineListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryCensorPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("State")
        public String state;

        public static QueryCensorPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorPipelineListResponseBodyPipelineListPipeline self = new QueryCensorPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryCensorPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryCensorPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryCensorPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryCensorPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryCensorPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorPipelineListResponseBodyPipelineList self = new QueryCensorPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryCensorPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryCensorPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryCensorPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
