// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The processing status of the vulnerability. Valid values:
    // 
    // *   y: handled
    // *   n: unhandled
    @NameInMap("Dealed")
    public String dealed;

    // The natural language of the request and response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("Lang")
    public String lang;

    // The priority to fix the vulnerability or the risk level of the vulnerability. Valid values:
    // 
    // *   asap: high
    // *   later: medium
    // *   nntf: low
    @NameInMap("Necessity")
    public String necessity;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The maximum number of entries to return on each page.
    // 
    // Default value: 20.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the vulnerability. Valid values:
    // 
    // *   cve: Linux software vulnerability
    // *   sys: Windows system vulnerability
    @NameInMap("Type")
    public String type;

    public static DescribeGroupedVulRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulRequest self = new DescribeGroupedVulRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeGroupedVulRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedVulRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeGroupedVulRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeGroupedVulRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGroupedVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
