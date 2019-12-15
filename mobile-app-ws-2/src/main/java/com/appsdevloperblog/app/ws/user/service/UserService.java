package com.appsdevloperblog.app.ws.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdevloperblog.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	
	 UserDto createUser(UserDto dto); 

}
