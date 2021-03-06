package com.bjlx.core.model.account;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 由中国大陆颁发的身份证件
 * @author xiaozhi
 *
 */
public class ChineseID extends IdProof {

	/**
	 * 身份证号码（15位或者18位）
	 */
	@NotBlank
	@Pattern(regexp = "([\\d]{17}[\\dX]|[\\d]{15})")
	String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
