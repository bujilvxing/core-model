package com.bjlx.core.model.im;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Transient;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by pengyt on 2016/7/24.
 * 消息
 */
@Entity
public class Message {

    /**
     * 主键
     */
    @NotBlank
    @Id
    private ObjectId id;

    /**
     * 所属会话的id
     */
    @Indexed
    private ObjectId conversation = new ObjectId();

    /**
     * 消息id
     */
    @NotNull
    @Indexed
    private long msgId;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 发送者id
     */
    private long senderId;

    /**
     * 单聊时，表示接收者用户id。群聊时，表示群组的id
     */
    private long receiverId;

    /**
     * 发送者昵称
     */
    private String senderNickName;

    /**
     * 发送者头像
     */
    private String senderAvatar;

    /**
     * 消息类型
     */
    private int msgType;

    /**
     * 消息摘要
     */
    @Transient
    private String abbrev;

    /**
     * 消息创建时间
     */
    private long timestamp;

    /**
     * 群聊时，所有接收消息的人的id
     */
    private List<Long> receiverIdList;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getConversation() {
        return conversation;
    }

    public void setConversation(ObjectId conversation) {
        this.conversation = conversation;
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    public String getSenderNickName() {
        return senderNickName;
    }

    public void setSenderNickName(String senderNickName) {
        this.senderNickName = senderNickName;
    }

    public String getSenderAvatar() {
        return senderAvatar;
    }

    public void setSenderAvatar(String senderAvatar) {
        this.senderAvatar = senderAvatar;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public List<Long> getReceiverIdList() {
        return receiverIdList;
    }

    public void setReceiverIdList(List<Long> receiverIdList) {
        this.receiverIdList = receiverIdList;
    }
}
