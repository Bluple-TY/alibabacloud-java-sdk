// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class EditLogMaskConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EditLogMaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditLogMaskConfigResponseBody self = new EditLogMaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public EditLogMaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
