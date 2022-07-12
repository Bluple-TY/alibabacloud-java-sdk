// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SyncTrademarkRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("ClassificationCode")
    public String classificationCode;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Label")
    public String label;

    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("OwnerEnName")
    public String ownerEnName;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RegAnnDate")
    public Long regAnnDate;

    @NameInMap("SecondaryClassification")
    public String secondaryClassification;

    @NameInMap("Status")
    public String status;

    @NameInMap("ThirdClassification")
    public String thirdClassification;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("Type")
    public String type;

    public static SyncTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTrademarkRequest self = new SyncTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public SyncTrademarkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public SyncTrademarkRequest setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
        return this;
    }
    public String getClassificationCode() {
        return this.classificationCode;
    }

    public SyncTrademarkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SyncTrademarkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SyncTrademarkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SyncTrademarkRequest setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public SyncTrademarkRequest setOwnerEnName(String ownerEnName) {
        this.ownerEnName = ownerEnName;
        return this;
    }
    public String getOwnerEnName() {
        return this.ownerEnName;
    }

    public SyncTrademarkRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public SyncTrademarkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncTrademarkRequest setRegAnnDate(Long regAnnDate) {
        this.regAnnDate = regAnnDate;
        return this;
    }
    public Long getRegAnnDate() {
        return this.regAnnDate;
    }

    public SyncTrademarkRequest setSecondaryClassification(String secondaryClassification) {
        this.secondaryClassification = secondaryClassification;
        return this;
    }
    public String getSecondaryClassification() {
        return this.secondaryClassification;
    }

    public SyncTrademarkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SyncTrademarkRequest setThirdClassification(String thirdClassification) {
        this.thirdClassification = thirdClassification;
        return this;
    }
    public String getThirdClassification() {
        return this.thirdClassification;
    }

    public SyncTrademarkRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public SyncTrademarkRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public SyncTrademarkRequest setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public SyncTrademarkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
