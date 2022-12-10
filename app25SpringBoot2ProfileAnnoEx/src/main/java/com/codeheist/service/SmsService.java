package com.codeheist.service;



@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class SmsService implements AlertSystem {
	private String service;
	private String format;
	@Override
	public void sendMessage() {
		System.out.println("Messgae From SMS Service System: "+service+" "+format);

	}

}
