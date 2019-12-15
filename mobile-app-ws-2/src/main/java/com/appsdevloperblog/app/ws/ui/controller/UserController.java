package com.appsdevloperblog.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdevloperblog.app.ws.model.request.UserDetailsRequestModel;
import com.appsdevloperblog.app.ws.response.UserResp;
import com.appsdevloperblog.app.ws.shared.dto.UserDto;
import com.appsdevloperblog.app.ws.user.service.UserService;

@RestController
@RequestMapping("/users")//http://localhost:8080/users
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping
	public String getUser() {
		return "get method called";
		
	}
	
	@PostMapping
	public UserResp postUser(@RequestBody  UserDetailsRequestModel userDetailsRequestModel) {
		
		UserResp userResp = new UserResp();
		
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(userDetailsRequestModel, dto);
		
		
		UserDto createdUser = userService.createUser(dto);
		BeanUtils.copyProperties(createdUser, userResp);
		
	
		
		return userResp;
		
	}
	
	@PutMapping
	public String updateUser() {
		return "update method called";
		
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete method called";
		
	}

}
