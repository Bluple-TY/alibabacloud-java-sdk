// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataResponseBody extends TeaModel {
    // The time interval between the data entries. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range during which data was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The number of PVs at each interval.
    @NameInMap("PvDataInterval")
    public DescribeDomainPvDataResponseBodyPvDataInterval pvDataInterval;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range during which data was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainPvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPvDataResponseBody self = new DescribeDomainPvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainPvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPvDataResponseBody setPvDataInterval(DescribeDomainPvDataResponseBodyPvDataInterval pvDataInterval) {
        this.pvDataInterval = pvDataInterval;
        return this;
    }
    public DescribeDomainPvDataResponseBodyPvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
    }

    public DescribeDomainPvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainPvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainPvDataResponseBodyPvDataIntervalUsageData extends TeaModel {
        // The timestamp of the returned data.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The number of PVs.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainPvDataResponseBodyPvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPvDataResponseBodyPvDataIntervalUsageData self = new DescribeDomainPvDataResponseBodyPvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPvDataResponseBodyPvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainPvDataResponseBodyPvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainPvDataResponseBodyPvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainPvDataResponseBodyPvDataIntervalUsageData> usageData;

        public static DescribeDomainPvDataResponseBodyPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPvDataResponseBodyPvDataInterval self = new DescribeDomainPvDataResponseBodyPvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPvDataResponseBodyPvDataInterval setUsageData(java.util.List<DescribeDomainPvDataResponseBodyPvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainPvDataResponseBodyPvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
