package com.bjlx.core.model.quora;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.bjlx.core.model.account.UserInfo;

/**
 * 问答数据的基础类
 * @author xiaozhi
 *
 */
public abstract class AbstractQuoraEntry {

	/**
	 * 作者信息
	 */
	@NotNull
	private UserInfo author;
	
	/**
	 * 发表时间戳
	 */
	@NotNull
	private Date publishTime;
	
	/**
	 * 标题
	 */
	@NotBlank
	String title;
	
	/**
	 * 具体描述
	 */
	@NotNull
	String contents;

	public UserInfo getAuthor() {
		return author;
	}

	public void setAuthor(UserInfo author) {
		this.author = author;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
