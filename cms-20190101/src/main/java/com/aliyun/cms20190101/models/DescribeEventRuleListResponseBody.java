// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EventRules")
    public DescribeEventRuleListResponseBodyEventRules eventRules;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static DescribeEventRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListResponseBody self = new DescribeEventRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventRuleListResponseBody setEventRules(DescribeEventRuleListResponseBodyEventRules eventRules) {
        this.eventRules = eventRules;
        return this;
    }
    public DescribeEventRuleListResponseBodyEventRules getEventRules() {
        return this.eventRules;
    }

    public DescribeEventRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEventRuleListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList extends TeaModel {
        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList setEventTypeList(java.util.List<String> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords extends TeaModel {
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter extends TeaModel {
        @NameInMap("Keywords")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords keywords;

        @NameInMap("Relation")
        public String relation;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter setKeywords(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords keywords) {
            this.keywords = keywords;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilterKeywords getKeywords() {
            return this.keywords;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList setLevelList(java.util.List<String> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern extends TeaModel {
        @NameInMap("CustomFilters")
        public String customFilters;

        @NameInMap("EventTypeList")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList eventTypeList;

        @NameInMap("KeywordFilter")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter keywordFilter;

        @NameInMap("LevelList")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList levelList;

        @NameInMap("NameList")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList nameList;

        @NameInMap("Product")
        public String product;

        @NameInMap("SQLFilter")
        public String SQLFilter;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setCustomFilters(String customFilters) {
            this.customFilters = customFilters;
            return this;
        }
        public String getCustomFilters() {
            return this.customFilters;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setEventTypeList(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList getEventTypeList() {
            return this.eventTypeList;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setKeywordFilter(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter keywordFilter) {
            this.keywordFilter = keywordFilter;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternKeywordFilter getKeywordFilter() {
            return this.keywordFilter;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setLevelList(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList levelList) {
            this.levelList = levelList;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList getLevelList() {
            return this.levelList;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setNameList(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList nameList) {
            this.nameList = nameList;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList getNameList() {
            return this.nameList;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setSQLFilter(String SQLFilter) {
            this.SQLFilter = SQLFilter;
            return this;
        }
        public String getSQLFilter() {
            return this.SQLFilter;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern extends TeaModel {
        @NameInMap("EventPattern")
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern> eventPattern;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern setEventPattern(java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern> getEventPattern() {
            return this.eventPattern;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EventPattern")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern eventPattern;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SilenceTime")
        public Long silenceTime;

        @NameInMap("State")
        public String state;

        public static DescribeEventRuleListResponseBodyEventRulesEventRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRule self = new DescribeEventRuleListResponseBodyEventRulesEventRule();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setEventPattern(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern getEventPattern() {
            return this.eventPattern;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setSilenceTime(Long silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Long getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRules extends TeaModel {
        @NameInMap("EventRule")
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRule> eventRule;

        public static DescribeEventRuleListResponseBodyEventRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRules self = new DescribeEventRuleListResponseBodyEventRules();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRules setEventRule(java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRule> eventRule) {
            this.eventRule = eventRule;
            return this;
        }
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRule> getEventRule() {
            return this.eventRule;
        }

    }

}
