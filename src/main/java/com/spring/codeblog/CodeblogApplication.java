package com.spring.codeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CodeblogApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CodeblogApplication.class, args);
	}

}
