// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setInstanceAttribute(DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttribute extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ImageVersionName")
        public String imageVersionName;

        @NameInMap("SeriesCode")
        public String seriesCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("AccessType")
        public Integer accessType;

        @NameInMap("EcsStatus")
        public String ecsStatus;

        @NameInMap("Operatable")
        public Boolean operatable;

        @NameInMap("PlanUpgradeStatus")
        public Integer planUpgradeStatus;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Upgradeable")
        public Boolean upgradeable;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Renewable")
        public Boolean renewable;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("UpgradeStatus")
        public Integer upgradeStatus;

        @NameInMap("PlanUpgradeable")
        public Boolean planUpgradeable;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("PublicAccessControl")
        public Integer publicAccessControl;

        @NameInMap("PublicWhiteList")
        public java.util.List<String> publicWhiteList;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("PrivateWhiteList")
        public java.util.List<String> privateWhiteList;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setImageVersionName(String imageVersionName) {
            this.imageVersionName = imageVersionName;
            return this;
        }
        public String getImageVersionName() {
            return this.imageVersionName;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAccessType(Integer accessType) {
            this.accessType = accessType;
            return this;
        }
        public Integer getAccessType() {
            return this.accessType;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setEcsStatus(String ecsStatus) {
            this.ecsStatus = ecsStatus;
            return this;
        }
        public String getEcsStatus() {
            return this.ecsStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setOperatable(Boolean operatable) {
            this.operatable = operatable;
            return this;
        }
        public Boolean getOperatable() {
            return this.operatable;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPlanUpgradeStatus(Integer planUpgradeStatus) {
            this.planUpgradeStatus = planUpgradeStatus;
            return this;
        }
        public Integer getPlanUpgradeStatus() {
            return this.planUpgradeStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setUpgradeable(Boolean upgradeable) {
            this.upgradeable = upgradeable;
            return this;
        }
        public Boolean getUpgradeable() {
            return this.upgradeable;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRenewable(Boolean renewable) {
            this.renewable = renewable;
            return this;
        }
        public Boolean getRenewable() {
            return this.renewable;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setUpgradeStatus(Integer upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public Integer getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPlanUpgradeable(Boolean planUpgradeable) {
            this.planUpgradeable = planUpgradeable;
            return this;
        }
        public Boolean getPlanUpgradeable() {
            return this.planUpgradeable;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicAccessControl(Integer publicAccessControl) {
            this.publicAccessControl = publicAccessControl;
            return this;
        }
        public Integer getPublicAccessControl() {
            return this.publicAccessControl;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicWhiteList(java.util.List<String> publicWhiteList) {
            this.publicWhiteList = publicWhiteList;
            return this;
        }
        public java.util.List<String> getPublicWhiteList() {
            return this.publicWhiteList;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPrivateWhiteList(java.util.List<String> privateWhiteList) {
            this.privateWhiteList = privateWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateWhiteList() {
            return this.privateWhiteList;
        }

    }

}
