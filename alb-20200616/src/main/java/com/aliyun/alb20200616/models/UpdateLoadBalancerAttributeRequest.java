// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("ModificationProtectionConfig")
    public UpdateLoadBalancerAttributeRequestModificationProtectionConfig modificationProtectionConfig;

    public static UpdateLoadBalancerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeRequest self = new UpdateLoadBalancerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerAttributeRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public UpdateLoadBalancerAttributeRequest setModificationProtectionConfig(UpdateLoadBalancerAttributeRequestModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public UpdateLoadBalancerAttributeRequestModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public static class UpdateLoadBalancerAttributeRequestModificationProtectionConfig extends TeaModel {
        @NameInMap("Reason")
        public String reason;

        @NameInMap("Status")
        public String status;

        public static UpdateLoadBalancerAttributeRequestModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAttributeRequestModificationProtectionConfig self = new UpdateLoadBalancerAttributeRequestModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAttributeRequestModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateLoadBalancerAttributeRequestModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
