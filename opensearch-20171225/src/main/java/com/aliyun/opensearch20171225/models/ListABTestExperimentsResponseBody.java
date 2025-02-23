// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestExperimentsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListABTestExperimentsResponseBodyResult> result;

    public static ListABTestExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestExperimentsResponseBody self = new ListABTestExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABTestExperimentsResponseBody setResult(java.util.List<ListABTestExperimentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestExperimentsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListABTestExperimentsResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("online")
        public Boolean online;

        @NameInMap("params")
        public java.util.Map<String, ?> params;

        @NameInMap("traffic")
        public Integer traffic;

        @NameInMap("updated")
        public Integer updated;

        public static ListABTestExperimentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestExperimentsResponseBodyResult self = new ListABTestExperimentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestExperimentsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListABTestExperimentsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListABTestExperimentsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABTestExperimentsResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListABTestExperimentsResponseBodyResult setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public ListABTestExperimentsResponseBodyResult setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public ListABTestExperimentsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
