// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleRequest self = new ListRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
