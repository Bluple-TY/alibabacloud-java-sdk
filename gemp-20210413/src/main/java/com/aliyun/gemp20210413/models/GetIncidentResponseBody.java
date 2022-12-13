// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetIncidentResponseBodyData data;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static GetIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentResponseBody self = new GetIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentResponseBody setData(GetIncidentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIncidentResponseBodyData getData() {
        return this.data;
    }

    public GetIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIncidentResponseBodyData extends TeaModel {
        @NameInMap("assignToWhoIsValid")
        public Integer assignToWhoIsValid;

        @NameInMap("assignUserId")
        public Long assignUserId;

        @NameInMap("assignUserName")
        public String assignUserName;

        @NameInMap("assignUserPhone")
        public String assignUserPhone;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("defaultAssignToWho")
        public Integer defaultAssignToWho;

        @NameInMap("defaultAssignToWhoIsValid")
        public Integer defaultAssignToWhoIsValid;

        @NameInMap("defaultAssignToWhoName")
        public String defaultAssignToWhoName;

        @NameInMap("durationTime")
        public Long durationTime;

        @NameInMap("effect")
        public String effect;

        @NameInMap("incidentDescription")
        public String incidentDescription;

        @NameInMap("incidentId")
        public Long incidentId;

        @NameInMap("incidentLevel")
        public String incidentLevel;

        @NameInMap("incidentNumber")
        public String incidentNumber;

        @NameInMap("incidentStatus")
        public String incidentStatus;

        @NameInMap("incidentTitle")
        public String incidentTitle;

        @NameInMap("isManual")
        public Boolean isManual;

        @NameInMap("isUpgrade")
        public Boolean isUpgrade;

        @NameInMap("notifyChannels")
        public java.util.List<String> notifyChannels;

        @NameInMap("problemId")
        public Long problemId;

        @NameInMap("problemNumber")
        public String problemNumber;

        @NameInMap("relRouteRuleDeleteType")
        public Integer relRouteRuleDeleteType;

        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        @NameInMap("relServiceGroupIsValid")
        public Integer relServiceGroupIsValid;

        @NameInMap("relatedServiceDescription")
        public String relatedServiceDescription;

        @NameInMap("relatedServiceGroupId")
        public Long relatedServiceGroupId;

        @NameInMap("relatedServiceGroupName")
        public String relatedServiceGroupName;

        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("routeRuleName")
        public String routeRuleName;

        public static GetIncidentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentResponseBodyData self = new GetIncidentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIncidentResponseBodyData setAssignToWhoIsValid(Integer assignToWhoIsValid) {
            this.assignToWhoIsValid = assignToWhoIsValid;
            return this;
        }
        public Integer getAssignToWhoIsValid() {
            return this.assignToWhoIsValid;
        }

        public GetIncidentResponseBodyData setAssignUserId(Long assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        public GetIncidentResponseBodyData setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public GetIncidentResponseBodyData setAssignUserPhone(String assignUserPhone) {
            this.assignUserPhone = assignUserPhone;
            return this;
        }
        public String getAssignUserPhone() {
            return this.assignUserPhone;
        }

        public GetIncidentResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIncidentResponseBodyData setDefaultAssignToWho(Integer defaultAssignToWho) {
            this.defaultAssignToWho = defaultAssignToWho;
            return this;
        }
        public Integer getDefaultAssignToWho() {
            return this.defaultAssignToWho;
        }

        public GetIncidentResponseBodyData setDefaultAssignToWhoIsValid(Integer defaultAssignToWhoIsValid) {
            this.defaultAssignToWhoIsValid = defaultAssignToWhoIsValid;
            return this;
        }
        public Integer getDefaultAssignToWhoIsValid() {
            return this.defaultAssignToWhoIsValid;
        }

        public GetIncidentResponseBodyData setDefaultAssignToWhoName(String defaultAssignToWhoName) {
            this.defaultAssignToWhoName = defaultAssignToWhoName;
            return this;
        }
        public String getDefaultAssignToWhoName() {
            return this.defaultAssignToWhoName;
        }

        public GetIncidentResponseBodyData setDurationTime(Long durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Long getDurationTime() {
            return this.durationTime;
        }

        public GetIncidentResponseBodyData setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GetIncidentResponseBodyData setIncidentDescription(String incidentDescription) {
            this.incidentDescription = incidentDescription;
            return this;
        }
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        public GetIncidentResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public GetIncidentResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public GetIncidentResponseBodyData setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public GetIncidentResponseBodyData setIncidentStatus(String incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        public GetIncidentResponseBodyData setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public GetIncidentResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public GetIncidentResponseBodyData setIsUpgrade(Boolean isUpgrade) {
            this.isUpgrade = isUpgrade;
            return this;
        }
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        public GetIncidentResponseBodyData setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public GetIncidentResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public GetIncidentResponseBodyData setProblemNumber(String problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }
        public String getProblemNumber() {
            return this.problemNumber;
        }

        public GetIncidentResponseBodyData setRelRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
            this.relRouteRuleDeleteType = relRouteRuleDeleteType;
            return this;
        }
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        public GetIncidentResponseBodyData setRelServiceDeleteType(Integer relServiceDeleteType) {
            this.relServiceDeleteType = relServiceDeleteType;
            return this;
        }
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        public GetIncidentResponseBodyData setRelServiceGroupIsValid(Integer relServiceGroupIsValid) {
            this.relServiceGroupIsValid = relServiceGroupIsValid;
            return this;
        }
        public Integer getRelServiceGroupIsValid() {
            return this.relServiceGroupIsValid;
        }

        public GetIncidentResponseBodyData setRelatedServiceDescription(String relatedServiceDescription) {
            this.relatedServiceDescription = relatedServiceDescription;
            return this;
        }
        public String getRelatedServiceDescription() {
            return this.relatedServiceDescription;
        }

        public GetIncidentResponseBodyData setRelatedServiceGroupId(Long relatedServiceGroupId) {
            this.relatedServiceGroupId = relatedServiceGroupId;
            return this;
        }
        public Long getRelatedServiceGroupId() {
            return this.relatedServiceGroupId;
        }

        public GetIncidentResponseBodyData setRelatedServiceGroupName(String relatedServiceGroupName) {
            this.relatedServiceGroupName = relatedServiceGroupName;
            return this;
        }
        public String getRelatedServiceGroupName() {
            return this.relatedServiceGroupName;
        }

        public GetIncidentResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public GetIncidentResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public GetIncidentResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public GetIncidentResponseBodyData setRouteRuleName(String routeRuleName) {
            this.routeRuleName = routeRuleName;
            return this;
        }
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

    }

}
