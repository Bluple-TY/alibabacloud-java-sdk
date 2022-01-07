// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppDomainListOpenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryStudioAppDomainListOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppDomainListOpenRequest self = new QueryStudioAppDomainListOpenRequest();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppDomainListOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryStudioAppDomainListOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryStudioAppDomainListOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
