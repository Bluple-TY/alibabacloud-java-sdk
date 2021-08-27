// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("Ipv6Sets")
    public AssignIpv6AddressesResponseBodyIpv6Sets ipv6Sets;

    public static AssignIpv6AddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesResponseBody self = new AssignIpv6AddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignIpv6AddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssignIpv6AddressesResponseBody setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignIpv6AddressesResponseBody setIpv6Sets(AssignIpv6AddressesResponseBodyIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public AssignIpv6AddressesResponseBodyIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public static class AssignIpv6AddressesResponseBodyIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        public static AssignIpv6AddressesResponseBodyIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            AssignIpv6AddressesResponseBodyIpv6Sets self = new AssignIpv6AddressesResponseBodyIpv6Sets();
            return TeaModel.build(map, self);
        }

        public AssignIpv6AddressesResponseBodyIpv6Sets setIpv6Address(java.util.List<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<String> getIpv6Address() {
            return this.ipv6Address;
        }

    }

}
