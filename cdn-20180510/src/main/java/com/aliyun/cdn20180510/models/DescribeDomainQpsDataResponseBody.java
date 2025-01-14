// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataResponseBody extends TeaModel {
    // The time interval between the data entries returned. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The number of queries per second at each time interval.
    @NameInMap("QpsDataInterval")
    public DescribeDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataResponseBody self = new DescribeDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainQpsDataResponseBody setQpsDataInterval(DescribeDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeDomainQpsDataResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public DescribeDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule extends TeaModel {
        // The number of requests in the Chinese mainland.
        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        // The number of requests outside the Chinese mainland.
        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        // The total number of requests.
        @NameInMap("AccValue")
        public String accValue;

        // The number of queries per second in the Chinese mainland.
        @NameInMap("DomesticValue")
        public String domesticValue;

        // The number of HTTPS requests sent to L1 edge nodes in the Chinese mainland.
        @NameInMap("HttpsAccDomesticValue")
        public String httpsAccDomesticValue;

        // The number of HTTPS requests sent to L1 edge nodes outside the Chinese mainland.
        @NameInMap("HttpsAccOverseasValue")
        public String httpsAccOverseasValue;

        // The total number of HTTPS requests sent to L1 edge nodes.
        @NameInMap("HttpsAccValue")
        public String httpsAccValue;

        // The number of queries per second that is calculated based on the HTTPS requests sent to L1 edge nodes in the Chinese mainland.
        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        // The number of queries per second that is calculated based on the HTTPS requests sent to L1 edge nodes outside the Chinese mainland.
        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        // The number of queries per second that is calculated based on the HTTPS requests sent to L1 edge nodes.
        @NameInMap("HttpsValue")
        public String httpsValue;

        // The number of queries per second outside the Chinese mainland.
        @NameInMap("OverseasValue")
        public String overseasValue;

        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The total number of queries per second.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule self = new DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccDomesticValue(String httpsAccDomesticValue) {
            this.httpsAccDomesticValue = httpsAccDomesticValue;
            return this;
        }
        public String getHttpsAccDomesticValue() {
            return this.httpsAccDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccOverseasValue(String httpsAccOverseasValue) {
            this.httpsAccOverseasValue = httpsAccOverseasValue;
            return this;
        }
        public String getHttpsAccOverseasValue() {
            return this.httpsAccOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccValue(String httpsAccValue) {
            this.httpsAccValue = httpsAccValue;
            return this;
        }
        public String getHttpsAccValue() {
            return this.httpsAccValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainQpsDataResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeDomainQpsDataResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataResponseBodyQpsDataInterval self = new DescribeDomainQpsDataResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
