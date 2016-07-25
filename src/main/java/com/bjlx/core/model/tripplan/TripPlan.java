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
    private Long ownerId;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 行程项列表
     */
    private List<TripItem> tripItems;

    /**
     * 转发次数
     */
    private Integer shareCnt;

    /**
     * 转发者id
     */
    private Long forwordId;

    /**
     * 热度
     */
    private Double hotness;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public List<TripItem> getTripItems() {
        return tripItems;
    }

    public void setTripItems(List<TripItem> tripItems) {
        this.tripItems = tripItems;
    }

    public Integer getShareCnt() {
        return shareCnt;
    }

    public void setShareCnt(Integer shareCnt) {
        this.shareCnt = shareCnt;
    }

    public Long getForwordId() {
        return forwordId;
    }

    public void setForwordId(Long forwordId) {
        this.forwordId = forwordId;
    }

    public Double getHotness() {
        return hotness;
    }

    public void setHotness(Double hotness) {
        this.hotness = hotness;
    }

    public TripPlan(ObjectId id, Long ownerId, Long createTime, List<TripItem> tripItems) {
        this.id = id;
        this.ownerId = ownerId;
        this.createTime = createTime;
        this.tripItems = tripItems;
    }
}
