package net.hualisheng.www.web.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ActionHome extends ActionSupport {
	public String toLogin(){
		return "toLogin";
		
	}
	public String toIndex(){
		return SUCCESS;
		
	}
}
