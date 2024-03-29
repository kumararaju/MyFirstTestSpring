package com.appsdevloperblog.app.ws.shared.dto;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	
	private final Random RANDOM = new SecureRandom();
	private final String ALPHABET ="0123456789ABCDEFGHasdfghhj";
	
	
	public String generateUserId(int length) {
		return generateRandomString(length);
	}
	
	private String generateRandomString(int length) {
		StringBuilder retunValue =new StringBuilder(length);
		for(int i=0;i<=length;i++) {
			retunValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		return new String(retunValue);
	}
	

}
