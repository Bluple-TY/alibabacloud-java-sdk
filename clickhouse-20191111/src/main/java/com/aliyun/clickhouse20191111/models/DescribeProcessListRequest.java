// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeProcessListRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("InitialQueryId")
    public String initialQueryId;

    @NameInMap("InitialUser")
    public String initialUser;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryDurationMs")
    public Integer queryDurationMs;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListRequest self = new DescribeProcessListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeProcessListRequest setInitialQueryId(String initialQueryId) {
        this.initialQueryId = initialQueryId;
        return this;
    }
    public String getInitialQueryId() {
        return this.initialQueryId;
    }

    public DescribeProcessListRequest setInitialUser(String initialUser) {
        this.initialUser = initialUser;
        return this;
    }
    public String getInitialUser() {
        return this.initialUser;
    }

    public DescribeProcessListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeProcessListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeProcessListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeProcessListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeProcessListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessListRequest setQueryDurationMs(Integer queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Integer getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeProcessListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeProcessListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeProcessListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
