package com.bjlx.core.model.trace;

import com.bjlx.core.model.misc.Audio;
import com.bjlx.core.model.misc.ImageItem;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 足迹
 * @author xiaozhi
 *
 */
@Entity
public class Trace {

	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id;
	
	/**
	 * 所属用户的用户id
	 */
	@NotNull
	@Min(value = 1)
	private Long userId;
	
	/**
	 * 所属用户的用户昵称
	 */
	@NotBlank
	@Length(min = 1, max = 64)
	private String nickName;
	
	/**
	 * 所属用户的用户头像
	 */
	private String avatar;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 图片列表
	 */
	private List<ImageItem> images;
	
	/**
	 * 语音描述
	 */
	private Audio audio;
	
	/**
	 * 文字描述
	 */
	private String desc;
	
	
	/**
	 * 状态，1表示私密可不见，2表示好友可见，3表示所有人可见
	 */
	private Integer status = 1;
}
