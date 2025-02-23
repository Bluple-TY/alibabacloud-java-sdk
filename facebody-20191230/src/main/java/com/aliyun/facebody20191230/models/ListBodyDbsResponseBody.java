// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyDbsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBodyDbsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBodyDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBodyDbsResponseBody self = new ListBodyDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBodyDbsResponseBody setData(ListBodyDbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBodyDbsResponseBodyData getData() {
        return this.data;
    }

    public ListBodyDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBodyDbsResponseBodyDataDbList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListBodyDbsResponseBodyDataDbList build(java.util.Map<String, ?> map) throws Exception {
            ListBodyDbsResponseBodyDataDbList self = new ListBodyDbsResponseBodyDataDbList();
            return TeaModel.build(map, self);
        }

        public ListBodyDbsResponseBodyDataDbList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBodyDbsResponseBodyDataDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListBodyDbsResponseBodyData extends TeaModel {
        @NameInMap("DbList")
        public java.util.List<ListBodyDbsResponseBodyDataDbList> dbList;

        @NameInMap("Total")
        public Long total;

        public static ListBodyDbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBodyDbsResponseBodyData self = new ListBodyDbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBodyDbsResponseBodyData setDbList(java.util.List<ListBodyDbsResponseBodyDataDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListBodyDbsResponseBodyDataDbList> getDbList() {
            return this.dbList;
        }

        public ListBodyDbsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
