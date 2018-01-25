package com.forzheng.hr.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forzheng.hr.service.domain.User;
import com.forzheng.hr.service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping("/getUserByUserid")
	public User getUserByUserid() {
		return userService.getUserByUserid();
	}
}
