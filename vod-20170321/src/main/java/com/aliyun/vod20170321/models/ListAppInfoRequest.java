// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoRequest extends TeaModel {
    // The number of the page to return. By default, pages start from page 1.
    @NameInMap("PageNo")
    public Integer pageNo;

    // The number of entries to return on each page. Default value: **10**. Maximum value: **100**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The status of the application. After an application is created, it enters the **Normal** state. Valid values:
    // 
    // *   **Normal**
    // *   **Disable**
    @NameInMap("Status")
    public String status;

    public static ListAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoRequest self = new ListAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAppInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
