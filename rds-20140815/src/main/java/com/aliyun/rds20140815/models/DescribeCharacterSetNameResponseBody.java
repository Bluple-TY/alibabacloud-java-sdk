// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the character sets that are supported for the instance.</p>
     */
    @NameInMap("CharacterSetNameItems")
    public DescribeCharacterSetNameResponseBodyCharacterSetNameItems characterSetNameItems;

    /**
     * <p>The database engine that is run on the instance.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCharacterSetNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameResponseBody self = new DescribeCharacterSetNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameResponseBody setCharacterSetNameItems(DescribeCharacterSetNameResponseBodyCharacterSetNameItems characterSetNameItems) {
        this.characterSetNameItems = characterSetNameItems;
        return this;
    }
    public DescribeCharacterSetNameResponseBodyCharacterSetNameItems getCharacterSetNameItems() {
        return this.characterSetNameItems;
    }

    public DescribeCharacterSetNameResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeCharacterSetNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCharacterSetNameResponseBodyCharacterSetNameItems extends TeaModel {
        @NameInMap("CharacterSetName")
        public java.util.List<String> characterSetName;

        public static DescribeCharacterSetNameResponseBodyCharacterSetNameItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCharacterSetNameResponseBodyCharacterSetNameItems self = new DescribeCharacterSetNameResponseBodyCharacterSetNameItems();
            return TeaModel.build(map, self);
        }

        public DescribeCharacterSetNameResponseBodyCharacterSetNameItems setCharacterSetName(java.util.List<String> characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public java.util.List<String> getCharacterSetName() {
            return this.characterSetName;
        }

    }

}
