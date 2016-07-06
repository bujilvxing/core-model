package com.bjlx.core.model.account;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Id;

/**
 * 用户收藏
 * @author xiaozhi
 *
 */
public class Favorite {
	
	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id = null;
	
	/**
	 * 用户ID
	 */
	@NotNull
	@Min(value = 1)
	private long userId;

	/**
	 * 用户收藏的足迹
	 */
	private List<ObjectId> traces;
	
	/**
	 * 用户收藏的形成规划
	 */
	private List<ObjectId> tripPlans;
	
	/**
	 * 用户收藏的活动
	 */
	private List<ObjectId>  activities;
	
	/**
	 * 用户收藏的问答
	 */
	private List<ObjectId>  quoras;
	
	/**
	 * 用户收藏的美食
	 */
	private List<ObjectId>  restaurants;
	
	/**
	 * 用户收藏的客栈
	 */
	private List<ObjectId>  hotels;
	
	/**
	 * 用户收藏的游记
	 */
	private List<ObjectId>  travelNotes;
	
	/**
	 * 用户收藏的商品
	 */
	private List<ObjectId>  commodities;
	
	/**
	 * 用户收藏的景点
	 */
	private List<ObjectId>  viewspots;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public List<ObjectId> getTraces() {
		return traces;
	}

	public void setTraces(List<ObjectId> traces) {
		this.traces = traces;
	}

	public List<ObjectId> getTripPlans() {
		return tripPlans;
	}

	public void setTripPlans(List<ObjectId> tripPlans) {
		this.tripPlans = tripPlans;
	}

	public List<ObjectId> getActivities() {
		return activities;
	}

	public void setActivities(List<ObjectId> activities) {
		this.activities = activities;
	}

	public List<ObjectId> getQuoras() {
		return quoras;
	}

	public void setQuoras(List<ObjectId> quoras) {
		this.quoras = quoras;
	}

	public List<ObjectId> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<ObjectId> restaurants) {
		this.restaurants = restaurants;
	}

	public List<ObjectId> getHotels() {
		return hotels;
	}

	public void setHotels(List<ObjectId> hotels) {
		this.hotels = hotels;
	}

	public List<ObjectId> getTravelNotes() {
		return travelNotes;
	}

	public void setTravelNotes(List<ObjectId> travelNotes) {
		this.travelNotes = travelNotes;
	}

	public List<ObjectId> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<ObjectId> commodities) {
		this.commodities = commodities;
	}

	public List<ObjectId> getViewspots() {
		return viewspots;
	}

	public void setViewspots(List<ObjectId> viewspots) {
		this.viewspots = viewspots;
	}
	
	
}
