// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerAvailableQuotaRequest extends TeaModel {
    /**
     * <p>You do not need to specify the parameter.</p>
     */
    @NameInMap("ItemCodes")
    public String itemCodes;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static QueryResellerAvailableQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerAvailableQuotaRequest self = new QueryResellerAvailableQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryResellerAvailableQuotaRequest setItemCodes(String itemCodes) {
        this.itemCodes = itemCodes;
        return this;
    }
    public String getItemCodes() {
        return this.itemCodes;
    }

    public QueryResellerAvailableQuotaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
