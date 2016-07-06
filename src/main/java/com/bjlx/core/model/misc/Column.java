package com.bjlx.core.model.misc;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.mongodb.morphia.annotations.Id;

/**
 * 专栏运营位
 * @author xiaozhi
 *
 */
public class Column {

	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id = null;
	
	/**
	 * 排名
	 */
	@Min(value = 1)
	private int rank;
	
	/**
	 * TODO
	 * 专栏类型，"slide"表示幻灯片专栏，"special"表示特色专栏，这个值还需要敲定
	 */
	private String columnType;
	
	/**
	 * 标题
	 */
	@NotBlank
	@Length(min = 1, max = 256)
	String title;

	/**
	 * 链接
	 */
	@NotBlank
	@URL
	@Length(min = 1, max = 1024)
	String link;

	/**
	 * 图像
	 */
	@Size(min = 0, max = 10)
	List<ImageItem> images;

	/**
	 * 专栏状态: 审核中, 已发布
	 */
	@Pattern(regexp = "(review|pub|disabled)")
	String status;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<ImageItem> getImages() {
		return images;
	}

	public void setImages(List<ImageItem> images) {
		this.images = images;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
