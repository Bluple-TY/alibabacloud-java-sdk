// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamRequest extends TeaModel {
    // The job IDs for deleting media streams.
    // 
    // *   Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified for one video.
    // *   You can obtain job IDs from the PlayInfo parameter that is returned after you call the [GetPlayInfo](~~56124~~) operation. Each media stream has a unique job ID.
    @NameInMap("JobIds")
    public String jobIds;

    // The ID of the video.
    @NameInMap("VideoId")
    public String videoId;

    public static DeleteStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamRequest self = new DeleteStreamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public DeleteStreamRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
