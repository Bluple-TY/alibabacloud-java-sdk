// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAncestorsRequest extends TeaModel {
    @NameInMap("ChildId")
    public String childId;

    public static ListAncestorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAncestorsRequest self = new ListAncestorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAncestorsRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

}
