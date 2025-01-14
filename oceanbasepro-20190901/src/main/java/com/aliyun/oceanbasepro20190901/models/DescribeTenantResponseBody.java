// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the tenant.</p>
     */
    @NameInMap("Tenant")
    public DescribeTenantResponseBodyTenant tenant;

    public static DescribeTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantResponseBody self = new DescribeTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantResponseBody setTenant(DescribeTenantResponseBodyTenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public DescribeTenantResponseBodyTenant getTenant() {
        return this.tenant;
    }

    public static class DescribeTenantResponseBodyTenantTenantConnections extends TeaModel {
        /**
         * <p>The type of the address.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The service mode of the connection address. Valid values:  </p>
         * <p>- ReadWrite: provides strong-consistency read and write services.   </p>
         * <p>- ReadOnly: provides the read-only service to ensure ultimate consistency of data.   </p>
         * <p>- Clog: provides transaction log services.</p>
         */
        @NameInMap("ConnectionRole")
        public String connectionRole;

        /**
         * <p>The list of zones corresponding to the tenant connection.</p>
         */
        @NameInMap("ConnectionZones")
        public java.util.List<String> connectionZones;

        /**
         * <p>The Internet address for accessing the tenant.</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The status of the Internet address for accessing the tenant. Valid values:   </p>
         * <p>- CLOSED: The address is disabled.   </p>
         * <p>- ALLOCATING_INTERNET_ADDRESS: An address is being applied for.   </p>
         * <p>- PENDING_OFFLINE_INTERNET_ADDRESS: The address is being disabled.   </p>
         * <p>- ONLINE: The address is in service.</p>
         */
        @NameInMap("InternetAddressStatus")
        public String internetAddressStatus;

        /**
         * <p>The Internet port for accessing the tenant.</p>
         */
        @NameInMap("InternetPort")
        public Integer internetPort;

        /**
         * <p>The intranet address for accessing the tenant.</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The primary zone corresponding to the address for accessing the tenant.</p>
         */
        @NameInMap("IntranetAddressMasterZoneId")
        public String intranetAddressMasterZoneId;

        /**
         * <p>The standby zone corresponding to the address for accessing the tenant.</p>
         */
        @NameInMap("IntranetAddressSlaveZoneId")
        public String intranetAddressSlaveZoneId;

        /**
         * <p>The status of the intranet address for accessing the tenant.  </p>
         * <p>The value ONLINE indicates that the address is in service.</p>
         */
        @NameInMap("IntranetAddressStatus")
        public String intranetAddressStatus;

        /**
         * <p>The intranet port for accessing the tenant.</p>
         */
        @NameInMap("IntranetPort")
        public Integer intranetPort;

        /**
         * <p>Indicates whether to enable transaction splitting.</p>
         */
        @NameInMap("TransactionSplit")
        public Boolean transactionSplit;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantResponseBodyTenantTenantConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantConnections self = new DescribeTenantResponseBodyTenantTenantConnections();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantConnections setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionRole(String connectionRole) {
            this.connectionRole = connectionRole;
            return this;
        }
        public String getConnectionRole() {
            return this.connectionRole;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionZones(java.util.List<String> connectionZones) {
            this.connectionZones = connectionZones;
            return this;
        }
        public java.util.List<String> getConnectionZones() {
            return this.connectionZones;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetAddressStatus(String internetAddressStatus) {
            this.internetAddressStatus = internetAddressStatus;
            return this;
        }
        public String getInternetAddressStatus() {
            return this.internetAddressStatus;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetPort(Integer internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public Integer getInternetPort() {
            return this.internetPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddressMasterZoneId(String intranetAddressMasterZoneId) {
            this.intranetAddressMasterZoneId = intranetAddressMasterZoneId;
            return this;
        }
        public String getIntranetAddressMasterZoneId() {
            return this.intranetAddressMasterZoneId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddressSlaveZoneId(String intranetAddressSlaveZoneId) {
            this.intranetAddressSlaveZoneId = intranetAddressSlaveZoneId;
            return this;
        }
        public String getIntranetAddressSlaveZoneId() {
            return this.intranetAddressSlaveZoneId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddressStatus(String intranetAddressStatus) {
            this.intranetAddressStatus = intranetAddressStatus;
            return this;
        }
        public String getIntranetAddressStatus() {
            return this.intranetAddressStatus;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetPort(Integer intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public Integer getIntranetPort() {
            return this.intranetPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setTransactionSplit(Boolean transactionSplit) {
            this.transactionSplit = transactionSplit;
            return this;
        }
        public Boolean getTransactionSplit() {
            return this.transactionSplit;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceCpu extends TeaModel {
        /**
         * <p>The total number of CPU cores of the tenant.</p>
         */
        @NameInMap("TotalCpu")
        public Float totalCpu;

        /**
         * <p>The number of CPU cores in each resource unit of the tenant.</p>
         */
        @NameInMap("UnitCpu")
        public Float unitCpu;

        /**
         * <p>The number of used CPU cores of the tenant.</p>
         */
        @NameInMap("UsedCpu")
        public Float usedCpu;

        public static DescribeTenantResponseBodyTenantTenantResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceCpu self = new DescribeTenantResponseBodyTenantTenantResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceCpu setTotalCpu(Float totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Float getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeTenantResponseBodyTenantTenantResourceCpu setUnitCpu(Float unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeTenantResponseBodyTenantTenantResourceCpu setUsedCpu(Float usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Float getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceDiskSize extends TeaModel {
        /**
         * <p>The size of used disk space of the tenant, in GB.</p>
         */
        @NameInMap("UsedDiskSize")
        public Float usedDiskSize;

        public static DescribeTenantResponseBodyTenantTenantResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceDiskSize self = new DescribeTenantResponseBodyTenantTenantResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceDiskSize setUsedDiskSize(Float usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceMemory extends TeaModel {
        /**
         * <p>The total memory size of the tenant, in GB.</p>
         */
        @NameInMap("TotalMemory")
        public Float totalMemory;

        /**
         * <p>The memory size of each resource unit of the tenant, in GB.</p>
         */
        @NameInMap("UnitMemory")
        public Float unitMemory;

        /**
         * <p>The size of used memory of the tenant, in GB.</p>
         */
        @NameInMap("UsedMemory")
        public Float usedMemory;

        public static DescribeTenantResponseBodyTenantTenantResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceMemory self = new DescribeTenantResponseBodyTenantTenantResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceMemory setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeTenantResponseBodyTenantTenantResourceMemory setUnitMemory(Float unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeTenantResponseBodyTenantTenantResourceMemory setUsedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Float getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResource extends TeaModel {
        /**
         * <p>The information about the CPU resources of the tenant.</p>
         */
        @NameInMap("Cpu")
        public DescribeTenantResponseBodyTenantTenantResourceCpu cpu;

        /**
         * <p>The information about the disk resources of the tenant.</p>
         */
        @NameInMap("DiskSize")
        public DescribeTenantResponseBodyTenantTenantResourceDiskSize diskSize;

        /**
         * <p>The information about the memory resources of the tenant.</p>
         */
        @NameInMap("Memory")
        public DescribeTenantResponseBodyTenantTenantResourceMemory memory;

        /**
         * <p>The number of resource units in the tenant.</p>
         */
        @NameInMap("UnitNum")
        public Integer unitNum;

        public static DescribeTenantResponseBodyTenantTenantResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResource self = new DescribeTenantResponseBodyTenantTenantResource();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResource setCpu(DescribeTenantResponseBodyTenantTenantResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeTenantResponseBodyTenantTenantResource setDiskSize(DescribeTenantResponseBodyTenantTenantResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeTenantResponseBodyTenantTenantResource setMemory(DescribeTenantResponseBodyTenantTenantResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeTenantResponseBodyTenantTenantResource setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantZones extends TeaModel {
        /**
         * <p>The region where the zone of the tenant resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        /**
         * <p>The role of the zone of the tenant.</p>
         */
        @NameInMap("TenantZoneRole")
        public String tenantZoneRole;

        public static DescribeTenantResponseBodyTenantTenantZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantZones self = new DescribeTenantResponseBodyTenantTenantZones();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantZones setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeTenantResponseBodyTenantTenantZones setTenantZoneId(String tenantZoneId) {
            this.tenantZoneId = tenantZoneId;
            return this;
        }
        public String getTenantZoneId() {
            return this.tenantZoneId;
        }

        public DescribeTenantResponseBodyTenantTenantZones setTenantZoneRole(String tenantZoneRole) {
            this.tenantZoneRole = tenantZoneRole;
            return this;
        }
        public String getTenantZoneRole() {
            return this.tenantZoneRole;
        }

    }

    public static class DescribeTenantResponseBodyTenant extends TeaModel {
        /**
         * <p>The list of zones.</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The character set.</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>The enabling status of the clog service.  </p>
         * <p>- CLOSED: The clog service is disabled.  </p>
         * <p>- ONLINE: The clog service is running.</p>
         */
        @NameInMap("ClogServiceStatus")
        public String clogServiceStatus;

        /**
         * <p>The collation.</p>
         */
        @NameInMap("Collation")
        public String collation;

        /**
         * <p>The time when the tenant was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The data replica distribution mode of the tenant.    </p>
         * <br>
         * <p>- For the high availability version, N-N-N indicates the three-zone mode, and N-N indicates the dual-zone or single-zone mode.</p>
         * <p>- For the basic version, N indicates the single-zone mode. </p>
         * <br>
         * <p>> <br>N represents the number of nodes in a single zone.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The deployment type of the cluster. Valid values:  </p>
         * <p>- multiple: multi-IDC deployment   </p>
         * <p>- single: single-IDC deployment   </p>
         * <p>- dual: dual-IDC deployment</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The description of the tenant.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the disk.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>Indicates whether the clog service is available. To enable the clog service, submit a ticket.</p>
         */
        @NameInMap("EnableClogService")
        public Boolean enableClogService;

        /**
         * <p>Indicates whether the Internet address can be enabled for the tenant.</p>
         */
        @NameInMap("EnableInternetAddressService")
        public Boolean enableInternetAddressService;

        /**
         * <p>Indicates whether to enable read/write splitting endpoint.</p>
         */
        @NameInMap("EnableReadWriteSplit")
        public Boolean enableReadWriteSplit;

        /**
         * <p>The type of the instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The zone where the primary node is located.</p>
         */
        @NameInMap("MasterIntranetAddressZone")
        public String masterIntranetAddressZone;

        /**
         * <p>The type of the payment.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The primary zone of the tenant.</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The deployment type of the primary zone.</p>
         */
        @NameInMap("PrimaryZoneDeployType")
        public String primaryZoneDeployType;

        /**
         * <p>The series of the instance.</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The status of the tenant.   </p>
         * <p>- PENDING_CREATE: The tenant is being created.   </p>
         * <p>- RESTORE: The tenant is being recovered.   </p>
         * <p>- ONLINE: The tenant is running.   </p>
         * <p>- SPEC_MODIFYING: The specification of the tenant is being modified.   </p>
         * <p>- ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.  </p>
         * <p>- PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.  </p>
         * <p>- PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.  </p>
         * <p>- PARAMETER_MODIFYING: Parameters are being modified.   </p>
         * <p>- WHITE_LIST_MODIFYING: The whitelist is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The connection information of the tenant.</p>
         */
        @NameInMap("TenantConnections")
        public java.util.List<DescribeTenantResponseBodyTenantTenantConnections> tenantConnections;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The tenant mode.   </p>
         * <p>Valid values:</p>
         * <p>- Oracle   </p>
         * <p>- MySQL</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <p>The name of the tenant.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The resource information of the tenant.</p>
         */
        @NameInMap("TenantResource")
        public DescribeTenantResponseBodyTenantTenantResource tenantResource;

        /**
         * <p>The zone information of the tenant.</p>
         */
        @NameInMap("TenantZones")
        public java.util.List<DescribeTenantResponseBodyTenantTenantZones> tenantZones;

        /**
         * <p>The ID of the VPC.    </p>
         * <p>If no suitable VPC is available, create a VPC as prompted. For more information, see "What is a VPC".</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenant self = new DescribeTenantResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenant setAvailableZones(java.util.List<String> availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public java.util.List<String> getAvailableZones() {
            return this.availableZones;
        }

        public DescribeTenantResponseBodyTenant setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeTenantResponseBodyTenant setClogServiceStatus(String clogServiceStatus) {
            this.clogServiceStatus = clogServiceStatus;
            return this;
        }
        public String getClogServiceStatus() {
            return this.clogServiceStatus;
        }

        public DescribeTenantResponseBodyTenant setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public DescribeTenantResponseBodyTenant setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTenantResponseBodyTenant setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeTenantResponseBodyTenant setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeTenantResponseBodyTenant setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTenantResponseBodyTenant setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeTenantResponseBodyTenant setEnableClogService(Boolean enableClogService) {
            this.enableClogService = enableClogService;
            return this;
        }
        public Boolean getEnableClogService() {
            return this.enableClogService;
        }

        public DescribeTenantResponseBodyTenant setEnableInternetAddressService(Boolean enableInternetAddressService) {
            this.enableInternetAddressService = enableInternetAddressService;
            return this;
        }
        public Boolean getEnableInternetAddressService() {
            return this.enableInternetAddressService;
        }

        public DescribeTenantResponseBodyTenant setEnableReadWriteSplit(Boolean enableReadWriteSplit) {
            this.enableReadWriteSplit = enableReadWriteSplit;
            return this;
        }
        public Boolean getEnableReadWriteSplit() {
            return this.enableReadWriteSplit;
        }

        public DescribeTenantResponseBodyTenant setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeTenantResponseBodyTenant setMasterIntranetAddressZone(String masterIntranetAddressZone) {
            this.masterIntranetAddressZone = masterIntranetAddressZone;
            return this;
        }
        public String getMasterIntranetAddressZone() {
            return this.masterIntranetAddressZone;
        }

        public DescribeTenantResponseBodyTenant setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeTenantResponseBodyTenant setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeTenantResponseBodyTenant setPrimaryZoneDeployType(String primaryZoneDeployType) {
            this.primaryZoneDeployType = primaryZoneDeployType;
            return this;
        }
        public String getPrimaryZoneDeployType() {
            return this.primaryZoneDeployType;
        }

        public DescribeTenantResponseBodyTenant setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeTenantResponseBodyTenant setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTenantResponseBodyTenant setTenantConnections(java.util.List<DescribeTenantResponseBodyTenantTenantConnections> tenantConnections) {
            this.tenantConnections = tenantConnections;
            return this;
        }
        public java.util.List<DescribeTenantResponseBodyTenantTenantConnections> getTenantConnections() {
            return this.tenantConnections;
        }

        public DescribeTenantResponseBodyTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantResponseBodyTenant setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

        public DescribeTenantResponseBodyTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTenantResponseBodyTenant setTenantResource(DescribeTenantResponseBodyTenantTenantResource tenantResource) {
            this.tenantResource = tenantResource;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResource getTenantResource() {
            return this.tenantResource;
        }

        public DescribeTenantResponseBodyTenant setTenantZones(java.util.List<DescribeTenantResponseBodyTenantTenantZones> tenantZones) {
            this.tenantZones = tenantZones;
            return this;
        }
        public java.util.List<DescribeTenantResponseBodyTenantTenantZones> getTenantZones() {
            return this.tenantZones;
        }

        public DescribeTenantResponseBodyTenant setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
