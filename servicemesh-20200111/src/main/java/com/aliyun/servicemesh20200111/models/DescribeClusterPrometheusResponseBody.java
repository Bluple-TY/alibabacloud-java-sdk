// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterPrometheusResponseBody extends TeaModel {
    @NameInMap("Prometheus")
    public String prometheus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterPrometheusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPrometheusResponseBody self = new DescribeClusterPrometheusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPrometheusResponseBody setPrometheus(String prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public String getPrometheus() {
        return this.prometheus;
    }

    public DescribeClusterPrometheusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
