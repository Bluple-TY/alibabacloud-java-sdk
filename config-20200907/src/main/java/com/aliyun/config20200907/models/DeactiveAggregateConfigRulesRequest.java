// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveAggregateConfigRulesRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DeactiveAggregateConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactiveAggregateConfigRulesRequest self = new DeactiveAggregateConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeactiveAggregateConfigRulesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public DeactiveAggregateConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
