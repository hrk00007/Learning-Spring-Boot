package com.codeheist.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner cmd() {
		/*
		 * CommandLineRunner cmd1= new CommandLineRunner() {
		 * 
		 * @Override public void run(String... args) throws Exception { System.out.
		 * println(" This is java based Configuration of Command line runner using anynoumous classes"
		 * );
		 * 
		 * } }; CommandLineRunner cmd2=(args)->{ System.out.
		 * println(" This is java based Configuration of Command line runner using lambda expressions"
		 * ); };
		 */
		
		return args->System.out.println(" This is java based Configuration of Command line runner using lambda expressions shorthand");
		
	}
}
