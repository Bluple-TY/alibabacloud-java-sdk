// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListAliasesResponseBody extends TeaModel {
    /**
     * <p>The list of aliases.</p>
     */
    @NameInMap("aliases")
    public java.util.List<ListAliasesResponseBodyAliases> aliases;

    /**
     * <p>The token used to obtain more results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAliasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesResponseBody self = new ListAliasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliasesResponseBody setAliases(java.util.List<ListAliasesResponseBodyAliases> aliases) {
        this.aliases = aliases;
        return this;
    }
    public java.util.List<ListAliasesResponseBodyAliases> getAliases() {
        return this.aliases;
    }

    public ListAliasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListAliasesResponseBodyAliases extends TeaModel {
        /**
         * <p>The weight of the canary release version.</p>
         */
        @NameInMap("additionalVersionWeight")
        public java.util.Map<String, Float> additionalVersionWeight;

        /**
         * <p>The name of the alias.</p>
         */
        @NameInMap("aliasName")
        public String aliasName;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The description of the alias.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The last update time.</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("resolvePolicy")
        public String resolvePolicy;

        @NameInMap("routePolicy")
        public RoutePolicy routePolicy;

        /**
         * <p>The ID of the version.</p>
         */
        @NameInMap("versionId")
        public String versionId;

        public static ListAliasesResponseBodyAliases build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseBodyAliases self = new ListAliasesResponseBodyAliases();
            return TeaModel.build(map, self);
        }

        public ListAliasesResponseBodyAliases setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }
        public java.util.Map<String, Float> getAdditionalVersionWeight() {
            return this.additionalVersionWeight;
        }

        public ListAliasesResponseBodyAliases setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListAliasesResponseBodyAliases setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListAliasesResponseBodyAliases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAliasesResponseBodyAliases setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListAliasesResponseBodyAliases setResolvePolicy(String resolvePolicy) {
            this.resolvePolicy = resolvePolicy;
            return this;
        }
        public String getResolvePolicy() {
            return this.resolvePolicy;
        }

        public ListAliasesResponseBodyAliases setRoutePolicy(RoutePolicy routePolicy) {
            this.routePolicy = routePolicy;
            return this;
        }
        public RoutePolicy getRoutePolicy() {
            return this.routePolicy;
        }

        public ListAliasesResponseBodyAliases setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
