package com.codeheist.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropsRunner implements CommandLineRunner {
	@Value("${code}")
	private int id;
	@Value("${title}")
	private String name;
	@Value("${price}")
	private String price;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "MyPropsRunner [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
