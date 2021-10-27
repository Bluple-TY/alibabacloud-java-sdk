// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
    @NameInMap("Result")
    public CreateLiveRoomResponseBodyResult result;

    public static CreateLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRoomResponseBody self = new CreateLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveRoomResponseBody setResult(CreateLiveRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLiveRoomResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLiveRoomResponseBodyResultArtcInfo extends TeaModel {
        // RTS转码流地址，推荐web端使用。
        @NameInMap("ArtcH5Url")
        public String artcH5Url;

        // RTS原码流地址，推荐移动端使用。
        @NameInMap("ArtcUrl")
        public String artcUrl;

        public static CreateLiveRoomResponseBodyResultArtcInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRoomResponseBodyResultArtcInfo self = new CreateLiveRoomResponseBodyResultArtcInfo();
            return TeaModel.build(map, self);
        }

        public CreateLiveRoomResponseBodyResultArtcInfo setArtcH5Url(String artcH5Url) {
            this.artcH5Url = artcH5Url;
            return this;
        }
        public String getArtcH5Url() {
            return this.artcH5Url;
        }

        public CreateLiveRoomResponseBodyResultArtcInfo setArtcUrl(String artcUrl) {
            this.artcUrl = artcUrl;
            return this;
        }
        public String getArtcUrl() {
            return this.artcUrl;
        }

    }

    public static class CreateLiveRoomResponseBodyResultPluginInstanceInfoList extends TeaModel {
        // 插件实例创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 插件拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 插件实例唯一标识。
        @NameInMap("PluginId")
        public String pluginId;

        // 插件唯一标识，取值：live-直播，wb-白板，chat-聊天，rtc。
        @NameInMap("PluginType")
        public String pluginType;

        public static CreateLiveRoomResponseBodyResultPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRoomResponseBodyResultPluginInstanceInfoList self = new CreateLiveRoomResponseBodyResultPluginInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public CreateLiveRoomResponseBodyResultPluginInstanceInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateLiveRoomResponseBodyResultPluginInstanceInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public CreateLiveRoomResponseBodyResultPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public CreateLiveRoomResponseBodyResultPluginInstanceInfoList setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

    }

    public static class CreateLiveRoomResponseBodyResult extends TeaModel {
        // 主播ID。
        @NameInMap("AnchorId")
        public String anchorId;

        // 主播昵称。
        @NameInMap("AnchorNick")
        public String anchorNick;

        // 应用ID。
        @NameInMap("AppId")
        public String appId;

        // RTS低延迟播流信息。
        @NameInMap("ArtcInfo")
        public CreateLiveRoomResponseBodyResultArtcInfo artcInfo;

        // 聊天ID。
        @NameInMap("ChatId")
        public String chatId;

        // 封面。
        @NameInMap("CoverUrl")
        public String coverUrl;

        // 直播拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 原画HLS播放地址。
        @NameInMap("HlsUrl")
        public String hlsUrl;

        // 直播ID。
        @NameInMap("LiveId")
        public String liveId;

        // 直播拉流地址。
        @NameInMap("LiveUrl")
        public String liveUrl;

        // 公告。
        @NameInMap("Notice")
        public String notice;

        // 直播回放地址。
        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        // 活跃插件列表。
        @NameInMap("PluginInstanceInfoList")
        public java.util.List<CreateLiveRoomResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList;

        // 直播推流地址。
        @NameInMap("PushUrl")
        public String pushUrl;

        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 标题。
        @NameInMap("Title")
        public String title;

        public static CreateLiveRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRoomResponseBodyResult self = new CreateLiveRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLiveRoomResponseBodyResult setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public CreateLiveRoomResponseBodyResult setAnchorNick(String anchorNick) {
            this.anchorNick = anchorNick;
            return this;
        }
        public String getAnchorNick() {
            return this.anchorNick;
        }

        public CreateLiveRoomResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateLiveRoomResponseBodyResult setArtcInfo(CreateLiveRoomResponseBodyResultArtcInfo artcInfo) {
            this.artcInfo = artcInfo;
            return this;
        }
        public CreateLiveRoomResponseBodyResultArtcInfo getArtcInfo() {
            return this.artcInfo;
        }

        public CreateLiveRoomResponseBodyResult setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public CreateLiveRoomResponseBodyResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public CreateLiveRoomResponseBodyResult setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public CreateLiveRoomResponseBodyResult setHlsUrl(String hlsUrl) {
            this.hlsUrl = hlsUrl;
            return this;
        }
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        public CreateLiveRoomResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public CreateLiveRoomResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public CreateLiveRoomResponseBodyResult setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public CreateLiveRoomResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public CreateLiveRoomResponseBodyResult setPluginInstanceInfoList(java.util.List<CreateLiveRoomResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList) {
            this.pluginInstanceInfoList = pluginInstanceInfoList;
            return this;
        }
        public java.util.List<CreateLiveRoomResponseBodyResultPluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

        public CreateLiveRoomResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public CreateLiveRoomResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public CreateLiveRoomResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
