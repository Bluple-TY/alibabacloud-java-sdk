// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("IpSets")
    public java.util.List<CreateIpSetsResponseBodyIpSets> ipSets;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsResponseBody self = new CreateIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateIpSetsResponseBody setIpSets(java.util.List<CreateIpSetsResponseBodyIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<CreateIpSetsResponseBodyIpSets> getIpSets() {
        return this.ipSets;
    }

    public CreateIpSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIpSetsResponseBodyIpSets extends TeaModel {
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("IpSetId")
        public String ipSetId;

        @NameInMap("IspType")
        public String ispType;

        public static CreateIpSetsResponseBodyIpSets build(java.util.Map<String, ?> map) throws Exception {
            CreateIpSetsResponseBodyIpSets self = new CreateIpSetsResponseBodyIpSets();
            return TeaModel.build(map, self);
        }

        public CreateIpSetsResponseBodyIpSets setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public CreateIpSetsResponseBodyIpSets setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateIpSetsResponseBodyIpSets setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public CreateIpSetsResponseBodyIpSets setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

    }

}
