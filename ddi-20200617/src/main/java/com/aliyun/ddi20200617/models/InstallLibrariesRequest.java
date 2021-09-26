// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class InstallLibrariesRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterBizIdList")
    public java.util.List<String> clusterBizIdList;

    @NameInMap("LibraryBizId")
    public String libraryBizId;

    public static InstallLibrariesRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallLibrariesRequest self = new InstallLibrariesRequest();
        return TeaModel.build(map, self);
    }

    public InstallLibrariesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public InstallLibrariesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstallLibrariesRequest setClusterBizIdList(java.util.List<String> clusterBizIdList) {
        this.clusterBizIdList = clusterBizIdList;
        return this;
    }
    public java.util.List<String> getClusterBizIdList() {
        return this.clusterBizIdList;
    }

    public InstallLibrariesRequest setLibraryBizId(String libraryBizId) {
        this.libraryBizId = libraryBizId;
        return this;
    }
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

}
