package com.bjlx.core.model.im;

import org.mongodb.morphia.annotations.Embedded;

import com.bjlx.core.model.misc.Audio;
import com.bjlx.core.model.misc.ImageItem;
import com.bjlx.core.model.misc.Position;

@Embedded
public class Content {

	private String text;
	
	/**
	 * 缩略图
	 */
	private ImageItem thumb;
	
	/**
	 * 完整图
	 */
	private ImageItem full;
	
	/**
	 * 原图
	 */
	private ImageItem origin;
	
	/**
	 * 音频信息
	 */
	private Audio audio;
	
	/**
	 * 位置信息
	 */
	private Position position;
	
	/**
	 * 动画表情
	 */
	private Emoticon emoticon;
	
	/**
	 * 视频
	 */
	private Video video;
}
