// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTenantModesResponseBody extends TeaModel {
    /**
     * <p>The information of tenants.</p>
     */
    @NameInMap("InstanceModes")
    public java.util.List<String> instanceModes;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTenantModesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTenantModesResponseBody self = new DescribeInstanceTenantModesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTenantModesResponseBody setInstanceModes(java.util.List<String> instanceModes) {
        this.instanceModes = instanceModes;
        return this;
    }
    public java.util.List<String> getInstanceModes() {
        return this.instanceModes;
    }

    public DescribeInstanceTenantModesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
