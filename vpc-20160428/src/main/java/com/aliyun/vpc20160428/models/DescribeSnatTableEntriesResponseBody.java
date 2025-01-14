// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatTableEntries")
    public DescribeSnatTableEntriesResponseBodySnatTableEntries snatTableEntries;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnatTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesResponseBody self = new DescribeSnatTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatTableEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatTableEntriesResponseBody setSnatTableEntries(DescribeSnatTableEntriesResponseBodySnatTableEntries snatTableEntries) {
        this.snatTableEntries = snatTableEntries;
        return this;
    }
    public DescribeSnatTableEntriesResponseBodySnatTableEntries getSnatTableEntries() {
        return this.snatTableEntries;
    }

    public DescribeSnatTableEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry extends TeaModel {
        @NameInMap("SnatEntryId")
        public String snatEntryId;

        @NameInMap("SnatEntryName")
        public String snatEntryName;

        @NameInMap("SnatIp")
        public String snatIp;

        @NameInMap("SnatTableId")
        public String snatTableId;

        @NameInMap("SourceCIDR")
        public String sourceCIDR;

        @NameInMap("SourceVSwitchId")
        public String sourceVSwitchId;

        @NameInMap("Status")
        public String status;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry self = new DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }
        public String getSnatIp() {
            return this.snatIp;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatTableId(String snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public String getSnatTableId() {
            return this.snatTableId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSourceVSwitchId(String sourceVSwitchId) {
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }
        public String getSourceVSwitchId() {
            return this.sourceVSwitchId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSnatTableEntriesResponseBodySnatTableEntries extends TeaModel {
        @NameInMap("SnatTableEntry")
        public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry> snatTableEntry;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntries self = new DescribeSnatTableEntriesResponseBodySnatTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatTableEntry(java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry> snatTableEntry) {
            this.snatTableEntry = snatTableEntry;
            return this;
        }
        public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry> getSnatTableEntry() {
            return this.snatTableEntry;
        }

    }

}
