package com.appsdevloperblog.app.ws.user.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.appsdevloperblog.app.ws.io.entity.UserEnity;
import com.appsdevloperblog.app.ws.shared.dto.UserDto;
import com.appsdevloperblog.app.ws.shared.dto.Utils;
import com.appsdevloperblog.app.ws.user.repo.UserRepository;
import com.appsdevloperblog.app.ws.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRespository;

	@Autowired
    Utils util;
	

   @Autowired 
   BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Override
	public UserDto createUser(UserDto user) {
		
		
		if(userRespository.findByEmail(user.getEmail())!=null) throw  new RuntimeException("Record already existed");
		
		UserEnity userEnity = new UserEnity();
		BeanUtils.copyProperties(user, userEnity);
		
		String userId = util.generateUserId(30);
		userEnity.setUserId(userId);
		userEnity.setEncryptedpassword(bCryptPasswordEncoder.encode(user.getPassword()));

		
		UserEnity userDetailssave  = userRespository.save(userEnity);
		
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(userDetailssave, returnValue);
		
		return returnValue;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		
		return null;
	}
	
	
	

}
