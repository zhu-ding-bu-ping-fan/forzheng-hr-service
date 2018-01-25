package com.forzheng.hr.service.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forzheng.hr.service.dao.UserDao;
import com.forzheng.hr.service.domain.User;
import com.forzheng.hr.service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public User getUserByUserid() {
		return userDao.getUserByUserid();
	}

}
