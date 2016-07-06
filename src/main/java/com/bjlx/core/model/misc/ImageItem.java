package com.bjlx.core.model.misc;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class ImageItem {

	/**
	 * 标题
	 */
	String caption;

	/**
	 * 图像的主键
	 */
	@NotBlank
	@Length(max = 1024)
	String key;

	/**
	 * 图像放在哪个bucket之中
	 */
	@Length(max = 1024)
	String bucket;

	/**
	 * 图像宽度
	 */
	@Min(value = 0)
	int width;

	/**
	 * 图像高度
	 */
	@Min(value = 0)
	int height;

	/**
	 * 图像url
	 */
	String url;

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ImageItem(String caption, String key, String bucket, int width, int height, String url) {
		super();
		this.caption = caption;
		this.key = key;
		this.bucket = bucket;
		this.width = width;
		this.height = height;
		this.url = url;
	}
}
