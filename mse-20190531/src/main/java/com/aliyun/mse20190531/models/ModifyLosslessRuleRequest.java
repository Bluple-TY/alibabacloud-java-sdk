// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyLosslessRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to align the lifecycle of the application in the Kubernetes cluster with that of the microservice.</p>
     */
    @NameInMap("Aligned")
    public Boolean aligned;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The registration latency.</p>
     */
    @NameInMap("DelayTime")
    public Long delayTime;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the rule.</p>
     * <p>*   `false`: disables the rule.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The slope of the prefetching curve.</p>
     */
    @NameInMap("FuncType")
    public Long funcType;

    /**
     * <p>Specifies whether to display online and offline processing details.</p>
     */
    @NameInMap("LossLessDetail")
    public Boolean lossLessDetail;

    /**
     * <p>The microservice namespace to which the rule applies.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Specifies whether to enable notification.</p>
     */
    @NameInMap("Notice")
    public Boolean notice;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to associate with service prefetching.</p>
     */
    @NameInMap("Related")
    public Boolean related;

    /**
     * <p>The cooldown duration. Unit: seconds.</p>
     */
    @NameInMap("ShutdownWaitSeconds")
    public Integer shutdownWaitSeconds;

    /**
     * <p>The service source.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The prefetching duration.</p>
     */
    @NameInMap("WarmupTime")
    public Long warmupTime;

    public static ModifyLosslessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLosslessRuleRequest self = new ModifyLosslessRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLosslessRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ModifyLosslessRuleRequest setAligned(Boolean aligned) {
        this.aligned = aligned;
        return this;
    }
    public Boolean getAligned() {
        return this.aligned;
    }

    public ModifyLosslessRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLosslessRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyLosslessRuleRequest setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public ModifyLosslessRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyLosslessRuleRequest setFuncType(Long funcType) {
        this.funcType = funcType;
        return this;
    }
    public Long getFuncType() {
        return this.funcType;
    }

    public ModifyLosslessRuleRequest setLossLessDetail(Boolean lossLessDetail) {
        this.lossLessDetail = lossLessDetail;
        return this;
    }
    public Boolean getLossLessDetail() {
        return this.lossLessDetail;
    }

    public ModifyLosslessRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyLosslessRuleRequest setNotice(Boolean notice) {
        this.notice = notice;
        return this;
    }
    public Boolean getNotice() {
        return this.notice;
    }

    public ModifyLosslessRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLosslessRuleRequest setRelated(Boolean related) {
        this.related = related;
        return this;
    }
    public Boolean getRelated() {
        return this.related;
    }

    public ModifyLosslessRuleRequest setShutdownWaitSeconds(Integer shutdownWaitSeconds) {
        this.shutdownWaitSeconds = shutdownWaitSeconds;
        return this;
    }
    public Integer getShutdownWaitSeconds() {
        return this.shutdownWaitSeconds;
    }

    public ModifyLosslessRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ModifyLosslessRuleRequest setWarmupTime(Long warmupTime) {
        this.warmupTime = warmupTime;
        return this;
    }
    public Long getWarmupTime() {
        return this.warmupTime;
    }

}
