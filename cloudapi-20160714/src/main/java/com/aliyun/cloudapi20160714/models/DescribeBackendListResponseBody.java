// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendListResponseBody extends TeaModel {
    /**
     * <p>The backend services.</p>
     */
    @NameInMap("BackendInfoList")
    public java.util.List<DescribeBackendListResponseBodyBackendInfoList> backendInfoList;

    /**
     * <p>The number of the current page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBackendListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendListResponseBody self = new DescribeBackendListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackendListResponseBody setBackendInfoList(java.util.List<DescribeBackendListResponseBodyBackendInfoList> backendInfoList) {
        this.backendInfoList = backendInfoList;
        return this;
    }
    public java.util.List<DescribeBackendListResponseBodyBackendInfoList> getBackendInfoList() {
        return this.backendInfoList;
    }

    public DescribeBackendListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackendListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackendListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackendListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackendListResponseBodyBackendInfoList extends TeaModel {
        /**
         * <p>The ID of the backend service.</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The name of the backend service.</p>
         */
        @NameInMap("BackendName")
        public String backendName;

        /**
         * <p>The type of the backend service.</p>
         */
        @NameInMap("BackendType")
        public String backendType;

        /**
         * <p>The time when the backend service was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the backend service.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the backend service was modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeBackendListResponseBodyBackendInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendListResponseBodyBackendInfoList self = new DescribeBackendListResponseBodyBackendInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeBackendListResponseBodyBackendInfoList setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeBackendListResponseBodyBackendInfoList setBackendName(String backendName) {
            this.backendName = backendName;
            return this;
        }
        public String getBackendName() {
            return this.backendName;
        }

        public DescribeBackendListResponseBodyBackendInfoList setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public DescribeBackendListResponseBodyBackendInfoList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackendListResponseBodyBackendInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBackendListResponseBodyBackendInfoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
