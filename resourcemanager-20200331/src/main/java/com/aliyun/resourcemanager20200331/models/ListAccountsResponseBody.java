// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsResponseBody extends TeaModel {
    @NameInMap("Accounts")
    public ListAccountsResponseBodyAccounts accounts;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsResponseBody self = new ListAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsResponseBody setAccounts(ListAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccountsResponseBodyAccountsAccountTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListAccountsResponseBodyAccountsAccountTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccountsAccountTagsTag self = new ListAccountsResponseBodyAccountsAccountTagsTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccountsAccountTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsResponseBodyAccountsAccountTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAccountsResponseBodyAccountsAccountTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListAccountsResponseBodyAccountsAccountTagsTag> tag;

        public static ListAccountsResponseBodyAccountsAccountTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccountsAccountTags self = new ListAccountsResponseBodyAccountsAccountTags();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccountsAccountTags setTag(java.util.List<ListAccountsResponseBodyAccountsAccountTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListAccountsResponseBodyAccountsAccountTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListAccountsResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public ListAccountsResponseBodyAccountsAccountTags tags;

        @NameInMap("Type")
        public String type;

        public static ListAccountsResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccountsAccount self = new ListAccountsResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsResponseBodyAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountsResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsResponseBodyAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsResponseBodyAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountsResponseBodyAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsResponseBodyAccountsAccount setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public ListAccountsResponseBodyAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsResponseBodyAccountsAccount setTags(ListAccountsResponseBodyAccountsAccountTags tags) {
            this.tags = tags;
            return this;
        }
        public ListAccountsResponseBodyAccountsAccountTags getTags() {
            return this.tags;
        }

        public ListAccountsResponseBodyAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAccountsResponseBodyAccountsAccount> account;

        public static ListAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccounts self = new ListAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccounts setAccount(java.util.List<ListAccountsResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
