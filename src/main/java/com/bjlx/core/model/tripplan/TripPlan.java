package com.bjlx.core.model.tripplan;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

import java.util.List;

/**
 * Created by pengyt on 2016/7/24.
 * 行程规划
 */
@Entity
public class TripPlan {

    /**
     * 主键
     */
    private ObjectId id;

    /**
     * 行程规划的id
     */
    private long ownerId;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 行程项列表
     */
    private List<TripItem> tripItems;

    /**
     * 转发次数
     */
    private int shareCnt;

    /**
     * 转发者id
     */
    private long forwordId;

    /**
     * 热度
     */
    private double hotness;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public List<TripItem> getTripItems() {
        return tripItems;
    }

    public void setTripItems(List<TripItem> tripItems) {
        this.tripItems = tripItems;
    }

    public int getShareCnt() {
        return shareCnt;
    }

    public void setShareCnt(int shareCnt) {
        this.shareCnt = shareCnt;
    }

    public long getForwordId() {
        return forwordId;
    }

    public void setForwordId(long forwordId) {
        this.forwordId = forwordId;
    }

    public double getHotness() {
        return hotness;
    }

    public void setHotness(double hotness) {
        this.hotness = hotness;
    }

    public TripPlan(ObjectId id, long ownerId, long createTime, List<TripItem> tripItems) {
        this.id = id;
        this.ownerId = ownerId;
        this.createTime = createTime;
        this.tripItems = tripItems;
    }
}
