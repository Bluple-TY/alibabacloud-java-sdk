// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureRequest extends TeaModel {
    @NameInMap("AccessLogEnabled")
    public Boolean accessLogEnabled;

    @NameInMap("AccessLogFile")
    public String accessLogFile;

    @NameInMap("AccessLogFormat")
    public String accessLogFormat;

    @NameInMap("AccessLogGatewayLifecycle")
    public Integer accessLogGatewayLifecycle;

    @NameInMap("AccessLogProject")
    public String accessLogProject;

    @NameInMap("AccessLogServiceEnabled")
    public Boolean accessLogServiceEnabled;

    @NameInMap("AccessLogServiceHost")
    public String accessLogServiceHost;

    @NameInMap("AccessLogServicePort")
    public Integer accessLogServicePort;

    @NameInMap("AccessLogSidecarLifecycle")
    public Integer accessLogSidecarLifecycle;

    @NameInMap("AuditProject")
    public String auditProject;

    @NameInMap("AutoInjectionPolicyEnabled")
    public Boolean autoInjectionPolicyEnabled;

    @NameInMap("CRAggregationEnabled")
    public Boolean CRAggregationEnabled;

    @NameInMap("ClusterSpec")
    public String clusterSpec;

    @NameInMap("CniEnabled")
    public Boolean cniEnabled;

    @NameInMap("CniExcludeNamespaces")
    public String cniExcludeNamespaces;

    @NameInMap("Concurrency")
    public Integer concurrency;

    @NameInMap("ConfigSourceEnabled")
    public Boolean configSourceEnabled;

    @NameInMap("ConfigSourceNacosID")
    public String configSourceNacosID;

    @NameInMap("CustomizedPrometheus")
    public Boolean customizedPrometheus;

    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    @NameInMap("DNSProxyingEnabled")
    public Boolean DNSProxyingEnabled;

    @NameInMap("DiscoverySelectors")
    public String discoverySelectors;

    @NameInMap("DubboFilterEnabled")
    public Boolean dubboFilterEnabled;

    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    @NameInMap("EnableAutoDiagnosis")
    public Boolean enableAutoDiagnosis;

    @NameInMap("EnableCRHistory")
    public Boolean enableCRHistory;

    @NameInMap("EnableNamespacesByDefault")
    public Boolean enableNamespacesByDefault;

    @NameInMap("EnableSDSServer")
    public Boolean enableSDSServer;

    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    @NameInMap("FilterGatewayClusterConfig")
    public Boolean filterGatewayClusterConfig;

    @NameInMap("GatewayAPIEnabled")
    public Boolean gatewayAPIEnabled;

    @NameInMap("GlobalRateLimitEnabled")
    public Boolean globalRateLimitEnabled;

    @NameInMap("HoldApplicationUntilProxyStarts")
    public Boolean holdApplicationUntilProxyStarts;

    @NameInMap("Http10Enabled")
    public Boolean http10Enabled;

    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    @NameInMap("IncludeInboundPorts")
    public String includeInboundPorts;

    @NameInMap("IncludeOutboundPorts")
    public String includeOutboundPorts;

    @NameInMap("IntegrateKiali")
    public Boolean integrateKiali;

    @NameInMap("InterceptionMode")
    public String interceptionMode;

    @NameInMap("KialiEnabled")
    public Boolean kialiEnabled;

    @NameInMap("Lifecycle")
    public String lifecycle;

    @NameInMap("LocalityLBConf")
    public String localityLBConf;

    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    @NameInMap("LogLevel")
    public String logLevel;

    @NameInMap("MSEEnabled")
    public Boolean MSEEnabled;

    @NameInMap("MultiBufferEnabled")
    public Boolean multiBufferEnabled;

    @NameInMap("MultiBufferPollDelay")
    public String multiBufferPollDelay;

    @NameInMap("MysqlFilterEnabled")
    public Boolean mysqlFilterEnabled;

    @NameInMap("NFDEnabled")
    public Boolean NFDEnabled;

    @NameInMap("NFDLabelPruned")
    public Boolean NFDLabelPruned;

    @NameInMap("OPAInjectorCPULimit")
    public String OPAInjectorCPULimit;

    @NameInMap("OPAInjectorCPURequirement")
    public String OPAInjectorCPURequirement;

    @NameInMap("OPAInjectorMemoryLimit")
    public String OPAInjectorMemoryLimit;

    @NameInMap("OPAInjectorMemoryRequirement")
    public String OPAInjectorMemoryRequirement;

    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    @NameInMap("OPAScopeInjected")
    public Boolean OPAScopeInjected;

    @NameInMap("OpaEnabled")
    public Boolean opaEnabled;

    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    @NameInMap("OutboundTrafficPolicy")
    public String outboundTrafficPolicy;

    @NameInMap("PrometheusUrl")
    public String prometheusUrl;

    @NameInMap("ProxyInitCPUResourceLimit")
    public String proxyInitCPUResourceLimit;

    @NameInMap("ProxyInitCPUResourceRequest")
    public String proxyInitCPUResourceRequest;

    @NameInMap("ProxyInitMemoryResourceLimit")
    public String proxyInitMemoryResourceLimit;

    @NameInMap("ProxyInitMemoryResourceRequest")
    public String proxyInitMemoryResourceRequest;

    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    @NameInMap("ProxyStatsMatcher")
    public String proxyStatsMatcher;

    @NameInMap("RedisFilterEnabled")
    public Boolean redisFilterEnabled;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("SidecarInjectorLimitCPU")
    public String sidecarInjectorLimitCPU;

    @NameInMap("SidecarInjectorLimitMemory")
    public String sidecarInjectorLimitMemory;

    @NameInMap("SidecarInjectorRequestCPU")
    public String sidecarInjectorRequestCPU;

    @NameInMap("SidecarInjectorRequestMemory")
    public String sidecarInjectorRequestMemory;

    @NameInMap("SidecarInjectorWebhookAsYaml")
    public String sidecarInjectorWebhookAsYaml;

    @NameInMap("Telemetry")
    public Boolean telemetry;

    @NameInMap("TerminationDrainDuration")
    public String terminationDrainDuration;

    @NameInMap("ThriftFilterEnabled")
    public Boolean thriftFilterEnabled;

    @NameInMap("TraceCustomTags")
    public String traceCustomTags;

    @NameInMap("TraceMaxPathTagLength")
    public String traceMaxPathTagLength;

    @NameInMap("TraceSampling")
    public Float traceSampling;

    @NameInMap("Tracing")
    public Boolean tracing;

    @NameInMap("TracingOnExtZipkinLimitCPU")
    public String tracingOnExtZipkinLimitCPU;

    @NameInMap("TracingOnExtZipkinLimitMemory")
    public String tracingOnExtZipkinLimitMemory;

    @NameInMap("TracingOnExtZipkinRequestCPU")
    public String tracingOnExtZipkinRequestCPU;

    @NameInMap("TracingOnExtZipkinRequestMemory")
    public String tracingOnExtZipkinRequestMemory;

    @NameInMap("WebAssemblyFilterEnabled")
    public Boolean webAssemblyFilterEnabled;

    public static UpdateMeshFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshFeatureRequest self = new UpdateMeshFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshFeatureRequest setAccessLogEnabled(Boolean accessLogEnabled) {
        this.accessLogEnabled = accessLogEnabled;
        return this;
    }
    public Boolean getAccessLogEnabled() {
        return this.accessLogEnabled;
    }

    public UpdateMeshFeatureRequest setAccessLogFile(String accessLogFile) {
        this.accessLogFile = accessLogFile;
        return this;
    }
    public String getAccessLogFile() {
        return this.accessLogFile;
    }

    public UpdateMeshFeatureRequest setAccessLogFormat(String accessLogFormat) {
        this.accessLogFormat = accessLogFormat;
        return this;
    }
    public String getAccessLogFormat() {
        return this.accessLogFormat;
    }

    public UpdateMeshFeatureRequest setAccessLogGatewayLifecycle(Integer accessLogGatewayLifecycle) {
        this.accessLogGatewayLifecycle = accessLogGatewayLifecycle;
        return this;
    }
    public Integer getAccessLogGatewayLifecycle() {
        return this.accessLogGatewayLifecycle;
    }

    public UpdateMeshFeatureRequest setAccessLogProject(String accessLogProject) {
        this.accessLogProject = accessLogProject;
        return this;
    }
    public String getAccessLogProject() {
        return this.accessLogProject;
    }

    public UpdateMeshFeatureRequest setAccessLogServiceEnabled(Boolean accessLogServiceEnabled) {
        this.accessLogServiceEnabled = accessLogServiceEnabled;
        return this;
    }
    public Boolean getAccessLogServiceEnabled() {
        return this.accessLogServiceEnabled;
    }

    public UpdateMeshFeatureRequest setAccessLogServiceHost(String accessLogServiceHost) {
        this.accessLogServiceHost = accessLogServiceHost;
        return this;
    }
    public String getAccessLogServiceHost() {
        return this.accessLogServiceHost;
    }

    public UpdateMeshFeatureRequest setAccessLogServicePort(Integer accessLogServicePort) {
        this.accessLogServicePort = accessLogServicePort;
        return this;
    }
    public Integer getAccessLogServicePort() {
        return this.accessLogServicePort;
    }

    public UpdateMeshFeatureRequest setAccessLogSidecarLifecycle(Integer accessLogSidecarLifecycle) {
        this.accessLogSidecarLifecycle = accessLogSidecarLifecycle;
        return this;
    }
    public Integer getAccessLogSidecarLifecycle() {
        return this.accessLogSidecarLifecycle;
    }

    public UpdateMeshFeatureRequest setAuditProject(String auditProject) {
        this.auditProject = auditProject;
        return this;
    }
    public String getAuditProject() {
        return this.auditProject;
    }

    public UpdateMeshFeatureRequest setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
        this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
        return this;
    }
    public Boolean getAutoInjectionPolicyEnabled() {
        return this.autoInjectionPolicyEnabled;
    }

    public UpdateMeshFeatureRequest setCRAggregationEnabled(Boolean CRAggregationEnabled) {
        this.CRAggregationEnabled = CRAggregationEnabled;
        return this;
    }
    public Boolean getCRAggregationEnabled() {
        return this.CRAggregationEnabled;
    }

    public UpdateMeshFeatureRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public UpdateMeshFeatureRequest setCniEnabled(Boolean cniEnabled) {
        this.cniEnabled = cniEnabled;
        return this;
    }
    public Boolean getCniEnabled() {
        return this.cniEnabled;
    }

    public UpdateMeshFeatureRequest setCniExcludeNamespaces(String cniExcludeNamespaces) {
        this.cniExcludeNamespaces = cniExcludeNamespaces;
        return this;
    }
    public String getCniExcludeNamespaces() {
        return this.cniExcludeNamespaces;
    }

    public UpdateMeshFeatureRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public UpdateMeshFeatureRequest setConfigSourceEnabled(Boolean configSourceEnabled) {
        this.configSourceEnabled = configSourceEnabled;
        return this;
    }
    public Boolean getConfigSourceEnabled() {
        return this.configSourceEnabled;
    }

    public UpdateMeshFeatureRequest setConfigSourceNacosID(String configSourceNacosID) {
        this.configSourceNacosID = configSourceNacosID;
        return this;
    }
    public String getConfigSourceNacosID() {
        return this.configSourceNacosID;
    }

    public UpdateMeshFeatureRequest setCustomizedPrometheus(Boolean customizedPrometheus) {
        this.customizedPrometheus = customizedPrometheus;
        return this;
    }
    public Boolean getCustomizedPrometheus() {
        return this.customizedPrometheus;
    }

    public UpdateMeshFeatureRequest setCustomizedZipkin(Boolean customizedZipkin) {
        this.customizedZipkin = customizedZipkin;
        return this;
    }
    public Boolean getCustomizedZipkin() {
        return this.customizedZipkin;
    }

    public UpdateMeshFeatureRequest setDNSProxyingEnabled(Boolean DNSProxyingEnabled) {
        this.DNSProxyingEnabled = DNSProxyingEnabled;
        return this;
    }
    public Boolean getDNSProxyingEnabled() {
        return this.DNSProxyingEnabled;
    }

    public UpdateMeshFeatureRequest setDiscoverySelectors(String discoverySelectors) {
        this.discoverySelectors = discoverySelectors;
        return this;
    }
    public String getDiscoverySelectors() {
        return this.discoverySelectors;
    }

    public UpdateMeshFeatureRequest setDubboFilterEnabled(Boolean dubboFilterEnabled) {
        this.dubboFilterEnabled = dubboFilterEnabled;
        return this;
    }
    public Boolean getDubboFilterEnabled() {
        return this.dubboFilterEnabled;
    }

    public UpdateMeshFeatureRequest setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public UpdateMeshFeatureRequest setEnableAutoDiagnosis(Boolean enableAutoDiagnosis) {
        this.enableAutoDiagnosis = enableAutoDiagnosis;
        return this;
    }
    public Boolean getEnableAutoDiagnosis() {
        return this.enableAutoDiagnosis;
    }

    public UpdateMeshFeatureRequest setEnableCRHistory(Boolean enableCRHistory) {
        this.enableCRHistory = enableCRHistory;
        return this;
    }
    public Boolean getEnableCRHistory() {
        return this.enableCRHistory;
    }

    public UpdateMeshFeatureRequest setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
        this.enableNamespacesByDefault = enableNamespacesByDefault;
        return this;
    }
    public Boolean getEnableNamespacesByDefault() {
        return this.enableNamespacesByDefault;
    }

    public UpdateMeshFeatureRequest setEnableSDSServer(Boolean enableSDSServer) {
        this.enableSDSServer = enableSDSServer;
        return this;
    }
    public Boolean getEnableSDSServer() {
        return this.enableSDSServer;
    }

    public UpdateMeshFeatureRequest setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    public UpdateMeshFeatureRequest setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    public UpdateMeshFeatureRequest setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    public UpdateMeshFeatureRequest setFilterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
        this.filterGatewayClusterConfig = filterGatewayClusterConfig;
        return this;
    }
    public Boolean getFilterGatewayClusterConfig() {
        return this.filterGatewayClusterConfig;
    }

    public UpdateMeshFeatureRequest setGatewayAPIEnabled(Boolean gatewayAPIEnabled) {
        this.gatewayAPIEnabled = gatewayAPIEnabled;
        return this;
    }
    public Boolean getGatewayAPIEnabled() {
        return this.gatewayAPIEnabled;
    }

    public UpdateMeshFeatureRequest setGlobalRateLimitEnabled(Boolean globalRateLimitEnabled) {
        this.globalRateLimitEnabled = globalRateLimitEnabled;
        return this;
    }
    public Boolean getGlobalRateLimitEnabled() {
        return this.globalRateLimitEnabled;
    }

    public UpdateMeshFeatureRequest setHoldApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
        this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
        return this;
    }
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.holdApplicationUntilProxyStarts;
    }

    public UpdateMeshFeatureRequest setHttp10Enabled(Boolean http10Enabled) {
        this.http10Enabled = http10Enabled;
        return this;
    }
    public Boolean getHttp10Enabled() {
        return this.http10Enabled;
    }

    public UpdateMeshFeatureRequest setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    public UpdateMeshFeatureRequest setIncludeInboundPorts(String includeInboundPorts) {
        this.includeInboundPorts = includeInboundPorts;
        return this;
    }
    public String getIncludeInboundPorts() {
        return this.includeInboundPorts;
    }

    public UpdateMeshFeatureRequest setIncludeOutboundPorts(String includeOutboundPorts) {
        this.includeOutboundPorts = includeOutboundPorts;
        return this;
    }
    public String getIncludeOutboundPorts() {
        return this.includeOutboundPorts;
    }

    public UpdateMeshFeatureRequest setIntegrateKiali(Boolean integrateKiali) {
        this.integrateKiali = integrateKiali;
        return this;
    }
    public Boolean getIntegrateKiali() {
        return this.integrateKiali;
    }

    public UpdateMeshFeatureRequest setInterceptionMode(String interceptionMode) {
        this.interceptionMode = interceptionMode;
        return this;
    }
    public String getInterceptionMode() {
        return this.interceptionMode;
    }

    public UpdateMeshFeatureRequest setKialiEnabled(Boolean kialiEnabled) {
        this.kialiEnabled = kialiEnabled;
        return this;
    }
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    public UpdateMeshFeatureRequest setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public UpdateMeshFeatureRequest setLocalityLBConf(String localityLBConf) {
        this.localityLBConf = localityLBConf;
        return this;
    }
    public String getLocalityLBConf() {
        return this.localityLBConf;
    }

    public UpdateMeshFeatureRequest setLocalityLoadBalancing(Boolean localityLoadBalancing) {
        this.localityLoadBalancing = localityLoadBalancing;
        return this;
    }
    public Boolean getLocalityLoadBalancing() {
        return this.localityLoadBalancing;
    }

    public UpdateMeshFeatureRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public UpdateMeshFeatureRequest setMSEEnabled(Boolean MSEEnabled) {
        this.MSEEnabled = MSEEnabled;
        return this;
    }
    public Boolean getMSEEnabled() {
        return this.MSEEnabled;
    }

    public UpdateMeshFeatureRequest setMultiBufferEnabled(Boolean multiBufferEnabled) {
        this.multiBufferEnabled = multiBufferEnabled;
        return this;
    }
    public Boolean getMultiBufferEnabled() {
        return this.multiBufferEnabled;
    }

    public UpdateMeshFeatureRequest setMultiBufferPollDelay(String multiBufferPollDelay) {
        this.multiBufferPollDelay = multiBufferPollDelay;
        return this;
    }
    public String getMultiBufferPollDelay() {
        return this.multiBufferPollDelay;
    }

    public UpdateMeshFeatureRequest setMysqlFilterEnabled(Boolean mysqlFilterEnabled) {
        this.mysqlFilterEnabled = mysqlFilterEnabled;
        return this;
    }
    public Boolean getMysqlFilterEnabled() {
        return this.mysqlFilterEnabled;
    }

    public UpdateMeshFeatureRequest setNFDEnabled(Boolean NFDEnabled) {
        this.NFDEnabled = NFDEnabled;
        return this;
    }
    public Boolean getNFDEnabled() {
        return this.NFDEnabled;
    }

    public UpdateMeshFeatureRequest setNFDLabelPruned(Boolean NFDLabelPruned) {
        this.NFDLabelPruned = NFDLabelPruned;
        return this;
    }
    public Boolean getNFDLabelPruned() {
        return this.NFDLabelPruned;
    }

    public UpdateMeshFeatureRequest setOPAInjectorCPULimit(String OPAInjectorCPULimit) {
        this.OPAInjectorCPULimit = OPAInjectorCPULimit;
        return this;
    }
    public String getOPAInjectorCPULimit() {
        return this.OPAInjectorCPULimit;
    }

    public UpdateMeshFeatureRequest setOPAInjectorCPURequirement(String OPAInjectorCPURequirement) {
        this.OPAInjectorCPURequirement = OPAInjectorCPURequirement;
        return this;
    }
    public String getOPAInjectorCPURequirement() {
        return this.OPAInjectorCPURequirement;
    }

    public UpdateMeshFeatureRequest setOPAInjectorMemoryLimit(String OPAInjectorMemoryLimit) {
        this.OPAInjectorMemoryLimit = OPAInjectorMemoryLimit;
        return this;
    }
    public String getOPAInjectorMemoryLimit() {
        return this.OPAInjectorMemoryLimit;
    }

    public UpdateMeshFeatureRequest setOPAInjectorMemoryRequirement(String OPAInjectorMemoryRequirement) {
        this.OPAInjectorMemoryRequirement = OPAInjectorMemoryRequirement;
        return this;
    }
    public String getOPAInjectorMemoryRequirement() {
        return this.OPAInjectorMemoryRequirement;
    }

    public UpdateMeshFeatureRequest setOPALimitCPU(String OPALimitCPU) {
        this.OPALimitCPU = OPALimitCPU;
        return this;
    }
    public String getOPALimitCPU() {
        return this.OPALimitCPU;
    }

    public UpdateMeshFeatureRequest setOPALimitMemory(String OPALimitMemory) {
        this.OPALimitMemory = OPALimitMemory;
        return this;
    }
    public String getOPALimitMemory() {
        return this.OPALimitMemory;
    }

    public UpdateMeshFeatureRequest setOPALogLevel(String OPALogLevel) {
        this.OPALogLevel = OPALogLevel;
        return this;
    }
    public String getOPALogLevel() {
        return this.OPALogLevel;
    }

    public UpdateMeshFeatureRequest setOPARequestCPU(String OPARequestCPU) {
        this.OPARequestCPU = OPARequestCPU;
        return this;
    }
    public String getOPARequestCPU() {
        return this.OPARequestCPU;
    }

    public UpdateMeshFeatureRequest setOPARequestMemory(String OPARequestMemory) {
        this.OPARequestMemory = OPARequestMemory;
        return this;
    }
    public String getOPARequestMemory() {
        return this.OPARequestMemory;
    }

    public UpdateMeshFeatureRequest setOPAScopeInjected(Boolean OPAScopeInjected) {
        this.OPAScopeInjected = OPAScopeInjected;
        return this;
    }
    public Boolean getOPAScopeInjected() {
        return this.OPAScopeInjected;
    }

    public UpdateMeshFeatureRequest setOpaEnabled(Boolean opaEnabled) {
        this.opaEnabled = opaEnabled;
        return this;
    }
    public Boolean getOpaEnabled() {
        return this.opaEnabled;
    }

    public UpdateMeshFeatureRequest setOpenAgentPolicy(Boolean openAgentPolicy) {
        this.openAgentPolicy = openAgentPolicy;
        return this;
    }
    public Boolean getOpenAgentPolicy() {
        return this.openAgentPolicy;
    }

    public UpdateMeshFeatureRequest setOutboundTrafficPolicy(String outboundTrafficPolicy) {
        this.outboundTrafficPolicy = outboundTrafficPolicy;
        return this;
    }
    public String getOutboundTrafficPolicy() {
        return this.outboundTrafficPolicy;
    }

    public UpdateMeshFeatureRequest setPrometheusUrl(String prometheusUrl) {
        this.prometheusUrl = prometheusUrl;
        return this;
    }
    public String getPrometheusUrl() {
        return this.prometheusUrl;
    }

    public UpdateMeshFeatureRequest setProxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
        this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
        return this;
    }
    public String getProxyInitCPUResourceLimit() {
        return this.proxyInitCPUResourceLimit;
    }

    public UpdateMeshFeatureRequest setProxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
        this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
        return this;
    }
    public String getProxyInitCPUResourceRequest() {
        return this.proxyInitCPUResourceRequest;
    }

    public UpdateMeshFeatureRequest setProxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
        this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
        return this;
    }
    public String getProxyInitMemoryResourceLimit() {
        return this.proxyInitMemoryResourceLimit;
    }

    public UpdateMeshFeatureRequest setProxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
        this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
        return this;
    }
    public String getProxyInitMemoryResourceRequest() {
        return this.proxyInitMemoryResourceRequest;
    }

    public UpdateMeshFeatureRequest setProxyLimitCPU(String proxyLimitCPU) {
        this.proxyLimitCPU = proxyLimitCPU;
        return this;
    }
    public String getProxyLimitCPU() {
        return this.proxyLimitCPU;
    }

    public UpdateMeshFeatureRequest setProxyLimitMemory(String proxyLimitMemory) {
        this.proxyLimitMemory = proxyLimitMemory;
        return this;
    }
    public String getProxyLimitMemory() {
        return this.proxyLimitMemory;
    }

    public UpdateMeshFeatureRequest setProxyRequestCPU(String proxyRequestCPU) {
        this.proxyRequestCPU = proxyRequestCPU;
        return this;
    }
    public String getProxyRequestCPU() {
        return this.proxyRequestCPU;
    }

    public UpdateMeshFeatureRequest setProxyRequestMemory(String proxyRequestMemory) {
        this.proxyRequestMemory = proxyRequestMemory;
        return this;
    }
    public String getProxyRequestMemory() {
        return this.proxyRequestMemory;
    }

    public UpdateMeshFeatureRequest setProxyStatsMatcher(String proxyStatsMatcher) {
        this.proxyStatsMatcher = proxyStatsMatcher;
        return this;
    }
    public String getProxyStatsMatcher() {
        return this.proxyStatsMatcher;
    }

    public UpdateMeshFeatureRequest setRedisFilterEnabled(Boolean redisFilterEnabled) {
        this.redisFilterEnabled = redisFilterEnabled;
        return this;
    }
    public Boolean getRedisFilterEnabled() {
        return this.redisFilterEnabled;
    }

    public UpdateMeshFeatureRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorLimitCPU(String sidecarInjectorLimitCPU) {
        this.sidecarInjectorLimitCPU = sidecarInjectorLimitCPU;
        return this;
    }
    public String getSidecarInjectorLimitCPU() {
        return this.sidecarInjectorLimitCPU;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorLimitMemory(String sidecarInjectorLimitMemory) {
        this.sidecarInjectorLimitMemory = sidecarInjectorLimitMemory;
        return this;
    }
    public String getSidecarInjectorLimitMemory() {
        return this.sidecarInjectorLimitMemory;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorRequestCPU(String sidecarInjectorRequestCPU) {
        this.sidecarInjectorRequestCPU = sidecarInjectorRequestCPU;
        return this;
    }
    public String getSidecarInjectorRequestCPU() {
        return this.sidecarInjectorRequestCPU;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorRequestMemory(String sidecarInjectorRequestMemory) {
        this.sidecarInjectorRequestMemory = sidecarInjectorRequestMemory;
        return this;
    }
    public String getSidecarInjectorRequestMemory() {
        return this.sidecarInjectorRequestMemory;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
        this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
        return this;
    }
    public String getSidecarInjectorWebhookAsYaml() {
        return this.sidecarInjectorWebhookAsYaml;
    }

    public UpdateMeshFeatureRequest setTelemetry(Boolean telemetry) {
        this.telemetry = telemetry;
        return this;
    }
    public Boolean getTelemetry() {
        return this.telemetry;
    }

    public UpdateMeshFeatureRequest setTerminationDrainDuration(String terminationDrainDuration) {
        this.terminationDrainDuration = terminationDrainDuration;
        return this;
    }
    public String getTerminationDrainDuration() {
        return this.terminationDrainDuration;
    }

    public UpdateMeshFeatureRequest setThriftFilterEnabled(Boolean thriftFilterEnabled) {
        this.thriftFilterEnabled = thriftFilterEnabled;
        return this;
    }
    public Boolean getThriftFilterEnabled() {
        return this.thriftFilterEnabled;
    }

    public UpdateMeshFeatureRequest setTraceCustomTags(String traceCustomTags) {
        this.traceCustomTags = traceCustomTags;
        return this;
    }
    public String getTraceCustomTags() {
        return this.traceCustomTags;
    }

    public UpdateMeshFeatureRequest setTraceMaxPathTagLength(String traceMaxPathTagLength) {
        this.traceMaxPathTagLength = traceMaxPathTagLength;
        return this;
    }
    public String getTraceMaxPathTagLength() {
        return this.traceMaxPathTagLength;
    }

    public UpdateMeshFeatureRequest setTraceSampling(Float traceSampling) {
        this.traceSampling = traceSampling;
        return this;
    }
    public Float getTraceSampling() {
        return this.traceSampling;
    }

    public UpdateMeshFeatureRequest setTracing(Boolean tracing) {
        this.tracing = tracing;
        return this;
    }
    public Boolean getTracing() {
        return this.tracing;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinLimitCPU(String tracingOnExtZipkinLimitCPU) {
        this.tracingOnExtZipkinLimitCPU = tracingOnExtZipkinLimitCPU;
        return this;
    }
    public String getTracingOnExtZipkinLimitCPU() {
        return this.tracingOnExtZipkinLimitCPU;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinLimitMemory(String tracingOnExtZipkinLimitMemory) {
        this.tracingOnExtZipkinLimitMemory = tracingOnExtZipkinLimitMemory;
        return this;
    }
    public String getTracingOnExtZipkinLimitMemory() {
        return this.tracingOnExtZipkinLimitMemory;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinRequestCPU(String tracingOnExtZipkinRequestCPU) {
        this.tracingOnExtZipkinRequestCPU = tracingOnExtZipkinRequestCPU;
        return this;
    }
    public String getTracingOnExtZipkinRequestCPU() {
        return this.tracingOnExtZipkinRequestCPU;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinRequestMemory(String tracingOnExtZipkinRequestMemory) {
        this.tracingOnExtZipkinRequestMemory = tracingOnExtZipkinRequestMemory;
        return this;
    }
    public String getTracingOnExtZipkinRequestMemory() {
        return this.tracingOnExtZipkinRequestMemory;
    }

    public UpdateMeshFeatureRequest setWebAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
        this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
        return this;
    }
    public Boolean getWebAssemblyFilterEnabled() {
        return this.webAssemblyFilterEnabled;
    }

}
