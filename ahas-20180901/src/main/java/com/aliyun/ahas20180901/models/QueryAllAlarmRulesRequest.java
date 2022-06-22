// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAllAlarmRulesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Resource")
    public String resource;

    public static QueryAllAlarmRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllAlarmRulesRequest self = new QueryAllAlarmRulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllAlarmRulesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAllAlarmRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAllAlarmRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAllAlarmRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAllAlarmRulesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryAllAlarmRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAllAlarmRulesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
