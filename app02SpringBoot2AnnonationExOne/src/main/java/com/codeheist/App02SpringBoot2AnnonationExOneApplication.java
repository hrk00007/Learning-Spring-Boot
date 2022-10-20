package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App02SpringBoot2AnnonationExOneApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(App02SpringBoot2AnnonationExOneApplication.class, args);
		//Product product=context.getBean("pob",Product.class);
		Product product=(Product)context.getBean("pob");
		
			System.out.println(product);
	}

}
