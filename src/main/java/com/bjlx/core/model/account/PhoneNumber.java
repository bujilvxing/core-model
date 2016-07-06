package com.bjlx.core.model.account;

import org.mongodb.morphia.annotations.Embedded;

/**
 * 电话号码数据
 * @author xiaozhi
 *
 */
@Embedded
public class PhoneNumber {

	/**
	 * 国家区域号码
	 */
	private int dialCode = 86;
	
	/**
	 * 手机号
	 */
	private String number;

	public PhoneNumber(int dialCode, String number) {
		super();
		this.dialCode = dialCode;
		this.number = number;
	}

	public int getDialCode() {
		return dialCode;
	}

	public void setDialCode(int dialCode) {
		this.dialCode = dialCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
