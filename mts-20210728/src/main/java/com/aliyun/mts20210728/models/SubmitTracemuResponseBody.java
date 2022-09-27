// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTracemuResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitTracemuResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitTracemuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTracemuResponseBody self = new SubmitTracemuResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTracemuResponseBody setData(SubmitTracemuResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTracemuResponseBodyData getData() {
        return this.data;
    }

    public SubmitTracemuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTracemuResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public SubmitTracemuResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitTracemuResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("JobId")
        public String jobId;

        public static SubmitTracemuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTracemuResponseBodyData self = new SubmitTracemuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTracemuResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitTracemuResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
