package com.codeheist.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MyDataRunner implements CommandLineRunner{
	
	@Value("${my.app.pid}")
	private Integer productId;
	@Value("${my.app.pname}")
	private String productName;
	@Value("${my.app.pcost}")
	private Double productCost;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);	
	}

}
