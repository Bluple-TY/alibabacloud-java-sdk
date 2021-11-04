// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitComplexJobResponseBody extends TeaModel {
    @NameInMap("ComplexJob")
    public SubmitComplexJobResponseBodyComplexJob complexJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitComplexJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitComplexJobResponseBody self = new SubmitComplexJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitComplexJobResponseBody setComplexJob(SubmitComplexJobResponseBodyComplexJob complexJob) {
        this.complexJob = complexJob;
        return this;
    }
    public SubmitComplexJobResponseBodyComplexJob getComplexJob() {
        return this.complexJob;
    }

    public SubmitComplexJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("EffectConfig")
        public String effectConfig;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect setEffectConfig(String effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public String getEffectConfig() {
            return this.effectConfig;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects extends TeaModel {
        @NameInMap("Effect")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect> effect;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects setEffect(java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect> effect) {
            this.effect = effect;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffectsEffect> getEffect() {
            return this.effect;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip extends TeaModel {
        @NameInMap("Effects")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects effects;

        @NameInMap("Id")
        public String id;

        @NameInMap("In")
        public String in;

        @NameInMap("Out")
        public String out;

        @NameInMap("SourceID")
        public String sourceID;

        @NameInMap("SourceStrmMap")
        public String sourceStrmMap;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Type")
        public String type;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setEffects(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects effects) {
            this.effects = effects;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClipEffects getEffects() {
            return this.effects;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setSourceStrmMap(String sourceStrmMap) {
            this.sourceStrmMap = sourceStrmMap;
            return this;
        }
        public String getSourceStrmMap() {
            return this.sourceStrmMap;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip> clip;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList setClip(java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipListClip> getClip() {
            return this.clip;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio extends TeaModel {
        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Samplerate")
        public String samplerate;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo extends TeaModel {
        @NameInMap("BgColor")
        public String bgColor;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("IsGpuData")
        public String isGpuData;

        @NameInMap("IsOneTrackData")
        public String isOneTrackData;

        @NameInMap("ReclosePrec")
        public String reclosePrec;

        @NameInMap("RenderRatio")
        public String renderRatio;

        @NameInMap("Width")
        public String width;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setIsGpuData(String isGpuData) {
            this.isGpuData = isGpuData;
            return this;
        }
        public String getIsGpuData() {
            return this.isGpuData;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setIsOneTrackData(String isOneTrackData) {
            this.isOneTrackData = isOneTrackData;
            return this;
        }
        public String getIsOneTrackData() {
            return this.isOneTrackData;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setReclosePrec(String reclosePrec) {
            this.reclosePrec = reclosePrec;
            return this;
        }
        public String getReclosePrec() {
            return this.reclosePrec;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setRenderRatio(String renderRatio) {
            this.renderRatio = renderRatio;
            return this;
        }
        public String getRenderRatio() {
            return this.renderRatio;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig extends TeaModel {
        @NameInMap("TimelineConfigAudio")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio;

        @NameInMap("TimelineConfigVideo")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig setTimelineConfigAudio(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio) {
            this.timelineConfigAudio = timelineConfigAudio;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigAudio getTimelineConfigAudio() {
            return this.timelineConfigAudio;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig setTimelineConfigVideo(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo) {
            this.timelineConfigVideo = timelineConfigVideo;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfigTimelineConfigVideo getTimelineConfigVideo() {
            return this.timelineConfigVideo;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo extends TeaModel {
        @NameInMap("L")
        public String l;

        @NameInMap("T")
        public String t;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setL(String l) {
            this.l = l;
            return this;
        }
        public String getL() {
            return this.l;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig extends TeaModel {
        @NameInMap("ClipsConfigVideo")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig setClipsConfigVideo(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo) {
            this.clipsConfigVideo = clipsConfigVideo;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo getClipsConfigVideo() {
            return this.clipsConfigVideo;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip extends TeaModel {
        @NameInMap("ClipsConfig")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig;

        @NameInMap("In")
        public String in;

        @NameInMap("Out")
        public String out;

        @NameInMap("clipID")
        public String clipID;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setClipsConfig(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig) {
            this.clipsConfig = clipsConfig;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClipClipsConfig getClipsConfig() {
            return this.clipsConfig;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip setClipID(String clipID) {
            this.clipID = clipID;
            return this;
        }
        public String getClipID() {
            return this.clipID;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip> clip;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips setClip(java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClipsClip> getClip() {
            return this.clip;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack extends TeaModel {
        @NameInMap("Clips")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips clips;

        @NameInMap("Id")
        public String id;

        @NameInMap("Order")
        public String order;

        @NameInMap("Type")
        public String type;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setClips(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips clips) {
            this.clips = clips;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrackClips getClips() {
            return this.clips;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList extends TeaModel {
        @NameInMap("Track")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack> track;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList setTrack(java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack> track) {
            this.track = track;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackListTrack> getTrack() {
            return this.track;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline extends TeaModel {
        @NameInMap("TimelineConfig")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig timelineConfig;

        @NameInMap("TrackList")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList trackList;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline setTimelineConfig(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig timelineConfig) {
            this.timelineConfig = timelineConfig;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTimelineConfig getTimelineConfig() {
            return this.timelineConfig;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline setTrackList(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimelineTrackList getTrackList() {
            return this.trackList;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing extends TeaModel {
        @NameInMap("ClipList")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList clipList;

        @NameInMap("Timeline")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline timeline;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing setClipList(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList clipList) {
            this.clipList = clipList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingClipList getClipList() {
            return this.clipList;
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing setTimeline(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditingTimeline getTimeline() {
            return this.timeline;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs extends TeaModel {
        @NameInMap("Editing")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing editing;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs setEditing(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing editing) {
            this.editing = editing;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigsEditing getEditing() {
            return this.editing;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs extends TeaModel {
        @NameInMap("ComplexEditingConfigs")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs> complexEditingConfigs;

        public static SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs self = new SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs setComplexEditingConfigs(java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs> complexEditingConfigs) {
            this.complexEditingConfigs = complexEditingConfigs;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobComplexEditingConfigsComplexEditingConfigs> getComplexEditingConfigs() {
            return this.complexEditingConfigs;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig extends TeaModel {
        @NameInMap("DeinterlaceMethod")
        public String deinterlaceMethod;

        @NameInMap("IsNormalSar")
        public String isNormalSar;

        public static SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig self = new SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig setDeinterlaceMethod(String deinterlaceMethod) {
            this.deinterlaceMethod = deinterlaceMethod;
            return this;
        }
        public String getDeinterlaceMethod() {
            return this.deinterlaceMethod;
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig setIsNormalSar(String isNormalSar) {
            this.isNormalSar = isNormalSar;
            return this;
        }
        public String getIsNormalSar() {
            return this.isNormalSar;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile self = new SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("InputConfig")
        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig inputConfig;

        @NameInMap("InputFile")
        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile inputFile;

        public static SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput self = new SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput setInputConfig(SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput setInputFile(SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInputInputFile getInputFile() {
            return this.inputFile;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs extends TeaModel {
        @NameInMap("EditingInput")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput> editingInput;

        public static SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs self = new SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs setEditingInput(java.util.List<SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput> editingInput) {
            this.editingInput = editingInput;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputsEditingInput> getEditingInput() {
            return this.editingInput;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobInputsInputs extends TeaModel {
        @NameInMap("EditingInputs")
        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs editingInputs;

        public static SubmitComplexJobResponseBodyComplexJobInputsInputs build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobInputsInputs self = new SubmitComplexJobResponseBodyComplexJobInputsInputs();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobInputsInputs setEditingInputs(SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs editingInputs) {
            this.editingInputs = editingInputs;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobInputsInputsEditingInputs getEditingInputs() {
            return this.editingInputs;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobInputs extends TeaModel {
        @NameInMap("Inputs")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobInputsInputs> inputs;

        public static SubmitComplexJobResponseBodyComplexJobInputs build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobInputs self = new SubmitComplexJobResponseBodyComplexJobInputs();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobInputs setInputs(java.util.List<SubmitComplexJobResponseBodyComplexJobInputsInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobInputsInputs> getInputs() {
            return this.inputs;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobMNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MessageId")
        public String messageId;

        public static SubmitComplexJobResponseBodyComplexJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobMNSMessageResult self = new SubmitComplexJobResponseBodyComplexJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitComplexJobResponseBodyComplexJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitComplexJobResponseBodyComplexJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Method")
        public String method;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Volume")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume volume;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio setVolume(SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Seek")
        public String seek;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip extends TeaModel {
        @NameInMap("TimeSpan")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan timeSpan;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip setTimeSpan(SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark extends TeaModel {
        @NameInMap("Alpha")
        public String alpha;

        @NameInMap("InputFile")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile inputFile;

        @NameInMap("Type")
        public String type;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark setAlpha(String alpha) {
            this.alpha = alpha;
            return this;
        }
        public String getAlpha() {
            return this.alpha;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark setInputFile(SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("KeyUri")
        public String keyUri;

        @NameInMap("SkipCnt")
        public String skipCnt;

        @NameInMap("Type")
        public String type;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("Md5Support")
        public Boolean md5Support;

        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport extends TeaModel {
        @NameInMap("TS")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS TS;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport setTS(SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Start")
        public String start;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge> merge;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList setMerge(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif extends TeaModel {
        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        @NameInMap("Loop")
        public String loop;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif gif;

        @NameInMap("Segment")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment segment;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig setGif(SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigGif getGif() {
            return this.gif;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig setSegment(SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("Size")
        public String size;

        @NameInMap("StartTime")
        public String startTime;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList setAudioStream(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        @NameInMap("PreloadTime")
        public String preloadTime;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Height")
        public String height;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

        @NameInMap("NetworkCost")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Width")
        public String width;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList setVideoStream(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams extends TeaModel {
        @NameInMap("AudioStreamList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        @NameInMap("VideoStreamList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList videoStreamList;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams setAudioStreamList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams setSubtitleStreamList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams setVideoStreamList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Format")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("Streams")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams streams;

        @NameInMap("Width")
        public String width;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setFormat(SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setStreams(SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("Input")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle setInput(SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle> subtitle;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList setSubtitle(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig extends TeaModel {
        @NameInMap("ExtSubtitleList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList extSubtitleList;

        @NameInMap("SubtitleList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList subtitleList;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig setExtSubtitleList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig setSubtitleList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso extends TeaModel {
        @NameInMap("IsHalfSample")
        public String isHalfSample;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig extends TeaModel {
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("TransMode")
        public String transMode;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("MaxFps")
        public String maxFps;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("Width")
        public String width;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setBitrateBnd(SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Height")
        public String height;

        @NameInMap("InputFile")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Type")
        public String type;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Width")
        public String width;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setInputFile(SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark> waterMark;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList setWaterMark(java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJobTranscodeOutput extends TeaModel {
        @NameInMap("Audio")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("Clip")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip clip;

        @NameInMap("Container")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer container;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("DigiWaterMark")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark digiWaterMark;

        @NameInMap("Encryption")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption encryption;

        @NameInMap("M3U8NonStandardSupport")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("MergeList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList mergeList;

        @NameInMap("MuxConfig")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig muxConfig;

        @NameInMap("OutputFile")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile outputFile;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Properties")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties properties;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("SubtitleConfig")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig subtitleConfig;

        @NameInMap("SuperReso")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso superReso;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TransConfig")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig transConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Video")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo video;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("WaterMarkList")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList waterMarkList;

        public static SubmitComplexJobResponseBodyComplexJobTranscodeOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJobTranscodeOutput self = new SubmitComplexJobResponseBodyComplexJobTranscodeOutput();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setAudio(SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputAudio getAudio() {
            return this.audio;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setClip(SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputClip getClip() {
            return this.clip;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setContainer(SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer container) {
            this.container = container;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputContainer getContainer() {
            return this.container;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setDigiWaterMark(SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setEncryption(SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputEncryption getEncryption() {
            return this.encryption;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setM3U8NonStandardSupport(SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setMergeList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setMuxConfig(SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setOutputFile(SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setProperties(SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputProperties getProperties() {
            return this.properties;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setSubtitleConfig(SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setSuperReso(SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setTransConfig(SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setVideo(SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo video) {
            this.video = video;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputVideo getVideo() {
            return this.video;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput setWaterMarkList(SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

    }

    public static class SubmitComplexJobResponseBodyComplexJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ComplexEditingConfigs")
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs complexEditingConfigs;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Inputs")
        public SubmitComplexJobResponseBodyComplexJobInputs inputs;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MNSMessageResult")
        public SubmitComplexJobResponseBodyComplexJobMNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("transcodeOutput")
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput transcodeOutput;

        public static SubmitComplexJobResponseBodyComplexJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitComplexJobResponseBodyComplexJob self = new SubmitComplexJobResponseBodyComplexJob();
            return TeaModel.build(map, self);
        }

        public SubmitComplexJobResponseBodyComplexJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitComplexJobResponseBodyComplexJob setComplexEditingConfigs(SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs complexEditingConfigs) {
            this.complexEditingConfigs = complexEditingConfigs;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobComplexEditingConfigs getComplexEditingConfigs() {
            return this.complexEditingConfigs;
        }

        public SubmitComplexJobResponseBodyComplexJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitComplexJobResponseBodyComplexJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitComplexJobResponseBodyComplexJob setInputs(SubmitComplexJobResponseBodyComplexJobInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobInputs getInputs() {
            return this.inputs;
        }

        public SubmitComplexJobResponseBodyComplexJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitComplexJobResponseBodyComplexJob setMNSMessageResult(SubmitComplexJobResponseBodyComplexJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public SubmitComplexJobResponseBodyComplexJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitComplexJobResponseBodyComplexJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public SubmitComplexJobResponseBodyComplexJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitComplexJobResponseBodyComplexJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitComplexJobResponseBodyComplexJob setTranscodeOutput(SubmitComplexJobResponseBodyComplexJobTranscodeOutput transcodeOutput) {
            this.transcodeOutput = transcodeOutput;
            return this;
        }
        public SubmitComplexJobResponseBodyComplexJobTranscodeOutput getTranscodeOutput() {
            return this.transcodeOutput;
        }

    }

}
