// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallRequest extends TeaModel {
    @NameInMap("ByeCode")
    public String byeCode;

    @NameInMap("ByeTtsParams")
    public String byeTtsParams;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    @NameInMap("MenuKeyMap")
    public java.util.List<IvrCallRequestMenuKeyMap> menuKeyMap;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartCode")
    public String startCode;

    @NameInMap("StartTtsParams")
    public String startTtsParams;

    @NameInMap("Timeout")
    public Integer timeout;

    public static IvrCallRequest build(java.util.Map<String, ?> map) throws Exception {
        IvrCallRequest self = new IvrCallRequest();
        return TeaModel.build(map, self);
    }

    public IvrCallRequest setByeCode(String byeCode) {
        this.byeCode = byeCode;
        return this;
    }
    public String getByeCode() {
        return this.byeCode;
    }

    public IvrCallRequest setByeTtsParams(String byeTtsParams) {
        this.byeTtsParams = byeTtsParams;
        return this;
    }
    public String getByeTtsParams() {
        return this.byeTtsParams;
    }

    public IvrCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public IvrCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public IvrCallRequest setMenuKeyMap(java.util.List<IvrCallRequestMenuKeyMap> menuKeyMap) {
        this.menuKeyMap = menuKeyMap;
        return this;
    }
    public java.util.List<IvrCallRequestMenuKeyMap> getMenuKeyMap() {
        return this.menuKeyMap;
    }

    public IvrCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public IvrCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public IvrCallRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public IvrCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public IvrCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public IvrCallRequest setStartCode(String startCode) {
        this.startCode = startCode;
        return this;
    }
    public String getStartCode() {
        return this.startCode;
    }

    public IvrCallRequest setStartTtsParams(String startTtsParams) {
        this.startTtsParams = startTtsParams;
        return this;
    }
    public String getStartTtsParams() {
        return this.startTtsParams;
    }

    public IvrCallRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class IvrCallRequestMenuKeyMap extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Key")
        public String key;

        @NameInMap("TtsParams")
        public String ttsParams;

        public static IvrCallRequestMenuKeyMap build(java.util.Map<String, ?> map) throws Exception {
            IvrCallRequestMenuKeyMap self = new IvrCallRequestMenuKeyMap();
            return TeaModel.build(map, self);
        }

        public IvrCallRequestMenuKeyMap setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IvrCallRequestMenuKeyMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public IvrCallRequestMenuKeyMap setTtsParams(String ttsParams) {
            this.ttsParams = ttsParams;
            return this;
        }
        public String getTtsParams() {
            return this.ttsParams;
        }

    }

}
