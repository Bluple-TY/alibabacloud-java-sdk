// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details about the DNS record of the domain name.
    @NameInMap("ResolveResult")
    public DescribeDomainResolveResponseBodyResolveResult resolveResult;

    public static DescribeDomainResolveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveResponseBody self = new DescribeDomainResolveResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResolveResponseBody setResolveResult(DescribeDomainResolveResponseBodyResolveResult resolveResult) {
        this.resolveResult = resolveResult;
        return this;
    }
    public DescribeDomainResolveResponseBodyResolveResult getResolveResult() {
        return this.resolveResult;
    }

    public static class DescribeDomainResolveResponseBodyResolveResult extends TeaModel {
        // The IP address to which the domain name is resolved. Multiple IP addresses are separated by commas (,).
        @NameInMap("IpAddrs")
        public String ipAddrs;

        // The time when the domain name was resolved. The value of this parameter is a timestamp. Unit: seconds.
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeDomainResolveResponseBodyResolveResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResolveResponseBodyResolveResult self = new DescribeDomainResolveResponseBodyResolveResult();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResolveResponseBodyResolveResult setIpAddrs(String ipAddrs) {
            this.ipAddrs = ipAddrs;
            return this;
        }
        public String getIpAddrs() {
            return this.ipAddrs;
        }

        public DescribeDomainResolveResponseBodyResolveResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
