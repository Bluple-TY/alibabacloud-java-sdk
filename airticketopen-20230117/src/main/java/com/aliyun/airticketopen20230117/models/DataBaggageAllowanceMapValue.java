// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataBaggageAllowanceMapValue extends TeaModel {
    @NameInMap("baggage_amount")
    public Integer baggageAmount;

    @NameInMap("baggage_weight")
    public Integer baggageWeight;

    @NameInMap("baggage_weight_unit")
    public String baggageWeightUnit;

    @NameInMap("is_all_weight")
    public Boolean isAllWeight;

    @NameInMap("carry_on_amount")
    public Integer carryOnAmount;

    @NameInMap("carry_on_weight")
    public Integer carryOnWeight;

    @NameInMap("carry_on_weight_unit")
    public String carryOnWeightUnit;

    @NameInMap("is_all_carry_on_weight")
    public Boolean isAllCarryOnWeight;

    public static DataBaggageAllowanceMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataBaggageAllowanceMapValue self = new DataBaggageAllowanceMapValue();
        return TeaModel.build(map, self);
    }

    public DataBaggageAllowanceMapValue setBaggageAmount(Integer baggageAmount) {
        this.baggageAmount = baggageAmount;
        return this;
    }
    public Integer getBaggageAmount() {
        return this.baggageAmount;
    }

    public DataBaggageAllowanceMapValue setBaggageWeight(Integer baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Integer getBaggageWeight() {
        return this.baggageWeight;
    }

    public DataBaggageAllowanceMapValue setBaggageWeightUnit(String baggageWeightUnit) {
        this.baggageWeightUnit = baggageWeightUnit;
        return this;
    }
    public String getBaggageWeightUnit() {
        return this.baggageWeightUnit;
    }

    public DataBaggageAllowanceMapValue setIsAllWeight(Boolean isAllWeight) {
        this.isAllWeight = isAllWeight;
        return this;
    }
    public Boolean getIsAllWeight() {
        return this.isAllWeight;
    }

    public DataBaggageAllowanceMapValue setCarryOnAmount(Integer carryOnAmount) {
        this.carryOnAmount = carryOnAmount;
        return this;
    }
    public Integer getCarryOnAmount() {
        return this.carryOnAmount;
    }

    public DataBaggageAllowanceMapValue setCarryOnWeight(Integer carryOnWeight) {
        this.carryOnWeight = carryOnWeight;
        return this;
    }
    public Integer getCarryOnWeight() {
        return this.carryOnWeight;
    }

    public DataBaggageAllowanceMapValue setCarryOnWeightUnit(String carryOnWeightUnit) {
        this.carryOnWeightUnit = carryOnWeightUnit;
        return this;
    }
    public String getCarryOnWeightUnit() {
        return this.carryOnWeightUnit;
    }

    public DataBaggageAllowanceMapValue setIsAllCarryOnWeight(Boolean isAllCarryOnWeight) {
        this.isAllCarryOnWeight = isAllCarryOnWeight;
        return this;
    }
    public Boolean getIsAllCarryOnWeight() {
        return this.isAllCarryOnWeight;
    }

}
