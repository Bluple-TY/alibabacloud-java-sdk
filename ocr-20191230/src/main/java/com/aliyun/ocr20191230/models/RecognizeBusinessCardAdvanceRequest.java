// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessCardAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RecognizeBusinessCardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessCardAdvanceRequest self = new RecognizeBusinessCardAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessCardAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
