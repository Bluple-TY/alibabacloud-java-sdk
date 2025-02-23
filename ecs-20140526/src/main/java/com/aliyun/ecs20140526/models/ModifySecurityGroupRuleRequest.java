// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>The transport layer protocol of the security group rule. The values of this parameter are case-insensitive. Valid values:</p>
     * <br>
     * <p>*   ICMP</p>
     * <p>*   GRE</p>
     * <p>*   TCP</p>
     * <p>*   UDP</p>
     * <p>*   ALL</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The destination IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.</p>
     * <br>
     * <p>> Only the IP addresses of the VPC type are supported. You cannot specify both the Ipv6DestCidrIp parameter and the `DestCidrIp` parameter.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    /**
     * <p>The source IPv6 CIDR block to which you want to control access. CIDR blocks and IPv6 addresses are supported.</p>
     * <br>
     * <p>> Only the IP addresses of the Virtual Private Cloud (VPC) type are supported. You cannot specify both the Ipv6SourceCidrIp parameter and the `SourceCidrIp` parameter.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>You cannot modify this parameter when you modify a security group rule by specifying its ID.\</p>
     * <p>You can add a new rule that meets your requirements and delete the original rule.</p>
     */
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The action of the security group rule that determines whether to allow access. Valid values:</p>
     * <br>
     * <p>*   accept: allows access.</p>
     * <p>*   drop: denies access and returns no responses.</p>
     * <br>
     * <p>Default value: accept.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of source ports that correspond to the transport layer protocol. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
     * <p>*   If the IpProtocol parameter is set to icmp, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   If the IpProtocol parameter is set to gre, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   If the IpProtocol parameter is set to all, the port number range is -1/-1, which indicates all ports.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the security group rule. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the security group rule.\</p>
     * <p>This parameter is required when you modify a security group rule based on the ID of the security group rule.</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public String securityGroupRuleId;

    /**
     * <p>The source IPv4 CIDR block to which you want to control access. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The ID of the source security group. At least one of `SourceGroupId` and `SourceCidrIp` must be specified.</p>
     * <br>
     * <p>*   If `SourceGroupId` is specified but `SourceCidrIp` is not specified, the `NicType` parameter must be set to intranet.</p>
     * <p>*   If both `SourceGroupId` and `SourceCidrIp` are specified, `SourceCidrIp` takes precedence.</p>
     */
    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    /**
     * <p>The Alibaba Cloud account that manages the source security group when you set a security group rule across accounts.</p>
     * <br>
     * <p>*   If both `SourceGroupOwnerId` and `SourceGroupOwnerAccount` are empty, access permissions are configured for another security group managed by your account.</p>
     * <p>*   If `SourceCidrIp` is specified, the `SourceGroupOwnerAccount` parameter is ignored.</p>
     */
    @NameInMap("SourceGroupOwnerAccount")
    public String sourceGroupOwnerAccount;

    /**
     * <p>The Alibaba Cloud account that manages the source security group when you set a security group rule across accounts.</p>
     * <br>
     * <p>*   If both `SourceGroupOwnerId` and `SourceGroupOwnerAccount` are empty, access permissions are configured for another security group managed by your account.</p>
     * <p>*   If `SourceCidrIp` is specified, the `SourceGroupOwnerId` parameter is ignored.</p>
     */
    @NameInMap("SourceGroupOwnerId")
    public Long sourceGroupOwnerId;

    /**
     * <p>The range of source ports that correspond to the transport layer protocol. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
     * <p>*   If the IpProtocol parameter is set to icmp, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   If the IpProtocol parameter is set to gre, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   If the IpProtocol parameter is set to all, the port number range is -1/-1, which indicates all ports.</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The ID of the source prefix list to which you want to control access. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.</p>
     * <br>
     * <p>If you specify the `SourceCidrIp`, `Ipv6SourceCidrIp`, or `SourceGroupId` parameter, this parameter is ignored.</p>
     */
    @NameInMap("SourcePrefixListId")
    public String sourcePrefixListId;

    public static ModifySecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupRuleRequest self = new ModifySecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityGroupRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySecurityGroupRuleRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public ModifySecurityGroupRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifySecurityGroupRuleRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public ModifySecurityGroupRuleRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public ModifySecurityGroupRuleRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public ModifySecurityGroupRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityGroupRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityGroupRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifySecurityGroupRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifySecurityGroupRuleRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifySecurityGroupRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityGroupRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityGroupRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityGroupRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifySecurityGroupRuleRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public ModifySecurityGroupRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifySecurityGroupRuleRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public ModifySecurityGroupRuleRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public ModifySecurityGroupRuleRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    public ModifySecurityGroupRuleRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public ModifySecurityGroupRuleRequest setSourcePrefixListId(String sourcePrefixListId) {
        this.sourcePrefixListId = sourcePrefixListId;
        return this;
    }
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

}
