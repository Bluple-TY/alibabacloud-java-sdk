// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("Service")
    public GetServiceInstanceResponseBodyService service;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("StatusDetail")
    public String statusDetail;

    @NameInMap("Progress")
    public Long progress;

    @NameInMap("TemplateName")
    public String templateName;

    public static GetServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceResponseBody self = new GetServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceInstanceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetServiceInstanceResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public GetServiceInstanceResponseBody setService(GetServiceInstanceResponseBodyService service) {
        this.service = service;
        return this;
    }
    public GetServiceInstanceResponseBodyService getService() {
        return this.service;
    }

    public GetServiceInstanceResponseBody setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public GetServiceInstanceResponseBody setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }
    public String getStatusDetail() {
        return this.statusDetail;
    }

    public GetServiceInstanceResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public GetServiceInstanceResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class GetServiceInstanceResponseBodyServiceServiceInfos extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static GetServiceInstanceResponseBodyServiceServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyServiceServiceInfos self = new GetServiceInstanceResponseBodyServiceServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class GetServiceInstanceResponseBodyService extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("ServiceInfos")
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos;

        @NameInMap("DeployMetadata")
        public String deployMetadata;

        public static GetServiceInstanceResponseBodyService build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyService self = new GetServiceInstanceResponseBodyService();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceInstanceResponseBodyService setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public GetServiceInstanceResponseBodyService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetServiceInstanceResponseBodyService setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetServiceInstanceResponseBodyService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetServiceInstanceResponseBodyService setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public GetServiceInstanceResponseBodyService setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceInstanceResponseBodyService setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public GetServiceInstanceResponseBodyService setServiceInfos(java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public GetServiceInstanceResponseBodyService setDeployMetadata(String deployMetadata) {
            this.deployMetadata = deployMetadata;
            return this;
        }
        public String getDeployMetadata() {
            return this.deployMetadata;
        }

    }

}
