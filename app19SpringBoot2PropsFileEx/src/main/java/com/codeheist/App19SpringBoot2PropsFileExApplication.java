package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("file:./mno.properties") // from project folder but not in classpath
@PropertySource("file:F:\\Project\\abcd.properties")
public class App19SpringBoot2PropsFileExApplication {

	public static void main(String[] args) {
		SpringApplication.run(App19SpringBoot2PropsFileExApplication.class, args);
	}

}
