// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteContactRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact.</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    public static DeleteContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactRequest self = new DeleteContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

}
