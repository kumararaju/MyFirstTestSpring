 package com.appsdevloperblog.app.ws.user.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appsdevloperblog.app.ws.io.entity.UserEnity;

@Repository
public interface UserRepository extends CrudRepository<UserEnity, Long> {

 UserEnity findByEmail(String email);
	
}
