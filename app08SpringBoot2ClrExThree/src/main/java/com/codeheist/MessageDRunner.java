package com.codeheist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageDRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message from Runner D: "+MessageDRunner.class.getCanonicalName());

	}

}
