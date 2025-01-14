// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionMetaList")
    public java.util.List<DescribeSubscriptionMetaResponseBodySubscriptionMetaList> subscriptionMetaList;

    @NameInMap("Success")
    public String success;

    public static DescribeSubscriptionMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaResponseBody self = new DescribeSubscriptionMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSubscriptionMetaResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSubscriptionMetaResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSubscriptionMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionMetaResponseBody setSubscriptionMetaList(java.util.List<DescribeSubscriptionMetaResponseBodySubscriptionMetaList> subscriptionMetaList) {
        this.subscriptionMetaList = subscriptionMetaList;
        return this;
    }
    public java.util.List<DescribeSubscriptionMetaResponseBodySubscriptionMetaList> getSubscriptionMetaList() {
        return this.subscriptionMetaList;
    }

    public DescribeSubscriptionMetaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSubscriptionMetaResponseBodySubscriptionMetaList extends TeaModel {
        @NameInMap("Checkpoint")
        public Long checkpoint;

        @NameInMap("DBList")
        public String DBList;

        @NameInMap("DProxyUrl")
        public String DProxyUrl;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("Topic")
        public String topic;

        public static DescribeSubscriptionMetaResponseBodySubscriptionMetaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionMetaResponseBodySubscriptionMetaList self = new DescribeSubscriptionMetaResponseBodySubscriptionMetaList();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setCheckpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public Long getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setDBList(String DBList) {
            this.DBList = DBList;
            return this;
        }
        public String getDBList() {
            return this.DBList;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setDProxyUrl(String DProxyUrl) {
            this.DProxyUrl = DProxyUrl;
            return this;
        }
        public String getDProxyUrl() {
            return this.DProxyUrl;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
