package net.hualisheng.www.services.impl;

import net.hualisheng.www.bean.User;
import net.hualisheng.www.services.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User login(String username, String password) {
		System.out.println("你的名字："+username+"密码:"+password);
		return null;
	}

}
