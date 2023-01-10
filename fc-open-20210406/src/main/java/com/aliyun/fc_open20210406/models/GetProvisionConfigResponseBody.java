// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetProvisionConfigResponseBody extends TeaModel {
    // Specifies whether to always allocate CPU to a function instance.
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    // The actual number of provisioned instances.
    @NameInMap("current")
    public Long current;

    // The error message returned if a provisioned instance fails to be created.
    @NameInMap("currentError")
    public String currentError;

    // The description of the resource.
    @NameInMap("resource")
    public String resource;

    // The configurations of scheduled auto scaling.
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledActions> scheduledActions;

    // The expected number of provisioned instances.
    @NameInMap("target")
    public Long target;

    // The configurations of metric-based auto scaling.
    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicies> targetTrackingPolicies;

    public static GetProvisionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigResponseBody self = new GetProvisionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigResponseBody setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public GetProvisionConfigResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetProvisionConfigResponseBody setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public GetProvisionConfigResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public GetProvisionConfigResponseBody setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledActions> getScheduledActions() {
        return this.scheduledActions;
    }

    public GetProvisionConfigResponseBody setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public GetProvisionConfigResponseBody setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

}
