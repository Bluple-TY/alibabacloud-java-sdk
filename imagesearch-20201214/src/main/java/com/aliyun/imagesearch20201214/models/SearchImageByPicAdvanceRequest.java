// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicAdvanceRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicContent")
    public java.io.InputStream picContentObject;

    @NameInMap("Region")
    public String region;

    @NameInMap("Start")
    public Integer start;

    public static SearchImageByPicAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicAdvanceRequest self = new SearchImageByPicAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicAdvanceRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchImageByPicAdvanceRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchImageByPicAdvanceRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByPicAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByPicAdvanceRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public SearchImageByPicAdvanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchImageByPicAdvanceRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
