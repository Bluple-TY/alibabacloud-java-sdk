// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageTotalRequest extends TeaModel {
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("PeriodType")
    public String periodType;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeResourceUsageTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageTotalRequest self = new DescribeResourceUsageTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageTotalRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeResourceUsageTotalRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeResourceUsageTotalRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeResourceUsageTotalRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceUsageTotalRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}
