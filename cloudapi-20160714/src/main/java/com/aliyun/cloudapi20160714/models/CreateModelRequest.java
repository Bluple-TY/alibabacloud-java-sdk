// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    /**
     * <p>The description of the model definition.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group to which the model belongs.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the model. The name must be unique within the group.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The definition of the model in JSON Schema.</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
