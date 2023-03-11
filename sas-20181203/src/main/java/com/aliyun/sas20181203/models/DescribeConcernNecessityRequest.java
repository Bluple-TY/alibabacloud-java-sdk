// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeConcernNecessityRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeConcernNecessityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConcernNecessityRequest self = new DescribeConcernNecessityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConcernNecessityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
