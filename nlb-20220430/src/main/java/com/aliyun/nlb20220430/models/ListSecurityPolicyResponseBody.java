// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPolicies")
    public java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> securityPolicies;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyResponseBody self = new ListSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecurityPolicyResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListSecurityPolicyResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListSecurityPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityPolicyResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecurityPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityPolicyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityPolicyResponseBody setSecurityPolicies(java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> securityPolicies) {
        this.securityPolicies = securityPolicies;
        return this;
    }
    public java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public ListSecurityPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSecurityPolicyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners extends TeaModel {
        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners self = new ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class ListSecurityPolicyResponseBodySecurityPoliciesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListSecurityPolicyResponseBodySecurityPoliciesTags build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodySecurityPoliciesTags self = new ListSecurityPolicyResponseBodySecurityPoliciesTags();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSecurityPolicyResponseBodySecurityPolicies extends TeaModel {
        // 加密套件
        @NameInMap("Ciphers")
        public String ciphers;

        // 业务location
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RelatedListeners")
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> relatedListeners;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // tls策略ID
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        // 名称
        @NameInMap("SecurityPolicyName")
        public String securityPolicyName;

        @NameInMap("SecurityPolicyStatus")
        public String securityPolicyStatus;

        @NameInMap("Tags")
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> tags;

        // tls版本
        @NameInMap("TlsVersion")
        public String tlsVersion;

        public static ListSecurityPolicyResponseBodySecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodySecurityPolicies self = new ListSecurityPolicyResponseBodySecurityPolicies();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setCiphers(String ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public String getCiphers() {
            return this.ciphers;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setRelatedListeners(java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> relatedListeners) {
            this.relatedListeners = relatedListeners;
            return this;
        }
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public String getSecurityPolicyName() {
            return this.securityPolicyName;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyStatus(String securityPolicyStatus) {
            this.securityPolicyStatus = securityPolicyStatus;
            return this;
        }
        public String getSecurityPolicyStatus() {
            return this.securityPolicyStatus;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setTags(java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> getTags() {
            return this.tags;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setTlsVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }
        public String getTlsVersion() {
            return this.tlsVersion;
        }

    }

}
