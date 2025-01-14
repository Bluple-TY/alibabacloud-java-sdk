// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setUsers(java.util.List<ListUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        // 账户过期时间
        @NameInMap("AccountExpireTime")
        public Long accountExpireTime;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 账号描述
        @NameInMap("Description")
        public String description;

        // 账户显示名
        @NameInMap("DisplayName")
        public String displayName;

        // 邮箱
        @NameInMap("Email")
        public String email;

        // 邮箱是否已验证
        @NameInMap("EmailVerified")
        public Boolean emailVerified;

        // 实例Id
        @NameInMap("InstanceId")
        public String instanceId;

        // 锁定过期时间
        @NameInMap("LockExpireTime")
        public Long lockExpireTime;

        // 密码是否已设置
        @NameInMap("PasswordSet")
        public Boolean passwordSet;

        // 手机号码
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        // 手机号是否已验证
        @NameInMap("PhoneNumberVerified")
        public Boolean phoneNumberVerified;

        // 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +
        @NameInMap("PhoneRegion")
        public String phoneRegion;

        // 账户注册时间
        @NameInMap("RegisterTime")
        public Long registerTime;

        // 账户状态, enabled:启用,disabled:禁用
        @NameInMap("Status")
        public String status;

        // 最近一次更新时间
        @NameInMap("UpdateTime")
        public Long updateTime;

        // 外部ID
        @NameInMap("UserExternalId")
        public String userExternalId;

        // 账户ID
        @NameInMap("UserId")
        public String userId;

        // 来源ID
        @NameInMap("UserSourceId")
        public String userSourceId;

        // 来源类型，build_in[自建],ding_talk[钉钉导入],ad[AD导入],ldap[LDAP导入]
        @NameInMap("UserSourceType")
        public String userSourceType;

        // 账户名
        @NameInMap("Username")
        public String username;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setAccountExpireTime(Long accountExpireTime) {
            this.accountExpireTime = accountExpireTime;
            return this;
        }
        public Long getAccountExpireTime() {
            return this.accountExpireTime;
        }

        public ListUsersResponseBodyUsers setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUsersResponseBodyUsers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsers setEmailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }
        public Boolean getEmailVerified() {
            return this.emailVerified;
        }

        public ListUsersResponseBodyUsers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersResponseBodyUsers setLockExpireTime(Long lockExpireTime) {
            this.lockExpireTime = lockExpireTime;
            return this;
        }
        public Long getLockExpireTime() {
            return this.lockExpireTime;
        }

        public ListUsersResponseBodyUsers setPasswordSet(Boolean passwordSet) {
            this.passwordSet = passwordSet;
            return this;
        }
        public Boolean getPasswordSet() {
            return this.passwordSet;
        }

        public ListUsersResponseBodyUsers setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListUsersResponseBodyUsers setPhoneNumberVerified(Boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }
        public Boolean getPhoneNumberVerified() {
            return this.phoneNumberVerified;
        }

        public ListUsersResponseBodyUsers setPhoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }
        public String getPhoneRegion() {
            return this.phoneRegion;
        }

        public ListUsersResponseBodyUsers setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public ListUsersResponseBodyUsers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUsersResponseBodyUsers setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListUsersResponseBodyUsers setUserExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }
        public String getUserExternalId() {
            return this.userExternalId;
        }

        public ListUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsers setUserSourceId(String userSourceId) {
            this.userSourceId = userSourceId;
            return this;
        }
        public String getUserSourceId() {
            return this.userSourceId;
        }

        public ListUsersResponseBodyUsers setUserSourceType(String userSourceType) {
            this.userSourceType = userSourceType;
            return this;
        }
        public String getUserSourceType() {
            return this.userSourceType;
        }

        public ListUsersResponseBodyUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
