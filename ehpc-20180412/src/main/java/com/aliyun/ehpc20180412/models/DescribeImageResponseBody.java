// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageResponseBody extends TeaModel {
    @NameInMap("ImageInfo")
    public DescribeImageResponseBodyImageInfo imageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageResponseBody self = new DescribeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageResponseBody setImageInfo(DescribeImageResponseBodyImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }
    public DescribeImageResponseBodyImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public DescribeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageResponseBodyImageInfo extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("Status")
        public String status;

        @NameInMap("System")
        public String system;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateDateTime")
        public String updateDateTime;

        public static DescribeImageResponseBodyImageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResponseBodyImageInfo self = new DescribeImageResponseBodyImageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageResponseBodyImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageResponseBodyImageInfo setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public DescribeImageResponseBodyImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageResponseBodyImageInfo setSystem(String system) {
            this.system = system;
            return this;
        }
        public String getSystem() {
            return this.system;
        }

        public DescribeImageResponseBodyImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageResponseBodyImageInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageResponseBodyImageInfo setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

}
