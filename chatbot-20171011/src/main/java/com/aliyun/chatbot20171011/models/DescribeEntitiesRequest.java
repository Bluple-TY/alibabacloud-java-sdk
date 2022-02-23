// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeEntitiesRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EntityId")
    public Long entityId;

    public static DescribeEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntitiesRequest self = new DescribeEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEntitiesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DescribeEntitiesRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

}
