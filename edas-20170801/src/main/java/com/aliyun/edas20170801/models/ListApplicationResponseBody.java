// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationList")
    public ListApplicationResponseBodyApplicationList applicationList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponseBody self = new ListApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponseBody setApplicationList(ListApplicationResponseBodyApplicationList applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public ListApplicationResponseBodyApplicationList getApplicationList() {
        return this.applicationList;
    }

    public ListApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationResponseBodyApplicationListApplication extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        @NameInMap("ExtSlbListenerPort")
        public Integer extSlbListenerPort;

        @NameInMap("Instances")
        public Integer instances;

        @NameInMap("Name")
        public String name;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbListenerPort")
        public Integer slbListenerPort;

        @NameInMap("SlbPort")
        public Integer slbPort;

        @NameInMap("State")
        public String state;

        public static ListApplicationResponseBodyApplicationListApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyApplicationListApplication self = new ListApplicationResponseBodyApplicationListApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyApplicationListApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationResponseBodyApplicationListApplication setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListApplicationResponseBodyApplicationListApplication setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public ListApplicationResponseBodyApplicationListApplication setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListApplicationResponseBodyApplicationListApplication setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public ListApplicationResponseBodyApplicationListApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationResponseBodyApplicationListApplication setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public ListApplicationResponseBodyApplicationListApplication setExtSlbListenerPort(Integer extSlbListenerPort) {
            this.extSlbListenerPort = extSlbListenerPort;
            return this;
        }
        public Integer getExtSlbListenerPort() {
            return this.extSlbListenerPort;
        }

        public ListApplicationResponseBodyApplicationListApplication setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationResponseBodyApplicationListApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationResponseBodyApplicationListApplication setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListApplicationResponseBodyApplicationListApplication setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationResponseBodyApplicationListApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationResponseBodyApplicationListApplication setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public ListApplicationResponseBodyApplicationListApplication setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListApplicationResponseBodyApplicationListApplication setSlbListenerPort(Integer slbListenerPort) {
            this.slbListenerPort = slbListenerPort;
            return this;
        }
        public Integer getSlbListenerPort() {
            return this.slbListenerPort;
        }

        public ListApplicationResponseBodyApplicationListApplication setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public ListApplicationResponseBodyApplicationListApplication setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListApplicationResponseBodyApplicationList extends TeaModel {
        @NameInMap("Application")
        public java.util.List<ListApplicationResponseBodyApplicationListApplication> application;

        public static ListApplicationResponseBodyApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyApplicationList self = new ListApplicationResponseBodyApplicationList();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyApplicationList setApplication(java.util.List<ListApplicationResponseBodyApplicationListApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationResponseBodyApplicationListApplication> getApplication() {
            return this.application;
        }

    }

}
