// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public GetImageResponseBodyData data;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setData(GetImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageResponseBodyData getData() {
        return this.data;
    }

    public GetImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetImageResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageResponseBodyData extends TeaModel {
        // The full name of the current cluster image version. The full name is in the X.X.X.X format.
        @NameInMap("CurrentVersionFullShowName")
        public String currentVersionFullShowName;

        // The URL of change logs for the latest version that can be updated to.
        @NameInMap("MaxVersionChangelogUrl")
        public String maxVersionChangelogUrl;

        // The code of the latest version that can be updated to.
        @NameInMap("MaxVersionCode")
        public String maxVersionCode;

        // The full name of the latest version that can be updated to.
        @NameInMap("MaxVersionFullShowName")
        public String maxVersionFullShowName;

        public static GetImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyData self = new GetImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyData setCurrentVersionFullShowName(String currentVersionFullShowName) {
            this.currentVersionFullShowName = currentVersionFullShowName;
            return this;
        }
        public String getCurrentVersionFullShowName() {
            return this.currentVersionFullShowName;
        }

        public GetImageResponseBodyData setMaxVersionChangelogUrl(String maxVersionChangelogUrl) {
            this.maxVersionChangelogUrl = maxVersionChangelogUrl;
            return this;
        }
        public String getMaxVersionChangelogUrl() {
            return this.maxVersionChangelogUrl;
        }

        public GetImageResponseBodyData setMaxVersionCode(String maxVersionCode) {
            this.maxVersionCode = maxVersionCode;
            return this;
        }
        public String getMaxVersionCode() {
            return this.maxVersionCode;
        }

        public GetImageResponseBodyData setMaxVersionFullShowName(String maxVersionFullShowName) {
            this.maxVersionFullShowName = maxVersionFullShowName;
            return this;
        }
        public String getMaxVersionFullShowName() {
            return this.maxVersionFullShowName;
        }

    }

}
