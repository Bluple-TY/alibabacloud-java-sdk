// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudProductFieldStatisticsResponseBody extends TeaModel {
    @NameInMap("GroupedFields")
    public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields groupedFields;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudProductFieldStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudProductFieldStatisticsResponseBody self = new DescribeCloudProductFieldStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudProductFieldStatisticsResponseBody setGroupedFields(DescribeCloudProductFieldStatisticsResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public DescribeCloudProductFieldStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudProductFieldStatisticsResponseBodyGroupedFields extends TeaModel {
        @NameInMap("CategoryCount")
        public String categoryCount;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        public static DescribeCloudProductFieldStatisticsResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudProductFieldStatisticsResponseBodyGroupedFields self = new DescribeCloudProductFieldStatisticsResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields setCategoryCount(String categoryCount) {
            this.categoryCount = categoryCount;
            return this;
        }
        public String getCategoryCount() {
            return this.categoryCount;
        }

        public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

    }

}
