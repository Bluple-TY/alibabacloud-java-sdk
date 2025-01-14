// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionResponseBody extends TeaModel {
    @NameInMap("AttachInstanceId")
    public String attachInstanceId;

    @NameInMap("AttachType")
    public String attachType;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CrossAccountAuthorized")
    public Boolean crossAccountAuthorized;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    public DescribeVpnConnectionResponseBodyIkeConfig ikeConfig;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("IpsecConfig")
    public DescribeVpnConnectionResponseBodyIpsecConfig ipsecConfig;

    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("State")
    public String state;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeVpnConnectionResponseBodyTags tags;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterName")
    public String transitRouterName;

    @NameInMap("VcoHealthCheck")
    public DescribeVpnConnectionResponseBodyVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    public DescribeVpnConnectionResponseBodyVpnBgpConfig vpnBgpConfig;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("ZoneNo")
    public String zoneNo;

    public static DescribeVpnConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionResponseBody self = new DescribeVpnConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionResponseBody setAttachInstanceId(String attachInstanceId) {
        this.attachInstanceId = attachInstanceId;
        return this;
    }
    public String getAttachInstanceId() {
        return this.attachInstanceId;
    }

    public DescribeVpnConnectionResponseBody setAttachType(String attachType) {
        this.attachType = attachType;
        return this;
    }
    public String getAttachType() {
        return this.attachType;
    }

    public DescribeVpnConnectionResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeVpnConnectionResponseBody setCrossAccountAuthorized(Boolean crossAccountAuthorized) {
        this.crossAccountAuthorized = crossAccountAuthorized;
        return this;
    }
    public Boolean getCrossAccountAuthorized() {
        return this.crossAccountAuthorized;
    }

    public DescribeVpnConnectionResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public DescribeVpnConnectionResponseBody setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public DescribeVpnConnectionResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public DescribeVpnConnectionResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public DescribeVpnConnectionResponseBody setIkeConfig(DescribeVpnConnectionResponseBodyIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public DescribeVpnConnectionResponseBodyIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public DescribeVpnConnectionResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeVpnConnectionResponseBody setIpsecConfig(DescribeVpnConnectionResponseBodyIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public DescribeVpnConnectionResponseBodyIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public DescribeVpnConnectionResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public DescribeVpnConnectionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpnConnectionResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeVpnConnectionResponseBody setRemoteCaCertificate(String remoteCaCertificate) {
        this.remoteCaCertificate = remoteCaCertificate;
        return this;
    }
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    public DescribeVpnConnectionResponseBody setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public DescribeVpnConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnConnectionResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeVpnConnectionResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeVpnConnectionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnConnectionResponseBody setTags(DescribeVpnConnectionResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVpnConnectionResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVpnConnectionResponseBody setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeVpnConnectionResponseBody setTransitRouterName(String transitRouterName) {
        this.transitRouterName = transitRouterName;
        return this;
    }
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public DescribeVpnConnectionResponseBody setVcoHealthCheck(DescribeVpnConnectionResponseBodyVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public DescribeVpnConnectionResponseBodyVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public DescribeVpnConnectionResponseBody setVpnBgpConfig(DescribeVpnConnectionResponseBodyVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public DescribeVpnConnectionResponseBodyVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public DescribeVpnConnectionResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public DescribeVpnConnectionResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnConnectionResponseBody setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
        return this;
    }
    public String getZoneNo() {
        return this.zoneNo;
    }

    public static class DescribeVpnConnectionResponseBodyIkeConfig extends TeaModel {
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        @NameInMap("IkeMode")
        public String ikeMode;

        @NameInMap("IkePfs")
        public String ikePfs;

        @NameInMap("IkeVersion")
        public String ikeVersion;

        @NameInMap("LocalId")
        public String localId;

        @NameInMap("Psk")
        public String psk;

        @NameInMap("RemoteId")
        public String remoteId;

        public static DescribeVpnConnectionResponseBodyIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyIkeConfig self = new DescribeVpnConnectionResponseBodyIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionResponseBodyIpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static DescribeVpnConnectionResponseBodyIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyIpsecConfig self = new DescribeVpnConnectionResponseBodyIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpnConnectionResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTagsTag self = new DescribeVpnConnectionResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnConnectionResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpnConnectionResponseBodyTagsTag> tag;

        public static DescribeVpnConnectionResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTags self = new DescribeVpnConnectionResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTags setTag(java.util.List<DescribeVpnConnectionResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnConnectionResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnConnectionResponseBodyVcoHealthCheck extends TeaModel {
        @NameInMap("Dip")
        public String dip;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Retry")
        public Integer retry;

        @NameInMap("Sip")
        public String sip;

        @NameInMap("Status")
        public String status;

        public static DescribeVpnConnectionResponseBodyVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyVcoHealthCheck self = new DescribeVpnConnectionResponseBodyVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnConnectionResponseBodyVpnBgpConfig extends TeaModel {
        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("EnableBgp")
        public String enableBgp;

        @NameInMap("LocalAsn")
        public Long localAsn;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("PeerAsn")
        public Long peerAsn;

        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        @NameInMap("Status")
        public String status;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static DescribeVpnConnectionResponseBodyVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyVpnBgpConfig self = new DescribeVpnConnectionResponseBodyVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

}
