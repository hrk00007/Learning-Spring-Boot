package com.codeheist.starter.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageCRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Messagae From Runner C :"+MessageCRunner.class.getCanonicalName());

	}

}
