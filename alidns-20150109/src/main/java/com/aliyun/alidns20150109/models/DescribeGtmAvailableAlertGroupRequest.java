// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAvailableAlertGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeGtmAvailableAlertGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAvailableAlertGroupRequest self = new DescribeGtmAvailableAlertGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAvailableAlertGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmAvailableAlertGroupRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
