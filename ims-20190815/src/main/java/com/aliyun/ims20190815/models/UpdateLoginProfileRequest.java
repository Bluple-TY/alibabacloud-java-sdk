// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileRequest extends TeaModel {
    /**
     * <p>Specifies whether multi-factor authentication (MFA) must be enabled. Valid values:</p>
     * <br>
     * <p>*   true. The value true indicates that the RAM user must bind an MFA device at the next logon.</p>
     * <p>*   false.</p>
     */
    @NameInMap("MFABindRequired")
    public Boolean MFABindRequired;

    /**
     * <p>The new password that is used to log on to the console.</p>
     * <br>
     * <p>The password must meet the complexity requirements.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether the RAM user must reset the password at the next logon. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("PasswordResetRequired")
    public Boolean passwordResetRequired;

    /**
     * <p>The status of password-based logon. Valid values:</p>
     * <br>
     * <p>*   Active</p>
     * <p>*   Inactive</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UpdateLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileRequest self = new UpdateLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileRequest setMFABindRequired(Boolean MFABindRequired) {
        this.MFABindRequired = MFABindRequired;
        return this;
    }
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

    public UpdateLoginProfileRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateLoginProfileRequest setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }
    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    public UpdateLoginProfileRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLoginProfileRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
