// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataByLayerResponseBody extends TeaModel {
    // The time interval between the data entries returned. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The layer at which the data was collected.
    @NameInMap("Layer")
    public String layer;

    // The number of queries per second at each time interval.
    @NameInMap("QpsDataInterval")
    public DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval qpsDataInterval;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainQpsDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataByLayerResponseBody self = new DescribeDomainQpsDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainQpsDataByLayerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainQpsDataByLayerResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainQpsDataByLayerResponseBody setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDomainQpsDataByLayerResponseBody setQpsDataInterval(DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public DescribeDomainQpsDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsDataByLayerResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule extends TeaModel {
        // The number of requests in the Chinese mainland.
        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        // The number of requests in the Chinese mainland.
        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        // The total number of requests.
        @NameInMap("AccValue")
        public String accValue;

        // The number of queries per second in the Chinese mainland.
        @NameInMap("DomesticValue")
        public String domesticValue;

        // The number of queries per second outside the Chinese mainland.
        @NameInMap("OverseasValue")
        public String overseasValue;

        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The total number of queries per second in all regions.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule self = new DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval self = new DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
