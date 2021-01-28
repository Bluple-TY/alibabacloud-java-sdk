// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InDebt")
    public Boolean inDebt;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    @NameInMap("OnService")
    public Boolean onService;

    public static DescribeUserDcdnStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDcdnStatusResponseBody self = new DescribeUserDcdnStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserDcdnStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserDcdnStatusResponseBody setInDebt(Boolean inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public Boolean getInDebt() {
        return this.inDebt;
    }

    public DescribeUserDcdnStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeUserDcdnStatusResponseBody setInDebtOverdue(Boolean inDebtOverdue) {
        this.inDebtOverdue = inDebtOverdue;
        return this;
    }
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    public DescribeUserDcdnStatusResponseBody setOnService(Boolean onService) {
        this.onService = onService;
        return this;
    }
    public Boolean getOnService() {
        return this.onService;
    }

}
