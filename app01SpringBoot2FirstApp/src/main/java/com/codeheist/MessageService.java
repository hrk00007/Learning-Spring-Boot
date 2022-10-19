package com.codeheist;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	public String getMsg() {
		return "This is my first Spring Boot application";
	}
}
