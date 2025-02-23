// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("EventId")
    public String eventId;

    public static QueryEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRequest self = new QueryEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public QueryEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
