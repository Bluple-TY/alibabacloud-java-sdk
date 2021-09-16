// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDetectionTemplateRequest extends TeaModel {
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Period")
    public String period;

    public static ListDetectionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionTemplateRequest self = new ListDetectionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectionTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListDetectionTemplateRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

}
