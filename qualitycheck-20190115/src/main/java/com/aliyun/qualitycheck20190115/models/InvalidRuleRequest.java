// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InvalidRuleRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static InvalidRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidRuleRequest self = new InvalidRuleRequest();
        return TeaModel.build(map, self);
    }

    public InvalidRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
