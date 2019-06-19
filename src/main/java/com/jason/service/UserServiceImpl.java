package com.jason.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jason.mapper.UserMapper;
import com.jason.po.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
@Autowired
private UserMapper userMapper;

public User getUserById(int userId) {
	// TODO Auto-generated method stub
	return this.userMapper.selectByPrimaryKey(userId);
	}
}

