// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class SearchTracesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MinDuration")
    public Long minDuration;

    @NameInMap("OperationName")
    public String operationName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Tag")
    public java.util.List<SearchTracesRequestTag> tag;

    public static SearchTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesRequest self = new SearchTracesRequest();
        return TeaModel.build(map, self);
    }

    public SearchTracesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchTracesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchTracesRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public SearchTracesRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public SearchTracesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchTracesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTracesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTracesRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public SearchTracesRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public SearchTracesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public SearchTracesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchTracesRequest setTag(java.util.List<SearchTracesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<SearchTracesRequestTag> getTag() {
        return this.tag;
    }

    public static class SearchTracesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchTracesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesRequestTag self = new SearchTracesRequestTag();
            return TeaModel.build(map, self);
        }

        public SearchTracesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTracesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
