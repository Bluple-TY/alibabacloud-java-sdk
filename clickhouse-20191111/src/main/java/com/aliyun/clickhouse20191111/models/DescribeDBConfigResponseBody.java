// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBConfigResponseBody self = new DescribeDBConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDBConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
