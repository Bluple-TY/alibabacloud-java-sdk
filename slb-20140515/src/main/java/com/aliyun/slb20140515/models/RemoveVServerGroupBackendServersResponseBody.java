// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveVServerGroupBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    public RemoveVServerGroupBackendServersResponseBodyBackendServers backendServers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static RemoveVServerGroupBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVServerGroupBackendServersResponseBody self = new RemoveVServerGroupBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVServerGroupBackendServersResponseBody setBackendServers(RemoveVServerGroupBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public RemoveVServerGroupBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public RemoveVServerGroupBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveVServerGroupBackendServersResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public static class RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer self = new RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class RemoveVServerGroupBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static RemoveVServerGroupBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveVServerGroupBackendServersResponseBodyBackendServers self = new RemoveVServerGroupBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServers setBackendServer(java.util.List<RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<RemoveVServerGroupBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
