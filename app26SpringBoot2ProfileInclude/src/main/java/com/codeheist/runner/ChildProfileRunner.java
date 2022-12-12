package com.codeheist.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "my.app")
@Data
public class ChildProfileRunner implements CommandLineRunner {
	
	private Integer code;
	private String title;
	private String dbName;
	private String dbPwd;
	private String host;
	private String emailId;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
