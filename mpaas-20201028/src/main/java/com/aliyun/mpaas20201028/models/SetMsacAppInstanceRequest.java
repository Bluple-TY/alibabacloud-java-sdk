// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SetMsacAppInstanceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("mpaasMappcenterMsacSetAppInstanceJsonStr")
    public String mpaasMappcenterMsacSetAppInstanceJsonStr;

    public static SetMsacAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMsacAppInstanceRequest self = new SetMsacAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SetMsacAppInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetMsacAppInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SetMsacAppInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SetMsacAppInstanceRequest setMpaasMappcenterMsacSetAppInstanceJsonStr(String mpaasMappcenterMsacSetAppInstanceJsonStr) {
        this.mpaasMappcenterMsacSetAppInstanceJsonStr = mpaasMappcenterMsacSetAppInstanceJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacSetAppInstanceJsonStr() {
        return this.mpaasMappcenterMsacSetAppInstanceJsonStr;
    }

}
