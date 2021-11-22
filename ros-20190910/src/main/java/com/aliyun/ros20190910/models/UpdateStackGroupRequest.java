// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    @NameInMap("AutoDeployment")
    public UpdateStackGroupRequestAutoDeployment autoDeployment;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeploymentTargets")
    public UpdateStackGroupRequestDeploymentTargets deploymentTargets;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupRequestParameters> parameters;

    @NameInMap("PermissionModel")
    public String permissionModel;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupRequest self = new UpdateStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public UpdateStackGroupRequest setAdministrationRoleName(String administrationRoleName) {
        this.administrationRoleName = administrationRoleName;
        return this;
    }
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    public UpdateStackGroupRequest setAutoDeployment(UpdateStackGroupRequestAutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }
    public UpdateStackGroupRequestAutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    public UpdateStackGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackGroupRequest setDeploymentTargets(UpdateStackGroupRequestDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public UpdateStackGroupRequestDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    public UpdateStackGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStackGroupRequest setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    public UpdateStackGroupRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackGroupRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public UpdateStackGroupRequest setParameters(java.util.List<UpdateStackGroupRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackGroupRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateStackGroupRequest setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }
    public String getPermissionModel() {
        return this.permissionModel;
    }

    public UpdateStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackGroupRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public UpdateStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackGroupRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackGroupRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackGroupRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackGroupRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class UpdateStackGroupRequestAutoDeployment extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("RetainStacksOnAccountRemoval")
        public Boolean retainStacksOnAccountRemoval;

        public static UpdateStackGroupRequestAutoDeployment build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestAutoDeployment self = new UpdateStackGroupRequestAutoDeployment();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestAutoDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateStackGroupRequestAutoDeployment setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

    }

    public static class UpdateStackGroupRequestDeploymentTargets extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static UpdateStackGroupRequestDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestDeploymentTargets self = new UpdateStackGroupRequestDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestDeploymentTargets setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        public UpdateStackGroupRequestDeploymentTargets setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

    }

    public static class UpdateStackGroupRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackGroupRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestParameters self = new UpdateStackGroupRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackGroupRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
