// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("ActionList")
    public java.util.List<String> actionList;

    @NameInMap("ClientIpList")
    public java.util.List<String> clientIpList;

    @NameInMap("DbUserList")
    public java.util.List<String> dbUserList;

    @NameInMap("DbHostList")
    public java.util.List<String> dbHostList;

    @NameInMap("ClientProgramList")
    public java.util.List<String> clientProgramList;

    public static GetSessionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSessionListRequest self = new GetSessionListRequest();
        return TeaModel.build(map, self);
    }

    public GetSessionListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSessionListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSessionListRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetSessionListRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetSessionListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetSessionListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSessionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSessionListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetSessionListRequest setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public GetSessionListRequest setClientIpList(java.util.List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    public GetSessionListRequest setDbUserList(java.util.List<String> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    public GetSessionListRequest setDbHostList(java.util.List<String> dbHostList) {
        this.dbHostList = dbHostList;
        return this;
    }
    public java.util.List<String> getDbHostList() {
        return this.dbHostList;
    }

    public GetSessionListRequest setClientProgramList(java.util.List<String> clientProgramList) {
        this.clientProgramList = clientProgramList;
        return this;
    }
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

}
