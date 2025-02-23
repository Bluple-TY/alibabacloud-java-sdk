// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsRequest extends TeaModel {
    @NameInMap("IsConfirmed")
    public Boolean isConfirmed;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<ListVirtualPhysicalConnectionsRequestTags> tags;

    @NameInMap("VirtualPhysicalConnectionAliUids")
    public java.util.List<String> virtualPhysicalConnectionAliUids;

    @NameInMap("VirtualPhysicalConnectionBusinessStatus")
    public String virtualPhysicalConnectionBusinessStatus;

    @NameInMap("VirtualPhysicalConnectionIds")
    public java.util.List<String> virtualPhysicalConnectionIds;

    @NameInMap("VirtualPhysicalConnectionStatuses")
    public java.util.List<String> virtualPhysicalConnectionStatuses;

    @NameInMap("VlanIds")
    public java.util.List<String> vlanIds;

    public static ListVirtualPhysicalConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualPhysicalConnectionsRequest self = new ListVirtualPhysicalConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualPhysicalConnectionsRequest setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
        return this;
    }
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    public ListVirtualPhysicalConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVirtualPhysicalConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualPhysicalConnectionsRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public ListVirtualPhysicalConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVirtualPhysicalConnectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVirtualPhysicalConnectionsRequest setTags(java.util.List<ListVirtualPhysicalConnectionsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListVirtualPhysicalConnectionsRequestTags> getTags() {
        return this.tags;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionAliUids(java.util.List<String> virtualPhysicalConnectionAliUids) {
        this.virtualPhysicalConnectionAliUids = virtualPhysicalConnectionAliUids;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionAliUids() {
        return this.virtualPhysicalConnectionAliUids;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
        this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
        return this;
    }
    public String getVirtualPhysicalConnectionBusinessStatus() {
        return this.virtualPhysicalConnectionBusinessStatus;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionIds(java.util.List<String> virtualPhysicalConnectionIds) {
        this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionStatuses(java.util.List<String> virtualPhysicalConnectionStatuses) {
        this.virtualPhysicalConnectionStatuses = virtualPhysicalConnectionStatuses;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionStatuses() {
        return this.virtualPhysicalConnectionStatuses;
    }

    public ListVirtualPhysicalConnectionsRequest setVlanIds(java.util.List<String> vlanIds) {
        this.vlanIds = vlanIds;
        return this;
    }
    public java.util.List<String> getVlanIds() {
        return this.vlanIds;
    }

    public static class ListVirtualPhysicalConnectionsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListVirtualPhysicalConnectionsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualPhysicalConnectionsRequestTags self = new ListVirtualPhysicalConnectionsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListVirtualPhysicalConnectionsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVirtualPhysicalConnectionsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
