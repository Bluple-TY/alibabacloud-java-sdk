// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitImageSearchJobRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("FpDBId")
    public String fpDBId;

    @NameInMap("InputImage")
    public String inputImage;

    @NameInMap("InputVideo")
    public String inputVideo;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitImageSearchJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageSearchJobRequest self = new SubmitImageSearchJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageSearchJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SubmitImageSearchJobRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public SubmitImageSearchJobRequest setInputImage(String inputImage) {
        this.inputImage = inputImage;
        return this;
    }
    public String getInputImage() {
        return this.inputImage;
    }

    public SubmitImageSearchJobRequest setInputVideo(String inputVideo) {
        this.inputVideo = inputVideo;
        return this;
    }
    public String getInputVideo() {
        return this.inputVideo;
    }

    public SubmitImageSearchJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitImageSearchJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitImageSearchJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitImageSearchJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitImageSearchJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitImageSearchJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
