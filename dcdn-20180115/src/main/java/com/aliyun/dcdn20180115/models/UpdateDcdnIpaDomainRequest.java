// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnIpaDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to modify. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The list of origin URLs.</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The top-level domain name.</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static UpdateDcdnIpaDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnIpaDomainRequest self = new UpdateDcdnIpaDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnIpaDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnIpaDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDcdnIpaDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateDcdnIpaDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateDcdnIpaDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public UpdateDcdnIpaDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
