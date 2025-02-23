// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartNamespaceResponseBody extends TeaModel {
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    @NameInMap("Code")
    public String code;

    @NameInMap("DefaultRepoType")
    public String defaultRepoType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("NamespaceStatus")
    public String namespaceStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetChartNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChartNamespaceResponseBody self = new GetChartNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChartNamespaceResponseBody setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public GetChartNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChartNamespaceResponseBody setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public GetChartNamespaceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetChartNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetChartNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetChartNamespaceResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetChartNamespaceResponseBody setNamespaceStatus(String namespaceStatus) {
        this.namespaceStatus = namespaceStatus;
        return this;
    }
    public String getNamespaceStatus() {
        return this.namespaceStatus;
    }

    public GetChartNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChartNamespaceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
