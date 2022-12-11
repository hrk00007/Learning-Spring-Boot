package com.codeheist.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Profile("social")
@ConfigurationProperties
@Component
@Data
public class SocialService implements AlertSystem {

	private String service;
	private String format;
	@Override
	public void sendMessage() {
		System.out.println("Messgae From Social Service System: "+service+" "+format);

	}

}
