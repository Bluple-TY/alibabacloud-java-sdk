// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoSummaryJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryVideoSummaryJobListResponseBodyJobList jobList;

    @NameInMap("NonExistIds")
    public QueryVideoSummaryJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryVideoSummaryJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoSummaryJobListResponseBody self = new QueryVideoSummaryJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoSummaryJobListResponseBody setJobList(QueryVideoSummaryJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryVideoSummaryJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryVideoSummaryJobListResponseBody setNonExistIds(QueryVideoSummaryJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryVideoSummaryJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryVideoSummaryJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryVideoSummaryJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryVideoSummaryJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobListJobInput self = new QueryVideoSummaryJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile self = new QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary self = new QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList extends TeaModel {
        @NameInMap("VideoSummary")
        public java.util.List<QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary> videoSummary;

        public static QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList self = new QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList setVideoSummary(java.util.List<QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary> videoSummary) {
            this.videoSummary = videoSummary;
            return this;
        }
        public java.util.List<QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryListVideoSummary> getVideoSummary() {
            return this.videoSummary;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult extends TeaModel {
        @NameInMap("OutputFile")
        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile outputFile;

        @NameInMap("VideoSummaryList")
        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList videoSummaryList;

        public static QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult self = new QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult setOutputFile(QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult setVideoSummaryList(QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList videoSummaryList) {
            this.videoSummaryList = videoSummaryList;
            return this;
        }
        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResultVideoSummaryList getVideoSummaryList() {
            return this.videoSummaryList;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryVideoSummaryJobListResponseBodyJobListJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VideoSummaryResult")
        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult videoSummaryResult;

        public static QueryVideoSummaryJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobListJob self = new QueryVideoSummaryJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setInput(QueryVideoSummaryJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryVideoSummaryJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryVideoSummaryJobListResponseBodyJobListJob setVideoSummaryResult(QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult videoSummaryResult) {
            this.videoSummaryResult = videoSummaryResult;
            return this;
        }
        public QueryVideoSummaryJobListResponseBodyJobListJobVideoSummaryResult getVideoSummaryResult() {
            return this.videoSummaryResult;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryVideoSummaryJobListResponseBodyJobListJob> job;

        public static QueryVideoSummaryJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyJobList self = new QueryVideoSummaryJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyJobList setJob(java.util.List<QueryVideoSummaryJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryVideoSummaryJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryVideoSummaryJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryVideoSummaryJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSummaryJobListResponseBodyNonExistIds self = new QueryVideoSummaryJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryVideoSummaryJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
