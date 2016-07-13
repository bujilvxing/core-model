package com.bjlx.core.model.comment;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Id;

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
	private double rating = 0.0;
	
	/**
	 * 用户ID
	 */
	@NotNull
	@Min(value = 1)
	private long userId = 0;

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
	private Date publishTime;

	/**
	 * 评论修改时间
	 */
	@NotNull
	private Date mTime;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
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

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getmTime() {
		return mTime;
	}

	public void setmTime(Date mTime) {
		this.mTime = mTime;
	}
}
