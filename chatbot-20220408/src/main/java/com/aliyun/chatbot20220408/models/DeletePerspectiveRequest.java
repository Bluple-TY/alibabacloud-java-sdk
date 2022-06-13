// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeletePerspectiveRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 视角主键（code_id）
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static DeletePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePerspectiveRequest self = new DeletePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public DeletePerspectiveRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeletePerspectiveRequest setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}