package com.bjlx.core.model.im;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.NotNull;

/**
 * Created by pengyt on 2016/7/24.
 * 用户关系。包含关注与被关注，黑名单，备注
 */
@Entity
public class Relationship {

    /**
     * 主键
     */
    @NotBlank
    @Id
    private ObjectId id;

    /**
     * 用户A的用户id
     */
    @NotNull
    private long userA;

    /**
     * 用户B的用户id
     */
    @NotNull
    private long userB;

    /**
     * 用户A关注用户B
     */
    private int follow;

    /**
     * 用户A将用户B拉黑
     */
    private int block;

    /**
     * 用户A备注用户B
     */
    private String memo;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getUserA() {
        return userA;
    }

    public void setUserA(long userA) {
        this.userA = userA;
    }

    public long getUserB() {
        return userB;
    }

    public void setUserB(long userB) {
        this.userB = userB;
    }

    public int getFollow() {
        return follow;
    }

    public void setFollow(int follow) {
        this.follow = follow;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Relationship(long userA, long userB) {
        this.id = new ObjectId();
        this.userA = userA;
        this.userB = userB;
    }
}
