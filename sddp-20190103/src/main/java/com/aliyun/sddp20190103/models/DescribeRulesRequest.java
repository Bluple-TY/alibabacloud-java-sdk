// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesRequest extends TeaModel {
    @NameInMap("Category")
    public Integer category;

    @NameInMap("ContentCategory")
    public Integer contentCategory;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CustomType")
    public Integer customType;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("KeywordCompatible")
    public Boolean keywordCompatible;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public Integer productCode;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("WarnLevel")
    public Integer warnLevel;

    public static DescribeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesRequest self = new DescribeRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRulesRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public DescribeRulesRequest setContentCategory(Integer contentCategory) {
        this.contentCategory = contentCategory;
        return this;
    }
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    public DescribeRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRulesRequest setCustomType(Integer customType) {
        this.customType = customType;
        return this;
    }
    public Integer getCustomType() {
        return this.customType;
    }

    public DescribeRulesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeRulesRequest setKeywordCompatible(Boolean keywordCompatible) {
        this.keywordCompatible = keywordCompatible;
        return this;
    }
    public Boolean getKeywordCompatible() {
        return this.keywordCompatible;
    }

    public DescribeRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRulesRequest setProductCode(Integer productCode) {
        this.productCode = productCode;
        return this;
    }
    public Integer getProductCode() {
        return this.productCode;
    }

    public DescribeRulesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeRulesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeRulesRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public DescribeRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeRulesRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
