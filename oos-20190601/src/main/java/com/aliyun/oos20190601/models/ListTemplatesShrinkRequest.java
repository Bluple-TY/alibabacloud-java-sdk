// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesShrinkRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("CreatedDateAfter")
    public String createdDateAfter;

    @NameInMap("CreatedDateBefore")
    public String createdDateBefore;

    @NameInMap("HasTrigger")
    public Boolean hasTrigger;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("TemplateFormat")
    public String templateFormat;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateType")
    public String templateType;

    public static ListTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesShrinkRequest self = new ListTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListTemplatesShrinkRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListTemplatesShrinkRequest setCreatedDateAfter(String createdDateAfter) {
        this.createdDateAfter = createdDateAfter;
        return this;
    }
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    public ListTemplatesShrinkRequest setCreatedDateBefore(String createdDateBefore) {
        this.createdDateBefore = createdDateBefore;
        return this;
    }
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    public ListTemplatesShrinkRequest setHasTrigger(Boolean hasTrigger) {
        this.hasTrigger = hasTrigger;
        return this;
    }
    public Boolean getHasTrigger() {
        return this.hasTrigger;
    }

    public ListTemplatesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplatesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplatesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplatesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplatesShrinkRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListTemplatesShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTemplatesShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTemplatesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListTemplatesShrinkRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public ListTemplatesShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplatesShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
