// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The interval at which the system attempts to rerun a job. Default value: 30. Unit: seconds.</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <p>When the Time type parameter is set to cron, you can specify a custom calendar.</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>The full path of the job interface class.</p>
     * <br>
     * <p>This field is available only when you select a java job. In this case, you must enter a full path.</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The number of threads that are triggered by a single worker at a time. Default value: 5. This parameter is an advanced configuration item of the MapReduce job.</p>
     */
    @NameInMap("ConsumerSize")
    public Integer consumerSize;

    /**
     * <p>The information of the job contact.</p>
     */
    @NameInMap("ContactInfo")
    public java.util.List<UpdateJobRequestContactInfo> contactInfo;

    /**
     * <p>The script code content that is required when you set the job type to **python**, **shell**, or **go**.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>When the Time type parameter is set to cron, you can specify a time offset. Unit: seconds.</p>
     */
    @NameInMap("DataOffset")
    public Integer dataOffset;

    /**
     * <p>The description of the job.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Default value: 5. This parameter is an advanced configuration item of the MapReduce job.</p>
     */
    @NameInMap("DispatcherSize")
    public Integer dispatcherSize;

    /**
     * <p>The execution mode of the job. The following execution modes are supported:</p>
     * <br>
     * <p>*   **standalone**: The job runs in standalone mode.</p>
     * <p>*   **broadcast**: The job runs in broadcast mode.</p>
     * <p>*   **parallel**: The job runs in parallel computing mode.</p>
     * <p>*   **grid**: The job runs in memory grid mode.</p>
     * <p>*   **batch**: The job runs in grid computing mode.</p>
     * <p>*   **sharding**: The job runs in sharding mode.</p>
     */
    @NameInMap("ExecuteMode")
    public String executeMode;

    /**
     * <p>Specifies whether to turn on Failure alarm. Valid values:</p>
     * <br>
     * <p>*   **true**: Turn on Failure alarm.</p>
     * <p>*   **false**: Turn off Failure alarm.</p>
     */
    @NameInMap("FailEnable")
    public Boolean failEnable;

    @NameInMap("FailTimes")
    public Integer failTimes;

    /**
     * <p>The ID of the application. You can obtain the application ID on the Application Management page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the job. You can obtain the job ID on the Task Management page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The maximum number of attempts that the system can make when an error occurs on a job. You can specify this parameter based on your business requirements.</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <p>The maximum number of instances that the system can run at the same time. Default value: 1. When you set this parameter to 1, if the current job does not end, the system will not run the next job even if the runtime is reached.</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>Specifies whether to turn on No machine alarm available when no worker is available.</p>
     * <br>
     * <p>*   **true**: Turn on No machine alarm available when no worker is available.</p>
     * <p>*   **false**: Turn off No machine alarm available when no worker is available.</p>
     */
    @NameInMap("MissWorkerEnable")
    public Boolean missWorkerEnable;

    /**
     * <p>The name of the job.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The number of subtasks that can be pulled at a time. Default value: 100. This parameter is an advanced configuration item of the MapReduce job.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The user-defined parameters that you can obtain when you run the job.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The maximum number of subtask queues that you can cache. Default value: 10000. This parameter is an advanced configuration item of the MapReduce job.</p>
     */
    @NameInMap("QueueSize")
    public Integer queueSize;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The channel for sending alerts. Only SMS messages are supported.</p>
     */
    @NameInMap("SendChannel")
    public String sendChannel;

    @NameInMap("SuccessNoticeEnable")
    public Boolean successNoticeEnable;

    /**
     * <p>The interval at which the system can rerun the subtask when the subtask fails. This parameter is an advanced configuration item of the MapReduce job.</p>
     */
    @NameInMap("TaskAttemptInterval")
    public Integer taskAttemptInterval;

    @NameInMap("TaskDispatchMode")
    public String taskDispatchMode;

    /**
     * <p>The number of retries that the system can perform when the subtask fails. This parameter is an advanced configuration item of the MapReduce job.</p>
     */
    @NameInMap("TaskMaxAttempt")
    public Integer taskMaxAttempt;

    /**
     * <p>The time expression. You can set the time expression according to the selected time type.</p>
     * <br>
     * <p>*   **cron**: Specify a standard Cron expression. You can verify the expression online after you specify the expression.</p>
     * <p>*   **api**: No time expression is available.</p>
     * <p>*   **fixed_rate**: Specify a fixed frequency value. Unit: seconds. For example, if you set this parameter to 30, the system triggers a job every 30 seconds.</p>
     * <p>*   **second_delay**: Specify a delay after which you can run a job. You can specify a value from 1 to 60. Unit: seconds.</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The type of time. The following time types are supported:</p>
     * <br>
     * <p>*   **cron**: 1</p>
     * <p>*   **fix_rate**: 3</p>
     * <p>*   **second_delay**: 4</p>
     * <p>*   **api**: 100</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The timeout threshold. Default value: 7200. Unit: seconds.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>Specifies whether to turn on Timeout alarm. Valid values:</p>
     * <br>
     * <p>*   **true**: Turn on Timeout alarm.</p>
     * <p>*   **false**: Turn off Timeout alarm.</p>
     */
    @NameInMap("TimeoutEnable")
    public Boolean timeoutEnable;

    /**
     * <p>Specifies whether to turn on Timeout termination. Valid values:</p>
     * <br>
     * <p>*   **true**: Turn on Timeout termination.</p>
     * <p>*   **false**: Turn off Timeout termination.</p>
     */
    @NameInMap("TimeoutKillEnable")
    public Boolean timeoutKillEnable;

    @NameInMap("Timezone")
    public String timezone;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
        return this;
    }
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    public UpdateJobRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public UpdateJobRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public UpdateJobRequest setConsumerSize(Integer consumerSize) {
        this.consumerSize = consumerSize;
        return this;
    }
    public Integer getConsumerSize() {
        return this.consumerSize;
    }

    public UpdateJobRequest setContactInfo(java.util.List<UpdateJobRequestContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public java.util.List<UpdateJobRequestContactInfo> getContactInfo() {
        return this.contactInfo;
    }

    public UpdateJobRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateJobRequest setDataOffset(Integer dataOffset) {
        this.dataOffset = dataOffset;
        return this;
    }
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    public UpdateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobRequest setDispatcherSize(Integer dispatcherSize) {
        this.dispatcherSize = dispatcherSize;
        return this;
    }
    public Integer getDispatcherSize() {
        return this.dispatcherSize;
    }

    public UpdateJobRequest setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public UpdateJobRequest setFailEnable(Boolean failEnable) {
        this.failEnable = failEnable;
        return this;
    }
    public Boolean getFailEnable() {
        return this.failEnable;
    }

    public UpdateJobRequest setFailTimes(Integer failTimes) {
        this.failTimes = failTimes;
        return this;
    }
    public Integer getFailTimes() {
        return this.failTimes;
    }

    public UpdateJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateJobRequest setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
        return this;
    }
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    public UpdateJobRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateJobRequest setMissWorkerEnable(Boolean missWorkerEnable) {
        this.missWorkerEnable = missWorkerEnable;
        return this;
    }
    public Boolean getMissWorkerEnable() {
        return this.missWorkerEnable;
    }

    public UpdateJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public UpdateJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UpdateJobRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public UpdateJobRequest setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
        return this;
    }
    public Integer getQueueSize() {
        return this.queueSize;
    }

    public UpdateJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateJobRequest setSendChannel(String sendChannel) {
        this.sendChannel = sendChannel;
        return this;
    }
    public String getSendChannel() {
        return this.sendChannel;
    }

    public UpdateJobRequest setSuccessNoticeEnable(Boolean successNoticeEnable) {
        this.successNoticeEnable = successNoticeEnable;
        return this;
    }
    public Boolean getSuccessNoticeEnable() {
        return this.successNoticeEnable;
    }

    public UpdateJobRequest setTaskAttemptInterval(Integer taskAttemptInterval) {
        this.taskAttemptInterval = taskAttemptInterval;
        return this;
    }
    public Integer getTaskAttemptInterval() {
        return this.taskAttemptInterval;
    }

    public UpdateJobRequest setTaskDispatchMode(String taskDispatchMode) {
        this.taskDispatchMode = taskDispatchMode;
        return this;
    }
    public String getTaskDispatchMode() {
        return this.taskDispatchMode;
    }

    public UpdateJobRequest setTaskMaxAttempt(Integer taskMaxAttempt) {
        this.taskMaxAttempt = taskMaxAttempt;
        return this;
    }
    public Integer getTaskMaxAttempt() {
        return this.taskMaxAttempt;
    }

    public UpdateJobRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public UpdateJobRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public UpdateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public UpdateJobRequest setTimeoutEnable(Boolean timeoutEnable) {
        this.timeoutEnable = timeoutEnable;
        return this;
    }
    public Boolean getTimeoutEnable() {
        return this.timeoutEnable;
    }

    public UpdateJobRequest setTimeoutKillEnable(Boolean timeoutKillEnable) {
        this.timeoutKillEnable = timeoutKillEnable;
        return this;
    }
    public Boolean getTimeoutKillEnable() {
        return this.timeoutKillEnable;
    }

    public UpdateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public static class UpdateJobRequestContactInfo extends TeaModel {
        /**
         * <p>The webhook URL of the DingTalk chatbot. For more information, see [DingTalk development documentation](https://open.dingtalk.com/document/org/application-types).</p>
         */
        @NameInMap("Ding")
        public String ding;

        /**
         * <p>The email address of the contact.</p>
         */
        @NameInMap("UserMail")
        public String userMail;

        /**
         * <p>The name of the contact.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The mobile phone number of the contact.</p>
         */
        @NameInMap("UserPhone")
        public String userPhone;

        public static UpdateJobRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobRequestContactInfo self = new UpdateJobRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public UpdateJobRequestContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public UpdateJobRequestContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public UpdateJobRequestContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public UpdateJobRequestContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

}
