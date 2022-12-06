package com.codeheist.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class ProductRunner implements CommandLineRunner {

	private Integer pid;
	private String pname;
	private Double pversion;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	
	
	

}
