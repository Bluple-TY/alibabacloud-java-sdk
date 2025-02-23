// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTopUrlVisitResponseBody extends TeaModel {
    // A list of frequently requested URLs.
    @NameInMap("AllUrlList")
    public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList allUrlList;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    // A list of URLs for which 2xx status codes were returned.
    @NameInMap("Url200List")
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl200List url200List;

    // A list of URLs for which 3xx status codes were returned.
    @NameInMap("Url300List")
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl300List url300List;

    // A list of URLs for which 4xx status codes were returned.
    @NameInMap("Url400List")
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl400List url400List;

    // A list of URLs for which 5xx status codes were returned.
    @NameInMap("Url500List")
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl500List url500List;

    public static DescribeDomainSrcTopUrlVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcTopUrlVisitResponseBody self = new DescribeDomainSrcTopUrlVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setAllUrlList(DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList allUrlList) {
        this.allUrlList = allUrlList;
        return this;
    }
    public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList getAllUrlList() {
        return this.allUrlList;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setUrl200List(DescribeDomainSrcTopUrlVisitResponseBodyUrl200List url200List) {
        this.url200List = url200List;
        return this;
    }
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl200List getUrl200List() {
        return this.url200List;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setUrl300List(DescribeDomainSrcTopUrlVisitResponseBodyUrl300List url300List) {
        this.url300List = url300List;
        return this;
    }
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl300List getUrl300List() {
        return this.url300List;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setUrl400List(DescribeDomainSrcTopUrlVisitResponseBodyUrl400List url400List) {
        this.url400List = url400List;
        return this;
    }
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl400List getUrl400List() {
        return this.url400List;
    }

    public DescribeDomainSrcTopUrlVisitResponseBody setUrl500List(DescribeDomainSrcTopUrlVisitResponseBodyUrl500List url500List) {
        this.url500List = url500List;
        return this;
    }
    public DescribeDomainSrcTopUrlVisitResponseBodyUrl500List getUrl500List() {
        return this.url500List;
    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList extends TeaModel {
        // The amount of network traffic. Unit: bytes.
        @NameInMap("Flow")
        public String flow;

        // The proportion of network traffic consumed to access the URL.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the URL.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList self = new DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList> urlList;

        public static DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList self = new DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyAllUrlList setUrlList(java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyAllUrlListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList extends TeaModel {
        // The amount of network traffic. Unit: bytes.
        @NameInMap("Flow")
        public String flow;

        // The proportion of network traffic consumed to access the URL.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the URL.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl200List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList> urlList;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl200List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl200List self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl200List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl200List setUrlList(java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl200ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList extends TeaModel {
        // The amount of network traffic. Unit: bytes.
        @NameInMap("Flow")
        public String flow;

        // The proportion of network traffic consumed to access the URL.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the URL.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl300List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList> urlList;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl300List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl300List self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl300List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl300List setUrlList(java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl300ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList extends TeaModel {
        // The amount of network traffic. Unit: bytes.
        @NameInMap("Flow")
        public String flow;

        // The proportion of network traffic consumed to access the URL.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the URL.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl400List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList> urlList;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl400List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl400List self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl400List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl400List setUrlList(java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl400ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList extends TeaModel {
        // The network traffic consumed to visit the URL, in bytes.
        @NameInMap("Flow")
        public String flow;

        // The proportion of network traffic consumed to access the URL.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the URL.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainSrcTopUrlVisitResponseBodyUrl500List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList> urlList;

        public static DescribeDomainSrcTopUrlVisitResponseBodyUrl500List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcTopUrlVisitResponseBodyUrl500List self = new DescribeDomainSrcTopUrlVisitResponseBodyUrl500List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcTopUrlVisitResponseBodyUrl500List setUrlList(java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainSrcTopUrlVisitResponseBodyUrl500ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

}
