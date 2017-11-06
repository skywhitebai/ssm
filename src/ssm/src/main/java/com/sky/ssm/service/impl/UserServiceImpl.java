package com.sky.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.ssm.dao.UserMapper;
import com.sky.ssm.model.User;
import com.sky.ssm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper;
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
