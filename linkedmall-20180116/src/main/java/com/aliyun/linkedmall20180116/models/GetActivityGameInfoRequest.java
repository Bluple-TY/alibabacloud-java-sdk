// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetActivityGameInfoRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("ActivityId")
    @Validation(required = true)
    public String activityId;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    public String thirdPartyUserId;

    public static GetActivityGameInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActivityGameInfoRequest self = new GetActivityGameInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetActivityGameInfoRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetActivityGameInfoRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public GetActivityGameInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetActivityGameInfoRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetActivityGameInfoRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
