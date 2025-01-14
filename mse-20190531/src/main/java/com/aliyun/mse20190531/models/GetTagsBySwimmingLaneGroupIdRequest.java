// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetTagsBySwimmingLaneGroupIdRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the lane group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    public static GetTagsBySwimmingLaneGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagsBySwimmingLaneGroupIdRequest self = new GetTagsBySwimmingLaneGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTagsBySwimmingLaneGroupIdRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetTagsBySwimmingLaneGroupIdRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
