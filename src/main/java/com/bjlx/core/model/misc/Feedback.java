package com.bjlx.core.model.misc;

import java.util.Date;

import javax.validation.constraints.Min;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Id;

public class Feedback {

	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id = null;
	
	/**
	 * 用户id
	 */
	@NotBlank
	@Min(value = 1)
	long userId;

	/**
	 * 反馈内容
	 */
	String body;

	/**
	 * 反馈时间
	 */
	Date time;

	/**
	 * 从哪个App反馈过来的, 例如：不羁旅行
	 */
	String origin;

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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Feedback(long userId, String body, Date time, String origin) {
		super();
		this.id = new ObjectId();
		this.userId = userId;
		this.body = body;
		this.time = time;
		this.origin = origin;
	}
}
