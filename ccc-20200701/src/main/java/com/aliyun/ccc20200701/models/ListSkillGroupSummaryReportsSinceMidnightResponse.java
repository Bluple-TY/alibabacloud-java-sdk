// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsSinceMidnightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSkillGroupSummaryReportsSinceMidnightResponseBody body;

    public static ListSkillGroupSummaryReportsSinceMidnightResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsSinceMidnightResponse self = new ListSkillGroupSummaryReportsSinceMidnightResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponse setBody(ListSkillGroupSummaryReportsSinceMidnightResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupSummaryReportsSinceMidnightResponseBody getBody() {
        return this.body;
    }

}
