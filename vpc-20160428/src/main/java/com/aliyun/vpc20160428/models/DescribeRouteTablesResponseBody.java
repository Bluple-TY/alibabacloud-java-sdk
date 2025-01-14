// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteTables")
    public DescribeRouteTablesResponseBodyRouteTables routeTables;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesResponseBody self = new DescribeRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTablesResponseBody setRouteTables(DescribeRouteTablesResponseBodyRouteTables routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public DescribeRouteTablesResponseBodyRouteTables getRouteTables() {
        return this.routeTables;
    }

    public DescribeRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
        @NameInMap("Enabled")
        public Integer enabled;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("NextHops")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops;

        @NameInMap("RouteEntryId")
        public String routeEntryId;

        @NameInMap("RouteEntryName")
        public String routeEntryName;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setNextHops(DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys setRouteEntry(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTable extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RouteEntrys")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys routeEntrys;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("Status")
        public String status;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("VSwitchIds")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds vSwitchIds;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTable self = new DescribeRouteTablesResponseBodyRouteTablesRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteEntrys(DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys getRouteEntrys() {
            return this.routeEntrys;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setVSwitchIds(DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTables extends TeaModel {
        @NameInMap("RouteTable")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> routeTable;

        public static DescribeRouteTablesResponseBodyRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTables self = new DescribeRouteTablesResponseBodyRouteTables();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTables setRouteTable(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> getRouteTable() {
            return this.routeTable;
        }

    }

}
