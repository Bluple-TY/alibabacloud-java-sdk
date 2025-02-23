// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateCompliancePackReportRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GenerateCompliancePackReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCompliancePackReportRequest self = new GenerateCompliancePackReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCompliancePackReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateCompliancePackReportRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
