// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The Object Storage Service (OSS) URL of the watermark file. You must set this parameter if you add image watermarks.</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The name of the watermark. Only letters and digits are supported.</p>
     * <p>*   The name can be up to 128 bytes in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the watermark. Valid values:</p>
     * <p>*   **Image**: This is the default value.</p>
     * <p>*   **Text**</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The configurations such as the position and effect of the text watermark or image watermark. The value is a JSON-formatted string.</p>
     * <p>> The value of this parameter varies with the watermark type. For more information about the data structure, see the "WatermarkConfig" section of the [Media processing parameters](~~98618~~) topic.</p>
     */
    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    public static AddWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkRequest self = new AddWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public AddWatermarkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddWatermarkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AddWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWatermarkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddWatermarkRequest setWatermarkConfig(String watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

}
