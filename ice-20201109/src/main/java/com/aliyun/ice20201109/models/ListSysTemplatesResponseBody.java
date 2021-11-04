// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSysTemplatesResponseBody extends TeaModel {
    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListSysTemplatesResponseBodyTemplates> templates;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSysTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSysTemplatesResponseBody self = new ListSysTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSysTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSysTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSysTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSysTemplatesResponseBody setTemplates(java.util.List<ListSysTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListSysTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public ListSysTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSysTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Type")
        public String type;

        public static ListSysTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListSysTemplatesResponseBodyTemplates self = new ListSysTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListSysTemplatesResponseBodyTemplates setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListSysTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSysTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSysTemplatesResponseBodyTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
