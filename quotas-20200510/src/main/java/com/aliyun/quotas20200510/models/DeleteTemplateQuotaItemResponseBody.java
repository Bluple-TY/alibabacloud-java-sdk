// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteTemplateQuotaItemResponseBody extends TeaModel {
    // The ID of the quota template.
    @NameInMap("Id")
    public String id;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTemplateQuotaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateQuotaItemResponseBody self = new DeleteTemplateQuotaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateQuotaItemResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteTemplateQuotaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
