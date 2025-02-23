// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsResponseBody extends TeaModel {
    // Details about desktop groups.
    @NameInMap("DesktopGroups")
    public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> desktopGroups;

    // The token that determines the start point of the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupsResponseBody self = new DescribeDesktopGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupsResponseBody setDesktopGroups(java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> desktopGroups) {
        this.desktopGroups = desktopGroups;
        return this;
    }
    public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> getDesktopGroups() {
        return this.desktopGroups;
    }

    public DescribeDesktopGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopGroupsResponseBodyDesktopGroups extends TeaModel {
        // The number of sessions that are allowed for each cloud desktop in the multi-session desktop group.
        @NameInMap("BindAmount")
        public Long bindAmount;

        // The remarks on the desktop group.
        @NameInMap("Comments")
        public String comments;

        @NameInMap("ConnectDuration")
        public Long connectDuration;

        // The number of vCPUs.
        @NameInMap("Cpu")
        public Integer cpu;

        // The time when the desktop group was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The ID of the Alibaba Cloud account that is used to create the desktop group.
        @NameInMap("Creator")
        public String creator;

        // The type of the data disk.
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        // The size of the data disk. Unit: GiB.
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        // The ID of the desktop group.
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        // The name of the desktop group.
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        // The number of users that are authorized to use the desktop group.
        @NameInMap("EndUserCount")
        public Integer endUserCount;

        // The time when the subscription cloud desktop expires.
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // The number of GPUs.
        @NameInMap("GpuCount")
        public Float gpuCount;

        // The GPU memory.
        @NameInMap("GpuSpec")
        public String gpuSpec;

        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        // The ID of the image.
        @NameInMap("ImageId")
        public String imageId;

        // The retention period during which the cloud desktop remains connected after the regular user disconnects from the cloud desktop. Unit: ms.
        @NameInMap("KeepDuration")
        public Long keepDuration;

        // The load balancing policy of the multi-session desktop group.
        @NameInMap("LoadPolicy")
        public Long loadPolicy;

        // The maximum number of cloud desktops that the desktop group can hold.
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        // The size of the memory. Unit: MiB.
        @NameInMap("Memory")
        public Long memory;

        // The minimum number of desktops that the desktop group must retain.
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        // The ID of the workspace.
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        // The name of the workspace.
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        // The account type of the workspace.
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        // The ID of the desktop template.
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        // The name of the desktop template.
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        // The type of the desktop group.
        @NameInMap("OwnType")
        public Long ownType;

        // The billing method of the desktop group.
        @NameInMap("PayType")
        public String payType;

        // The ID of the policy.
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        // The name of the policy.
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        // Indicates which type of disk used by cloud desktops in the desktop group is reset.
        @NameInMap("ResetType")
        public Long resetType;

        // The payment status of the desktop group.
        @NameInMap("Status")
        public Integer status;

        @NameInMap("StopDuration")
        public Long stopDuration;

        // The type of the system disk.
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        // The size of the system disk. Unit: GiB.
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("Version")
        public Integer version;

        // Indicates whether disk encryption is enabled.
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        // The ID of the Key Management Service (KMS) key for the disk.
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static DescribeDesktopGroupsResponseBodyDesktopGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupsResponseBodyDesktopGroups self = new DescribeDesktopGroupsResponseBodyDesktopGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setBindAmount(Long bindAmount) {
            this.bindAmount = bindAmount;
            return this;
        }
        public Long getBindAmount() {
            return this.bindAmount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setConnectDuration(Long connectDuration) {
            this.connectDuration = connectDuration;
            return this;
        }
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setEndUserCount(Integer endUserCount) {
            this.endUserCount = endUserCount;
            return this;
        }
        public Integer getEndUserCount() {
            return this.endUserCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setIdleDisconnectDuration(Long idleDisconnectDuration) {
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }
        public Long getIdleDisconnectDuration() {
            return this.idleDisconnectDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setLoadPolicy(Long loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
        public Long getLoadPolicy() {
            return this.loadPolicy;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setMaxDesktopsCount(Integer maxDesktopsCount) {
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setMinDesktopsCount(Integer minDesktopsCount) {
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOwnBundleId(String ownBundleId) {
            this.ownBundleId = ownBundleId;
            return this;
        }
        public String getOwnBundleId() {
            return this.ownBundleId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOwnBundleName(String ownBundleName) {
            this.ownBundleName = ownBundleName;
            return this;
        }
        public String getOwnBundleName() {
            return this.ownBundleName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOwnType(Long ownType) {
            this.ownType = ownType;
            return this;
        }
        public Long getOwnType() {
            return this.ownType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setRatioThreshold(Float ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setResetType(Long resetType) {
            this.resetType = resetType;
            return this;
        }
        public Long getResetType() {
            return this.resetType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setStopDuration(Long stopDuration) {
            this.stopDuration = stopDuration;
            return this;
        }
        public Long getStopDuration() {
            return this.stopDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
