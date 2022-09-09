// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListPluginStatusResponseBody extends TeaModel {
    @NameInMap("InstancePluginStatusSet")
    public ListPluginStatusResponseBodyInstancePluginStatusSet instancePluginStatusSet;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPluginStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginStatusResponseBody self = new ListPluginStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginStatusResponseBody setInstancePluginStatusSet(ListPluginStatusResponseBodyInstancePluginStatusSet instancePluginStatusSet) {
        this.instancePluginStatusSet = instancePluginStatusSet;
        return this;
    }
    public ListPluginStatusResponseBodyInstancePluginStatusSet getInstancePluginStatusSet() {
        return this.instancePluginStatusSet;
    }

    public ListPluginStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginStatusResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPluginStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPluginStatusResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus extends TeaModel {
        @NameInMap("FirstHeartbeatTime")
        public String firstHeartbeatTime;

        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("PluginStatus")
        public String pluginStatus;

        @NameInMap("PluginVersion")
        public String pluginVersion;

        public static ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus self = new ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setFirstHeartbeatTime(String firstHeartbeatTime) {
            this.firstHeartbeatTime = firstHeartbeatTime;
            return this;
        }
        public String getFirstHeartbeatTime() {
            return this.firstHeartbeatTime;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setLastHeartbeatTime(String lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setPluginStatus(String pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public String getPluginStatus() {
            return this.pluginStatus;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet extends TeaModel {
        @NameInMap("PluginStatus")
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus> pluginStatus;

        public static ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet self = new ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet setPluginStatus(java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus> pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus> getPluginStatus() {
            return this.pluginStatus;
        }

    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PluginStatusSet")
        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet pluginStatusSet;

        public static ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus self = new ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus setPluginStatusSet(ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet pluginStatusSet) {
            this.pluginStatusSet = pluginStatusSet;
            return this;
        }
        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet getPluginStatusSet() {
            return this.pluginStatusSet;
        }

    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSet extends TeaModel {
        @NameInMap("InstancePluginStatus")
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus> instancePluginStatus;

        public static ListPluginStatusResponseBodyInstancePluginStatusSet build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSet self = new ListPluginStatusResponseBodyInstancePluginStatusSet();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSet setInstancePluginStatus(java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus> instancePluginStatus) {
            this.instancePluginStatus = instancePluginStatus;
            return this;
        }
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus> getInstancePluginStatus() {
            return this.instancePluginStatus;
        }

    }

}
