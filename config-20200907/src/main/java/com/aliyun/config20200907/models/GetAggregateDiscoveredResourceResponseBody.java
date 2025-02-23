// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateDiscoveredResourceResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceDetail")
    public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateDiscoveredResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateDiscoveredResourceResponseBody self = new GetAggregateDiscoveredResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateDiscoveredResourceResponseBody setDiscoveredResourceDetail(GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail) {
        this.discoveredResourceDetail = discoveredResourceDetail;
        return this;
    }
    public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    public GetAggregateDiscoveredResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tags")
        public String tags;

        public static GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail self = new GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail();
            return TeaModel.build(map, self);
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
