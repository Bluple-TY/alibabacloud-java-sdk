// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>关键字搜索。</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>所属的group。</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Label")
    public java.util.Map<String, String> label;

    /**
     * <p>排序顺序，支持升序或将序。</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>页号。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>每页大小。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Band类型服务主服务的UID</p>
     */
    @NameInMap("ParentServiceUid")
    public String parentServiceUid;

    /**
     * <p>服务的类型，例如Async, OfflineTask和Standard等</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>排序字段。</p>
     */
    @NameInMap("Sort")
    public String sort;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServicesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListServicesRequest setLabel(java.util.Map<String, String> label) {
        this.label = label;
        return this;
    }
    public java.util.Map<String, String> getLabel() {
        return this.label;
    }

    public ListServicesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesRequest setParentServiceUid(String parentServiceUid) {
        this.parentServiceUid = parentServiceUid;
        return this;
    }
    public String getParentServiceUid() {
        return this.parentServiceUid;
    }

    public ListServicesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListServicesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
