// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeletePkgVersionRequest extends TeaModel {
    @NameInMap("PkgVersionId")
    public String pkgVersionId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeletePkgVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePkgVersionRequest self = new DeletePkgVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeletePkgVersionRequest setPkgVersionId(String pkgVersionId) {
        this.pkgVersionId = pkgVersionId;
        return this;
    }
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    public DeletePkgVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
