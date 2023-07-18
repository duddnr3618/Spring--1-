package com.mysite.test_sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSbbApplicationTests {

	@Autowired
	private QuestionBoardRepository qr;


	@Test
	void contextLoads() {
		QuestionBoard q1 = new QuestionBoard();
		q1.setSubject("날씨");
		q1.setContent("오늘의 날씨는 흐립니다.");
		q1.setCreateDate(LocalDateTime.now());
		
		qr.save(q1);
	
	
		QuestionBoard q2 = new QuestionBoard();
		q2.setSubject("지역");
		q2.setContent("서울지역은 흐립니다.");
		q2.setCreateDate(LocalDateTime.now());
		
		qr.save(q2);
	}
	
	
	
	

}
