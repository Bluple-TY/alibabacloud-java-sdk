// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MetricRuleCount")
    public DescribeMetricRuleCountResponseBodyMetricRuleCount metricRuleCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMetricRuleCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountResponseBody self = new DescribeMetricRuleCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricRuleCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleCountResponseBody setMetricRuleCount(DescribeMetricRuleCountResponseBodyMetricRuleCount metricRuleCount) {
        this.metricRuleCount = metricRuleCount;
        return this;
    }
    public DescribeMetricRuleCountResponseBodyMetricRuleCount getMetricRuleCount() {
        return this.metricRuleCount;
    }

    public DescribeMetricRuleCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMetricRuleCountResponseBodyMetricRuleCount extends TeaModel {
        @NameInMap("Alarm")
        public Integer alarm;

        @NameInMap("Disable")
        public Integer disable;

        @NameInMap("Nodata")
        public Integer nodata;

        @NameInMap("Ok")
        public Integer ok;

        @NameInMap("Total")
        public Integer total;

        public static DescribeMetricRuleCountResponseBodyMetricRuleCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleCountResponseBodyMetricRuleCount self = new DescribeMetricRuleCountResponseBodyMetricRuleCount();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setAlarm(Integer alarm) {
            this.alarm = alarm;
            return this;
        }
        public Integer getAlarm() {
            return this.alarm;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setDisable(Integer disable) {
            this.disable = disable;
            return this;
        }
        public Integer getDisable() {
            return this.disable;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setNodata(Integer nodata) {
            this.nodata = nodata;
            return this;
        }
        public Integer getNodata() {
            return this.nodata;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setOk(Integer ok) {
            this.ok = ok;
            return this;
        }
        public Integer getOk() {
            return this.ok;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
