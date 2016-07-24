package com.bjlx.core.model.account;

import com.bjlx.core.model.activity.Activity;
import com.bjlx.core.model.misc.ImageItem;
import com.bjlx.core.model.misc.TravelNote;
import com.bjlx.core.model.trace.Trace;
import com.bjlx.core.model.tripplan.TripPlan;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

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

	/**
	 * 用户的状态
	 */
	private int status;

	/**
	 * 邀请码。每个人有全局唯一的一个邀请码，用于分享平台内容时奖励
	 */
	@NotBlank
	@Indexed(unique = true)
	String promotionCode;

	/**
	 * 登录的状态，是否在线
	 */
	@NotNull
	boolean loginStatus = false;

	/**
	 * 登录时间
	 */
	@NotNull
	long loginTime = 0;

	/**
	 * 登出时间
	 */
	@NotNull
	long logoutTime = 0;

	/**
	 * 登录设备来源
	 */
	List<String> loginSource = null;

	/**
	 * 设备版本
	 */
	@Version
	long version = 0;

	/**
	 * 用户角色。普通用户，商家等等
	 */
	List<Integer> roles = null;

	/**
	 * 用户备注。此字段为Transient，是不存入数据库的，但是取用户数据的时候，可以将给此字段赋值，为了返回用户信息的
	 */
	@Transient
	String memo = null;

	/**
	 * 用户的居住地
	 */
	String residence = null;

	/**
	 * 用户的生日
	 */
	String birthday  = null;

	/**
	 * 第三方账号的信息
	 */
	List<OAuthInfo> oauthInfoList = null;

	/**
	 * 用户等级
	 */
	private int level;

	/**
	 * 用户足迹
	 */
	private List<Trace> traces;

	/**
	 * 用户发布的活动
	 */
	private List<Activity> activities;

	/**
	 * 用户发表的游记
	 */
	private List<TravelNote> travelNotes;

	/**
	 * 用户发布的行程规划
	 */
	private List<TripPlan> tripPlans;

	/**
	 * 星座
	 */
	private int zodiac;

	/**
	 * 设置声音提醒
	 */
	private boolean soundNotify;

	/**
	 * 设置振动提醒
	 */
	private boolean vibrateNotify;

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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	public long getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}

	public long getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(long logoutTime) {
		this.logoutTime = logoutTime;
	}

	public List<String> getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(List<String> loginSource) {
		this.loginSource = loginSource;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public List<Integer> getRoles() {
		return roles;
	}

	public void setRoles(List<Integer> roles) {
		this.roles = roles;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public List<OAuthInfo> getOauthInfoList() {
		return oauthInfoList;
	}

	public void setOauthInfoList(List<OAuthInfo> oauthInfoList) {
		this.oauthInfoList = oauthInfoList;
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
