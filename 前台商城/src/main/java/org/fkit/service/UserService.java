package org.fkit.service;

import org.fkit.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String username,String password);
	boolean register(String username,String nickname,String telphone,String email,String password);
	
	void changePassword(String latter,String username);
   String  findPwd(String username,String email);
}
