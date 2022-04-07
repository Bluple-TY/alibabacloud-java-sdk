// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("BasicBandwidthPackage")
    public DescribeAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CrossDomainBandwidthPackage")
    public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    @NameInMap("DdosId")
    public String ddosId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DnsName")
    public String dnsName;

    @NameInMap("ExpiredTime")
    public Long expiredTime;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("IpSetConfig")
    public DescribeAcceleratorResponseBodyIpSetConfig ipSetConfig;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecondDnsName")
    public String secondDnsName;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("State")
    public String state;

    public static DescribeAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorResponseBody self = new DescribeAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeAcceleratorResponseBody setBasicBandwidthPackage(DescribeAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage) {
        this.basicBandwidthPackage = basicBandwidthPackage;
        return this;
    }
    public DescribeAcceleratorResponseBodyBasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    public DescribeAcceleratorResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeAcceleratorResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeAcceleratorResponseBody setCrossDomainBandwidthPackage(DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
        this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
        return this;
    }
    public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
    }

    public DescribeAcceleratorResponseBody setDdosId(String ddosId) {
        this.ddosId = ddosId;
        return this;
    }
    public String getDdosId() {
        return this.ddosId;
    }

    public DescribeAcceleratorResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAcceleratorResponseBody setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public DescribeAcceleratorResponseBody setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeAcceleratorResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAcceleratorResponseBody setIpSetConfig(DescribeAcceleratorResponseBodyIpSetConfig ipSetConfig) {
        this.ipSetConfig = ipSetConfig;
        return this;
    }
    public DescribeAcceleratorResponseBodyIpSetConfig getIpSetConfig() {
        return this.ipSetConfig;
    }

    public DescribeAcceleratorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAcceleratorResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAcceleratorResponseBody setSecondDnsName(String secondDnsName) {
        this.secondDnsName = secondDnsName;
        return this;
    }
    public String getSecondDnsName() {
        return this.secondDnsName;
    }

    public DescribeAcceleratorResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeAcceleratorResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class DescribeAcceleratorResponseBodyBasicBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeAcceleratorResponseBodyBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyBasicBandwidthPackage self = new DescribeAcceleratorResponseBodyBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAcceleratorResponseBodyBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public DescribeAcceleratorResponseBodyBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage self = new DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeAcceleratorResponseBodyIpSetConfig extends TeaModel {
        @NameInMap("AccessMode")
        public String accessMode;

        public static DescribeAcceleratorResponseBodyIpSetConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyIpSetConfig self = new DescribeAcceleratorResponseBodyIpSetConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyIpSetConfig setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

    }

}
