// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDataServiceApiRequest extends TeaModel {
    @NameInMap("ApiDescription")
    public String apiDescription;

    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Protocols")
    public String protocols;

    @NameInMap("RegistrationDetails")
    public String registrationDetails;

    @NameInMap("RequestMethod")
    public Integer requestMethod;

    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    @NameInMap("ResponseContentType")
    public Integer responseContentType;

    @NameInMap("ScriptDetails")
    public String scriptDetails;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("VisibleRange")
    public Integer visibleRange;

    @NameInMap("WizardDetails")
    public String wizardDetails;

    public static UpdateDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceApiRequest self = new UpdateDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceApiRequest setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
        return this;
    }
    public String getApiDescription() {
        return this.apiDescription;
    }

    public UpdateDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public UpdateDataServiceApiRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public UpdateDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataServiceApiRequest setProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }
    public String getProtocols() {
        return this.protocols;
    }

    public UpdateDataServiceApiRequest setRegistrationDetails(String registrationDetails) {
        this.registrationDetails = registrationDetails;
        return this;
    }
    public String getRegistrationDetails() {
        return this.registrationDetails;
    }

    public UpdateDataServiceApiRequest setRequestMethod(Integer requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public Integer getRequestMethod() {
        return this.requestMethod;
    }

    public UpdateDataServiceApiRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateDataServiceApiRequest setResponseContentType(Integer responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public Integer getResponseContentType() {
        return this.responseContentType;
    }

    public UpdateDataServiceApiRequest setScriptDetails(String scriptDetails) {
        this.scriptDetails = scriptDetails;
        return this;
    }
    public String getScriptDetails() {
        return this.scriptDetails;
    }

    public UpdateDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UpdateDataServiceApiRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateDataServiceApiRequest setVisibleRange(Integer visibleRange) {
        this.visibleRange = visibleRange;
        return this;
    }
    public Integer getVisibleRange() {
        return this.visibleRange;
    }

    public UpdateDataServiceApiRequest setWizardDetails(String wizardDetails) {
        this.wizardDetails = wizardDetails;
        return this;
    }
    public String getWizardDetails() {
        return this.wizardDetails;
    }

}
