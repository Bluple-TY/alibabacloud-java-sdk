// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeWebhookContactsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public DescribeWebhookContactsResponseBodyPageBean pageBean;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebhookContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebhookContactsResponseBody self = new DescribeWebhookContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebhookContactsResponseBody setPageBean(DescribeWebhookContactsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public DescribeWebhookContactsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public DescribeWebhookContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook extends TeaModel {
        @NameInMap("BizHeaders")
        public java.util.Map<String, ?> bizHeaders;

        @NameInMap("BizParams")
        public java.util.Map<String, ?> bizParams;

        @NameInMap("Body")
        public String body;

        @NameInMap("Method")
        public String method;

        @NameInMap("RecoverBody")
        public String recoverBody;

        @NameInMap("Url")
        public String url;

        public static DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook self = new DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook();
            return TeaModel.build(map, self);
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setBizHeaders(java.util.Map<String, ?> bizHeaders) {
            this.bizHeaders = bizHeaders;
            return this;
        }
        public java.util.Map<String, ?> getBizHeaders() {
            return this.bizHeaders;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setBizParams(java.util.Map<String, ?> bizParams) {
            this.bizParams = bizParams;
            return this;
        }
        public java.util.Map<String, ?> getBizParams() {
            return this.bizParams;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setRecoverBody(String recoverBody) {
            this.recoverBody = recoverBody;
            return this;
        }
        public String getRecoverBody() {
            return this.recoverBody;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeWebhookContactsResponseBodyPageBeanWebhookContacts extends TeaModel {
        @NameInMap("Webhook")
        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook webhook;

        @NameInMap("WebhookId")
        public Float webhookId;

        @NameInMap("WebhookName")
        public String webhookName;

        public static DescribeWebhookContactsResponseBodyPageBeanWebhookContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebhookContactsResponseBodyPageBeanWebhookContacts self = new DescribeWebhookContactsResponseBodyPageBeanWebhookContacts();
            return TeaModel.build(map, self);
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContacts setWebhook(DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook webhook) {
            this.webhook = webhook;
            return this;
        }
        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook getWebhook() {
            return this.webhook;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContacts setWebhookId(Float webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Float getWebhookId() {
            return this.webhookId;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContacts setWebhookName(String webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public String getWebhookName() {
            return this.webhookName;
        }

    }

    public static class DescribeWebhookContactsResponseBodyPageBean extends TeaModel {
        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Total")
        public Long total;

        @NameInMap("WebhookContacts")
        public java.util.List<DescribeWebhookContactsResponseBodyPageBeanWebhookContacts> webhookContacts;

        public static DescribeWebhookContactsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebhookContactsResponseBodyPageBean self = new DescribeWebhookContactsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public DescribeWebhookContactsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeWebhookContactsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeWebhookContactsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeWebhookContactsResponseBodyPageBean setWebhookContacts(java.util.List<DescribeWebhookContactsResponseBodyPageBeanWebhookContacts> webhookContacts) {
            this.webhookContacts = webhookContacts;
            return this;
        }
        public java.util.List<DescribeWebhookContactsResponseBodyPageBeanWebhookContacts> getWebhookContacts() {
            return this.webhookContacts;
        }

    }

}
