package com.bjlx.core.model.comment;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
	private String authorAvatar;

	/**
	 * 用户昵称
	 */
	private String authorName;

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

	public String getAuthorAvatar() {
		return authorAvatar;
	}

	public void setAuthorAvatar(String authorAvatar) {
		this.authorAvatar = authorAvatar;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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
