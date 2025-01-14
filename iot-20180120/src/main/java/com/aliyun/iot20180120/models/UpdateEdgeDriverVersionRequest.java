// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeDriverVersionRequest extends TeaModel {
    @NameInMap("Argument")
    public String argument;

    @NameInMap("ConfigCheckRule")
    public String configCheckRule;

    @NameInMap("ContainerConfig")
    public String containerConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("DriverConfig")
    public String driverConfig;

    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("DriverVersion")
    public String driverVersion;

    @NameInMap("EdgeVersion")
    public String edgeVersion;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SourceConfig")
    public String sourceConfig;

    public static UpdateEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeDriverVersionRequest self = new UpdateEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeDriverVersionRequest setArgument(String argument) {
        this.argument = argument;
        return this;
    }
    public String getArgument() {
        return this.argument;
    }

    public UpdateEdgeDriverVersionRequest setConfigCheckRule(String configCheckRule) {
        this.configCheckRule = configCheckRule;
        return this;
    }
    public String getConfigCheckRule() {
        return this.configCheckRule;
    }

    public UpdateEdgeDriverVersionRequest setContainerConfig(String containerConfig) {
        this.containerConfig = containerConfig;
        return this;
    }
    public String getContainerConfig() {
        return this.containerConfig;
    }

    public UpdateEdgeDriverVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEdgeDriverVersionRequest setDriverConfig(String driverConfig) {
        this.driverConfig = driverConfig;
        return this;
    }
    public String getDriverConfig() {
        return this.driverConfig;
    }

    public UpdateEdgeDriverVersionRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public UpdateEdgeDriverVersionRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

    public UpdateEdgeDriverVersionRequest setEdgeVersion(String edgeVersion) {
        this.edgeVersion = edgeVersion;
        return this;
    }
    public String getEdgeVersion() {
        return this.edgeVersion;
    }

    public UpdateEdgeDriverVersionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeDriverVersionRequest setSourceConfig(String sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public String getSourceConfig() {
        return this.sourceConfig;
    }

}
