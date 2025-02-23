// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RollbackStagingConfigRequest extends TeaModel {
    // The accelerated domain name. You can specify only one domain name in each call.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static RollbackStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackStagingConfigRequest self = new RollbackStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public RollbackStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RollbackStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
