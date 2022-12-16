// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGovernanceKubernetesClusterResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The data returned.
    @NameInMap("Data")
    public QueryGovernanceKubernetesClusterResponseBodyData data;

    // HttpCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // Message
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful.
    @NameInMap("Success")
    public Boolean success;

    public static QueryGovernanceKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGovernanceKubernetesClusterResponseBody self = new QueryGovernanceKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGovernanceKubernetesClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryGovernanceKubernetesClusterResponseBody setData(QueryGovernanceKubernetesClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGovernanceKubernetesClusterResponseBodyData getData() {
        return this.data;
    }

    public QueryGovernanceKubernetesClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryGovernanceKubernetesClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGovernanceKubernetesClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGovernanceKubernetesClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGovernanceKubernetesClusterResponseBodyDataResult extends TeaModel {
        // The ID of the cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The name of the cluster.
        @NameInMap("ClusterName")
        public String clusterName;

        // The version of the cluster.
        @NameInMap("K8sVersion")
        public String k8sVersion;

        // The information of the namespace.
        @NameInMap("NamespaceInfos")
        public String namespaceInfos;

        // The time when the ack-one-pilot component was started.
        @NameInMap("PilotStartTime")
        public String pilotStartTime;

        // Region
        @NameInMap("Region")
        public String region;

        public static QueryGovernanceKubernetesClusterResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryGovernanceKubernetesClusterResponseBodyDataResult self = new QueryGovernanceKubernetesClusterResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setNamespaceInfos(String namespaceInfos) {
            this.namespaceInfos = namespaceInfos;
            return this;
        }
        public String getNamespaceInfos() {
            return this.namespaceInfos;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setPilotStartTime(String pilotStartTime) {
            this.pilotStartTime = pilotStartTime;
            return this;
        }
        public String getPilotStartTime() {
            return this.pilotStartTime;
        }

        public QueryGovernanceKubernetesClusterResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class QueryGovernanceKubernetesClusterResponseBodyData extends TeaModel {
        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> result;

        // The number of clusters.
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static QueryGovernanceKubernetesClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGovernanceKubernetesClusterResponseBodyData self = new QueryGovernanceKubernetesClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setResult(java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryGovernanceKubernetesClusterResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryGovernanceKubernetesClusterResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
