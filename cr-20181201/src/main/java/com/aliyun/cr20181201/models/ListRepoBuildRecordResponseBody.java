// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordResponseBody extends TeaModel {
    @NameInMap("BuildRecords")
    public java.util.List<ListRepoBuildRecordResponseBodyBuildRecords> buildRecords;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepoBuildRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordResponseBody self = new ListRepoBuildRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordResponseBody setBuildRecords(java.util.List<ListRepoBuildRecordResponseBodyBuildRecords> buildRecords) {
        this.buildRecords = buildRecords;
        return this;
    }
    public java.util.List<ListRepoBuildRecordResponseBodyBuildRecords> getBuildRecords() {
        return this.buildRecords;
    }

    public ListRepoBuildRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoBuildRecordResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoBuildRecordResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoBuildRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoBuildRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoBuildRecordResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoBuildRecordResponseBodyBuildRecordsImage extends TeaModel {
        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        public static ListRepoBuildRecordResponseBodyBuildRecordsImage build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRecordResponseBodyBuildRecordsImage self = new ListRepoBuildRecordResponseBodyBuildRecordsImage();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepoBuildRecordResponseBodyBuildRecordsImage setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

    public static class ListRepoBuildRecordResponseBodyBuildRecords extends TeaModel {
        @NameInMap("BuildRecordId")
        public String buildRecordId;

        @NameInMap("BuildStatus")
        public String buildStatus;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Image")
        public ListRepoBuildRecordResponseBodyBuildRecordsImage image;

        @NameInMap("StartTime")
        public String startTime;

        public static ListRepoBuildRecordResponseBodyBuildRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRecordResponseBodyBuildRecords self = new ListRepoBuildRecordResponseBodyBuildRecords();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setBuildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
            return this;
        }
        public String getBuildRecordId() {
            return this.buildRecordId;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setBuildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            return this;
        }
        public String getBuildStatus() {
            return this.buildStatus;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setImage(ListRepoBuildRecordResponseBodyBuildRecordsImage image) {
            this.image = image;
            return this;
        }
        public ListRepoBuildRecordResponseBodyBuildRecordsImage getImage() {
            return this.image;
        }

        public ListRepoBuildRecordResponseBodyBuildRecords setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
