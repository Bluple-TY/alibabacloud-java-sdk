// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("RegionIds")
    public DescribeGeographicRegionMembershipResponseBodyRegionIds regionIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGeographicRegionMembershipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeographicRegionMembershipResponseBody self = new DescribeGeographicRegionMembershipResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeographicRegionMembershipResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGeographicRegionMembershipResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGeographicRegionMembershipResponseBody setRegionIds(DescribeGeographicRegionMembershipResponseBodyRegionIds regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public DescribeGeographicRegionMembershipResponseBodyRegionIds getRegionIds() {
        return this.regionIds;
    }

    public DescribeGeographicRegionMembershipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeographicRegionMembershipResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         * <br>
         * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId self = new DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId();
            return TeaModel.build(map, self);
        }

        public DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeGeographicRegionMembershipResponseBodyRegionIds extends TeaModel {
        @NameInMap("RegionId")
        public java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId> regionId;

        public static DescribeGeographicRegionMembershipResponseBodyRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeographicRegionMembershipResponseBodyRegionIds self = new DescribeGeographicRegionMembershipResponseBodyRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeGeographicRegionMembershipResponseBodyRegionIds setRegionId(java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId> getRegionId() {
            return this.regionId;
        }

    }

}
