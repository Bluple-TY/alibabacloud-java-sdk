// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListAliasesRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token used to obtain more results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The prefix.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The starting position of the result list.</p>
     */
    @NameInMap("startKey")
    public String startKey;

    public static ListAliasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesRequest self = new ListAliasesRequest();
        return TeaModel.build(map, self);
    }

    public ListAliasesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAliasesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAliasesRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListAliasesRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
