// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("IncludeListener")
    public Boolean includeListener;

    public static DescribeMasterSlaveServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsRequest self = new DescribeMasterSlaveServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMasterSlaveServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMasterSlaveServerGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMasterSlaveServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMasterSlaveServerGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeMasterSlaveServerGroupsRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeMasterSlaveServerGroupsRequest setIncludeListener(Boolean includeListener) {
        this.includeListener = includeListener;
        return this;
    }
    public Boolean getIncludeListener() {
        return this.includeListener;
    }

}
