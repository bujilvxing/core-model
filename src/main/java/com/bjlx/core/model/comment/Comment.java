package com.bjlx.core.model.comment;

import com.bjlx.core.model.misc.ImageItem;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Comment {

	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id = null;
	
	/**
	 * 评分
	 */
	@Min(value = 0)
	private Double rating = 0.0;
	
	/**
	 * 用户ID
	 */
	@NotNull
	@Min(value = 1)
	private Long userId = 0L;

	/**
	 * 用户头像
	 */
	private ImageItem avatar;

	/**
	 * 用户昵称
	 */
	private String name;

	/**
	 * 评价的详情
	 */
	@NotBlank
	private String contents;

	/**
	 * 评论发表时间
	 */
	@NotNull
	private Long publishTime;

	/**
	 * 评论修改时间
	 */
	@NotNull
	private Long updateTime;

	/**
	 * 评论类型
	 */
	private Integer commentType;

	/**
	 * 评论的对象id
	 */
	private ObjectId itemId;

	/**
	 * 评论中附带的照片
	 */
	private List<ImageItem> images;

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCommentType() {
		return commentType;
	}

	public void setCommentType(Integer commentType) {
		this.commentType = commentType;
	}

	public ObjectId getItemId() {
		return itemId;
	}

	public void setItemId(ObjectId itemId) {
		this.itemId = itemId;
	}

	public List<ImageItem> getImages() {
		return images;
	}

	public void setImages(List<ImageItem> images) {
		this.images = images;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public ImageItem getAvatar() {
		return avatar;
	}

	public void setAvatar(ImageItem avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
	}

	public Long getmTime() {
		return updateTime;
	}

	public void setmTime(Long updateTime) {
		this.updateTime = updateTime;
	}
}
