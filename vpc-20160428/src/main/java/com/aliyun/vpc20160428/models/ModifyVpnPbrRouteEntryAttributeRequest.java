// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("NewPriority")
    public Integer newPriority;

    @NameInMap("NewWeight")
    public Integer newWeight;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouteDest")
    public String routeDest;

    @NameInMap("RouteSource")
    public String routeSource;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("Weight")
    public Integer weight;

    public static ModifyVpnPbrRouteEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryAttributeRequest self = new ModifyVpnPbrRouteEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setNewPriority(Integer newPriority) {
        this.newPriority = newPriority;
        return this;
    }
    public Integer getNewPriority() {
        return this.newPriority;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setNewWeight(Integer newWeight) {
        this.newWeight = newWeight;
        return this;
    }
    public Integer getNewWeight() {
        return this.newWeight;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifyVpnPbrRouteEntryAttributeRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
