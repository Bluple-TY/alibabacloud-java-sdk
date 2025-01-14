// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsResponseBody extends TeaModel {
    @NameInMap("MasterSlaveServerGroups")
    public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups masterSlaveServerGroups;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMasterSlaveServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsResponseBody self = new DescribeMasterSlaveServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsResponseBody setMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups masterSlaveServerGroups) {
        this.masterSlaveServerGroups = masterSlaveServerGroups;
        return this;
    }
    public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups getMasterSlaveServerGroups() {
        return this.masterSlaveServerGroups;
    }

    public DescribeMasterSlaveServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners extends TeaModel {
        @NameInMap("Listener")
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener> listener;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners setListener(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener> listener) {
            this.listener = listener;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener> getListener() {
            return this.listener;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects extends TeaModel {
        @NameInMap("Listeners")
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners listeners;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects setListeners(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners listeners) {
            this.listeners = listeners;
            return this;
        }
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners getListeners() {
            return this.listeners;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup extends TeaModel {
        @NameInMap("AssociatedObjects")
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects associatedObjects;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        @NameInMap("MasterSlaveServerGroupName")
        public String masterSlaveServerGroupName;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setAssociatedObjects(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects associatedObjects) {
            this.associatedObjects = associatedObjects;
            return this;
        }
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
            this.masterSlaveServerGroupName = masterSlaveServerGroupName;
            return this;
        }
        public String getMasterSlaveServerGroupName() {
            return this.masterSlaveServerGroupName;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups extends TeaModel {
        @NameInMap("MasterSlaveServerGroup")
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup> masterSlaveServerGroup;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups setMasterSlaveServerGroup(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup> masterSlaveServerGroup) {
            this.masterSlaveServerGroup = masterSlaveServerGroup;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup> getMasterSlaveServerGroup() {
            return this.masterSlaveServerGroup;
        }

    }

}
