// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Description")
    public String description;

    @NameInMap("EipTransmit")
    public String eipTransmit;

    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("Status")
    public String status;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static DescribeLoadBalancerTCPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerTCPListenerAttributeResponseBody self = new DescribeLoadBalancerTCPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
