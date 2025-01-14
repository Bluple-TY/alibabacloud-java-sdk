// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DescribeUserPermissionResponseBody> body;

    public static DescribeUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionResponse self = new DescribeUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserPermissionResponse setBody(java.util.List<DescribeUserPermissionResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeUserPermissionResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeUserPermissionResponseBody extends TeaModel {
        @NameInMap("resource_id")
        public String resourceId;

        @NameInMap("resource_type")
        public String resourceType;

        @NameInMap("role_name")
        public String roleName;

        @NameInMap("role_type")
        public String roleType;

        @NameInMap("is_owner")
        public Long isOwner;

        @NameInMap("is_ram_role")
        public Long isRamRole;

        public static DescribeUserPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserPermissionResponseBody self = new DescribeUserPermissionResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeUserPermissionResponseBody setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeUserPermissionResponseBody setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeUserPermissionResponseBody setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeUserPermissionResponseBody setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public DescribeUserPermissionResponseBody setIsOwner(Long isOwner) {
            this.isOwner = isOwner;
            return this;
        }
        public Long getIsOwner() {
            return this.isOwner;
        }

        public DescribeUserPermissionResponseBody setIsRamRole(Long isRamRole) {
            this.isRamRole = isRamRole;
            return this;
        }
        public Long getIsRamRole() {
            return this.isRamRole;
        }

    }

}
