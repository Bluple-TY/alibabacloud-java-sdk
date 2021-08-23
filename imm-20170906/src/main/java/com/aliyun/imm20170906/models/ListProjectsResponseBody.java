// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Projects")
    public java.util.List<ListProjectsResponseBodyProjects> projects;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setProjects(java.util.List<ListProjectsResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyProjects> getProjects() {
        return this.projects;
    }

    public static class ListProjectsResponseBodyProjects extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("CU")
        public Integer CU;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ServiceRole")
        public String serviceRole;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Project")
        public String project;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListProjectsResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyProjects self = new ListProjectsResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyProjects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectsResponseBodyProjects setCU(Integer CU) {
            this.CU = CU;
            return this;
        }
        public Integer getCU() {
            return this.CU;
        }

        public ListProjectsResponseBodyProjects setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectsResponseBodyProjects setServiceRole(String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }
        public String getServiceRole() {
            return this.serviceRole;
        }

        public ListProjectsResponseBodyProjects setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListProjectsResponseBodyProjects setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListProjectsResponseBodyProjects setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListProjectsResponseBodyProjects setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ListProjectsResponseBodyProjects setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
