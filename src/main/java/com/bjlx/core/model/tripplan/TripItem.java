package com.bjlx.core.model.tripplan;

import com.bjlx.core.model.activity.Activity;
import com.bjlx.core.model.poi.Hotel;
import com.bjlx.core.model.poi.Restaurant;
import com.bjlx.core.model.poi.Shopping;
import com.bjlx.core.model.poi.Viewspot;
import org.mongodb.morphia.annotations.Embedded;

/**
 * Created by pengyt on 2016/7/24.
 * 行程规划的项
 */
@Embedded
public class TripItem {

    /**
     * 行程项时间
     */
    private long tripTime;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 描述
     */
    private String desc;

    /**
     * 餐馆
     */
    private Restaurant restaurant;

    /**
     * 客栈酒店
     */
    private Hotel hotel;

    /**
     * 景点
     */
    private Viewspot viewspot;

    /**
     * 活动
     */
    private Activity activity;

    /**
     * 购物
     */
    private Shopping shopping;

    /**
     * 上一项时间，保证此项时间必须在上一项时间之后
     */
    private long lastTripTime;

    public long getTripTime() {
        return tripTime;
    }

    public void setTripTime(long tripTime) {
        this.tripTime = tripTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Viewspot getViewspot() {
        return viewspot;
    }

    public void setViewspot(Viewspot viewspot) {
        this.viewspot = viewspot;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Shopping getShopping() {
        return shopping;
    }

    public void setShopping(Shopping shopping) {
        this.shopping = shopping;
    }

    public long getLastTripTime() {
        return lastTripTime;
    }

    public void setLastTripTime(long lastTripTime) {
        this.lastTripTime = lastTripTime;
    }
}
