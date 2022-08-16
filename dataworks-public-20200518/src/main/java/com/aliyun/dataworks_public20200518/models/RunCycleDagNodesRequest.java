// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunCycleDagNodesRequest extends TeaModel {
    @NameInMap("BizBeginTime")
    public String bizBeginTime;

    @NameInMap("BizEndTime")
    public String bizEndTime;

    @NameInMap("EndBizDate")
    public String endBizDate;

    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeParams")
    public String nodeParams;

    @NameInMap("Parallelism")
    public Boolean parallelism;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("RootNodeId")
    public Long rootNodeId;

    @NameInMap("StartBizDate")
    public String startBizDate;

    @NameInMap("StartFutureInstanceImmediately")
    public Boolean startFutureInstanceImmediately;

    public static RunCycleDagNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCycleDagNodesRequest self = new RunCycleDagNodesRequest();
        return TeaModel.build(map, self);
    }

    public RunCycleDagNodesRequest setBizBeginTime(String bizBeginTime) {
        this.bizBeginTime = bizBeginTime;
        return this;
    }
    public String getBizBeginTime() {
        return this.bizBeginTime;
    }

    public RunCycleDagNodesRequest setBizEndTime(String bizEndTime) {
        this.bizEndTime = bizEndTime;
        return this;
    }
    public String getBizEndTime() {
        return this.bizEndTime;
    }

    public RunCycleDagNodesRequest setEndBizDate(String endBizDate) {
        this.endBizDate = endBizDate;
        return this;
    }
    public String getEndBizDate() {
        return this.endBizDate;
    }

    public RunCycleDagNodesRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public RunCycleDagNodesRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public RunCycleDagNodesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCycleDagNodesRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

    public RunCycleDagNodesRequest setParallelism(Boolean parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Boolean getParallelism() {
        return this.parallelism;
    }

    public RunCycleDagNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public RunCycleDagNodesRequest setRootNodeId(Long rootNodeId) {
        this.rootNodeId = rootNodeId;
        return this;
    }
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    public RunCycleDagNodesRequest setStartBizDate(String startBizDate) {
        this.startBizDate = startBizDate;
        return this;
    }
    public String getStartBizDate() {
        return this.startBizDate;
    }

    public RunCycleDagNodesRequest setStartFutureInstanceImmediately(Boolean startFutureInstanceImmediately) {
        this.startFutureInstanceImmediately = startFutureInstanceImmediately;
        return this;
    }
    public Boolean getStartFutureInstanceImmediately() {
        return this.startFutureInstanceImmediately;
    }

}
