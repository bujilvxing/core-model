package com.bjlx.core.model.im;

/**
 * Created by xiaozhi on 2016/7/21.
 * 讨论组
 */

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Chatgroup {

    /**
     * 主键
     */
    @Id
    private ObjectId id = new ObjectId();

    /**
     * 讨论组id
     */
    @NotNull
    @Indexed(unique = true)
    private long chatGroupId = 0;

    /**
     * 名称
     */
    @NotBlank
    @Size(min = 2, max = 32)
    private String name = "";

    /**
     * 描述
     */
    @Size(min = 0, max = 1024)
    private String groupDesc = "";

    /**
     * 头像
     */
    @Size(min = 0, max = 128)
    private String avatar = "";

    /**
     * 讨论组标签
     */
    List<String> tags;

    /**
     * 创建者用户id
     */
    @NotNull
    private long creator;

    /**
     * 管理员用户id
     */
    private List<Long> admins;

    /**
     * 讨论组成员
     */
    private List<Long> participants;

    /**
     * 讨论组最大允许人数
     */
    @NotNull
    @Min(value = 1)
    @Max(value = 2000)
    private int maxUsers = 250;

    /**
     * 创建时间
     */
    @NotNull
    private long createTime = 0;

    /**
     * 更新时间
     */
    @NotNull
    private long updateTime = 0;

    /**
     * 是否公开
     */
    @NotNull
    private boolean visible = true;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getChatGroupId() {
        return chatGroupId;
    }

    public void setChatGroupId(long chatGroupId) {
        this.chatGroupId = chatGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public long getCreator() {
        return creator;
    }

    public void setCreator(long creator) {
        this.creator = creator;
    }

    public List<Long> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Long> admins) {
        this.admins = admins;
    }

    public List<Long> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Long> participants) {
        this.participants = participants;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Chatgroup(long chatGroupId, String name, String avatar, long creator, List<Long> participants, int maxUsers) {
        this.id = new ObjectId();
        this.chatGroupId = chatGroupId;
        this.name = name;
        this.avatar = avatar;
        this.creator = creator;
        this.participants = participants;
        this.maxUsers = maxUsers;
        this.createTime = System.currentTimeMillis();
        this.updateTime = System.currentTimeMillis();
    }
}
