package com.codeheist.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="product")
public class MyProductRunner implements CommandLineRunner {
	
	private Integer mid;
	private String service;
	private String grade;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "MyProductRunner [mid=" + mid + ", service=" + service + ", grade=" + grade + "]";
	}
		
	
	
	
}
