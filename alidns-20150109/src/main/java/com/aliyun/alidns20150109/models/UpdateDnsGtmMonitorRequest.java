// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorRequest extends TeaModel {
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNode")
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateDnsGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmMonitorRequest self = new UpdateDnsGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateDnsGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateDnsGtmMonitorRequest setIspCityNode(java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public UpdateDnsGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmMonitorRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public UpdateDnsGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public UpdateDnsGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UpdateDnsGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateDnsGtmMonitorRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateDnsGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmMonitorRequestIspCityNode self = new UpdateDnsGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateDnsGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
