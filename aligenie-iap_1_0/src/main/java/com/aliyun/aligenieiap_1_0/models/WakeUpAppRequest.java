// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class WakeUpAppRequest extends TeaModel {
    // 是否调试
    @NameInMap("IsDebug")
    public Boolean isDebug;

    // 应用拉起路径，类似在技能应用控制台中填的唤起链接。
    @NameInMap("Path")
    public String path;

    // 要拉起的目标设备信息。
    @NameInMap("TargetInfo")
    public WakeUpAppRequestTargetInfo targetInfo;

    public static WakeUpAppRequest build(java.util.Map<String, ?> map) throws Exception {
        WakeUpAppRequest self = new WakeUpAppRequest();
        return TeaModel.build(map, self);
    }

    public WakeUpAppRequest setIsDebug(Boolean isDebug) {
        this.isDebug = isDebug;
        return this;
    }
    public Boolean getIsDebug() {
        return this.isDebug;
    }

    public WakeUpAppRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public WakeUpAppRequest setTargetInfo(WakeUpAppRequestTargetInfo targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public WakeUpAppRequestTargetInfo getTargetInfo() {
        return this.targetInfo;
    }

    public static class WakeUpAppRequestTargetInfo extends TeaModel {
        // 编码类型对应的值，例如：编码类型是SKILLID，其值就为webhook服务中得到的skillId；编码类似是PACKAGENAME，其值就为对应客户端app的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型：  PACKAGE_NAME：apk包名 SKILL_ID：技能id
        @NameInMap("EncodeType")
        public String encodeType;

        // 组织标识，推送类型是XX_UNION_XX时才需要配。当存在多种途径获取猫精设备标识且又需要能互通的情况下需要找平台申请组织，申请通过后由平台分配得到。
        @NameInMap("OrganizationId")
        public String organizationId;

        // 推送目标类型对应的标识值
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        // 推送目标类型，获取到对应设备标识时的类型  DEVICE_UNION_ID：设备unionId； DEVICE_OPEN_ID：设备openId
        @NameInMap("TargetType")
        public String targetType;

        public static WakeUpAppRequestTargetInfo build(java.util.Map<String, ?> map) throws Exception {
            WakeUpAppRequestTargetInfo self = new WakeUpAppRequestTargetInfo();
            return TeaModel.build(map, self);
        }

        public WakeUpAppRequestTargetInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public WakeUpAppRequestTargetInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public WakeUpAppRequestTargetInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public WakeUpAppRequestTargetInfo setTargetIdentity(String targetIdentity) {
            this.targetIdentity = targetIdentity;
            return this;
        }
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

        public WakeUpAppRequestTargetInfo setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
