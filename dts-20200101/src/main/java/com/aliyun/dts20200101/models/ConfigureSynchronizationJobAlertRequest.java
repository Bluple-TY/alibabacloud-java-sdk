// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobAlertRequest extends TeaModel {
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static ConfigureSynchronizationJobAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobAlertRequest self = new ConfigureSynchronizationJobAlertRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobAlertRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public ConfigureSynchronizationJobAlertRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ConfigureSynchronizationJobAlertRequest setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public ConfigureSynchronizationJobAlertRequest setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public ConfigureSynchronizationJobAlertRequest setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public ConfigureSynchronizationJobAlertRequest setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public ConfigureSynchronizationJobAlertRequest setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public ConfigureSynchronizationJobAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSynchronizationJobAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
