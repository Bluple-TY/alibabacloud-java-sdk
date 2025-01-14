// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiQpsDataResponseBody extends TeaModel {
    /**
     * <p>The value corresponding to the monitoring metric.</p>
     */
    @NameInMap("CallFails")
    public DescribeApiQpsDataResponseBodyCallFails callFails;

    /**
     * <p>The value corresponding to the monitoring metric.</p>
     */
    @NameInMap("CallSuccesses")
    public DescribeApiQpsDataResponseBodyCallSuccesses callSuccesses;

    /**
     * <p>The returned information about successful API calls. It is an array consisting of MonitorItem data.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiQpsDataResponseBody self = new DescribeApiQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiQpsDataResponseBody setCallFails(DescribeApiQpsDataResponseBodyCallFails callFails) {
        this.callFails = callFails;
        return this;
    }
    public DescribeApiQpsDataResponseBodyCallFails getCallFails() {
        return this.callFails;
    }

    public DescribeApiQpsDataResponseBody setCallSuccesses(DescribeApiQpsDataResponseBodyCallSuccesses callSuccesses) {
        this.callSuccesses = callSuccesses;
        return this;
    }
    public DescribeApiQpsDataResponseBodyCallSuccesses getCallSuccesses() {
        return this.callSuccesses;
    }

    public DescribeApiQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApiQpsDataResponseBodyCallFailsMonitorItem extends TeaModel {
        /**
         * <p>auditing</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeApiQpsDataResponseBodyCallFailsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsDataResponseBodyCallFailsMonitorItem self = new DescribeApiQpsDataResponseBodyCallFailsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsDataResponseBodyCallFailsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeApiQpsDataResponseBodyCallFailsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeApiQpsDataResponseBodyCallFails extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiQpsDataResponseBodyCallFailsMonitorItem> monitorItem;

        public static DescribeApiQpsDataResponseBodyCallFails build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsDataResponseBodyCallFails self = new DescribeApiQpsDataResponseBodyCallFails();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsDataResponseBodyCallFails setMonitorItem(java.util.List<DescribeApiQpsDataResponseBodyCallFailsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiQpsDataResponseBodyCallFailsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

    public static class DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem extends TeaModel {
        /**
         * <p>The returned information about failed API calls. It is an array consisting of MonitorItem data.</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem self = new DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeApiQpsDataResponseBodyCallSuccesses extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem> monitorItem;

        public static DescribeApiQpsDataResponseBodyCallSuccesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsDataResponseBodyCallSuccesses self = new DescribeApiQpsDataResponseBodyCallSuccesses();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsDataResponseBodyCallSuccesses setMonitorItem(java.util.List<DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiQpsDataResponseBodyCallSuccessesMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
