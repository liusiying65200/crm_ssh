package net.hualisheng.www.services;

import net.hualisheng.www.bean.User;

public interface UserService {

	User login(String username, String password);

}
