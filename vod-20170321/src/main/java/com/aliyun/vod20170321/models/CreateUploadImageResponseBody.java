// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageResponseBody extends TeaModel {
    // The OSS URL of the file. The URL does not contain the information used for URL signing. You can set FileUrl to this URL when you call the [AddWatermark](~~98617~~) operation.
    @NameInMap("FileURL")
    public String fileURL;

    // The ID of the image file.
    @NameInMap("ImageId")
    public String imageId;

    // The URL of the image.
    // 
    // > If you enable the URL signing feature in ApsaraVideo VOD, the returned URL may not be accessible from a browser and an HTTP 403 status code may be returned. To resolve this issue, you can disable the [URL signing](~~86090~~) feature or [generate a signed URL](~~57007~~).
    @NameInMap("ImageURL")
    public String imageURL;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The upload URL.
    // 
    // > The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAddress only if you use the OSS SDK or call an OSS API operation to upload media files.
    @NameInMap("UploadAddress")
    public String uploadAddress;

    // The upload credential.
    // 
    // > The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded credential before you use an SDK or call an API operation to upload media files. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload media files.
    @NameInMap("UploadAuth")
    public String uploadAuth;

    public static CreateUploadImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageResponseBody self = new CreateUploadImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadImageResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateUploadImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateUploadImageResponseBody setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public CreateUploadImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadImageResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadImageResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
