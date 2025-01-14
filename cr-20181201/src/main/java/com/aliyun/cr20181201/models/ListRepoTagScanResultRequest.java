// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultRequest extends TeaModel {
    @NameInMap("Digest")
    public String digest;

    @NameInMap("FilterValue")
    public String filterValue;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("ScanTaskId")
    public String scanTaskId;

    @NameInMap("ScanType")
    public String scanType;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("VulQueryKey")
    public String vulQueryKey;

    public static ListRepoTagScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagScanResultRequest self = new ListRepoTagScanResultRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoTagScanResultRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public ListRepoTagScanResultRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public ListRepoTagScanResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepoTagScanResultRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoTagScanResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoTagScanResultRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public ListRepoTagScanResultRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public ListRepoTagScanResultRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public ListRepoTagScanResultRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ListRepoTagScanResultRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListRepoTagScanResultRequest setVulQueryKey(String vulQueryKey) {
        this.vulQueryKey = vulQueryKey;
        return this;
    }
    public String getVulQueryKey() {
        return this.vulQueryKey;
    }

}
