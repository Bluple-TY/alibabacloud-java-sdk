// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateResponseBody extends TeaModel {
    @NameInMap("Date")
    public AddFaceVideoTemplateResponseBodyDate date;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddFaceVideoTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateResponseBody self = new AddFaceVideoTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateResponseBody setDate(AddFaceVideoTemplateResponseBodyDate date) {
        this.date = date;
        return this;
    }
    public AddFaceVideoTemplateResponseBodyDate getDate() {
        return this.date;
    }

    public AddFaceVideoTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddFaceVideoTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFaceVideoTemplateResponseBodyDate extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        public static AddFaceVideoTemplateResponseBodyDate build(java.util.Map<String, ?> map) throws Exception {
            AddFaceVideoTemplateResponseBodyDate self = new AddFaceVideoTemplateResponseBodyDate();
            return TeaModel.build(map, self);
        }

        public AddFaceVideoTemplateResponseBodyDate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
