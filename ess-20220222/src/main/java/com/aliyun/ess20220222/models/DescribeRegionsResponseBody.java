// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>Details of the regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    /**
     * <p>Details of the regions.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The endpoint of the region.</p>
         */
        @NameInMap("ClassicUnavailable")
        public Boolean classicUnavailable;

        /**
         * <p>China (Beijing)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>auditing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("VpcUnavailable")
        public Boolean vpcUnavailable;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setClassicUnavailable(Boolean classicUnavailable) {
            this.classicUnavailable = classicUnavailable;
            return this;
        }
        public Boolean getClassicUnavailable() {
            return this.classicUnavailable;
        }

        public DescribeRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegions setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegions setVpcUnavailable(Boolean vpcUnavailable) {
            this.vpcUnavailable = vpcUnavailable;
            return this;
        }
        public Boolean getVpcUnavailable() {
            return this.vpcUnavailable;
        }

    }

}
