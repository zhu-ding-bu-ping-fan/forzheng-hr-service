package com.forzheng.hr.service.service;

import java.util.List;

import com.forzheng.hr.service.domain.User;

public interface UserService {

	List<User> getUsers();
	
	User getUserByUserid();
}
