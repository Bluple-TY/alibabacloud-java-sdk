// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBusiRegionsResponseBody extends TeaModel {
    /**
     * <p>Information about the region.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListBusiRegionsResponseBodyRegions> regions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBusiRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusiRegionsResponseBody self = new ListBusiRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusiRegionsResponseBody setRegions(java.util.List<ListBusiRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListBusiRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListBusiRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBusiRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the region where the GA instance is deployed. Only **cn-hangzhou** is returned.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListBusiRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListBusiRegionsResponseBodyRegions self = new ListBusiRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListBusiRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListBusiRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
