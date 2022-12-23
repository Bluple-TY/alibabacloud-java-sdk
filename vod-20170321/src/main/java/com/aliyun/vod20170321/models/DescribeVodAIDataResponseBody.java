// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAIDataResponseBody extends TeaModel {
    // The statistics on video AI.
    @NameInMap("AIData")
    public DescribeVodAIDataResponseBodyAIData AIData;

    // The time granularity at which the data was queried. Valid values:
    // 
    // - **hour**
    // - **day**
    @NameInMap("DataInterval")
    public String dataInterval;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodAIDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAIDataResponseBody self = new DescribeVodAIDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodAIDataResponseBody setAIData(DescribeVodAIDataResponseBodyAIData AIData) {
        this.AIData = AIData;
        return this;
    }
    public DescribeVodAIDataResponseBodyAIData getAIData() {
        return this.AIData;
    }

    public DescribeVodAIDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodAIDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem extends TeaModel {
        // The type of video AI. Valid values:
        // 
        // - **AIVideoCensor**: automated review
        // - **AIVideoFPShot**: media fingerprinting
        // - **AIVideoTag**: smart tag
        @NameInMap("Name")
        public String name;

        // The processing duration. Unit: seconds.
        @NameInMap("Value")
        public String value;

        public static DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem self = new DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodAIDataResponseBodyAIDataAIDataItemData extends TeaModel {
        @NameInMap("DataItem")
        public java.util.List<DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem> dataItem;

        public static DescribeVodAIDataResponseBodyAIDataAIDataItemData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseBodyAIDataAIDataItemData self = new DescribeVodAIDataResponseBodyAIDataAIDataItemData();
            return TeaModel.build(map, self);
        }

        public DescribeVodAIDataResponseBodyAIDataAIDataItemData setDataItem(java.util.List<DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem> dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public java.util.List<DescribeVodAIDataResponseBodyAIDataAIDataItemDataDataItem> getDataItem() {
            return this.dataItem;
        }

    }

    public static class DescribeVodAIDataResponseBodyAIDataAIDataItem extends TeaModel {
        // The statistics on video AI of each type.
        @NameInMap("Data")
        public DescribeVodAIDataResponseBodyAIDataAIDataItemData data;

        // The timestamp of the returned data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodAIDataResponseBodyAIDataAIDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseBodyAIDataAIDataItem self = new DescribeVodAIDataResponseBodyAIDataAIDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeVodAIDataResponseBodyAIDataAIDataItem setData(DescribeVodAIDataResponseBodyAIDataAIDataItemData data) {
            this.data = data;
            return this;
        }
        public DescribeVodAIDataResponseBodyAIDataAIDataItemData getData() {
            return this.data;
        }

        public DescribeVodAIDataResponseBodyAIDataAIDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodAIDataResponseBodyAIData extends TeaModel {
        @NameInMap("AIDataItem")
        public java.util.List<DescribeVodAIDataResponseBodyAIDataAIDataItem> AIDataItem;

        public static DescribeVodAIDataResponseBodyAIData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAIDataResponseBodyAIData self = new DescribeVodAIDataResponseBodyAIData();
            return TeaModel.build(map, self);
        }

        public DescribeVodAIDataResponseBodyAIData setAIDataItem(java.util.List<DescribeVodAIDataResponseBodyAIDataAIDataItem> AIDataItem) {
            this.AIDataItem = AIDataItem;
            return this;
        }
        public java.util.List<DescribeVodAIDataResponseBodyAIDataAIDataItem> getAIDataItem() {
            return this.AIDataItem;
        }

    }

}
