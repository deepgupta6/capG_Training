package com.cg.oneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


//@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	private String answer;
	@ManyToOne()
	@JoinColumn(name = "question_id")
	private Question question;
	
	public Answer() {
		
	}
	
	public Answer(String answer,Question q) {
		super();
		this.question = q;
		this.answer = answer;
	}
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
