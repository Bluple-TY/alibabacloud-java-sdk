// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDataExportTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Valid values: **1** to **100000**.
    @NameInMap("PageNumber")
    public String pageNumber;

    // The number of entries to return on each page. Default value: **20**. Maximum value: **50**.
    // 
    // Valid values: **1** to **50**.
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeUserUsageDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDataExportTaskRequest self = new DescribeUserUsageDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDataExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserUsageDataExportTaskRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserUsageDataExportTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
