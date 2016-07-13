package com.bjlx.core.model.account;

import javax.validation.constraints.NotNull;

public class OAuthInfo {
	
	/**
     * 第三方账号体系的名称。比如：weixin表示这是微信账号
     */
    @NotNull
    private String provider;

    /**
     * 用户在第三方账号体系中的id
     */
    @NotNull
    private String oauthId;

    /**
     * 用户在第三方账号的昵称
     */
    @NotNull
    private String nickName;

    /**
     * 用户在第三方账号的头像
     */
    private String avatar;

    /**
     * 用户在第三方账号的token
     */
    private String token;

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getOauthId() {
		return oauthId;
	}

	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
