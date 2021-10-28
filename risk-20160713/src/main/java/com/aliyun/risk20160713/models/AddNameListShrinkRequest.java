// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class AddNameListShrinkRequest extends TeaModel {
    @NameInMap("Applicant")
    public String applicant;

    @NameInMap("BpmsUrl")
    public String bpmsUrl;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DataValue")
    public String dataValue;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Type")
    public String type;

    public static AddNameListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNameListShrinkRequest self = new AddNameListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddNameListShrinkRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public AddNameListShrinkRequest setBpmsUrl(String bpmsUrl) {
        this.bpmsUrl = bpmsUrl;
        return this;
    }
    public String getBpmsUrl() {
        return this.bpmsUrl;
    }

    public AddNameListShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public AddNameListShrinkRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public AddNameListShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public AddNameListShrinkRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public AddNameListShrinkRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddNameListShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public AddNameListShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
