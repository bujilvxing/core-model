package com.bjlx.core.model.misc;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class TravelNote {

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
	 * 评分, 值在0到1之间
	 */
	@Max(value = 1)
	@Min(value = 0)
	double rating = 0.0;
	
	@Min(value = 0)
	double hotness = 0.0;

	/**
	 * 游记标题
	 */
	@NotBlank
	private String title;

	/**
	 * 发表时间
	 */
	@NotNull
	private Date publishTime;

	/**
	 * 收藏次数
	 */
	@Min(value = 0)
	private int favorCnt = 0;

	/**
	 * 评论次数
	 */
	@Min(value = 0)
	private int commentCnt = 0;

	/**
	 * 浏览次数
	 */
	@Min(value = 0)
	private int viewCnt = 0;

	/**
	 * 分享次数
	 */
	@Min(value = 0)
	private int shareCnt = 0;

	/**
	 * 出游的时间
	 */
	@NotNull
	Date travelTime;

	/**
	 * 游记摘要
	 */
	@NotBlank
	String summary;

	/**
	 * 游记正文
	 */
	private List<Map<String, String>> contents;

	/**
	 * 游记来源
	 */
	private String source;

	/**
	 * 是否为精华游记
	 */
	private boolean essence = false;

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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getHotness() {
		return hotness;
	}

	public void setHotness(double hotness) {
		this.hotness = hotness;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public int getFavorCnt() {
		return favorCnt;
	}

	public void setFavorCnt(int favorCnt) {
		this.favorCnt = favorCnt;
	}

	public int getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getShareCnt() {
		return shareCnt;
	}

	public void setShareCnt(int shareCnt) {
		this.shareCnt = shareCnt;
	}

	public Date getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(Date travelTime) {
		this.travelTime = travelTime;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<Map<String, String>> getContents() {
		return contents;
	}

	public void setContents(List<Map<String, String>> contents) {
		this.contents = contents;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean isEssence() {
		return essence;
	}

	public void setEssence(boolean essence) {
		this.essence = essence;
	}

	public TravelNote(ObjectId id, ImageItem cover, List<ImageItem> images, double hotness, String title,
			Date publishTime, int commentCnt, Date travelTime, String summary, List<Map<String, String>> contents,
			String source, boolean essence) {
		super();
		this.id = id;
		this.cover = cover;
		this.images = images;
		this.hotness = hotness;
		this.title = title;
		this.publishTime = publishTime;
		this.commentCnt = commentCnt;
		this.travelTime = travelTime;
		this.summary = summary;
		this.contents = contents;
		this.source = source;
		this.essence = essence;
	}
	
}
