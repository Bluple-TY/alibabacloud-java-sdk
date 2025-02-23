// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("NetworkingModel")
    public String networkingModel;

    @NameInMap("Period")
    public String period;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Version")
    public String version;

    public static DescribeEpnBandWidthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandWidthDataRequest self = new DescribeEpnBandWidthDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandWidthDataRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public DescribeEpnBandWidthDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEpnBandWidthDataRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEpnBandWidthDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeEpnBandWidthDataRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeEpnBandWidthDataRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public DescribeEpnBandWidthDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeEpnBandWidthDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeEpnBandWidthDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
