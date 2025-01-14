// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FirmwareInfo")
    public QueryOTAFirmwareResponseBodyFirmwareInfo firmwareInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOTAFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAFirmwareResponseBody self = new QueryOTAFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOTAFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAFirmwareResponseBody setFirmwareInfo(QueryOTAFirmwareResponseBodyFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public QueryOTAFirmwareResponseBodyFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public QueryOTAFirmwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOTAFirmwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles extends TeaModel {
        @NameInMap("FileMd5")
        public String fileMd5;

        @NameInMap("Name")
        public String name;

        @NameInMap("SignValue")
        public String signValue;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Url")
        public String url;

        public static QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles self = new QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles();
            return TeaModel.build(map, self);
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setSignValue(String signValue) {
            this.signValue = signValue;
            return this;
        }
        public String getSignValue() {
            return this.signValue;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryOTAFirmwareResponseBodyFirmwareInfo extends TeaModel {
        @NameInMap("DestVersion")
        public String destVersion;

        @NameInMap("FirmwareDesc")
        public String firmwareDesc;

        @NameInMap("FirmwareId")
        public String firmwareId;

        @NameInMap("FirmwareName")
        public String firmwareName;

        @NameInMap("FirmwareSign")
        public String firmwareSign;

        @NameInMap("FirmwareSize")
        public Integer firmwareSize;

        @NameInMap("FirmwareUrl")
        public String firmwareUrl;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("MultiFiles")
        public java.util.List<QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles> multiFiles;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("SrcVersion")
        public String srcVersion;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Udi")
        public String udi;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("VerifyProgress")
        public Integer verifyProgress;

        public static QueryOTAFirmwareResponseBodyFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAFirmwareResponseBodyFirmwareInfo self = new QueryOTAFirmwareResponseBodyFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareSign(String firmwareSign) {
            this.firmwareSign = firmwareSign;
            return this;
        }
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareSize(Integer firmwareSize) {
            this.firmwareSize = firmwareSize;
            return this;
        }
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setMultiFiles(java.util.List<QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles> multiFiles) {
            this.multiFiles = multiFiles;
            return this;
        }
        public java.util.List<QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles> getMultiFiles() {
            return this.multiFiles;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUdi(String udi) {
            this.udi = udi;
            return this;
        }
        public String getUdi() {
            return this.udi;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setVerifyProgress(Integer verifyProgress) {
            this.verifyProgress = verifyProgress;
            return this;
        }
        public Integer getVerifyProgress() {
            return this.verifyProgress;
        }

    }

}
