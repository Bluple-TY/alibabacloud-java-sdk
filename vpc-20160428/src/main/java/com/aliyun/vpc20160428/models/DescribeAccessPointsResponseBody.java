// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponseBody extends TeaModel {
    @NameInMap("AccessPointSet")
    public DescribeAccessPointsResponseBodyAccessPointSet accessPointSet;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponseBody self = new DescribeAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponseBody setAccessPointSet(DescribeAccessPointsResponseBodyAccessPointSet accessPointSet) {
        this.accessPointSet = accessPointSet;
        return this;
    }
    public DescribeAccessPointsResponseBodyAccessPointSet getAccessPointSet() {
        return this.accessPointSet;
    }

    public DescribeAccessPointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessPointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel extends TeaModel {
        @NameInMap("FeatureKey")
        public String featureKey;

        @NameInMap("FeatureValue")
        public String featureValue;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }
        public String getFeatureKey() {
            return this.featureKey;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels extends TeaModel {
        @NameInMap("AccessPointFeatureModel")
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> accessPointFeatureModel;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels setAccessPointFeatureModel(java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> accessPointFeatureModel) {
            this.accessPointFeatureModel = accessPointFeatureModel;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModelsAccessPointFeatureModel> getAccessPointFeatureModel() {
            return this.accessPointFeatureModel;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSetAccessPointType extends TeaModel {
        @NameInMap("AccessPointFeatureModels")
        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels accessPointFeatureModels;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AttachedRegionNo")
        public String attachedRegionNo;

        @NameInMap("Description")
        public String description;

        @NameInMap("HostOperator")
        public String hostOperator;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeAccessPointsResponseBodyAccessPointSetAccessPointType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSetAccessPointType self = new DescribeAccessPointsResponseBodyAccessPointSetAccessPointType();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAccessPointFeatureModels(DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels accessPointFeatureModels) {
            this.accessPointFeatureModels = accessPointFeatureModels;
            return this;
        }
        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointTypeAccessPointFeatureModels getAccessPointFeatureModels() {
            return this.accessPointFeatureModels;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setAttachedRegionNo(String attachedRegionNo) {
            this.attachedRegionNo = attachedRegionNo;
            return this;
        }
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setHostOperator(String hostOperator) {
            this.hostOperator = hostOperator;
            return this;
        }
        public String getHostOperator() {
            return this.hostOperator;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointsResponseBodyAccessPointSetAccessPointType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> accessPointType;

        public static DescribeAccessPointsResponseBodyAccessPointSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointSet self = new DescribeAccessPointsResponseBodyAccessPointSet();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointSet setAccessPointType(java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointSetAccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

    }

}
