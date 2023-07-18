package com.mysite.test_sbb;

import java.time.LocalDateTime;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AnswerBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "text")
	private String content;
	
	@CreatedDate
	private LocalDateTime createDate; // CREATE_DATE
	
	@ManyToOne		
	private QuestionBoard questionBoard;
	
	
}
