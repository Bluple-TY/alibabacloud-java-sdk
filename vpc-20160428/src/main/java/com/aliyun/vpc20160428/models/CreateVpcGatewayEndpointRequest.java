// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcGatewayEndpointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointDescription")
    public String endpointDescription;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PolicyDocument")
    public String policyDocument;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcGatewayEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcGatewayEndpointRequest self = new CreateVpcGatewayEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcGatewayEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcGatewayEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcGatewayEndpointRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public CreateVpcGatewayEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateVpcGatewayEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpcGatewayEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpcGatewayEndpointRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreateVpcGatewayEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcGatewayEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpcGatewayEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpcGatewayEndpointRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateVpcGatewayEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
