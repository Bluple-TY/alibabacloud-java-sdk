// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsForParentResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Accounts")
    public ListAccountsForParentResponseBodyAccounts accounts;

    public static ListAccountsForParentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentResponseBody self = new ListAccountsForParentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAccountsForParentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsForParentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsForParentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsForParentResponseBody setAccounts(ListAccountsForParentResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsForParentResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public static class ListAccountsForParentResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListAccountsForParentResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccount self = new ListAccountsForParentResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

    public static class ListAccountsForParentResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccount> account;

        public static ListAccountsForParentResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccounts self = new ListAccountsForParentResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccounts setAccount(java.util.List<ListAccountsForParentResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
