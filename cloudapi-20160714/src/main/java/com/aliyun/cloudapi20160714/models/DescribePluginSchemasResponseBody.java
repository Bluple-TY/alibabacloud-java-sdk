// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginSchemasResponseBody extends TeaModel {
    /**
     * <p>The plug-in modes.</p>
     */
    @NameInMap("PluginSchemas")
    public DescribePluginSchemasResponseBodyPluginSchemas pluginSchemas;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePluginSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginSchemasResponseBody self = new DescribePluginSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginSchemasResponseBody setPluginSchemas(DescribePluginSchemasResponseBodyPluginSchemas pluginSchemas) {
        this.pluginSchemas = pluginSchemas;
        return this;
    }
    public DescribePluginSchemasResponseBodyPluginSchemas getPluginSchemas() {
        return this.pluginSchemas;
    }

    public DescribePluginSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePluginSchemasResponseBodyPluginSchemasPluginSchema extends TeaModel {
        /**
         * <p>The plug-in description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the document.</p>
         */
        @NameInMap("DocumentId")
        public String documentId;

        /**
         * <p>The name of the plug-in.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether classification is supported.</p>
         */
        @NameInMap("SupportClassic")
        public Boolean supportClassic;

        /**
         * <p>The plug-in title.</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePluginSchemasResponseBodyPluginSchemasPluginSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginSchemasResponseBodyPluginSchemasPluginSchema self = new DescribePluginSchemasResponseBodyPluginSchemasPluginSchema();
            return TeaModel.build(map, self);
        }

        public DescribePluginSchemasResponseBodyPluginSchemasPluginSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginSchemasResponseBodyPluginSchemasPluginSchema setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public DescribePluginSchemasResponseBodyPluginSchemasPluginSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePluginSchemasResponseBodyPluginSchemasPluginSchema setSupportClassic(Boolean supportClassic) {
            this.supportClassic = supportClassic;
            return this;
        }
        public Boolean getSupportClassic() {
            return this.supportClassic;
        }

        public DescribePluginSchemasResponseBodyPluginSchemasPluginSchema setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribePluginSchemasResponseBodyPluginSchemas extends TeaModel {
        @NameInMap("PluginSchema")
        public java.util.List<DescribePluginSchemasResponseBodyPluginSchemasPluginSchema> pluginSchema;

        public static DescribePluginSchemasResponseBodyPluginSchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginSchemasResponseBodyPluginSchemas self = new DescribePluginSchemasResponseBodyPluginSchemas();
            return TeaModel.build(map, self);
        }

        public DescribePluginSchemasResponseBodyPluginSchemas setPluginSchema(java.util.List<DescribePluginSchemasResponseBodyPluginSchemasPluginSchema> pluginSchema) {
            this.pluginSchema = pluginSchema;
            return this;
        }
        public java.util.List<DescribePluginSchemasResponseBodyPluginSchemasPluginSchema> getPluginSchema() {
            return this.pluginSchema;
        }

    }

}
