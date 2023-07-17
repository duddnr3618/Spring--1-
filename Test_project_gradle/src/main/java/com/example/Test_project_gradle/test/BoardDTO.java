package com.example.Test_project_gradle.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BoardDTO {
	private String b_id;
	private String title;
	private String content;
}
