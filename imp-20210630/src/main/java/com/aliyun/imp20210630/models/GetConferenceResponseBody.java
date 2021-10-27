// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetConferenceResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetConferenceResponseBodyResult result;

    public static GetConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConferenceResponseBody self = new GetConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConferenceResponseBody setResult(GetConferenceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetConferenceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetConferenceResponseBodyResult extends TeaModel {
        // 租户名
        @NameInMap("AppId")
        public String appId;

        // 会议资源唯一标识。
        @NameInMap("ConferenceId")
        public String conferenceId;

        // 会议创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 录制回放地址，m3u8格式，会议结束后10秒才会生成。
        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 会议状态。
        @NameInMap("Status")
        public String status;

        // 会议标题。
        @NameInMap("Title")
        public String title;

        // 创建会议用户。
        @NameInMap("UserId")
        public String userId;

        public static GetConferenceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetConferenceResponseBodyResult self = new GetConferenceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetConferenceResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetConferenceResponseBodyResult setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public GetConferenceResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetConferenceResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public GetConferenceResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetConferenceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetConferenceResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetConferenceResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
