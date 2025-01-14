// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeBusinessCardResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeBusinessCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessCardResponseBody self = new RecognizeBusinessCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessCardResponseBody setData(RecognizeBusinessCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeBusinessCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeBusinessCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeBusinessCardResponseBodyData extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        @NameInMap("CellPhoneNumbers")
        public java.util.List<String> cellPhoneNumbers;

        @NameInMap("Companies")
        public java.util.List<String> companies;

        @NameInMap("Departments")
        public java.util.List<String> departments;

        @NameInMap("Emails")
        public java.util.List<String> emails;

        @NameInMap("Name")
        public String name;

        @NameInMap("OfficePhoneNumbers")
        public java.util.List<String> officePhoneNumbers;

        @NameInMap("Titles")
        public java.util.List<String> titles;

        public static RecognizeBusinessCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessCardResponseBodyData self = new RecognizeBusinessCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessCardResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public RecognizeBusinessCardResponseBodyData setCellPhoneNumbers(java.util.List<String> cellPhoneNumbers) {
            this.cellPhoneNumbers = cellPhoneNumbers;
            return this;
        }
        public java.util.List<String> getCellPhoneNumbers() {
            return this.cellPhoneNumbers;
        }

        public RecognizeBusinessCardResponseBodyData setCompanies(java.util.List<String> companies) {
            this.companies = companies;
            return this;
        }
        public java.util.List<String> getCompanies() {
            return this.companies;
        }

        public RecognizeBusinessCardResponseBodyData setDepartments(java.util.List<String> departments) {
            this.departments = departments;
            return this;
        }
        public java.util.List<String> getDepartments() {
            return this.departments;
        }

        public RecognizeBusinessCardResponseBodyData setEmails(java.util.List<String> emails) {
            this.emails = emails;
            return this;
        }
        public java.util.List<String> getEmails() {
            return this.emails;
        }

        public RecognizeBusinessCardResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeBusinessCardResponseBodyData setOfficePhoneNumbers(java.util.List<String> officePhoneNumbers) {
            this.officePhoneNumbers = officePhoneNumbers;
            return this;
        }
        public java.util.List<String> getOfficePhoneNumbers() {
            return this.officePhoneNumbers;
        }

        public RecognizeBusinessCardResponseBodyData setTitles(java.util.List<String> titles) {
            this.titles = titles;
            return this;
        }
        public java.util.List<String> getTitles() {
            return this.titles;
        }

    }

}
