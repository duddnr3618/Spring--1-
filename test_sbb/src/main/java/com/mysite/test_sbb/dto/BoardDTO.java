package com.mysite.test_sbb.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class BoardDTO {
	private String id;
	private String pass;
	private String title;
	private String content;


}
