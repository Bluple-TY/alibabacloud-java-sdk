// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HoneypotNode")
    public GetHoneypotNodeResponseBodyHoneypotNode honeypotNode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeResponseBody self = new GetHoneypotNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotNodeResponseBody setHoneypotNode(GetHoneypotNodeResponseBodyHoneypotNode honeypotNode) {
        this.honeypotNode = honeypotNode;
        return this;
    }
    public GetHoneypotNodeResponseBodyHoneypotNode getHoneypotNode() {
        return this.honeypotNode;
    }

    public GetHoneypotNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotNodeResponseBodyHoneypotNode extends TeaModel {
        @NameInMap("AllowHoneypotAccessInternet")
        public Boolean allowHoneypotAccessInternet;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("HoneypotTotalCount")
        public Integer honeypotTotalCount;

        @NameInMap("HoneypotUsedCount")
        public Integer honeypotUsedCount;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProbeTotalCount")
        public Integer probeTotalCount;

        @NameInMap("ProbeUsedCount")
        public Integer probeUsedCount;

        @NameInMap("SecurityGroupProbeIpList")
        public java.util.List<String> securityGroupProbeIpList;

        @NameInMap("TotalStatus")
        public Integer totalStatus;

        @NameInMap("UpgradeAvailable")
        public Boolean upgradeAvailable;

        public static GetHoneypotNodeResponseBodyHoneypotNode build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotNodeResponseBodyHoneypotNode self = new GetHoneypotNodeResponseBodyHoneypotNode();
            return TeaModel.build(map, self);
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setAllowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
            this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
            return this;
        }
        public Boolean getAllowHoneypotAccessInternet() {
            return this.allowHoneypotAccessInternet;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setHoneypotTotalCount(Integer honeypotTotalCount) {
            this.honeypotTotalCount = honeypotTotalCount;
            return this;
        }
        public Integer getHoneypotTotalCount() {
            return this.honeypotTotalCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setHoneypotUsedCount(Integer honeypotUsedCount) {
            this.honeypotUsedCount = honeypotUsedCount;
            return this;
        }
        public Integer getHoneypotUsedCount() {
            return this.honeypotUsedCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setProbeTotalCount(Integer probeTotalCount) {
            this.probeTotalCount = probeTotalCount;
            return this;
        }
        public Integer getProbeTotalCount() {
            return this.probeTotalCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setProbeUsedCount(Integer probeUsedCount) {
            this.probeUsedCount = probeUsedCount;
            return this;
        }
        public Integer getProbeUsedCount() {
            return this.probeUsedCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setSecurityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
            this.securityGroupProbeIpList = securityGroupProbeIpList;
            return this;
        }
        public java.util.List<String> getSecurityGroupProbeIpList() {
            return this.securityGroupProbeIpList;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setTotalStatus(Integer totalStatus) {
            this.totalStatus = totalStatus;
            return this;
        }
        public Integer getTotalStatus() {
            return this.totalStatus;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setUpgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

    }

}
