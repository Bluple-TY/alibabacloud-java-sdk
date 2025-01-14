// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitReviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoResponseBody self = new SubmitReviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitReviewInfoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitReviewInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitReviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitReviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchSubmitReviewInfoResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static BatchSubmitReviewInfoResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchSubmitReviewInfoResponseBodyMessages self = new BatchSubmitReviewInfoResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public BatchSubmitReviewInfoResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
