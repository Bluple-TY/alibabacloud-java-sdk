// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeCdnSubListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSubListRequest self = new DescribeCdnSubListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSubListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
