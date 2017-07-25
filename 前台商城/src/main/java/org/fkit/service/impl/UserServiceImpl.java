package org.fkit.service.impl;

import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String username, String password) {
		return userMapper.findWithLoginnameAndPassword(username, password);
	}

	@Override
	public boolean register(String username, String nickname, String telphone, String email, String password) {
		userMapper.insertInformation(username, nickname, telphone, email, password);
		return true;
		
	}

	@Override
	public void changePassword(String latter,String username) {
		userMapper.updatePassword(latter,username);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findPwd(String username, String email) {
		// TODO Auto-generated method stub
		return userMapper.findpwd(username, email);
	}

	
		
	}

