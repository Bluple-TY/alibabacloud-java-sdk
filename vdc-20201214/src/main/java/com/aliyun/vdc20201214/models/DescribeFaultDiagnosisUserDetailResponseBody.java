// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserDetailResponseBody extends TeaModel {
    // 通信基本信息，QueryCallUserInfo=false是返回。
    @NameInMap("CallInfo")
    public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo callInfo;

    // 影响因素列表，空表示影响因素未知
    @NameInMap("FactorList")
    public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> factorList;

    // 异常指标
    @NameInMap("FaultMetricData")
    public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData faultMetricData;

    // 网络运营商列表
    @NameInMap("NetworkOperators")
    public java.util.List<String> networkOperators;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 诊断用户详细信，QueryCallUserInfo=false是返回息
    @NameInMap("UserDetail")
    public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail userDetail;

    public static DescribeFaultDiagnosisUserDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserDetailResponseBody self = new DescribeFaultDiagnosisUserDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setCallInfo(DescribeFaultDiagnosisUserDetailResponseBodyCallInfo callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo getCallInfo() {
        return this.callInfo;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setFactorList(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> factorList) {
        this.factorList = factorList;
        return this;
    }
    public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> getFactorList() {
        return this.factorList;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setFaultMetricData(DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData faultMetricData) {
        this.faultMetricData = faultMetricData;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData getFaultMetricData() {
        return this.faultMetricData;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setNetworkOperators(java.util.List<String> networkOperators) {
        this.networkOperators = networkOperators;
        return this;
    }
    public java.util.List<String> getNetworkOperators() {
        return this.networkOperators;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setUserDetail(DescribeFaultDiagnosisUserDetailResponseBodyUserDetail userDetail) {
        this.userDetail = userDetail;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail getUserDetail() {
        return this.userDetail;
    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyCallInfo extends TeaModel {
        // App ID。
        @NameInMap("AppId")
        public String appId;

        // 通信状态。取值：IN：进行中。OUT：已结束。
        @NameInMap("CallStatus")
        public String callStatus;

        // 频道ID。
        @NameInMap("ChannelId")
        public String channelId;

        // 创建通信时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 释放通信时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通信持续时长，单位：秒。
        @NameInMap("Duration")
        public Long duration;

        public static DescribeFaultDiagnosisUserDetailResponseBodyCallInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyCallInfo self = new DescribeFaultDiagnosisUserDetailResponseBodyCallInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList extends TeaModel {
        @NameInMap("Acs")
        public String acs;

        @NameInMap("EventCode")
        public String eventCode;

        // 事件名称。
        @NameInMap("EventName")
        public String eventName;

        // 事件类型，取值：USER：用户事件。SYSTEM：系统事件。
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Os")
        public String os;

        @NameInMap("Sdk")
        public String sdk;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StreamType")
        public String streamType;

        @NameInMap("TrackCode")
        public String trackCode;

        @NameInMap("TrackName")
        public String trackName;

        // 事件发生的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("Ts")
        public Long ts;

        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setAcs(String acs) {
            this.acs = acs;
            return this;
        }
        public String getAcs() {
            return this.acs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setSdk(String sdk) {
            this.sdk = sdk;
            return this;
        }
        public String getSdk() {
            return this.sdk;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setTrackCode(String trackCode) {
            this.trackCode = trackCode;
            return this;
        }
        public String getTrackCode() {
            return this.trackCode;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setTrackName(String trackName) {
            this.trackName = trackName;
            return this;
        }
        public String getTrackName() {
            return this.trackName;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems extends TeaModel {
        // 事件列表。
        @NameInMap("EventList")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> eventList;

        // 第一个事件发生的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("Ts")
        public Long ts;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems setEventList(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> getEventList() {
            return this.eventList;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas extends TeaModel {
        // 事件数据列表
        @NameInMap("EventDataItems")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> eventDataItems;

        // 来源角色： SENDER：发布端，即上行 RECEIVER：订阅端，即下行
        @NameInMap("Role")
        public String role;

        // 用户ID
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas setEventDataItems(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> eventDataItems) {
            this.eventDataItems = eventDataItems;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> getEventDataItems() {
            return this.eventDataItems;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes extends TeaModel {
        // 扩展数据
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        // X坐标值，秒级时间戳
        @NameInMap("X")
        public String x;

        // Y坐标值，指标值
        @NameInMap("Y")
        public String y;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas extends TeaModel {
        // 坐标数据列表
        @NameInMap("Nodes")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> nodes;

        // 来源角色： SENDER：发布端，即上行 RECEIVER：订阅端，即下行
        @NameInMap("Role")
        public String role;

        // 指标类型，参照端到端指标接口的指标类型
        @NameInMap("Type")
        public String type;

        // 数据来自对应发布端的用户ID
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setNodes(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> getNodes() {
            return this.nodes;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorList extends TeaModel {
        // 影响因素ID： 1：发布端网络差 2：订阅端网络差 3：发布端设备性能差 4：发布端关闭摄像头 5：发布端切到后台运行
        @NameInMap("FactorId")
        public String factorId;

        // 异常来源 LOCAL：本端 REMOTE：远端
        @NameInMap("FaultSource")
        public String faultSource;

        // 关联的事件，按时间分组，当FaultType为AUDIO_STUCK、VIDEO_STUCK、VIDEO_VAGUE、HIGH_DELAY时返回
        @NameInMap("RelatedEventDatas")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> relatedEventDatas;

        // 关联的指标，坐标数据，当FaultType为AUDIO_STUCK、VIDEO_STUCK、VIDEO_VAGUE、HIGH_DELAY时返回
        @NameInMap("RelatedMetricDatas")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas> relatedMetricDatas;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorList self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setFactorId(String factorId) {
            this.factorId = factorId;
            return this;
        }
        public String getFactorId() {
            return this.factorId;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setFaultSource(String faultSource) {
            this.faultSource = faultSource;
            return this;
        }
        public String getFaultSource() {
            return this.faultSource;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setRelatedEventDatas(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> relatedEventDatas) {
            this.relatedEventDatas = relatedEventDatas;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> getRelatedEventDatas() {
            return this.relatedEventDatas;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setRelatedMetricDatas(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas> relatedMetricDatas) {
            this.relatedMetricDatas = relatedMetricDatas;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas> getRelatedMetricDatas() {
            return this.relatedMetricDatas;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes extends TeaModel {
        // x轴坐标值，秒级时间戳，单位时间为分钟
        @NameInMap("X")
        public String x;

        // y轴坐标值，异常指标的值
        @NameInMap("Y")
        public String y;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes self = new DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData extends TeaModel {
        // 指标坐标点列表
        @NameInMap("Nodes")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes> nodes;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData self = new DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData setNodes(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods extends TeaModel {
        // 加入通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("JoinTs")
        public Long joinTs;

        // 离开通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods self = new DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyUserDetail extends TeaModel {
        // 创建通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 释放通话时间，使用UNIX时间戳表示，单位：秒。通话未结束时值为0。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通话时长，首次进入到最后离开，单位：秒。
        @NameInMap("Duration")
        public Long duration;

        // 地理位置信息，例如：北京市-北京市
        @NameInMap("Location")
        public String location;

        // 网络类型，如WiFi，4G等
        @NameInMap("Network")
        public String network;

        // 在线时长，单位：秒。
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        // 在线时段信息。
        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> onlinePeriods;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("Os")
        public String os;

        // SDK版本，如1.0.0、1.1.1等
        @NameInMap("SdkVersion")
        public String sdkVersion;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyUserDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyUserDetail self = new DescribeFaultDiagnosisUserDetailResponseBodyUserDetail();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setOnlinePeriods(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
