// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicsRequest extends TeaModel {
    @NameInMap("filter")
    public String filter;

    @NameInMap("messageTypes")
    public java.util.List<String> messageTypes;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsRequest self = new ListTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListTopicsRequest setMessageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }
    public java.util.List<String> getMessageTypes() {
        return this.messageTypes;
    }

    public ListTopicsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTopicsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
