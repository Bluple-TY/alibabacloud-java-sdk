// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateTrailResponseBody extends TeaModel {
    @NameInMap("EventRW")
    public String eventRW;

    @NameInMap("HomeRegion")
    public String homeRegion;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    @NameInMap("OssWriteRoleArn")
    public String ossWriteRoleArn;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    @NameInMap("TrailRegion")
    public String trailRegion;

    public static CreateTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrailResponseBody self = new CreateTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrailResponseBody setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public CreateTrailResponseBody setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }
    public String getHomeRegion() {
        return this.homeRegion;
    }

    public CreateTrailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrailResponseBody setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateTrailResponseBody setOssKeyPrefix(String ossKeyPrefix) {
        this.ossKeyPrefix = ossKeyPrefix;
        return this;
    }
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    public CreateTrailResponseBody setOssWriteRoleArn(String ossWriteRoleArn) {
        this.ossWriteRoleArn = ossWriteRoleArn;
        return this;
    }
    public String getOssWriteRoleArn() {
        return this.ossWriteRoleArn;
    }

    public CreateTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrailResponseBody setSlsProjectArn(String slsProjectArn) {
        this.slsProjectArn = slsProjectArn;
        return this;
    }
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    public CreateTrailResponseBody setSlsWriteRoleArn(String slsWriteRoleArn) {
        this.slsWriteRoleArn = slsWriteRoleArn;
        return this;
    }
    public String getSlsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }

    public CreateTrailResponseBody setTrailRegion(String trailRegion) {
        this.trailRegion = trailRegion;
        return this;
    }
    public String getTrailRegion() {
        return this.trailRegion;
    }

}
