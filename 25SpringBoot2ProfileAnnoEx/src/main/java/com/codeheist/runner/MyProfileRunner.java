package com.codeheist.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.AlternativeJdkIdGenerator;

import com.codeheist.service.AlertSystem;

import lombok.Data;

@Component
public class MyProfileRunner implements CommandLineRunner {
	@Autowired(required = true)
	@Qualifier("socialService")
	private AlertSystem system;
	@Override
	public void run(String... args) throws Exception {
		system.sendMessage();
	}
}
