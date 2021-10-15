// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDiagnoseReportResponseBodyResult result;

    public static DescribeDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportResponseBody self = new DescribeDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnoseReportResponseBody setResult(DescribeDiagnoseReportResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDiagnoseReportResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("name")
        public String name;

        @NameInMap("desc")
        public String desc;

        @NameInMap("result")
        public String result;

        @NameInMap("suggest")
        public String suggest;

        public static DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail self = new DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

    }

    public static class DescribeDiagnoseReportResponseBodyResultDiagnoseItems extends TeaModel {
        @NameInMap("item")
        public String item;

        @NameInMap("health")
        public String health;

        @NameInMap("detail")
        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail;

        public static DescribeDiagnoseReportResponseBodyResultDiagnoseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResultDiagnoseItems self = new DescribeDiagnoseReportResponseBodyResultDiagnoseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItems setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItems setDetail(DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail getDetail() {
            return this.detail;
        }

    }

    public static class DescribeDiagnoseReportResponseBodyResult extends TeaModel {
        @NameInMap("trigger")
        public String trigger;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("reportId")
        public String reportId;

        @NameInMap("state")
        public String state;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("health")
        public String health;

        @NameInMap("diagnoseItems")
        public java.util.List<DescribeDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems;

        public static DescribeDiagnoseReportResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResult self = new DescribeDiagnoseReportResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResult setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public DescribeDiagnoseReportResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDiagnoseReportResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeDiagnoseReportResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDiagnoseReportResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDiagnoseReportResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public DescribeDiagnoseReportResponseBodyResult setDiagnoseItems(java.util.List<DescribeDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems) {
            this.diagnoseItems = diagnoseItems;
            return this;
        }
        public java.util.List<DescribeDiagnoseReportResponseBodyResultDiagnoseItems> getDiagnoseItems() {
            return this.diagnoseItems;
        }

    }

}
