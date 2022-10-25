package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
	"com.codeheist",
	"app.test.one"
})
public class App08SpringBoot2ClrExThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(App08SpringBoot2ClrExThreeApplication.class, args);
	}

}
