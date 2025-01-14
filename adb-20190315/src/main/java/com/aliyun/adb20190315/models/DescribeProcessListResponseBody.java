// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeProcessListResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeProcessListResponseBodyItems items;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListResponseBody self = new DescribeProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListResponseBody setItems(DescribeProcessListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeProcessListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeProcessListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessListResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProcessListResponseBodyItemsProcess extends TeaModel {
        @NameInMap("Command")
        public String command;

        @NameInMap("DB")
        public String DB;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Info")
        public String info;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Time")
        public Integer time;

        @NameInMap("User")
        public String user;

        public static DescribeProcessListResponseBodyItemsProcess build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyItemsProcess self = new DescribeProcessListResponseBodyItemsProcess();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyItemsProcess setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeProcessListResponseBodyItemsProcess setDB(String DB) {
            this.DB = DB;
            return this;
        }
        public String getDB() {
            return this.DB;
        }

        public DescribeProcessListResponseBodyItemsProcess setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeProcessListResponseBodyItemsProcess setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeProcessListResponseBodyItemsProcess setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public DescribeProcessListResponseBodyItemsProcess setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeProcessListResponseBodyItemsProcess setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProcessListResponseBodyItemsProcess setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public DescribeProcessListResponseBodyItemsProcess setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeProcessListResponseBodyItems extends TeaModel {
        @NameInMap("Process")
        public java.util.List<DescribeProcessListResponseBodyItemsProcess> process;

        public static DescribeProcessListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyItems self = new DescribeProcessListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyItems setProcess(java.util.List<DescribeProcessListResponseBodyItemsProcess> process) {
            this.process = process;
            return this;
        }
        public java.util.List<DescribeProcessListResponseBodyItemsProcess> getProcess() {
            return this.process;
        }

    }

}
