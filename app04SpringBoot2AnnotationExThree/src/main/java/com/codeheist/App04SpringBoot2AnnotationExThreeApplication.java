package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App04SpringBoot2AnnotationExThreeApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(App04SpringBoot2AnnotationExThreeApplication.class, args);
		Employee employee=context.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
