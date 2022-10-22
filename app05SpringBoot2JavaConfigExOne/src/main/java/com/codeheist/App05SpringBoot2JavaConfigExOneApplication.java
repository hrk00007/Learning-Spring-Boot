package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App05SpringBoot2JavaConfigExOneApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(App05SpringBoot2JavaConfigExOneApplication.class, args);
		EmpExport empExport=context.getBean("empExport",EmpExport.class);
		System.out.println(empExport);
	}

}
