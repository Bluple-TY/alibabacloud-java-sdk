// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTrafficDataResponseBody extends TeaModel {
    // The time interval between the data entries returned. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The amount of back-to-origin network traffic at each time interval. Unit: bytes.
    @NameInMap("SrcTrafficDataPerInterval")
    public DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval srcTrafficDataPerInterval;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainSrcTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcTrafficDataResponseBody self = new DescribeDomainSrcTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainSrcTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcTrafficDataResponseBody setSrcTrafficDataPerInterval(DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval srcTrafficDataPerInterval) {
        this.srcTrafficDataPerInterval = srcTrafficDataPerInterval;
        return this;
    }
    public DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval getSrcTrafficDataPerInterval() {
        return this.srcTrafficDataPerInterval;
    }

    public DescribeDomainSrcTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule extends TeaModel {
        // The amount of traffic generated by back-to-origin HTTPS requests.
        @NameInMap("HttpsValue")
        public String httpsValue;

        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The amount of network traffic.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule self = new DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval self = new DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval setDataModule(java.util.List<DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
