// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateAIInstanceResponseBody extends TeaModel {
    // 返回code码
    @NameInMap("Code")
    public String code;

    // 返回数据
    @NameInMap("Data")
    public CreateAIInstanceResponseBodyData data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAIInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAIInstanceResponseBody self = new CreateAIInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAIInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAIInstanceResponseBody setData(CreateAIInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAIInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateAIInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAIInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAIInstanceResponseBodyData extends TeaModel {
        // 当前实例ACU使用量
        @NameInMap("AcuUsed")
        public Long acuUsed;

        @NameInMap("InstanceId")
        public Double instanceId;

        @NameInMap("Storage")
        public String storage;

        public static CreateAIInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAIInstanceResponseBodyData self = new CreateAIInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAIInstanceResponseBodyData setAcuUsed(Long acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        public CreateAIInstanceResponseBodyData setInstanceId(Double instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Double getInstanceId() {
            return this.instanceId;
        }

        public CreateAIInstanceResponseBodyData setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

    }

    public static class TryCreateAIInstanceResponseBodyData extends TeaModel {
        // 当前实例ACU使用量
        @NameInMap("AcuUsed")
        public Long acuUsed;

        @NameInMap("Storage")
        public String storage;

        public static TryCreateAIInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TryCreateAIInstanceResponseBodyData self = new TryCreateAIInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TryCreateAIInstanceResponseBodyData setAcuUsed(Long acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        public TryCreateAIInstanceResponseBodyData setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

    }

}
