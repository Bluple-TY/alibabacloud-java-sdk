// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDeployGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("DeployGroupList")
    public ListDeployGroupResponseBodyDeployGroupList deployGroupList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeployGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployGroupResponseBody self = new ListDeployGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeployGroupResponseBody setDeployGroupList(ListDeployGroupResponseBodyDeployGroupList deployGroupList) {
        this.deployGroupList = deployGroupList;
        return this;
    }
    public ListDeployGroupResponseBodyDeployGroupList getDeployGroupList() {
        return this.deployGroupList;
    }

    public ListDeployGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeployGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeployGroupResponseBodyDeployGroupListDeployGroup extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("BaseComponentMetaName")
        public String baseComponentMetaName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("CpuLimit")
        public String cpuLimit;

        @NameInMap("CpuRequest")
        public String cpuRequest;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CsClusterId")
        public String csClusterId;

        @NameInMap("DeploymentName")
        public String deploymentName;

        @NameInMap("Env")
        public String env;

        @NameInMap("EphemeralStorageLimit")
        public String ephemeralStorageLimit;

        @NameInMap("EphemeralStorageRequest")
        public String ephemeralStorageRequest;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public Integer groupType;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        @NameInMap("MemoryLimit")
        public String memoryLimit;

        @NameInMap("MemoryRequest")
        public String memoryRequest;

        @NameInMap("NameSpace")
        public String nameSpace;

        @NameInMap("PackagePublicUrl")
        public String packagePublicUrl;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("PackageVersionId")
        public String packageVersionId;

        @NameInMap("PostStart")
        public String postStart;

        @NameInMap("PreStop")
        public String preStop;

        @NameInMap("Reversion")
        public String reversion;

        @NameInMap("Selector")
        public String selector;

        @NameInMap("Status")
        public String status;

        @NameInMap("Strategy")
        public String strategy;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("VExtServerGroupId")
        public String VExtServerGroupId;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static ListDeployGroupResponseBodyDeployGroupListDeployGroup build(java.util.Map<String, ?> map) throws Exception {
            ListDeployGroupResponseBodyDeployGroupListDeployGroup self = new ListDeployGroupResponseBodyDeployGroupListDeployGroup();
            return TeaModel.build(map, self);
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setBaseComponentMetaName(String baseComponentMetaName) {
            this.baseComponentMetaName = baseComponentMetaName;
            return this;
        }
        public String getBaseComponentMetaName() {
            return this.baseComponentMetaName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setEphemeralStorageLimit(String ephemeralStorageLimit) {
            this.ephemeralStorageLimit = ephemeralStorageLimit;
            return this;
        }
        public String getEphemeralStorageLimit() {
            return this.ephemeralStorageLimit;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setEphemeralStorageRequest(String ephemeralStorageRequest) {
            this.ephemeralStorageRequest = ephemeralStorageRequest;
            return this;
        }
        public String getEphemeralStorageRequest() {
            return this.ephemeralStorageRequest;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setGroupType(Integer groupType) {
            this.groupType = groupType;
            return this;
        }
        public Integer getGroupType() {
            return this.groupType;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackagePublicUrl(String packagePublicUrl) {
            this.packagePublicUrl = packagePublicUrl;
            return this;
        }
        public String getPackagePublicUrl() {
            return this.packagePublicUrl;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setReversion(String reversion) {
            this.reversion = reversion;
            return this;
        }
        public String getReversion() {
            return this.reversion;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setVExtServerGroupId(String VExtServerGroupId) {
            this.VExtServerGroupId = VExtServerGroupId;
            return this;
        }
        public String getVExtServerGroupId() {
            return this.VExtServerGroupId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class ListDeployGroupResponseBodyDeployGroupList extends TeaModel {
        @NameInMap("DeployGroup")
        public java.util.List<ListDeployGroupResponseBodyDeployGroupListDeployGroup> deployGroup;

        public static ListDeployGroupResponseBodyDeployGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListDeployGroupResponseBodyDeployGroupList self = new ListDeployGroupResponseBodyDeployGroupList();
            return TeaModel.build(map, self);
        }

        public ListDeployGroupResponseBodyDeployGroupList setDeployGroup(java.util.List<ListDeployGroupResponseBodyDeployGroupListDeployGroup> deployGroup) {
            this.deployGroup = deployGroup;
            return this;
        }
        public java.util.List<ListDeployGroupResponseBodyDeployGroupListDeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

    }

}
