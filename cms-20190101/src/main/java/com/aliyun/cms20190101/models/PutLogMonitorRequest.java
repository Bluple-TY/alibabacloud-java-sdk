// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorRequest extends TeaModel {
    @NameInMap("Aggregates")
    public java.util.List<PutLogMonitorRequestAggregates> aggregates;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Groupbys")
    public java.util.List<PutLogMonitorRequestGroupbys> groupbys;

    @NameInMap("LogId")
    public String logId;

    @NameInMap("MetricExpress")
    public String metricExpress;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SlsLogstore")
    public String slsLogstore;

    @NameInMap("SlsProject")
    public String slsProject;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("Tumblingwindows")
    public String tumblingwindows;

    @NameInMap("Unit")
    public String unit;

    @NameInMap("ValueFilter")
    public java.util.List<PutLogMonitorRequestValueFilter> valueFilter;

    @NameInMap("ValueFilterRelation")
    public String valueFilterRelation;

    public static PutLogMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLogMonitorRequest self = new PutLogMonitorRequest();
        return TeaModel.build(map, self);
    }

    public PutLogMonitorRequest setAggregates(java.util.List<PutLogMonitorRequestAggregates> aggregates) {
        this.aggregates = aggregates;
        return this;
    }
    public java.util.List<PutLogMonitorRequestAggregates> getAggregates() {
        return this.aggregates;
    }

    public PutLogMonitorRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutLogMonitorRequest setGroupbys(java.util.List<PutLogMonitorRequestGroupbys> groupbys) {
        this.groupbys = groupbys;
        return this;
    }
    public java.util.List<PutLogMonitorRequestGroupbys> getGroupbys() {
        return this.groupbys;
    }

    public PutLogMonitorRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public PutLogMonitorRequest setMetricExpress(String metricExpress) {
        this.metricExpress = metricExpress;
        return this;
    }
    public String getMetricExpress() {
        return this.metricExpress;
    }

    public PutLogMonitorRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutLogMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutLogMonitorRequest setSlsLogstore(String slsLogstore) {
        this.slsLogstore = slsLogstore;
        return this;
    }
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    public PutLogMonitorRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public PutLogMonitorRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public PutLogMonitorRequest setTumblingwindows(String tumblingwindows) {
        this.tumblingwindows = tumblingwindows;
        return this;
    }
    public String getTumblingwindows() {
        return this.tumblingwindows;
    }

    public PutLogMonitorRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public PutLogMonitorRequest setValueFilter(java.util.List<PutLogMonitorRequestValueFilter> valueFilter) {
        this.valueFilter = valueFilter;
        return this;
    }
    public java.util.List<PutLogMonitorRequestValueFilter> getValueFilter() {
        return this.valueFilter;
    }

    public PutLogMonitorRequest setValueFilterRelation(String valueFilterRelation) {
        this.valueFilterRelation = valueFilterRelation;
        return this;
    }
    public String getValueFilterRelation() {
        return this.valueFilterRelation;
    }

    public static class PutLogMonitorRequestAggregates extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("Function")
        public String function;

        public static PutLogMonitorRequestAggregates build(java.util.Map<String, ?> map) throws Exception {
            PutLogMonitorRequestAggregates self = new PutLogMonitorRequestAggregates();
            return TeaModel.build(map, self);
        }

        public PutLogMonitorRequestAggregates setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public PutLogMonitorRequestAggregates setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public PutLogMonitorRequestAggregates setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

    }

    public static class PutLogMonitorRequestGroupbys extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("FieldName")
        public String fieldName;

        public static PutLogMonitorRequestGroupbys build(java.util.Map<String, ?> map) throws Exception {
            PutLogMonitorRequestGroupbys self = new PutLogMonitorRequestGroupbys();
            return TeaModel.build(map, self);
        }

        public PutLogMonitorRequestGroupbys setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public PutLogMonitorRequestGroupbys setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

    public static class PutLogMonitorRequestValueFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static PutLogMonitorRequestValueFilter build(java.util.Map<String, ?> map) throws Exception {
            PutLogMonitorRequestValueFilter self = new PutLogMonitorRequestValueFilter();
            return TeaModel.build(map, self);
        }

        public PutLogMonitorRequestValueFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutLogMonitorRequestValueFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public PutLogMonitorRequestValueFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
