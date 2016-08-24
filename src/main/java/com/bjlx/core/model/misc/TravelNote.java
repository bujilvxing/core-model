package com.bjlx.core.model.misc;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
	Double rating = 0.0;
	
	@Min(value = 0)
	Double hotness = 0.0;

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
	private Integer favorCnt = 0;

	/**
	 * 评论次数
	 */
	@Min(value = 0)
	private Integer commentCnt = 0;

	/**
	 * 浏览次数
	 */
	@Min(value = 0)
	private Integer viewCnt = 0;

	/**
	 * 分享次数
	 */
	@Min(value = 0)
	private Integer shareCnt = 0;

	/**
	 * 出游的时间
	 */
	@NotNull
	Long travelTime;

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
	private Boolean essence = false;

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

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getHotness() {
		return hotness;
	}

	public void setHotness(Double hotness) {
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

	public Integer getFavorCnt() {
		return favorCnt;
	}

	public void setFavorCnt(Integer favorCnt) {
		this.favorCnt = favorCnt;
	}

	public Integer getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}

	public Integer getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(Integer viewCnt) {
		this.viewCnt = viewCnt;
	}

	public Integer getShareCnt() {
		return shareCnt;
	}

	public void setShareCnt(Integer shareCnt) {
		this.shareCnt = shareCnt;
	}

	public Long getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(Long travelTime) {
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

	public Boolean isEssence() {
		return essence;
	}

	public void setEssence(Boolean essence) {
		this.essence = essence;
	}

	public TravelNote(ObjectId id, ImageItem cover, List<ImageItem> images, Double hotness, String title,
			Date publishTime, Integer commentCnt, Long travelTime, String summary, List<Map<String, String>> contents,
			String source, Boolean essence) {
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
