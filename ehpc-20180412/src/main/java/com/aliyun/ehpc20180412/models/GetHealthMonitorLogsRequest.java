// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHealthMonitorLogsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EnableReverse")
    public Boolean enableReverse;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("StartTime")
    public Integer startTime;

    public static GetHealthMonitorLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHealthMonitorLogsRequest self = new GetHealthMonitorLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetHealthMonitorLogsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetHealthMonitorLogsRequest setEnableReverse(Boolean enableReverse) {
        this.enableReverse = enableReverse;
        return this;
    }
    public Boolean getEnableReverse() {
        return this.enableReverse;
    }

    public GetHealthMonitorLogsRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetHealthMonitorLogsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public GetHealthMonitorLogsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
