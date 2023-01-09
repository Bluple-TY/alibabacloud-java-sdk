// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDetailResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public QueryClusterDetailResponseBodyData data;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailResponseBody self = new QueryClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterDetailResponseBody setData(QueryClusterDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryClusterDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterDetailResponseBodyDataInstanceModels extends TeaModel {
        // The timestamp when the instance node was created.
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        // The health status of the instance node.
        @NameInMap("HealthStatus")
        public String healthStatus;

        // The public IP address.
        @NameInMap("InternetIp")
        public String internetIp;

        // The IP address of the node.
        @NameInMap("Ip")
        public String ip;

        // The name of the pod.
        @NameInMap("PodName")
        public String podName;

        // The role.
        @NameInMap("Role")
        public String role;

        // The single-thread IP address.
        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        // The zone.
        @NameInMap("Zone")
        public String zone;

        public static QueryClusterDetailResponseBodyDataInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyDataInstanceModels self = new QueryClusterDetailResponseBodyDataInstanceModels();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setSingleTunnelVip(String singleTunnelVip) {
            this.singleTunnelVip = singleTunnelVip;
            return this;
        }
        public String getSingleTunnelVip() {
            return this.singleTunnelVip;
        }

        public QueryClusterDetailResponseBodyDataInstanceModels setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryClusterDetailResponseBodyData extends TeaModel {
        // The whitelist.
        @NameInMap("AclEntryList")
        public String aclEntryList;

        // The ID of the whitelist.
        @NameInMap("AclId")
        public String aclId;

        // The application version.
        @NameInMap("AppVersion")
        public String appVersion;

        // The billing method, such as subscription or pay-as-you-go.
        @NameInMap("ChargeType")
        public String chargeType;

        // The alias of the instance.
        @NameInMap("ClusterAliasName")
        public String clusterAliasName;

        // The name of the instance.
        @NameInMap("ClusterName")
        public String clusterName;

        // The engine specifications.
        @NameInMap("ClusterSpecification")
        public String clusterSpecification;

        // The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.
        @NameInMap("ClusterType")
        public String clusterType;

        // The version of the instance.
        @NameInMap("ClusterVersion")
        public String clusterVersion;

        // The network connection type. Valid values:
        // 
        // *   slb
        // *   eni
        @NameInMap("ConnectionType")
        public String connectionType;

        // The number of vCPUs.
        @NameInMap("Cpu")
        public Integer cpu;

        // The time when the instance was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The capacity of the disk. Unit: GB.
        @NameInMap("DiskCapacity")
        public Long diskCapacity;

        // The type of the disk.
        @NameInMap("DiskType")
        public String diskType;

        // The health status of the instance.
        @NameInMap("HealthStatus")
        public String healthStatus;

        // The amount of time taken to create the instance. Unit: milliseconds.
        @NameInMap("InitCostTime")
        public Long initCostTime;

        // The creation status of the instance.
        @NameInMap("InitStatus")
        public String initStatus;

        // The number of instance nodes.
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The list of instance nodes.
        @NameInMap("InstanceModels")
        public java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> instanceModels;

        // The public IP address of the instance.
        @NameInMap("InternetAddress")
        public String internetAddress;

        // The public endpoint of the instance.
        @NameInMap("InternetDomain")
        public String internetDomain;

        // The private port number.
        @NameInMap("InternetPort")
        public String internetPort;

        // The internal IP address.
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        // The internal endpoint of the instance.
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        // The private port number.
        @NameInMap("IntranetPort")
        public String intranetPort;

        // The size of the memory. Unit: GB.
        @NameInMap("MemoryCapacity")
        public Long memoryCapacity;

        // The edition of Microservices Engine (MSE).
        @NameInMap("MseVersion")
        public String mseVersion;

        // The network type of the instance. Valid values:
        // 
        // *   `privatenet`: VPC
        // *   `pubnet`: Internet
        @NameInMap("NetType")
        public String netType;

        // The version number of the original order.
        @NameInMap("OrderClusterVersion")
        public String orderClusterVersion;

        // The billing method, such as subscription or pay-as-you-go.
        @NameInMap("PayInfo")
        public String payInfo;

        // The public bandwidth. Unit: Mbit/s.\
        // Valid values: 0 to 5000. The value 0 indicates no access to the Internet.
        @NameInMap("PubNetworkFlow")
        public String pubNetworkFlow;

        // The region ID.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The tags that are attached to the instance.
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        // The ID of the vSwitch.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The ID of the virtual private cloud (VPC).
        @NameInMap("VpcId")
        public String vpcId;

        public static QueryClusterDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyData self = new QueryClusterDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyData setAclEntryList(String aclEntryList) {
            this.aclEntryList = aclEntryList;
            return this;
        }
        public String getAclEntryList() {
            return this.aclEntryList;
        }

        public QueryClusterDetailResponseBodyData setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public QueryClusterDetailResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryClusterDetailResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryClusterDetailResponseBodyData setClusterAliasName(String clusterAliasName) {
            this.clusterAliasName = clusterAliasName;
            return this;
        }
        public String getClusterAliasName() {
            return this.clusterAliasName;
        }

        public QueryClusterDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryClusterDetailResponseBodyData setClusterSpecification(String clusterSpecification) {
            this.clusterSpecification = clusterSpecification;
            return this;
        }
        public String getClusterSpecification() {
            return this.clusterSpecification;
        }

        public QueryClusterDetailResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public QueryClusterDetailResponseBodyData setClusterVersion(String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        public QueryClusterDetailResponseBodyData setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public QueryClusterDetailResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryClusterDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryClusterDetailResponseBodyData setDiskCapacity(Long diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Long getDiskCapacity() {
            return this.diskCapacity;
        }

        public QueryClusterDetailResponseBodyData setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public QueryClusterDetailResponseBodyData setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public QueryClusterDetailResponseBodyData setInitCostTime(Long initCostTime) {
            this.initCostTime = initCostTime;
            return this;
        }
        public Long getInitCostTime() {
            return this.initCostTime;
        }

        public QueryClusterDetailResponseBodyData setInitStatus(String initStatus) {
            this.initStatus = initStatus;
            return this;
        }
        public String getInitStatus() {
            return this.initStatus;
        }

        public QueryClusterDetailResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public QueryClusterDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryClusterDetailResponseBodyData setInstanceModels(java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> instanceModels) {
            this.instanceModels = instanceModels;
            return this;
        }
        public java.util.List<QueryClusterDetailResponseBodyDataInstanceModels> getInstanceModels() {
            return this.instanceModels;
        }

        public QueryClusterDetailResponseBodyData setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public QueryClusterDetailResponseBodyData setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public QueryClusterDetailResponseBodyData setInternetPort(String internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public String getInternetPort() {
            return this.internetPort;
        }

        public QueryClusterDetailResponseBodyData setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public QueryClusterDetailResponseBodyData setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public QueryClusterDetailResponseBodyData setIntranetPort(String intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public String getIntranetPort() {
            return this.intranetPort;
        }

        public QueryClusterDetailResponseBodyData setMemoryCapacity(Long memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public Long getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public QueryClusterDetailResponseBodyData setMseVersion(String mseVersion) {
            this.mseVersion = mseVersion;
            return this;
        }
        public String getMseVersion() {
            return this.mseVersion;
        }

        public QueryClusterDetailResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryClusterDetailResponseBodyData setOrderClusterVersion(String orderClusterVersion) {
            this.orderClusterVersion = orderClusterVersion;
            return this;
        }
        public String getOrderClusterVersion() {
            return this.orderClusterVersion;
        }

        public QueryClusterDetailResponseBodyData setPayInfo(String payInfo) {
            this.payInfo = payInfo;
            return this;
        }
        public String getPayInfo() {
            return this.payInfo;
        }

        public QueryClusterDetailResponseBodyData setPubNetworkFlow(String pubNetworkFlow) {
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }
        public String getPubNetworkFlow() {
            return this.pubNetworkFlow;
        }

        public QueryClusterDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryClusterDetailResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public QueryClusterDetailResponseBodyData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public QueryClusterDetailResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public QueryClusterDetailResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
