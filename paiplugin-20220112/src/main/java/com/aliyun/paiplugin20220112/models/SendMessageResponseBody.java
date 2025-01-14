// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    @NameInMap("Data")
    public SendMessageResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setData(SendMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendMessageResponseBodyData getData() {
        return this.data;
    }

    public SendMessageResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SendMessageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SendMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SendMessageResponseBodyDataMessages extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static SendMessageResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyDataMessages self = new SendMessageResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyDataMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendMessageResponseBodyDataMessages setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class SendMessageResponseBodyData extends TeaModel {
        @NameInMap("Messages")
        public java.util.List<SendMessageResponseBodyDataMessages> messages;

        @NameInMap("RequestId")
        public String requestId;

        public static SendMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyData self = new SendMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyData setMessages(java.util.List<SendMessageResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<SendMessageResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public SendMessageResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
