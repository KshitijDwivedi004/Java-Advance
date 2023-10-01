package com.map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Questions {
	
	@Id
	@Column(name = "question_id")
	private int questionId;
	
	private String question;
	 
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	private List<Answers> answers;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public Questions(int questionId, String question, List<Answers> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
	
	
}
