// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateQueryProcessorResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateQueryProcessorResponseBodyResult result;

    public static CreateQueryProcessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryProcessorResponseBody self = new CreateQueryProcessorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQueryProcessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQueryProcessorResponseBody setResult(CreateQueryProcessorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateQueryProcessorResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateQueryProcessorResponseBodyResult extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("created")
        public Integer created;

        @NameInMap("domain")
        public String domain;

        @NameInMap("indexes")
        public java.util.List<String> indexes;

        @NameInMap("name")
        public String name;

        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        @NameInMap("updated")
        public Integer updated;

        public static CreateQueryProcessorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateQueryProcessorResponseBodyResult self = new CreateQueryProcessorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateQueryProcessorResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateQueryProcessorResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateQueryProcessorResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateQueryProcessorResponseBodyResult setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public CreateQueryProcessorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateQueryProcessorResponseBodyResult setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public CreateQueryProcessorResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
