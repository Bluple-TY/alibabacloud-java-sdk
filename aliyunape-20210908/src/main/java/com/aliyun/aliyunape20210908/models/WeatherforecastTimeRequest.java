// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeatherforecastTimeRequest extends TeaModel {
    // 20210809090000
    @NameInMap("CurHour")
    public String curHour;

    // 纬度，范围为（15°N~59.95°N
    @NameInMap("Lat")
    public String lat;

    // 经度，范围为（70°E~139.96°E）
    @NameInMap("Lon")
    public String lon;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    public static WeatherforecastTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        WeatherforecastTimeRequest self = new WeatherforecastTimeRequest();
        return TeaModel.build(map, self);
    }

    public WeatherforecastTimeRequest setCurHour(String curHour) {
        this.curHour = curHour;
        return this;
    }
    public String getCurHour() {
        return this.curHour;
    }

    public WeatherforecastTimeRequest setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public WeatherforecastTimeRequest setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public WeatherforecastTimeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
