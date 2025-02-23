// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesResponseBody extends TeaModel {
    @NameInMap("FullNatEntries")
    public java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> fullNatEntries;

    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFullNatEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFullNatEntriesResponseBody self = new ListFullNatEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFullNatEntriesResponseBody setFullNatEntries(java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> fullNatEntries) {
        this.fullNatEntries = fullNatEntries;
        return this;
    }
    public java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> getFullNatEntries() {
        return this.fullNatEntries;
    }

    public ListFullNatEntriesResponseBody setFullNatTableId(String fullNatTableId) {
        this.fullNatTableId = fullNatTableId;
        return this;
    }
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    public ListFullNatEntriesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListFullNatEntriesResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListFullNatEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFullNatEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFullNatEntriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFullNatEntriesResponseBodyFullNatEntries extends TeaModel {
        @NameInMap("AccessIp")
        public String accessIp;

        @NameInMap("AccessPort")
        public String accessPort;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FullNatEntryDescription")
        public String fullNatEntryDescription;

        @NameInMap("FullNatEntryId")
        public String fullNatEntryId;

        @NameInMap("FullNatEntryName")
        public String fullNatEntryName;

        @NameInMap("FullNatEntryStatus")
        public String fullNatEntryStatus;

        @NameInMap("FullNatTableId")
        public String fullNatTableId;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("NatIp")
        public String natIp;

        @NameInMap("NatIpPort")
        public String natIpPort;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("NetworkInterfaceType")
        public String networkInterfaceType;

        public static ListFullNatEntriesResponseBodyFullNatEntries build(java.util.Map<String, ?> map) throws Exception {
            ListFullNatEntriesResponseBodyFullNatEntries self = new ListFullNatEntriesResponseBodyFullNatEntries();
            return TeaModel.build(map, self);
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setAccessPort(String accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public String getAccessPort() {
            return this.accessPort;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryDescription(String fullNatEntryDescription) {
            this.fullNatEntryDescription = fullNatEntryDescription;
            return this;
        }
        public String getFullNatEntryDescription() {
            return this.fullNatEntryDescription;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryId(String fullNatEntryId) {
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }
        public String getFullNatEntryId() {
            return this.fullNatEntryId;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryName(String fullNatEntryName) {
            this.fullNatEntryName = fullNatEntryName;
            return this;
        }
        public String getFullNatEntryName() {
            return this.fullNatEntryName;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryStatus(String fullNatEntryStatus) {
            this.fullNatEntryStatus = fullNatEntryStatus;
            return this;
        }
        public String getFullNatEntryStatus() {
            return this.fullNatEntryStatus;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatTableId(String fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }
        public String getFullNatTableId() {
            return this.fullNatTableId;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNatIpPort(String natIpPort) {
            this.natIpPort = natIpPort;
            return this;
        }
        public String getNatIpPort() {
            return this.natIpPort;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNetworkInterfaceType(String networkInterfaceType) {
            this.networkInterfaceType = networkInterfaceType;
            return this;
        }
        public String getNetworkInterfaceType() {
            return this.networkInterfaceType;
        }

    }

}
