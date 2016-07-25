package com.bjlx.core.model.guide;

import com.bjlx.core.model.misc.ImageItem;
import com.bjlx.core.model.poi.Hotel;
import com.bjlx.core.model.poi.Restaurant;
import com.bjlx.core.model.poi.Shopping;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * 攻略
 * Created by pengyt on 2015/10/21.
 */
@Entity
class Guide {

	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id = null;
	
	/**
	 * 封面图
	 */
	private ImageItem cover;

	/**
	 * 图集
	 */
	private List<ImageItem> images;

	/**
	 * 更新时间
	 */
	private Long updateTime;

	/**
	 * 攻略标题
	 */
	@NotBlank
	private String title;

	/**
	 * 攻略中去的poi
	 */
	private List<Hotel> hotels;

	/**
	 * 攻略中的购物
	 */
	private List<Shopping> shoppings;

	/**
	 * 攻略中的美食
	 */
	private List<Restaurant> restaurants;
	
	/**
	 * 攻略摘要
	 */
	private String summary;

	/**
	 * 攻略详情
	 */
	private String detailUrl;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ImageItem getCover() {
		return cover;
	}

	public void setCover(ImageItem cover) {
		this.cover = cover;
	}

	public List<ImageItem> getImages() {
		return images;
	}

	public void setImages(List<ImageItem> images) {
		this.images = images;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public List<Shopping> getShoppings() {
		return shoppings;
	}

	public void setShoppings(List<Shopping> shoppings) {
		this.shoppings = shoppings;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
}

