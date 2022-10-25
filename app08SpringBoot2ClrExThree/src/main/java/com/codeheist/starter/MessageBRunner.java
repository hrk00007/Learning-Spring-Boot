package com.codeheist.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message from Runner B : "+MessageBRunner.class.getCanonicalName());

	}

}
