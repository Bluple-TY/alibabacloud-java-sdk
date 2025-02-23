// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateDeviceNameListURLResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateDeviceNameListURLResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateDeviceNameListURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceNameListURLResponseBody self = new GenerateDeviceNameListURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceNameListURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateDeviceNameListURLResponseBody setData(GenerateDeviceNameListURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDeviceNameListURLResponseBodyData getData() {
        return this.data;
    }

    public GenerateDeviceNameListURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateDeviceNameListURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDeviceNameListURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateDeviceNameListURLResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Host")
        public String host;

        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectStorage")
        public String objectStorage;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static GenerateDeviceNameListURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDeviceNameListURLResponseBodyData self = new GenerateDeviceNameListURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDeviceNameListURLResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GenerateDeviceNameListURLResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GenerateDeviceNameListURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateDeviceNameListURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateDeviceNameListURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

        public GenerateDeviceNameListURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateDeviceNameListURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateDeviceNameListURLResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
