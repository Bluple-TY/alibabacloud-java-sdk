// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeXpackMonitorConfigRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeXpackMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeXpackMonitorConfigRequest self = new DescribeXpackMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeXpackMonitorConfigRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}