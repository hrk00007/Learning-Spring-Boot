package com.codeheist.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.codeheist.beans.DbConn;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyPropsRunner implements CommandLineRunner {

	private DbConn conn;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "MyPropsRunner [conn=" + conn + "]";
	}
	public DbConn getConn() {
		return conn;
	}
	public void setConn(DbConn conn) {
		this.conn = conn;
	}
	

}
