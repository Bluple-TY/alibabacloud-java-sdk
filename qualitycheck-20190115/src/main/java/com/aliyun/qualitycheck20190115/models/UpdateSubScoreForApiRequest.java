// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSubScoreForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateSubScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubScoreForApiRequest self = new UpdateSubScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
