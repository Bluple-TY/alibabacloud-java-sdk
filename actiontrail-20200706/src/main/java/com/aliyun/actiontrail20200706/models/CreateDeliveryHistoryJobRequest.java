// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateDeliveryHistoryJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TrailName")
    public String trailName;

    public static CreateDeliveryHistoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryHistoryJobRequest self = new CreateDeliveryHistoryJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryHistoryJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDeliveryHistoryJobRequest setTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }
    public String getTrailName() {
        return this.trailName;
    }

}
