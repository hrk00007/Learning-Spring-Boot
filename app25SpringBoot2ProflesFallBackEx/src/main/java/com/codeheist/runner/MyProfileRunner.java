package com.codeheist.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MyProfileRunner implements CommandLineRunner{
	
	@Value("${dbName}")
	private String dbName;
	@Value("${dbPwd}")
	private String pass;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
}
