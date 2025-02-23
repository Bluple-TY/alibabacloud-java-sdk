// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class XpackRelateDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static XpackRelateDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XpackRelateDBResponseBody self = new XpackRelateDBResponseBody();
        return TeaModel.build(map, self);
    }

    public XpackRelateDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryXpackRelateDBResponseBodyClusterListCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("IsRelated")
        public Boolean isRelated;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("Status")
        public String status;

        public static QueryXpackRelateDBResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            QueryXpackRelateDBResponseBodyClusterListCluster self = new QueryXpackRelateDBResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setIsRelated(Boolean isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public Boolean getIsRelated() {
            return this.isRelated;
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public QueryXpackRelateDBResponseBodyClusterListCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryXpackRelateDBResponseBodyClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<QueryXpackRelateDBResponseBodyClusterListCluster> cluster;

        public static QueryXpackRelateDBResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            QueryXpackRelateDBResponseBodyClusterList self = new QueryXpackRelateDBResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public QueryXpackRelateDBResponseBodyClusterList setCluster(java.util.List<QueryXpackRelateDBResponseBodyClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<QueryXpackRelateDBResponseBodyClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

}
