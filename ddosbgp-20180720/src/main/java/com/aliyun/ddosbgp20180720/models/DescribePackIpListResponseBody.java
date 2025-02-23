// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackIpListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IpList")
    public java.util.List<DescribePackIpListResponseBodyIpList> ipList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static DescribePackIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackIpListResponseBody self = new DescribePackIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackIpListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePackIpListResponseBody setIpList(java.util.List<DescribePackIpListResponseBodyIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<DescribePackIpListResponseBodyIpList> getIpList() {
        return this.ipList;
    }

    public DescribePackIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackIpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePackIpListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribePackIpListResponseBodyIpList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Product")
        public String product;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        public static DescribePackIpListResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackIpListResponseBodyIpList self = new DescribePackIpListResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public DescribePackIpListResponseBodyIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePackIpListResponseBodyIpList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribePackIpListResponseBodyIpList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribePackIpListResponseBodyIpList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
