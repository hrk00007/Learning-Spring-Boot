package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App01SpringBoot2FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(App01SpringBoot2FirstAppApplication.class, args);
		MessageService service=context.getBean("messageService",MessageService.class);
		System.out.println( service.getMsg());
	}

}
