// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailRequest extends TeaModel {
    @NameInMap("Cmdline")
    public String cmdline;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Extend")
    public String extend;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProcTimeEnd")
    public Long procTimeEnd;

    @NameInMap("ProcTimeStart")
    public Long procTimeStart;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("User")
    public String user;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyProcDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcDetailRequest self = new DescribePropertyProcDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcDetailRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
    }

    public DescribePropertyProcDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyProcDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyProcDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertyProcDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyProcDetailRequest setProcTimeEnd(Long procTimeEnd) {
        this.procTimeEnd = procTimeEnd;
        return this;
    }
    public Long getProcTimeEnd() {
        return this.procTimeEnd;
    }

    public DescribePropertyProcDetailRequest setProcTimeStart(Long procTimeStart) {
        this.procTimeStart = procTimeStart;
        return this;
    }
    public Long getProcTimeStart() {
        return this.procTimeStart;
    }

    public DescribePropertyProcDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyProcDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyProcDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
