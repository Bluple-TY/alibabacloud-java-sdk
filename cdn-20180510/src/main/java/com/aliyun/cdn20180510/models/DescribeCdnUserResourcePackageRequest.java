// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserResourcePackageRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // Resource plan status:
    // 
    // *   **valid**: valid
    // *   **closed**: invalid
    @NameInMap("Status")
    public String status;

    public static DescribeCdnUserResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserResourcePackageRequest self = new DescribeCdnUserResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserResourcePackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnUserResourcePackageRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeCdnUserResourcePackageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
