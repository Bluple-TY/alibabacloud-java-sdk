// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionLOAResponseBody extends TeaModel {
    @NameInMap("PhysicalConnectionLOAType")
    public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType physicalConnectionLOAType;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhysicalConnectionLOAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionLOAResponseBody self = new DescribePhysicalConnectionLOAResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionLOAResponseBody setPhysicalConnectionLOAType(DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType physicalConnectionLOAType) {
        this.physicalConnectionLOAType = physicalConnectionLOAType;
        return this;
    }
    public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType getPhysicalConnectionLOAType() {
        return this.physicalConnectionLOAType;
    }

    public DescribePhysicalConnectionLOAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo extends TeaModel {
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        @NameInMap("PMGender")
        public String PMGender;

        @NameInMap("PMName")
        public String PMName;

        public static DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo self = new DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

    }

    public static class DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo extends TeaModel {
        @NameInMap("PMInfo")
        public java.util.List<DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo> PMInfo;

        public static DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo self = new DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo setPMInfo(java.util.List<DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo> PMInfo) {
            this.PMInfo = PMInfo;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo> getPMInfo() {
            return this.PMInfo;
        }

    }

    public static class DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType extends TeaModel {
        @NameInMap("CompanyLocalizedName")
        public String companyLocalizedName;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("ConstructionTime")
        public String constructionTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineLabel")
        public String lineLabel;

        @NameInMap("LineType")
        public String lineType;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("PMInfo")
        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo PMInfo;

        @NameInMap("SI")
        public String SI;

        @NameInMap("Status")
        public String status;

        public static DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType self = new DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setCompanyLocalizedName(String companyLocalizedName) {
            this.companyLocalizedName = companyLocalizedName;
            return this;
        }
        public String getCompanyLocalizedName() {
            return this.companyLocalizedName;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setConstructionTime(String constructionTime) {
            this.constructionTime = constructionTime;
            return this;
        }
        public String getConstructionTime() {
            return this.constructionTime;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineLabel(String lineLabel) {
            this.lineLabel = lineLabel;
            return this;
        }
        public String getLineLabel() {
            return this.lineLabel;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setPMInfo(DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo PMInfo) {
            this.PMInfo = PMInfo;
            return this;
        }
        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo getPMInfo() {
            return this.PMInfo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setSI(String SI) {
            this.SI = SI;
            return this;
        }
        public String getSI() {
            return this.SI;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
