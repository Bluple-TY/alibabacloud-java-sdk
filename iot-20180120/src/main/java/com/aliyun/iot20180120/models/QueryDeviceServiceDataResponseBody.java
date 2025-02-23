// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceServiceDataResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceServiceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataResponseBody self = new QueryDeviceServiceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceServiceDataResponseBody setData(QueryDeviceServiceDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceServiceDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceServiceDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceServiceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceServiceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceServiceDataResponseBodyDataListServiceInfo extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("InputData")
        public String inputData;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputData")
        public String outputData;

        @NameInMap("Time")
        public String time;

        public static QueryDeviceServiceDataResponseBodyDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyDataListServiceInfo self = new QueryDeviceServiceDataResponseBodyDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceServiceDataResponseBodyDataList extends TeaModel {
        @NameInMap("ServiceInfo")
        public java.util.List<QueryDeviceServiceDataResponseBodyDataListServiceInfo> serviceInfo;

        public static QueryDeviceServiceDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyDataList self = new QueryDeviceServiceDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyDataList setServiceInfo(java.util.List<QueryDeviceServiceDataResponseBodyDataListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceServiceDataResponseBodyDataListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class QueryDeviceServiceDataResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDeviceServiceDataResponseBodyDataList list;

        @NameInMap("NextTime")
        public Long nextTime;

        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceServiceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyData self = new QueryDeviceServiceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyData setList(QueryDeviceServiceDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceServiceDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceServiceDataResponseBodyData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDeviceServiceDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
