// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponseBody extends TeaModel {
    // Details about the vulnerability.
    @NameInMap("Cves")
    public java.util.List<DescribeVulDetailsResponseBodyCves> cves;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVulDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsResponseBody self = new DescribeVulDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsResponseBody setCves(java.util.List<DescribeVulDetailsResponseBodyCves> cves) {
        this.cves = cves;
        return this;
    }
    public java.util.List<DescribeVulDetailsResponseBodyCves> getCves() {
        return this.cves;
    }

    public DescribeVulDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVulDetailsResponseBodyCves extends TeaModel {
        // The ID of the vulnerability.
        @NameInMap("CveId")
        public String cveId;

        // The Common Vulnerability Scoring System (CVSS) score of the vulnerability, which indicates the severity of the vulnerability. A larger value indicates a higher severity. Valid values: 0 to 10.
        @NameInMap("CvssScore")
        public String cvssScore;

        // The description of the vulnerability.
        @NameInMap("Summary")
        public String summary;

        // The name of the vulnerability.
        @NameInMap("Title")
        public String title;

        public static DescribeVulDetailsResponseBodyCves build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseBodyCves self = new DescribeVulDetailsResponseBodyCves();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseBodyCves setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulDetailsResponseBodyCves setCvssScore(String cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }
        public String getCvssScore() {
            return this.cvssScore;
        }

        public DescribeVulDetailsResponseBodyCves setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeVulDetailsResponseBodyCves setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
