package com.appsdevloperblog.app.ws.secuirty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.appsdevloperblog.app.ws.user.service.UserService;


@EnableWebSecurity
public class WebSecurity  extends WebSecurityConfigurerAdapter{
	
	private final UserService detailsService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Autowired
	public WebSecurity(UserService detailsService,BCryptPasswordEncoder bCryptPasswordEncoder) {
		
		this.detailsService=detailsService;
		this.bCryptPasswordEncoder=bCryptPasswordEncoder;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

	auth.userDetailsService(detailsService).passwordEncoder(bCryptPasswordEncoder);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.POST, "/users")
		.permitAll().anyRequest().authenticated();
		
		
	}

	
	
	
	
	
}
