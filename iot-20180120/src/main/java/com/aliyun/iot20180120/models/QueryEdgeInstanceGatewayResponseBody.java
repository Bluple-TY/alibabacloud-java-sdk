// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("GatewayList")
    public java.util.List<QueryEdgeInstanceGatewayResponseBodyGatewayList> gatewayList;

    public static QueryEdgeInstanceGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceGatewayResponseBody self = new QueryEdgeInstanceGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceGatewayResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceGatewayResponseBody setGatewayList(java.util.List<QueryEdgeInstanceGatewayResponseBodyGatewayList> gatewayList) {
        this.gatewayList = gatewayList;
        return this;
    }
    public java.util.List<QueryEdgeInstanceGatewayResponseBodyGatewayList> getGatewayList() {
        return this.gatewayList;
    }

    public static class QueryEdgeInstanceGatewayResponseBodyGatewayList extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("EdgeVersion")
        public String edgeVersion;

        public static QueryEdgeInstanceGatewayResponseBodyGatewayList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceGatewayResponseBodyGatewayList self = new QueryEdgeInstanceGatewayResponseBodyGatewayList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

    }

}
