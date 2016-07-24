package com.bjlx.core.model.misc;

import com.bjlx.core.model.account.PhoneNumber;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.NotNull;

/**
 * Created by pengyt on 2016/7/24.
 * 验证码
 */
@Entity
public class ValidationCode {

    private final long interval = 60 * 1000L;

    /**
     * 主键
     */
    @NotBlank
    @Id
    private ObjectId id;

    /**
     * 验证码创建时间
     */
    @NotNull
    private long createTime;

    /**
     * 验证码过期时间
     */
    @NotNull
    private long expireTime;

    /**
     * 用于何处。1表示新用户注册，2表示重置密码，3表示绑定手机号，4表示绑定邮箱
     */
    private int action;

    /**
     * 验证码内容
     */
    @NotNull
    private String code;

    /**
     * 邮箱接收验证码时的邮箱号
     */
    private String email;

    /**
     * 手机接收验证码时的手机号
     */
    private PhoneNumber tel;

    /**
     * 是否已经验证过
     */
    private boolean used = false;

    /**
     * 上一次发送验证码的时间
     */
    public long lastSendTime;

    /**
     * 下一次允许发送验证码的时间
     */
    public long resendTime;

    /**
     * 验证错误次数
     */
    public int failCnt = 0;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PhoneNumber getTel() {
        return tel;
    }

    public void setTel(PhoneNumber tel) {
        this.tel = tel;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public long getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(long lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    public long getResendTime() {
        return resendTime;
    }

    public void setResendTime(long resendTime) {
        this.resendTime = resendTime;
    }

    public int getFailCnt() {
        return failCnt;
    }

    public void setFailCnt(int failCnt) {
        this.failCnt = failCnt;
    }

    public ValidationCode(long createTime, long expireTime, String code, String email, PhoneNumber tel) {
        this.id = new ObjectId();
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.code = code;
        this.email = email;
        this.tel = tel;
        this.lastSendTime = createTime;
        this.resendTime = createTime + interval;
    }
}
