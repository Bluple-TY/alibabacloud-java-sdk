// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDialogueNodeStatisticsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("Limit")
    public Integer limit;

    public static DescribeDialogueNodeStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogueNodeStatisticsRequest self = new DescribeDialogueNodeStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDialogueNodeStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDialogueNodeStatisticsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public DescribeDialogueNodeStatisticsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
