// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersRequest extends TeaModel {
    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("DBNodeIds")
    public String DBNodeIds;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RecentCreationInterval")
    public Integer recentCreationInterval;

    @NameInMap("RecentExpirationInterval")
    public Integer recentExpirationInterval;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeDBClustersRequestTag> tag;

    public static DescribeDBClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersRequest self = new DescribeDBClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBClustersRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClustersRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public DescribeDBClustersRequest setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClustersRequest setDBNodeIds(String DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public String getDBNodeIds() {
        return this.DBNodeIds;
    }

    public DescribeDBClustersRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClustersRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClustersRequest setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeDBClustersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBClustersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClustersRequest setRecentCreationInterval(Integer recentCreationInterval) {
        this.recentCreationInterval = recentCreationInterval;
        return this;
    }
    public Integer getRecentCreationInterval() {
        return this.recentCreationInterval;
    }

    public DescribeDBClustersRequest setRecentExpirationInterval(Integer recentExpirationInterval) {
        this.recentExpirationInterval = recentExpirationInterval;
        return this;
    }
    public Integer getRecentExpirationInterval() {
        return this.recentExpirationInterval;
    }

    public DescribeDBClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClustersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBClustersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBClustersRequest setTag(java.util.List<DescribeDBClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBClustersRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersRequestTag self = new DescribeDBClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
