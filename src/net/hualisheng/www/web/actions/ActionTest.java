package net.hualisheng.www.web.actions;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest extends ActionSupport {
	public String login(){
		System.out.println(7889);
		Map<String, String[]> map = ServletActionContext.getRequest().getParameterMap();
		Set<Entry<String,String[]>> entrySet = map.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
			System.out.println(entry.getKey()+"------------"+entry.getValue());
		}
		
		return NONE;
		
	}
}
