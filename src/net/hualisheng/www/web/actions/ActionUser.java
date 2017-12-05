package net.hualisheng.www.web.actions;

import com.opensymphony.xwork2.ActionSupport;

import net.hualisheng.www.bean.User;
import net.hualisheng.www.services.UserService;

public class ActionUser extends ActionSupport {
	private String username;
	private String password;
	private UserService service;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setService(UserService service) {
		this.service = service;
	}
	public String login(){
		User user=service.login(username,password);
		service.login("34636", "36347");
		return NONE;
		
	}
	public String ll(){
		System.out.println(409907095);
		return NONE;
		
	}
}
