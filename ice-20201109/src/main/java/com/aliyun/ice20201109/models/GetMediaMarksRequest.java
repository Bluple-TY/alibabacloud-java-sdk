// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaMarksRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    public static GetMediaMarksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMarksRequest self = new GetMediaMarksRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaMarksRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaMarksRequest setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

}
