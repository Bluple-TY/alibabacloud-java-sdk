// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotCriteriaRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeVpcHoneyPotCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHoneyPotCriteriaRequest self = new DescribeVpcHoneyPotCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHoneyPotCriteriaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
