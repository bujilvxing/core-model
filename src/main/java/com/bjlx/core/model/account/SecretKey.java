package com.bjlx.core.model.account;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Embedded;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * Created by xiaozhi on 2016/7/24.
 * 用户的密钥，用于用户操作授权
 */
@Embedded
public class SecretKey {

    /**
     * key的内容
     */
    @NotBlank
    @Length(min = 32, max = 256)
    private String key;

    /**
     * key的生成时间
     */
    @NotNull
    private Date timestamp;

    /**
     * key的过期时间
     */
    private Date expire;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public SecretKey() {
        this.key = org.apache.commons.codec.digest.DigestUtils.sha256Hex(UUID.randomUUID().toString());
        this.timestamp = new Date();
    }
}
