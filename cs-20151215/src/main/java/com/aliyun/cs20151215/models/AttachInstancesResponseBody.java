// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesResponseBody extends TeaModel {
    @NameInMap("list")
    public java.util.List<AttachInstancesResponseBodyList> list;

    @NameInMap("task_id")
    public String taskId;

    public static AttachInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesResponseBody self = new AttachInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachInstancesResponseBody setList(java.util.List<AttachInstancesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AttachInstancesResponseBodyList> getList() {
        return this.list;
    }

    public AttachInstancesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class AttachInstancesResponseBodyList extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("message")
        public String message;

        public static AttachInstancesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            AttachInstancesResponseBodyList self = new AttachInstancesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public AttachInstancesResponseBodyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachInstancesResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachInstancesResponseBodyList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
