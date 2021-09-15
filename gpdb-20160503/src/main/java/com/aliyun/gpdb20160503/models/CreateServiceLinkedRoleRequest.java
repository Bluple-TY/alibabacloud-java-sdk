// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleRequest self = new CreateServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceLinkedRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
