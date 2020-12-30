// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryArtExtensionResponseBody extends TeaModel {
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("MaterialsAndTechniques")
    public String materialsAndTechniques;

    @NameInMap("InscriptionsAndMarkings")
    public String inscriptionsAndMarkings;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Reference")
    public String reference;

    @NameInMap("DateOrPeriod")
    public String dateOrPeriod;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Title")
    public String title;

    @NameInMap("Features")
    public String features;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Maker")
    public String maker;

    public static QueryArtExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryArtExtensionResponseBody self = new QueryArtExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryArtExtensionResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public QueryArtExtensionResponseBody setMaterialsAndTechniques(String materialsAndTechniques) {
        this.materialsAndTechniques = materialsAndTechniques;
        return this;
    }
    public String getMaterialsAndTechniques() {
        return this.materialsAndTechniques;
    }

    public QueryArtExtensionResponseBody setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
        this.inscriptionsAndMarkings = inscriptionsAndMarkings;
        return this;
    }
    public String getInscriptionsAndMarkings() {
        return this.inscriptionsAndMarkings;
    }

    public QueryArtExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryArtExtensionResponseBody setReference(String reference) {
        this.reference = reference;
        return this;
    }
    public String getReference() {
        return this.reference;
    }

    public QueryArtExtensionResponseBody setDateOrPeriod(String dateOrPeriod) {
        this.dateOrPeriod = dateOrPeriod;
        return this;
    }
    public String getDateOrPeriod() {
        return this.dateOrPeriod;
    }

    public QueryArtExtensionResponseBody setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public QueryArtExtensionResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryArtExtensionResponseBody setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public QueryArtExtensionResponseBody setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public QueryArtExtensionResponseBody setMaker(String maker) {
        this.maker = maker;
        return this;
    }
    public String getMaker() {
        return this.maker;
    }

}
