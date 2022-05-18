// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProductRequest extends TeaModel {
    // 产品ID
    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductRequest self = new DeleteProductRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DeleteProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}