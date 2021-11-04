// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterMediaDetailPersonRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Images")
    public String images;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PersonLib")
    public String personLib;

    @NameInMap("PersonName")
    public String personName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RegisterMediaDetailPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaDetailPersonRequest self = new RegisterMediaDetailPersonRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMediaDetailPersonRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public RegisterMediaDetailPersonRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public RegisterMediaDetailPersonRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RegisterMediaDetailPersonRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterMediaDetailPersonRequest setPersonLib(String personLib) {
        this.personLib = personLib;
        return this;
    }
    public String getPersonLib() {
        return this.personLib;
    }

    public RegisterMediaDetailPersonRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public RegisterMediaDetailPersonRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegisterMediaDetailPersonRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
