package com.bjlx.core.model.geo;

import com.bjlx.core.model.misc.ImageItem;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Embedded;

/**
 * 详情介绍，包含标题、描述和图集
 *
 * Created by pengyt on 2015/10/19.
 */
@Embedded
class DetailsEntry {

	/**
	 * 封面图
	 */
	private ImageItem cover;

	/**
	 * 图集
	 */
	private List<ImageItem> images;
	
	/**
	 * 标题
	 */
	@NotBlank
	private String title;

	/**
	 * 描述
	 */
	@NotBlank
	private String desc;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
