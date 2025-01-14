// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupTagListRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDeviceGroupTagListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupTagListRequest self = new QueryDeviceGroupTagListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupTagListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryDeviceGroupTagListRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryDeviceGroupTagListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
