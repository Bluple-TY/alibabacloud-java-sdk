// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OfficeConversionTask")
    public OfficeConversionTask officeConversionTask;

    public static GetOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeConversionTaskResponseBody self = new GetOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfficeConversionTaskResponseBody setOfficeConversionTask(OfficeConversionTask officeConversionTask) {
        this.officeConversionTask = officeConversionTask;
        return this;
    }
    public OfficeConversionTask getOfficeConversionTask() {
        return this.officeConversionTask;
    }

}
