package com.codeheist.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class MessageBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message From Runner B ORDER 4");
	}

}
