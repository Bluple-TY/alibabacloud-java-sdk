// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceLDAPAuthServerResponseBody extends TeaModel {
    /**
     * <p>The settings of LDAP authentication.</p>
     */
    @NameInMap("LDAP")
    public GetInstanceLDAPAuthServerResponseBodyLDAP LDAP;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceLDAPAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLDAPAuthServerResponseBody self = new GetInstanceLDAPAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceLDAPAuthServerResponseBody setLDAP(GetInstanceLDAPAuthServerResponseBodyLDAP LDAP) {
        this.LDAP = LDAP;
        return this;
    }
    public GetInstanceLDAPAuthServerResponseBodyLDAP getLDAP() {
        return this.LDAP;
    }

    public GetInstanceLDAPAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceLDAPAuthServerResponseBodyLDAP extends TeaModel {
        /**
         * <p>The account of the LDAP server.</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The Base distinguished name (DN).</p>
         */
        @NameInMap("BaseDN")
        public String baseDN;

        /**
         * <p>The field that is used to indicate the email address of a user on the LDAP server.</p>
         */
        @NameInMap("EmailMapping")
        public String emailMapping;

        /**
         * <p>The condition that is used to filter users.</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>Indicates whether passwords are required. Valid values:</p>
         * <br>
         * <p>*   **true**: required</p>
         * <p>*   **false**: not required</p>
         */
        @NameInMap("HasPassword")
        public String hasPassword;

        /**
         * <p>Indicates whether SSL is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: supported</p>
         * <p>*   **false**: not supported</p>
         */
        @NameInMap("IsSSL")
        public Boolean isSSL;

        /**
         * <p>The field that is used to indicate the logon name of a user on the LDAP server.</p>
         */
        @NameInMap("LoginNameMapping")
        public String loginNameMapping;

        /**
         * <p>The field that is used to indicate the mobile phone number of a user on the LDAP server.</p>
         */
        @NameInMap("MobileMapping")
        public String mobileMapping;

        /**
         * <p>The field that is used to indicate the name of a user on the LDAP server.</p>
         */
        @NameInMap("NameMapping")
        public String nameMapping;

        /**
         * <p>The port that is used to access the LDAP server.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The address of the LDAP server.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The address of the secondary LDAP server.</p>
         */
        @NameInMap("StandbyServer")
        public String standbyServer;

        public static GetInstanceLDAPAuthServerResponseBodyLDAP build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceLDAPAuthServerResponseBodyLDAP self = new GetInstanceLDAPAuthServerResponseBodyLDAP();
            return TeaModel.build(map, self);
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setBaseDN(String baseDN) {
            this.baseDN = baseDN;
            return this;
        }
        public String getBaseDN() {
            return this.baseDN;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setEmailMapping(String emailMapping) {
            this.emailMapping = emailMapping;
            return this;
        }
        public String getEmailMapping() {
            return this.emailMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setHasPassword(String hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public String getHasPassword() {
            return this.hasPassword;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setIsSSL(Boolean isSSL) {
            this.isSSL = isSSL;
            return this;
        }
        public Boolean getIsSSL() {
            return this.isSSL;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setLoginNameMapping(String loginNameMapping) {
            this.loginNameMapping = loginNameMapping;
            return this;
        }
        public String getLoginNameMapping() {
            return this.loginNameMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setMobileMapping(String mobileMapping) {
            this.mobileMapping = mobileMapping;
            return this;
        }
        public String getMobileMapping() {
            return this.mobileMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setNameMapping(String nameMapping) {
            this.nameMapping = nameMapping;
            return this;
        }
        public String getNameMapping() {
            return this.nameMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setStandbyServer(String standbyServer) {
            this.standbyServer = standbyServer;
            return this;
        }
        public String getStandbyServer() {
            return this.standbyServer;
        }

    }

}
