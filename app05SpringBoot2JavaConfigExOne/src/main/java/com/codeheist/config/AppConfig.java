package com.codeheist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeheist.EmpExport;

@Configuration
public class AppConfig {

	@Bean
	public EmpExport empExport() {
		EmpExport empExport= new EmpExport();
		empExport.setCode(111);
		empExport.setName("Hritik");
		return empExport;
	}
}
