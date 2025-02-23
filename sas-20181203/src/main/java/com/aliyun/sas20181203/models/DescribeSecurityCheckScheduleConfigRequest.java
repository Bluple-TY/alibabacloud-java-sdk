// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityCheckScheduleConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecurityCheckScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityCheckScheduleConfigRequest self = new DescribeSecurityCheckScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityCheckScheduleConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecurityCheckScheduleConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSecurityCheckScheduleConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
