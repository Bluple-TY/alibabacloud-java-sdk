// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationResponseBody extends TeaModel {
    @NameInMap("AttacksProtectionConfiguration")
    public String attacksProtectionConfiguration;

    @NameInMap("PersistentConnectionsConfiguration")
    public String persistentConnectionsConfiguration;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransparentSwitchConfiguration")
    public String transparentSwitchConfiguration;

    public static DescribeDBInstanceProxyConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceProxyConfigurationResponseBody self = new DescribeDBInstanceProxyConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setAttacksProtectionConfiguration(String attacksProtectionConfiguration) {
        this.attacksProtectionConfiguration = attacksProtectionConfiguration;
        return this;
    }
    public String getAttacksProtectionConfiguration() {
        return this.attacksProtectionConfiguration;
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setPersistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
        this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
        return this;
    }
    public String getPersistentConnectionsConfiguration() {
        return this.persistentConnectionsConfiguration;
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setTransparentSwitchConfiguration(String transparentSwitchConfiguration) {
        this.transparentSwitchConfiguration = transparentSwitchConfiguration;
        return this;
    }
    public String getTransparentSwitchConfiguration() {
        return this.transparentSwitchConfiguration;
    }

}
