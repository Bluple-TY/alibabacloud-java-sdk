// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("EcsEntityList")
    public ListEcsNotInClusterResponseBodyEcsEntityList ecsEntityList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEcsNotInClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsNotInClusterResponseBody self = new ListEcsNotInClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsNotInClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEcsNotInClusterResponseBody setEcsEntityList(ListEcsNotInClusterResponseBodyEcsEntityList ecsEntityList) {
        this.ecsEntityList = ecsEntityList;
        return this;
    }
    public ListEcsNotInClusterResponseBodyEcsEntityList getEcsEntityList() {
        return this.ecsEntityList;
    }

    public ListEcsNotInClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEcsNotInClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Eip")
        public String eip;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("InnerIp")
        public String innerIp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity build(java.util.Map<String, ?> map) throws Exception {
            ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity self = new ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity();
            return TeaModel.build(map, self);
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class ListEcsNotInClusterResponseBodyEcsEntityList extends TeaModel {
        @NameInMap("EcsEntity")
        public java.util.List<ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity> ecsEntity;

        public static ListEcsNotInClusterResponseBodyEcsEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListEcsNotInClusterResponseBodyEcsEntityList self = new ListEcsNotInClusterResponseBodyEcsEntityList();
            return TeaModel.build(map, self);
        }

        public ListEcsNotInClusterResponseBodyEcsEntityList setEcsEntity(java.util.List<ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity> ecsEntity) {
            this.ecsEntity = ecsEntity;
            return this;
        }
        public java.util.List<ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity> getEcsEntity() {
            return this.ecsEntity;
        }

    }

}
