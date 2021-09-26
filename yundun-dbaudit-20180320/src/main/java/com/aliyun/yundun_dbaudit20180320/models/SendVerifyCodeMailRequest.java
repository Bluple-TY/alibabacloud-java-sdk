// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class SendVerifyCodeMailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mail")
    public String mail;

    public static SendVerifyCodeMailRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeMailRequest self = new SendVerifyCodeMailRequest();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeMailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SendVerifyCodeMailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendVerifyCodeMailRequest setMail(String mail) {
        this.mail = mail;
        return this;
    }
    public String getMail() {
        return this.mail;
    }

}
