// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMsacTinyAppInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public Long type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMsacTinyAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMsacTinyAppInfoRequest self = new GetMsacTinyAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMsacTinyAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMsacTinyAppInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMsacTinyAppInfoRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public GetMsacTinyAppInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
