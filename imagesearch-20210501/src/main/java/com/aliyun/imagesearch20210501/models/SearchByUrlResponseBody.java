// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByUrlResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public SearchByUrlResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PicInfo")
    public SearchByUrlResponseBodyPicInfo picInfo;

    public static SearchByUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchByUrlResponseBody self = new SearchByUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchByUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchByUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchByUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchByUrlResponseBody setData(SearchByUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchByUrlResponseBodyData getData() {
        return this.data;
    }

    public SearchByUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchByUrlResponseBody setPicInfo(SearchByUrlResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchByUrlResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public static class SearchByUrlResponseBodyDataAuctionsResult extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Pic")
        public String pic;

        @NameInMap("Price")
        public String price;

        @NameInMap("PromotionPrice")
        public String promotionPrice;

        @NameInMap("PriceAfterCoupon")
        public String priceAfterCoupon;

        @NameInMap("UserType")
        public Integer userType;

        @NameInMap("Provcity")
        public String provcity;

        @NameInMap("SellerNickName")
        public String sellerNickName;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("MonthSellCount")
        public Integer monthSellCount;

        @NameInMap("LevelOneCategoryName")
        public String levelOneCategoryName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CouponActivityId")
        public String couponActivityId;

        @NameInMap("CouponTotalCount")
        public String couponTotalCount;

        @NameInMap("CouponSendCount")
        public String couponSendCount;

        @NameInMap("CouponRemainCount")
        public Integer couponRemainCount;

        @NameInMap("CouponStartTime")
        public String couponStartTime;

        @NameInMap("CouponEndTime")
        public String couponEndTime;

        @NameInMap("CouponStartFee")
        public String couponStartFee;

        @NameInMap("CouponAmount")
        public Integer couponAmount;

        @NameInMap("CouponSaleTextInfo")
        public String couponSaleTextInfo;

        @NameInMap("CalTkRate")
        public String calTkRate;

        @NameInMap("CouponShareUrl")
        public String couponShareUrl;

        @NameInMap("ClickUrl")
        public String clickUrl;

        @NameInMap("ShortUrl")
        public String shortUrl;

        public static SearchByUrlResponseBodyDataAuctionsResult build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyDataAuctionsResult self = new SearchByUrlResponseBodyDataAuctionsResult();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyDataAuctionsResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setPic(String pic) {
            this.pic = pic;
            return this;
        }
        public String getPic() {
            return this.pic;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setPriceAfterCoupon(String priceAfterCoupon) {
            this.priceAfterCoupon = priceAfterCoupon;
            return this;
        }
        public String getPriceAfterCoupon() {
            return this.priceAfterCoupon;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setProvcity(String provcity) {
            this.provcity = provcity;
            return this;
        }
        public String getProvcity() {
            return this.provcity;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setSellerNickName(String sellerNickName) {
            this.sellerNickName = sellerNickName;
            return this;
        }
        public String getSellerNickName() {
            return this.sellerNickName;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setMonthSellCount(Integer monthSellCount) {
            this.monthSellCount = monthSellCount;
            return this;
        }
        public Integer getMonthSellCount() {
            return this.monthSellCount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setLevelOneCategoryName(String levelOneCategoryName) {
            this.levelOneCategoryName = levelOneCategoryName;
            return this;
        }
        public String getLevelOneCategoryName() {
            return this.levelOneCategoryName;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponActivityId(String couponActivityId) {
            this.couponActivityId = couponActivityId;
            return this;
        }
        public String getCouponActivityId() {
            return this.couponActivityId;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponTotalCount(String couponTotalCount) {
            this.couponTotalCount = couponTotalCount;
            return this;
        }
        public String getCouponTotalCount() {
            return this.couponTotalCount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponSendCount(String couponSendCount) {
            this.couponSendCount = couponSendCount;
            return this;
        }
        public String getCouponSendCount() {
            return this.couponSendCount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponRemainCount(Integer couponRemainCount) {
            this.couponRemainCount = couponRemainCount;
            return this;
        }
        public Integer getCouponRemainCount() {
            return this.couponRemainCount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponStartTime(String couponStartTime) {
            this.couponStartTime = couponStartTime;
            return this;
        }
        public String getCouponStartTime() {
            return this.couponStartTime;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponEndTime(String couponEndTime) {
            this.couponEndTime = couponEndTime;
            return this;
        }
        public String getCouponEndTime() {
            return this.couponEndTime;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponStartFee(String couponStartFee) {
            this.couponStartFee = couponStartFee;
            return this;
        }
        public String getCouponStartFee() {
            return this.couponStartFee;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponAmount(Integer couponAmount) {
            this.couponAmount = couponAmount;
            return this;
        }
        public Integer getCouponAmount() {
            return this.couponAmount;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponSaleTextInfo(String couponSaleTextInfo) {
            this.couponSaleTextInfo = couponSaleTextInfo;
            return this;
        }
        public String getCouponSaleTextInfo() {
            return this.couponSaleTextInfo;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCalTkRate(String calTkRate) {
            this.calTkRate = calTkRate;
            return this;
        }
        public String getCalTkRate() {
            return this.calTkRate;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setCouponShareUrl(String couponShareUrl) {
            this.couponShareUrl = couponShareUrl;
            return this;
        }
        public String getCouponShareUrl() {
            return this.couponShareUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setClickUrl(String clickUrl) {
            this.clickUrl = clickUrl;
            return this;
        }
        public String getClickUrl() {
            return this.clickUrl;
        }

        public SearchByUrlResponseBodyDataAuctionsResult setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

    }

    public static class SearchByUrlResponseBodyDataAuctions extends TeaModel {
        @NameInMap("Result")
        public SearchByUrlResponseBodyDataAuctionsResult result;

        @NameInMap("RankScore")
        public Float rankScore;

        public static SearchByUrlResponseBodyDataAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyDataAuctions self = new SearchByUrlResponseBodyDataAuctions();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyDataAuctions setResult(SearchByUrlResponseBodyDataAuctionsResult result) {
            this.result = result;
            return this;
        }
        public SearchByUrlResponseBodyDataAuctionsResult getResult() {
            return this.result;
        }

        public SearchByUrlResponseBodyDataAuctions setRankScore(Float rankScore) {
            this.rankScore = rankScore;
            return this;
        }
        public Float getRankScore() {
            return this.rankScore;
        }

    }

    public static class SearchByUrlResponseBodyData extends TeaModel {
        @NameInMap("Auctions")
        public java.util.List<SearchByUrlResponseBodyDataAuctions> auctions;

        public static SearchByUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyData self = new SearchByUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyData setAuctions(java.util.List<SearchByUrlResponseBodyDataAuctions> auctions) {
            this.auctions = auctions;
            return this;
        }
        public java.util.List<SearchByUrlResponseBodyDataAuctions> getAuctions() {
            return this.auctions;
        }

    }

    public static class SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId extends TeaModel {
        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("Score")
        public Float score;

        public static SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId self = new SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class SearchByUrlResponseBodyPicInfoMainRegion extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("MultiCategoryId")
        public java.util.List<SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId> multiCategoryId;

        public static SearchByUrlResponseBodyPicInfoMainRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfoMainRegion self = new SearchByUrlResponseBodyPicInfoMainRegion();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfoMainRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchByUrlResponseBodyPicInfoMainRegion setMultiCategoryId(java.util.List<SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId> multiCategoryId) {
            this.multiCategoryId = multiCategoryId;
            return this;
        }
        public java.util.List<SearchByUrlResponseBodyPicInfoMainRegionMultiCategoryId> getMultiCategoryId() {
            return this.multiCategoryId;
        }

    }

    public static class SearchByUrlResponseBodyPicInfoMultiRegion extends TeaModel {
        @NameInMap("Region")
        public String region;

        public static SearchByUrlResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfoMultiRegion self = new SearchByUrlResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SearchByUrlResponseBodyPicInfo extends TeaModel {
        @NameInMap("MainRegion")
        public SearchByUrlResponseBodyPicInfoMainRegion mainRegion;

        @NameInMap("MultiRegion")
        public java.util.List<SearchByUrlResponseBodyPicInfoMultiRegion> multiRegion;

        public static SearchByUrlResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchByUrlResponseBodyPicInfo self = new SearchByUrlResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchByUrlResponseBodyPicInfo setMainRegion(SearchByUrlResponseBodyPicInfoMainRegion mainRegion) {
            this.mainRegion = mainRegion;
            return this;
        }
        public SearchByUrlResponseBodyPicInfoMainRegion getMainRegion() {
            return this.mainRegion;
        }

        public SearchByUrlResponseBodyPicInfo setMultiRegion(java.util.List<SearchByUrlResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<SearchByUrlResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

    }

}
