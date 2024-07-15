package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJPA() {
		for(int i=1;i<=300;i++){
			String subject = String.format("Test data:[%03d]", i);
			String content = "NULL";
			this.questionService.create(subject, content);
		}
	}

}
