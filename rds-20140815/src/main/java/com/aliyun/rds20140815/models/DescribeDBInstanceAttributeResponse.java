// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstanceAttributeResponseItems items;

    public static DescribeDBInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponse self = new DescribeDBInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceAttributeResponse setItems(DescribeDBInstanceAttributeResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAttributeResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones setSlaveZone(java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone) {
            this.slaveZone = slaveZone;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds extends TeaModel {
        // DBInstanceId
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public java.util.List<String> DBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds setDBInstanceId(java.util.List<String> DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public java.util.List<String> getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra extends TeaModel {
        @NameInMap("ReplicaGroupID")
        @Validation(required = true)
        public String replicaGroupID;

        @NameInMap("ReplicaGroupStatus")
        @Validation(required = true)
        public String replicaGroupStatus;

        @NameInMap("ActiveReplicaDBInstanceID")
        @Validation(required = true)
        public String activeReplicaDBInstanceID;

        @NameInMap("DBInstanceIds")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds DBInstanceIds;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra setReplicaGroupID(String replicaGroupID) {
            this.replicaGroupID = replicaGroupID;
            return this;
        }
        public String getReplicaGroupID() {
            return this.replicaGroupID;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra setReplicaGroupStatus(String replicaGroupStatus) {
            this.replicaGroupStatus = replicaGroupStatus;
            return this;
        }
        public String getReplicaGroupStatus() {
            return this.replicaGroupStatus;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra setActiveReplicaDBInstanceID(String activeReplicaDBInstanceID) {
            this.activeReplicaDBInstanceID = activeReplicaDBInstanceID;
            return this;
        }
        public String getActiveReplicaDBInstanceID() {
            return this.activeReplicaDBInstanceID;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra setDBInstanceIds(DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute extends TeaModel {
        @NameInMap("IPType")
        @Validation(required = true)
        public String IPType;

        @NameInMap("DBInstanceDiskUsed")
        @Validation(required = true)
        public String DBInstanceDiskUsed;

        @NameInMap("GuardDBInstanceName")
        @Validation(required = true)
        public String guardDBInstanceName;

        @NameInMap("CanTempUpgrade")
        @Validation(required = true)
        public Boolean canTempUpgrade;

        @NameInMap("TempUpgradeTimeStart")
        @Validation(required = true)
        public String tempUpgradeTimeStart;

        @NameInMap("TempUpgradeTimeEnd")
        @Validation(required = true)
        public String tempUpgradeTimeEnd;

        @NameInMap("TempUpgradeRecoveryTime")
        @Validation(required = true)
        public String tempUpgradeRecoveryTime;

        @NameInMap("TempUpgradeRecoveryClass")
        @Validation(required = true)
        public String tempUpgradeRecoveryClass;

        @NameInMap("TempUpgradeRecoveryCpu")
        @Validation(required = true)
        public Integer tempUpgradeRecoveryCpu;

        @NameInMap("TempUpgradeRecoveryMemory")
        @Validation(required = true)
        public Integer tempUpgradeRecoveryMemory;

        @NameInMap("TempUpgradeRecoveryMaxIOPS")
        @Validation(required = true)
        public String tempUpgradeRecoveryMaxIOPS;

        @NameInMap("TempUpgradeRecoveryMaxConnections")
        @Validation(required = true)
        public String tempUpgradeRecoveryMaxConnections;

        @NameInMap("InsId")
        @Validation(required = true)
        public Integer insId;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBInstanceClassType")
        @Validation(required = true)
        public String DBInstanceClassType;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("DBInstanceMemory")
        @Validation(required = true)
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceStorage")
        @Validation(required = true)
        public Integer DBInstanceStorage;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("DBInstanceNetType")
        @Validation(required = true)
        public String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("ReadDelayTime")
        @Validation(required = true)
        public String readDelayTime;

        @NameInMap("DBMaxQuantity")
        @Validation(required = true)
        public Integer DBMaxQuantity;

        @NameInMap("AccountMaxQuantity")
        @Validation(required = true)
        public Integer accountMaxQuantity;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("MaintainTime")
        @Validation(required = true)
        public String maintainTime;

        @NameInMap("AvailabilityValue")
        @Validation(required = true)
        public String availabilityValue;

        @NameInMap("MaxIOPS")
        @Validation(required = true)
        public Integer maxIOPS;

        @NameInMap("MaxConnections")
        @Validation(required = true)
        public Integer maxConnections;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("DBInstanceCPU")
        @Validation(required = true)
        public String DBInstanceCPU;

        @NameInMap("IncrementSourceDBInstanceId")
        @Validation(required = true)
        public String incrementSourceDBInstanceId;

        @NameInMap("GuardDBInstanceId")
        @Validation(required = true)
        public String guardDBInstanceId;

        @NameInMap("ReplicateId")
        @Validation(required = true)
        public String replicateId;

        @NameInMap("TempDBInstanceId")
        @Validation(required = true)
        public String tempDBInstanceId;

        @NameInMap("SecurityIPList")
        @Validation(required = true)
        public String securityIPList;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("DBInstanceStorageType")
        @Validation(required = true)
        public String DBInstanceStorageType;

        @NameInMap("AdvancedFeatures")
        @Validation(required = true)
        public String advancedFeatures;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("SupportUpgradeAccountType")
        @Validation(required = true)
        public String supportUpgradeAccountType;

        @NameInMap("SupportCreateSuperAccount")
        @Validation(required = true)
        public String supportCreateSuperAccount;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("ConnectionMode")
        @Validation(required = true)
        public String connectionMode;

        @NameInMap("CurrentKernelVersion")
        @Validation(required = true)
        public String currentKernelVersion;

        @NameInMap("LatestKernelVersion")
        @Validation(required = true)
        public String latestKernelVersion;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        @Validation(required = true)
        public String readonlyInstanceSQLDelayedTime;

        @NameInMap("SecurityIPMode")
        @Validation(required = true)
        public String securityIPMode;

        @NameInMap("TimeZone")
        @Validation(required = true)
        public String timeZone;

        @NameInMap("Collation")
        @Validation(required = true)
        public String collation;

        @NameInMap("DispenseMode")
        @Validation(required = true)
        public String dispenseMode;

        @NameInMap("MasterZone")
        @Validation(required = true)
        public String masterZone;

        @NameInMap("AutoUpgradeMinorVersion")
        @Validation(required = true)
        public String autoUpgradeMinorVersion;

        @NameInMap("ProxyType")
        @Validation(required = true)
        public Integer proxyType;

        @NameInMap("ConsoleVersion")
        @Validation(required = true)
        public String consoleVersion;

        @NameInMap("MultipleTempUpgrade")
        @Validation(required = true)
        public Boolean multipleTempUpgrade;

        @NameInMap("OriginConfiguration")
        @Validation(required = true)
        public String originConfiguration;

        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        @NameInMap("SuperPermissionMode")
        @Validation(required = true)
        public String superPermissionMode;

        @NameInMap("SlaveZones")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones slaveZones;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("Extra")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra extra;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceDiskUsed(String DBInstanceDiskUsed) {
            this.DBInstanceDiskUsed = DBInstanceDiskUsed;
            return this;
        }
        public String getDBInstanceDiskUsed() {
            return this.DBInstanceDiskUsed;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setGuardDBInstanceName(String guardDBInstanceName) {
            this.guardDBInstanceName = guardDBInstanceName;
            return this;
        }
        public String getGuardDBInstanceName() {
            return this.guardDBInstanceName;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setCanTempUpgrade(Boolean canTempUpgrade) {
            this.canTempUpgrade = canTempUpgrade;
            return this;
        }
        public Boolean getCanTempUpgrade() {
            return this.canTempUpgrade;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeTimeStart(String tempUpgradeTimeStart) {
            this.tempUpgradeTimeStart = tempUpgradeTimeStart;
            return this;
        }
        public String getTempUpgradeTimeStart() {
            return this.tempUpgradeTimeStart;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
            this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
            return this;
        }
        public String getTempUpgradeTimeEnd() {
            return this.tempUpgradeTimeEnd;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeRecoveryTime(String tempUpgradeRecoveryTime) {
            this.tempUpgradeRecoveryTime = tempUpgradeRecoveryTime;
            return this;
        }
        public String getTempUpgradeRecoveryTime() {
            return this.tempUpgradeRecoveryTime;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeRecoveryClass(String tempUpgradeRecoveryClass) {
            this.tempUpgradeRecoveryClass = tempUpgradeRecoveryClass;
            return this;
        }
        public String getTempUpgradeRecoveryClass() {
            return this.tempUpgradeRecoveryClass;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeRecoveryCpu(Integer tempUpgradeRecoveryCpu) {
            this.tempUpgradeRecoveryCpu = tempUpgradeRecoveryCpu;
            return this;
        }
        public Integer getTempUpgradeRecoveryCpu() {
            return this.tempUpgradeRecoveryCpu;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeRecoveryMemory(Integer tempUpgradeRecoveryMemory) {
            this.tempUpgradeRecoveryMemory = tempUpgradeRecoveryMemory;
            return this;
        }
        public Integer getTempUpgradeRecoveryMemory() {
            return this.tempUpgradeRecoveryMemory;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeRecoveryMaxIOPS(String tempUpgradeRecoveryMaxIOPS) {
            this.tempUpgradeRecoveryMaxIOPS = tempUpgradeRecoveryMaxIOPS;
            return this;
        }
        public String getTempUpgradeRecoveryMaxIOPS() {
            return this.tempUpgradeRecoveryMaxIOPS;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempUpgradeRecoveryMaxConnections(String tempUpgradeRecoveryMaxConnections) {
            this.tempUpgradeRecoveryMaxConnections = tempUpgradeRecoveryMaxConnections;
            return this;
        }
        public String getTempUpgradeRecoveryMaxConnections() {
            return this.tempUpgradeRecoveryMaxConnections;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setInsId(Integer insId) {
            this.insId = insId;
            return this;
        }
        public Integer getInsId() {
            return this.insId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setReadDelayTime(String readDelayTime) {
            this.readDelayTime = readDelayTime;
            return this;
        }
        public String getReadDelayTime() {
            return this.readDelayTime;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBMaxQuantity(Integer DBMaxQuantity) {
            this.DBMaxQuantity = DBMaxQuantity;
            return this;
        }
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setAccountMaxQuantity(Integer accountMaxQuantity) {
            this.accountMaxQuantity = accountMaxQuantity;
            return this;
        }
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
            this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
            return this;
        }
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setReplicateId(String replicateId) {
            this.replicateId = replicateId;
            return this;
        }
        public String getReplicateId() {
            return this.replicateId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setAdvancedFeatures(String advancedFeatures) {
            this.advancedFeatures = advancedFeatures;
            return this;
        }
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setSupportUpgradeAccountType(String supportUpgradeAccountType) {
            this.supportUpgradeAccountType = supportUpgradeAccountType;
            return this;
        }
        public String getSupportUpgradeAccountType() {
            return this.supportUpgradeAccountType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setSupportCreateSuperAccount(String supportCreateSuperAccount) {
            this.supportCreateSuperAccount = supportCreateSuperAccount;
            return this;
        }
        public String getSupportCreateSuperAccount() {
            return this.supportCreateSuperAccount;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setCurrentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setLatestKernelVersion(String latestKernelVersion) {
            this.latestKernelVersion = latestKernelVersion;
            return this;
        }
        public String getLatestKernelVersion() {
            return this.latestKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
            this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
            return this;
        }
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setSecurityIPMode(String securityIPMode) {
            this.securityIPMode = securityIPMode;
            return this;
        }
        public String getSecurityIPMode() {
            return this.securityIPMode;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDispenseMode(String dispenseMode) {
            this.dispenseMode = dispenseMode;
            return this;
        }
        public String getDispenseMode() {
            return this.dispenseMode;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setMasterZone(String masterZone) {
            this.masterZone = masterZone;
            return this;
        }
        public String getMasterZone() {
            return this.masterZone;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setProxyType(Integer proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public Integer getProxyType() {
            return this.proxyType;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setConsoleVersion(String consoleVersion) {
            this.consoleVersion = consoleVersion;
            return this;
        }
        public String getConsoleVersion() {
            return this.consoleVersion;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setMultipleTempUpgrade(Boolean multipleTempUpgrade) {
            this.multipleTempUpgrade = multipleTempUpgrade;
            return this;
        }
        public Boolean getMultipleTempUpgrade() {
            return this.multipleTempUpgrade;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setOriginConfiguration(String originConfiguration) {
            this.originConfiguration = originConfiguration;
            return this;
        }
        public String getOriginConfiguration() {
            return this.originConfiguration;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setSuperPermissionMode(String superPermissionMode) {
            this.superPermissionMode = superPermissionMode;
            return this;
        }
        public String getSuperPermissionMode() {
            return this.superPermissionMode;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setSlaveZones(DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setReadOnlyDBInstanceIds(DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute setExtra(DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra extra) {
            this.extra = extra;
            return this;
        }
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra getExtra() {
            return this.extra;
        }

    }

    public static class DescribeDBInstanceAttributeResponseItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstanceAttributeResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItems self = new DescribeDBInstanceAttributeResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseItems setDBInstanceAttribute(java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
