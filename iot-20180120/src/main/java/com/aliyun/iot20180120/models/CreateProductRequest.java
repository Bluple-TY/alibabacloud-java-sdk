// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    @NameInMap("AliyunCommodityCode")
    public String aliyunCommodityCode;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("CategoryKey")
    public String categoryKey;

    @NameInMap("DataFormat")
    public Integer dataFormat;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id2")
    public Boolean id2;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JoinPermissionId")
    public String joinPermissionId;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("NodeType")
    public Integer nodeType;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("PublishAuto")
    public Boolean publishAuto;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ValidateType")
    public Integer validateType;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setAliyunCommodityCode(String aliyunCommodityCode) {
        this.aliyunCommodityCode = aliyunCommodityCode;
        return this;
    }
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    public CreateProductRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateProductRequest setCategoryKey(String categoryKey) {
        this.categoryKey = categoryKey;
        return this;
    }
    public String getCategoryKey() {
        return this.categoryKey;
    }

    public CreateProductRequest setDataFormat(Integer dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public Integer getDataFormat() {
        return this.dataFormat;
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setId2(Boolean id2) {
        this.id2 = id2;
        return this;
    }
    public Boolean getId2() {
        return this.id2;
    }

    public CreateProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateProductRequest setJoinPermissionId(String joinPermissionId) {
        this.joinPermissionId = joinPermissionId;
        return this;
    }
    public String getJoinPermissionId() {
        return this.joinPermissionId;
    }

    public CreateProductRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateProductRequest setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public Integer getNodeType() {
        return this.nodeType;
    }

    public CreateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateProductRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateProductRequest setPublishAuto(Boolean publishAuto) {
        this.publishAuto = publishAuto;
        return this;
    }
    public Boolean getPublishAuto() {
        return this.publishAuto;
    }

    public CreateProductRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateProductRequest setValidateType(Integer validateType) {
        this.validateType = validateType;
        return this;
    }
    public Integer getValidateType() {
        return this.validateType;
    }

}
