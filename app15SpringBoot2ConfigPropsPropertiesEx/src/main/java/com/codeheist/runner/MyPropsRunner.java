package com.codeheist.runner;

import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.app")
public class MyPropsRunner implements CommandLineRunner {

	private Properties prop;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "MyPropsRunner [prop=" + prop + "]";
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
}
