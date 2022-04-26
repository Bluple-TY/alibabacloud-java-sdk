// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    // MaxResults
    @NameInMap("MaxResults")
    public Long maxResults;

    // NextToken
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("TagSelector")
    public String tagSelector;

    @NameInMap("TaskTypes")
    public java.util.List<String> taskTypes;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTasksRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListTasksRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListTasksRequest setTagSelector(String tagSelector) {
        this.tagSelector = tagSelector;
        return this;
    }
    public String getTagSelector() {
        return this.tagSelector;
    }

    public ListTasksRequest setTaskTypes(java.util.List<String> taskTypes) {
        this.taskTypes = taskTypes;
        return this;
    }
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

}
