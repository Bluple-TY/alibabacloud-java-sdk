// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionShrinkRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The detailed configurations of the gateway.
    // 
    // *   **TraceDetails**: the sampling description of Tracing Analysis. Content: TraceEnabled specifies whether to activate Tracing Analysis. Sample specifies the sampling rate of Tracing Analysis.
    // *   **LogConfigDetails**: the description of Log Service. Content: LogEnabled specifies whether to activate Log Service. ProjectName specifies the Log Service project to which logs are delivered. LogStoreName specifies the name of the Logstore.
    // *   **EnableHardwareAcceleration**: specifies whether to enable hardware acceleration.
    // *   **DisableHttp2Alpn**: specifies whether to disable the HTTP/2 protocol.
    // *   **EnableWaf**: specifies whether to activate Web Application Firewall (WAF).
    @NameInMap("GatewayOption")
    public String gatewayOptionShrink;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static UpdateGatewayOptionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayOptionShrinkRequest self = new UpdateGatewayOptionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayOptionShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayOptionShrink(String gatewayOptionShrink) {
        this.gatewayOptionShrink = gatewayOptionShrink;
        return this;
    }
    public String getGatewayOptionShrink() {
        return this.gatewayOptionShrink;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
