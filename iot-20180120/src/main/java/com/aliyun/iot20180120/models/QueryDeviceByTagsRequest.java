// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByTagsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<QueryDeviceByTagsRequestTag> tag;

    public static QueryDeviceByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByTagsRequest self = new QueryDeviceByTagsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceByTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceByTagsRequest setTag(java.util.List<QueryDeviceByTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryDeviceByTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class QueryDeviceByTagsRequestTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDeviceByTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsRequestTag self = new QueryDeviceByTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDeviceByTagsRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
