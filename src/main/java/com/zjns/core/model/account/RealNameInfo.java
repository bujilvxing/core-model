package com.zjns.core.model.account;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Embedded;

/**
 * 实名信息
 * @author xiaozhi
 *
 */
@Embedded
public class RealNameInfo {

	/**
	 * 姓
	 */
	@NotBlank
	@Length(min = 1, max = 64)
	String surname;

	/**
	 * 名
	 */
	@NotBlank
	@Length(min = 1, max = 256)
	String givenName;

	/**
	 * 性别
	 */
	int gender;

	/**
	 * 出生日期
	 */
	Date birthday;

	/**
	 * 身份信息
	 */
	List<IdProof> identities;

	/**
	 * 联系电话
	 */
	PhoneNumber tel;

	/**
	 * 联系邮箱
	 */
	@Email
	String email;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<IdProof> getIdentities() {
		return identities;
	}

	public void setIdentities(List<IdProof> identities) {
		this.identities = identities;
	}

	public PhoneNumber getTel() {
		return tel;
	}

	public void setTel(PhoneNumber tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RealNameInfo(String surname, String givenName, int gender, Date birthday, List<IdProof> identities,
			PhoneNumber tel, String email) {
		super();
		this.surname = surname;
		this.givenName = givenName;
		this.gender = gender;
		this.birthday = birthday;
		this.identities = identities;
		this.tel = tel;
		this.email = email;
	}
}
