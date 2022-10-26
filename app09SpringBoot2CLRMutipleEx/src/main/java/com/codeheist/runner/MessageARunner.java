package com.codeheist.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class MessageARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message From Runner A ORDER 3");
	}

}