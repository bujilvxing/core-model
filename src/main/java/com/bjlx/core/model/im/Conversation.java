package com.bjlx.core.model.im;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.NotNull;
import org.mongodb.morphia.annotations.Transient;
import java.util.List;

/**
 * Created by pengyt on 2016/7/24.
 * 会话信息
 */
@Entity
public class Conversation {

    /**
     * 主键
     */
    @NotBlank
    @Id
    private ObjectId id;

    /**
     * 聊天类型。single表示单聊，group表示群组
     */
    private String chatType = "";

    /**
     * 消息数量
     */
    private long msgCounter = 0L;

    /**
     * 会话id。单聊为两个用户的id,例如：10001,10002   群组为群组的id
     */
    private String conversationId;

    /**
     * 会话创建时间
     */
    @NotNull
    private long createTime = 0;

    /**
     * 会话更新时间
     */
    @NotNull
    private long updateTime = 0;

    /**
     * 有多少条未读信息
     */
    private int unreadCnt = 0;

    /**
     * 最后一条消息的内容
     */
    private String lastMsgContent;

    /**
     * 消息免打扰机制。这个list保存了那些设置消息免打扰的用户的ID
     */
    private List<Long> muteNotif = null;

    /**
     * 是否免打扰。注意：这个值不会保存在数据库中，而是通过muteNotif计算而来。以不同的用户视角观察这个值，结果是不同的。
     */
    @Transient
    private boolean muted = false;

    /**
     * 是否置顶。和muted字段类似
     */
    @Transient
    private boolean pinned = false;

    /**
     * 非空conversation所对应的用户id
     */
    @Transient
    private long targetId = 0;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public long getMsgCounter() {
        return msgCounter;
    }

    public void setMsgCounter(long msgCounter) {
        this.msgCounter = msgCounter;
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

    public List<Long> getMuteNotif() {
        return muteNotif;
    }

    public void setMuteNotif(List<Long> muteNotif) {
        this.muteNotif = muteNotif;
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Conversation(ObjectId id, String conversationId, String chatType, long createTime) {
        this.id = id;
        this.conversationId = conversationId;
        this.chatType = chatType;
        this.createTime = createTime;
    }
}
