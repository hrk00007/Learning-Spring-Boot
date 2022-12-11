package com.codeheist.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
@ConfigurationProperties
public class SmsService implements AlertSystem {
	private String service;
	private String format;
	@Override
	public void sendMessage() {
		System.out.println("Messgae From SMS Service System: "+service+" "+format);

	}

}
