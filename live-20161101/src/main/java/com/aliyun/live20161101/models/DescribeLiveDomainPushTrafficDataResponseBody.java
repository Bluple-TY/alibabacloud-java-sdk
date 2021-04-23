// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPushTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TrafficDataPerInterval")
    public DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeLiveDomainPushTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPushTrafficDataResponseBody self = new DescribeLiveDomainPushTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPushTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainPushTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainPushTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainPushTrafficDataResponseBody setTrafficDataPerInterval(DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public DescribeLiveDomainPushTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainPushTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TrafficValue")
        public String trafficValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainPushTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
