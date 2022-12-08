package com.codeheist.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.codeheist.model.Vendor;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner {
	
	//1-D collections
	private List<String> colors;
  //private Set<String> colors;
  //private String [] colors;
	
	//2-D collections
	private Map<String,String> version;
	
	//HAS-A variable
	private Vendor vob;
	
	@Override
		public void run(String... args) throws Exception {
			System.out.println(this);
		}

	@Override
	public String toString() {
		return "MyDataRunner [colors=" + colors + ", version=" + version + ", vob=" + vob + "]";
	}

	
		
}
