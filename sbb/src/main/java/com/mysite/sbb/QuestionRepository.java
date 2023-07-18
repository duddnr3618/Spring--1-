package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

//QuestionRepository : Question 테이블을 CRUD하는 메소드 구현
public interface QuestionRepository extends JpaRepository<Question,Integer> {

	//client -> controller -> service (비즈니스 로직처리)
	//-> repository(DAO : DB를 직접 접근) -> Entity -> DB 
	//repository : 메소드를 사용해서 DB의 테이블을 select,insert,update,delete
	// Jparepository <Question (->Entity class) ,Integer (->Question Entity class의 primary key 컬럼의 데이터타입) > 
	//	인터페이스를 구현해서 생성해야한다. 
	
	/*
	 JPA 메소드
		findAll() : select
		save() : insert , update
		delete() : delete
		

	
	 */
	
	
	
	
}
