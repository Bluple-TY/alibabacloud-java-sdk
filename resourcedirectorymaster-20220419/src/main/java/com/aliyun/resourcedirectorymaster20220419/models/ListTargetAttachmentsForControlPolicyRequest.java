// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTargetAttachmentsForControlPolicyRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyId")
    public String policyId;

    public static ListTargetAttachmentsForControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTargetAttachmentsForControlPolicyRequest self = new ListTargetAttachmentsForControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListTargetAttachmentsForControlPolicyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTargetAttachmentsForControlPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTargetAttachmentsForControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
