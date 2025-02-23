// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysResponseBody extends TeaModel {
    @NameInMap("Ipv6Gateways")
    public DescribeIpv6GatewaysResponseBodyIpv6Gateways ipv6Gateways;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIpv6GatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysResponseBody self = new DescribeIpv6GatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewaysResponseBody setIpv6Gateways(DescribeIpv6GatewaysResponseBodyIpv6Gateways ipv6Gateways) {
        this.ipv6Gateways = ipv6Gateways;
        return this;
    }
    public DescribeIpv6GatewaysResponseBodyIpv6Gateways getIpv6Gateways() {
        return this.ipv6Gateways;
    }

    public DescribeIpv6GatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6GatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6GatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6GatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag self = new DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag> tag;

        public static DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags self = new DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags setTag(java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway extends TeaModel {
        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("Ipv6GatewayId")
        public String ipv6GatewayId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags tags;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway self = new DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setIpv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setTags(DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6GatewayTags getTags() {
            return this.tags;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeIpv6GatewaysResponseBodyIpv6Gateways extends TeaModel {
        @NameInMap("Ipv6Gateway")
        public java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway> ipv6Gateway;

        public static DescribeIpv6GatewaysResponseBodyIpv6Gateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseBodyIpv6Gateways self = new DescribeIpv6GatewaysResponseBodyIpv6Gateways();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseBodyIpv6Gateways setIpv6Gateway(java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway> ipv6Gateway) {
            this.ipv6Gateway = ipv6Gateway;
            return this;
        }
        public java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway> getIpv6Gateway() {
            return this.ipv6Gateway;
        }

    }

}
