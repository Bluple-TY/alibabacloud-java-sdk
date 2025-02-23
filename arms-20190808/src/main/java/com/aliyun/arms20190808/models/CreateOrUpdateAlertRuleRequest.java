// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleRequest extends TeaModel {
    /**
     * <p>The alert check type of the Prometheus alert rule.</p>
     * <br>
     * <p>*   STATIC: a static threshold value. If you set the parameter to STATIC, you must specify the **MetricsKey** parameter. For more information, see the **Correspondence between AlertGroup and MetricsKey for Prometheus Service** table.</p>
     * <p>*   CUSTOM: a custom PromQL statement. If you set the parameter to CUSTOM, you must specify the **PromQL**, **Duration**, and **Message** parameters to create a Prometheus alert rule.</p>
     */
    @NameInMap("AlertCheckType")
    public String alertCheckType;

    /**
     * <p>The alert contact group ID of the Prometheus alert rule.</p>
     * <br>
     * <p>*   \-1: custom PromQL</p>
     * <p>*   1: Kubernetes load</p>
     * <p>*   15: Kubernetes node</p>
     */
    @NameInMap("AlertGroup")
    public Long alertGroup;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>*   If you do not specify this parameter, a new alert rule is created.</p>
     * <p>*   If you specify this parameter, the specified alert rule is modified.</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The content of the Application Monitoring or Browser Monitoring alert rule. The following code provides an example of the **AlertRuleContent** parameter. For more information about the meaning of each field, see the supplementary description.</p>
     * <br>
     * <p>`{ "Condition": "OR", "AlertRuleItems": [ { "Operator": "CURRENT_LTE", "MetricKey": "appstat.jvm.threadcount", "Value": 1000, "Aggregate": "AVG", "N": 1 } ] }`</p>
     * <br>
     * <p>>  The conditional fields vary depending on the values of the **MetricsType** and **AlertRuleItems.MetricKey** parameters. For more information about the types of metrics supported by Application Monitoring and Browser Monitoring and the alert rule fields corresponding to each metric, see the supplementary description.</p>
     */
    @NameInMap("AlertRuleContent")
    public String alertRuleContent;

    /**
     * <p>The status of the alert rule.</p>
     * <br>
     * <p>*   RUNNING (default)</p>
     * <p>*   STOPPED</p>
     */
    @NameInMap("AlertStatus")
    public String alertStatus;

    /**
     * <p>The type of the alert rule. Valid values:</p>
     * <br>
     * <p>*   APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring</p>
     * <p>*   BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring</p>
     * <p>*   PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Prometheus Service</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The annotations of the Prometheus alert rule.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>Specifies whether to apply the alert rule to new applications that are created in Application Monitoring or Browser Monitoring.</p>
     * <br>
     * <p>*   `true`: yes</p>
     * <p>*   `false`: no</p>
     */
    @NameInMap("AutoAddNewApplication")
    public Boolean autoAddNewApplication;

    /**
     * <p>The cluster ID of the Prometheus alert rule.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The duration of the Prometheus alert rule. Unit: minutes.</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The filter conditions of the Application Monitoring or Browser Monitoring alert rule.</p>
     * <br>
     * <p>Format:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>"DimFilters": [ </p>
     * <p>{ </p>
     * <p> "FilterOpt": "ALL",</p>
     * <p> "FilterValues": [],         //The value of the filter condition. </p>
     * <p> "FilterKey": "rootIp"     //The Key of the filter condition. </p>
     * <p>}</p>
     * <p>]</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>Valid values of **FilterOpt**:</p>
     * <br>
     * <p>*   STATIC: matches the value of the specified dimension.</p>
     * <p>*   ALL: matches the values of all dimensions.</p>
     * <p>*   DISABLE: aggregates the values of all dimensions.</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The tags of the Prometheus alert rule.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The level of the Prometheus alert rule.</p>
     * <br>
     * <p>*   P1: Alert notifications are sent for major issues that affect the availability of core business, have huge impact, and may lead to serious consequences.</p>
     * <p>*   P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.</p>
     * <p>*   P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.</p>
     * <p>*   P4: Alert notifications are sent for low-priority issues that do not affect your business.</p>
     * <p>*   Default: Alert notifications are sent without distinguishing between alert levels.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The alert message of the Prometheus alert rule.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The alert metrics. If you set the **AlertCheckType** parameter to **STATIC** when you create a Prometheus alert rule, you must specify the **MetricsKey** parameter.</p>
     * <br>
     * <p>>  Alert metrics vary depending on the value of the **AlertGroup** parameter. For more information about the correspondence between **AlertGroup** and **MetricsKey**, see the supplementary description.</p>
     */
    @NameInMap("MetricsKey")
    public String metricsKey;

    /**
     * <p>The metric type of the Application Monitoring or Browser Monitoring alert rule. For more information, see the following tables.</p>
     */
    @NameInMap("MetricsType")
    public String metricsType;

    /**
     * <p>The notification policy.</p>
     * <br>
     * <p>*   If you set this parameter to null, no notification policy is specified. After you create an alert rule, you can create a notification policy and specify match rules and match conditions. For example, you can specify an alert rule name as the match condition. When the alert rule is triggered, an alert event is generated and an alert notification is sent to the contacts or contact groups that are specified in the notification policy.</p>
     * <p>*   To specify a notification policy, set this parameter to the ID of the notification policy. Application Real-Time Monitoring Service (ARMS) automatically adds a match rule to the notification policy and specifies the ID of the alert rule as the match condition. The name of the alert rule is also displayed. This way, the alert events that are generated based on the alert rule can be matched by the specified notification policy.</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <p>The process ID (PID) that is associated with the Application Monitoring or Browser Monitoring alert rule.</p>
     */
    @NameInMap("Pids")
    public String pids;

    /**
     * <p>The PromQL statement of the Prometheus alert rule.</p>
     */
    @NameInMap("PromQL")
    public String promQL;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateOrUpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleRequest self = new CreateOrUpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleRequest setAlertCheckType(String alertCheckType) {
        this.alertCheckType = alertCheckType;
        return this;
    }
    public String getAlertCheckType() {
        return this.alertCheckType;
    }

    public CreateOrUpdateAlertRuleRequest setAlertGroup(Long alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public Long getAlertGroup() {
        return this.alertGroup;
    }

    public CreateOrUpdateAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public CreateOrUpdateAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreateOrUpdateAlertRuleRequest setAlertRuleContent(String alertRuleContent) {
        this.alertRuleContent = alertRuleContent;
        return this;
    }
    public String getAlertRuleContent() {
        return this.alertRuleContent;
    }

    public CreateOrUpdateAlertRuleRequest setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public CreateOrUpdateAlertRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public CreateOrUpdateAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateOrUpdateAlertRuleRequest setAutoAddNewApplication(Boolean autoAddNewApplication) {
        this.autoAddNewApplication = autoAddNewApplication;
        return this;
    }
    public Boolean getAutoAddNewApplication() {
        return this.autoAddNewApplication;
    }

    public CreateOrUpdateAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateOrUpdateAlertRuleRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CreateOrUpdateAlertRuleRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public CreateOrUpdateAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateOrUpdateAlertRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateOrUpdateAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsKey(String metricsKey) {
        this.metricsKey = metricsKey;
        return this;
    }
    public String getMetricsKey() {
        return this.metricsKey;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsType(String metricsType) {
        this.metricsType = metricsType;
        return this;
    }
    public String getMetricsType() {
        return this.metricsType;
    }

    public CreateOrUpdateAlertRuleRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public CreateOrUpdateAlertRuleRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public CreateOrUpdateAlertRuleRequest setPromQL(String promQL) {
        this.promQL = promQL;
        return this;
    }
    public String getPromQL() {
        return this.promQL;
    }

    public CreateOrUpdateAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
