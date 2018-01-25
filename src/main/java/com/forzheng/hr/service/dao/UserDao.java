package com.forzheng.hr.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.forzheng.hr.service.domain.User;

@Mapper
public interface UserDao {

	List<User> getUsers();
	
	User getUserByUserid();
}
