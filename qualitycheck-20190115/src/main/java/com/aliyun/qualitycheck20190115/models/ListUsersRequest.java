// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
