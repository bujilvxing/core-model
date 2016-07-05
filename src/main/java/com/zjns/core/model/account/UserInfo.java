package com.zjns.core.model.account;

import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.zjns.core.model.misc.ImageItem;

/**
 * 用户数据
 * @author xiaozhi
 *
 */
@Entity
public class UserInfo {

	/**
	 * 主键
	 */
	@NotBlank
	@Id
	private ObjectId id = null;
	
	/**
	 * 用户ID
	 */
	@NotNull
	@Min(value = 1)
	private long userId;

	/**
	 * 用户的电话号码
	 */
	private PhoneNumber tel;

	/**
	 * 昵称
	 */
	@NotBlank
	@Length(min = 1, max = 64)
	private String nickName;

	/**
	 * 头像
	 */
	private ImageItem avatar;

	/**
	 * 性别
	 * 1表示未选择，2表示男，3表示女
	 */
	int gender = 1;

	/**
	 * 用户签名
	 */
	@Length(max = 1024)
	String signagure;

	/**
	 * 电子邮件
	 */
	@Length(max = 50)
	@Email
	String email;
	
	/**
	 * 旅客信息
	 */
	Map<String, RealNameInfo> travellers;

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

	public PhoneNumber getTel() {
		return tel;
	}

	public void setTel(PhoneNumber tel) {
		this.tel = tel;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public ImageItem getAvatar() {
		return avatar;
	}

	public void setAvatar(ImageItem avatar) {
		this.avatar = avatar;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getSignagure() {
		return signagure;
	}

	public void setSignagure(String signagure) {
		this.signagure = signagure;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<String, RealNameInfo> getTravellers() {
		return travellers;
	}

	public void setTravellers(Map<String, RealNameInfo> travellers) {
		this.travellers = travellers;
	}

	public UserInfo(long userId, PhoneNumber tel, String nickName, ImageItem avatar, String email) {
		super();
		this.id = new ObjectId();
		this.userId = userId;
		this.tel = tel;
		this.nickName = nickName;
		this.avatar = avatar;
		this.email = email;
	}
}
