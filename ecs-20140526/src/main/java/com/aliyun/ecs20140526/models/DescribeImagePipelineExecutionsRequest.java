// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelineExecutionsRequest extends TeaModel {
    /**
     * <p>The ID of the image build task.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The ID of the image template.</p>
     */
    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 500.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the `NextToken` value that was returned when you last called the DescribeImagePipelineExecutions operation. Leave this parameter empty when you call this operation for the first time.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image build task. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the image build task. You can specify multiple values at the same time. Separate the values with commas (,). Example format: `BUILDING,DISTRIBUTING`. Valid values: </p>
     * <br>
     * <p>- BUILDING: The image is being built.</p>
     * <p>- DISTRIBUTING: The image is being distributed.</p>
     * <p>- RELEASING: The image is being recycled.</p>
     * <p>- SUCCESS: The image is built.</p>
     * <p>- FAILED: The image fails to be built.</p>
     * <p>- CANCELLING: The image build task is being canceled.</p>
     * <p>- CANCELLED: The image build task is canceled.</p>
     * <br>
     * <p>>  You cannot query the image build tasks in all status by leaving this parameter empty.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>> This parameter is deprecated.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImagePipelineExecutionsRequestTag> tag;

    public static DescribeImagePipelineExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelineExecutionsRequest self = new DescribeImagePipelineExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelineExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public DescribeImagePipelineExecutionsRequest setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public DescribeImagePipelineExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelineExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelineExecutionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImagePipelineExecutionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImagePipelineExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagePipelineExecutionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImagePipelineExecutionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImagePipelineExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImagePipelineExecutionsRequest setTag(java.util.List<DescribeImagePipelineExecutionsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImagePipelineExecutionsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImagePipelineExecutionsRequestTag extends TeaModel {
        /**
         * <p>> This parameter is deprecated.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>> This parameter is deprecated.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImagePipelineExecutionsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsRequestTag self = new DescribeImagePipelineExecutionsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagePipelineExecutionsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
