package com.codeheist.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties
@ConfigurationProperties(prefix = "my.app")
public class MyPropsRunner implements CommandLineRunner {

	private Map<Integer, String> map;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "MyPropsRunner [map=" + map + "]";
	}

	
}
