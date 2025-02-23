// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcQpsDataResponseBody extends TeaModel {
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

    // The back-to-origin bandwidth information at each interval.
    @NameInMap("SrcQpsDataPerInterval")
    public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval srcQpsDataPerInterval;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainSrcQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcQpsDataResponseBody self = new DescribeDomainSrcQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainSrcQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcQpsDataResponseBody setSrcQpsDataPerInterval(DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval srcQpsDataPerInterval) {
        this.srcQpsDataPerInterval = srcQpsDataPerInterval;
        return this;
    }
    public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval getSrcQpsDataPerInterval() {
        return this.srcQpsDataPerInterval;
    }

    public DescribeDomainSrcQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule extends TeaModel {
        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The number of back-to-origin requests per second.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule self = new DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval self = new DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval setDataModule(java.util.List<DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
