package com.mysite.test_sbb;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class QuestionBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String subject;
	
	@Column
	private String content;
	
	private LocalDateTime createDate;
	
	@OneToMany (mappedBy="questionBoard", cascade=CascadeType.REMOVE)
	private List<AnswerBoard> answerBoardList;
	
	
}
