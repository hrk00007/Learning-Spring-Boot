package com.codeheist.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyDataRunner implements CommandLineRunner {
	
	@Value("${title}")
	private String title;
	@Override
	public void run(String... args) throws Exception {
			System.out.println(this);
	}
	@Override
	public String toString() {
		return "MyDataRunner [title=" + title + "]";
	}
	

}
