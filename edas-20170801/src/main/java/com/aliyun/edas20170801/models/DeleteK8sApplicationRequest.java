// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sApplicationRequest self = new DeleteK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteK8sApplicationRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
