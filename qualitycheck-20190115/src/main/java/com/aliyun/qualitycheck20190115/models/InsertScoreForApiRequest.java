// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertScoreForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static InsertScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertScoreForApiRequest self = new InsertScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public InsertScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
