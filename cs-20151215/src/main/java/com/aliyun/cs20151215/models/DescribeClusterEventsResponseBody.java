// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterEventsResponseBody extends TeaModel {
    // 事件列表。
    @NameInMap("events")
    public java.util.List<DescribeClusterEventsResponseBodyEvents> events;

    // 分页信息。
    @NameInMap("page_info")
    public DescribeClusterEventsResponseBodyPageInfo pageInfo;

    public static DescribeClusterEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterEventsResponseBody self = new DescribeClusterEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterEventsResponseBody setEvents(java.util.List<DescribeClusterEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeClusterEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeClusterEventsResponseBody setPageInfo(DescribeClusterEventsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeClusterEventsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeClusterEventsResponseBodyEventsData extends TeaModel {
        // 事件级别。
        @NameInMap("level")
        public String level;

        // 事件详情。
        @NameInMap("message")
        public String message;

        // 事件状态。
        @NameInMap("reason")
        public String reason;

        public static DescribeClusterEventsResponseBodyEventsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterEventsResponseBodyEventsData self = new DescribeClusterEventsResponseBodyEventsData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterEventsResponseBodyEventsData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeClusterEventsResponseBodyEventsData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeClusterEventsResponseBodyEventsData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeClusterEventsResponseBodyEvents extends TeaModel {
        // 集群ID。
        @NameInMap("cluster_id")
        public String clusterId;

        // 事件描述。
        @NameInMap("data")
        public DescribeClusterEventsResponseBodyEventsData data;

        // 事件ID。
        @NameInMap("event_id")
        public String eventId;

        // 事件源。
        @NameInMap("source")
        public String source;

        // 事件子项。
        @NameInMap("subject")
        public String subject;

        // 事件开始时间。
        @NameInMap("time")
        public String time;

        // 事件类型。
        @NameInMap("type")
        public String type;

        public static DescribeClusterEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterEventsResponseBodyEvents self = new DescribeClusterEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeClusterEventsResponseBodyEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterEventsResponseBodyEvents setData(DescribeClusterEventsResponseBodyEventsData data) {
            this.data = data;
            return this;
        }
        public DescribeClusterEventsResponseBodyEventsData getData() {
            return this.data;
        }

        public DescribeClusterEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeClusterEventsResponseBodyEvents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeClusterEventsResponseBodyEvents setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeClusterEventsResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeClusterEventsResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterEventsResponseBodyPageInfo extends TeaModel {
        // 分页页数。
        @NameInMap("page_number")
        public Long pageNumber;

        // 每页大小。
        @NameInMap("page_size")
        public Long pageSize;

        // 结果总数。
        @NameInMap("total_count")
        public Long totalCount;

        public static DescribeClusterEventsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterEventsResponseBodyPageInfo self = new DescribeClusterEventsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterEventsResponseBodyPageInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClusterEventsResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeClusterEventsResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}