// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPluginsRequest extends TeaModel {
    /**
     * <p>analysis-ik</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>1</p>
     */
    @NameInMap("page")
    public String page;

    /**
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>SYSTEM</p>
     */
    @NameInMap("source")
    public String source;

    public static ListPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsRequest self = new ListPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPluginsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListPluginsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListPluginsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
