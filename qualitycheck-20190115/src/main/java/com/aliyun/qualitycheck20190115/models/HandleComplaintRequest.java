// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class HandleComplaintRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static HandleComplaintRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleComplaintRequest self = new HandleComplaintRequest();
        return TeaModel.build(map, self);
    }

    public HandleComplaintRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
