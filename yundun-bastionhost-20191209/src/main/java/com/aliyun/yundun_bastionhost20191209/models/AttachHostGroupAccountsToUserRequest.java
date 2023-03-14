// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserRequest extends TeaModel {
    /**
     * <p>The ID of the host group and the name of the host account that you want to authorize the user to manage. You can specify up to 10 host group IDs and up to 10 host account names for each host group. You can specify only host group IDs. In this case, the user is authorized to manage only the specified host groups. For more information about this parameter, see the "Description of the HostGroups parameter" section of this topic.</p>
     * <br>
     * <p>>  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group and the [ListHostAccounts](~~204372~~) operation to query the name of the host account.</p>
     */
    @NameInMap("HostGroups")
    public String hostGroups;

    /**
     * <p>The ID of the bastion host for which you want to authorize the user to manage the specified host groups and host accounts.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host for which you want to authorize the user to manage the specified host groups and host accounts.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user that you want to authorize to manage the specified host groups and host accounts.</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AttachHostGroupAccountsToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserRequest self = new AttachHostGroupAccountsToUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserRequest setHostGroups(String hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public String getHostGroups() {
        return this.hostGroups;
    }

    public AttachHostGroupAccountsToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostGroupAccountsToUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostGroupAccountsToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
