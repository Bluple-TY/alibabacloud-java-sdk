// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorConfigResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNodes")
    public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeDnsGtmMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorConfigResponseBody self = new DescribeDnsGtmMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorConfigResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setIspCityNodes(DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("IspName")
        public String ispName;

        public static DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode self = new DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> ispCityNode;

        public static DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes self = new DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes setIspCityNode(java.util.List<DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
