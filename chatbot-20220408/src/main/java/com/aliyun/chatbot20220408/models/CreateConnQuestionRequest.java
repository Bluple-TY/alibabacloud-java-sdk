// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateConnQuestionRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ConnQuestionId")
    public Long connQuestionId;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static CreateConnQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnQuestionRequest self = new CreateConnQuestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateConnQuestionRequest setConnQuestionId(Long connQuestionId) {
        this.connQuestionId = connQuestionId;
        return this;
    }
    public Long getConnQuestionId() {
        return this.connQuestionId;
    }

    public CreateConnQuestionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
