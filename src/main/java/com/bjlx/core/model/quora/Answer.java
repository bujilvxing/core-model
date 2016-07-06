package com.bjlx.core.model.quora;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 回答
 * @author xiaozhi
 *
 */
public class Answer extends AbstractQuoraEntry {

	/**
	 * 对应的问题
	 */
	@NotNull
	private Question question;

	/**
	 * 被赞的次数
	 */
	@Min(value = 0)
	private int voteCnt = 0;

	/**
	 * 该回答是否被采纳
	 */
	boolean accepted = false;

	public Answer(Question question, int voteCnt, boolean accepted) {
		super();
		this.question = question;
		this.voteCnt = voteCnt;
		this.accepted = accepted;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getVoteCnt() {
		return voteCnt;
	}

	public void setVoteCnt(int voteCnt) {
		this.voteCnt = voteCnt;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
}
