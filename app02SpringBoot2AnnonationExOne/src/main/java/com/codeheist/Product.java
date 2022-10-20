package com.codeheist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pob")
public class Product {
	@Value("Pen")
	private String name;
	@Value("10.0")
	private double cost;
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + "]";
	}
	
}
