// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataResponseBody extends TeaModel {
    // The interval at which the monitoring data is queried.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The proportions of HTTP status codes at each time interval.
    @NameInMap("HttpCodeData")
    public DescribeDomainHttpCodeDataResponseBodyHttpCodeData httpCodeData;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataResponseBody self = new DescribeDomainHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainHttpCodeDataResponseBody setHttpCodeData(DescribeDomainHttpCodeDataResponseBodyHttpCodeData httpCodeData) {
        this.httpCodeData = httpCodeData;
        return this;
    }
    public DescribeDomainHttpCodeDataResponseBodyHttpCodeData getHttpCodeData() {
        return this.httpCodeData;
    }

    public DescribeDomainHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData extends TeaModel {
        // The HTTP status code.
        @NameInMap("Code")
        public String code;

        // The total number of HTTP status code returned.
        @NameInMap("Count")
        public String count;

        // The proportion of the HTTP status code.
        @NameInMap("Proportion")
        public String proportion;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("CodeProportionData")
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> codeProportionData;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue setCodeProportionData(java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> codeProportionData) {
            this.codeProportionData = codeProportionData;
            return this;
        }
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> getCodeProportionData() {
            return this.codeProportionData;
        }

    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData extends TeaModel {
        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The proportions of HTTP status codes.
        @NameInMap("Value")
        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue value;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData setValue(DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData> usageData;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeData self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeData setUsageData(java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
