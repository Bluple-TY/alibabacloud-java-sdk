// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class AttachCommonBandwidthPackageToLoadBalancerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AttachCommonBandwidthPackageToLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachCommonBandwidthPackageToLoadBalancerResponseBody self = new AttachCommonBandwidthPackageToLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}