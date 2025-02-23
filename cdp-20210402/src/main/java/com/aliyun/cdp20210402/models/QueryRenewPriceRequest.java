// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewPriceRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static QueryRenewPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceRequest self = new QueryRenewPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryRenewPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRenewPriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
