// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcListResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcList")
    public java.util.List<DescribeVpcListResponseBodyVpcList> vpcList;

    public static DescribeVpcListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcListResponseBody self = new DescribeVpcListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeVpcListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcListResponseBody setVpcList(java.util.List<DescribeVpcListResponseBodyVpcList> vpcList) {
        this.vpcList = vpcList;
        return this;
    }
    public java.util.List<DescribeVpcListResponseBodyVpcList> getVpcList() {
        return this.vpcList;
    }

    public static class DescribeVpcListResponseBodyVpcList extends TeaModel {
        @NameInMap("EcsCount")
        public Integer ecsCount;

        @NameInMap("InstanceDesc")
        public String instanceDesc;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeVpcListResponseBodyVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcListResponseBodyVpcList self = new DescribeVpcListResponseBodyVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcListResponseBodyVpcList setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeVpcListResponseBodyVpcList setInstanceDesc(String instanceDesc) {
            this.instanceDesc = instanceDesc;
            return this;
        }
        public String getInstanceDesc() {
            return this.instanceDesc;
        }

        public DescribeVpcListResponseBodyVpcList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVpcListResponseBodyVpcList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeVpcListResponseBodyVpcList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
