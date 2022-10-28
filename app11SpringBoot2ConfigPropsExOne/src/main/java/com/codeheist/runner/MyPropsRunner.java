package com.codeheist.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyPropsRunner implements CommandLineRunner {
	
	private Integer code;
	private String title;
	private Double price;
	@Override
	public void run(String... args) throws Exception {
			System.out.println(this);
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MyPropsRunner [code=" + code + ", title=" + title + ", price=" + price + "]";
	}

}
