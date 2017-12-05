package net.hualisheng.www.web.actions;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.opensymphony.xwork2.ActionSupport;

import net.hualisheng.www.bean.Categroy;
import net.hualisheng.www.bean.Product;
import net.hualisheng.www.services.CategroyService;
import net.hualisheng.www.services.impl.CategroyServiceImpl;

public class ActionCategroy extends ActionSupport {
	/**
	 * 
	 */
	private String cid;
	private static final long serialVersionUID = 1L;
	private List<Categroy> categroys;
	private CategroyService service;
	public void setService(CategroyService service) {
		this.service = service;
	}
	public List<Categroy> getCategroys() {
		return categroys;
	}
	public void setCategroys(List<Categroy> categroys) {
		this.categroys = categroys;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String findAll(){
		categroys=service.getCategroys();
		if (categroys!=null) {
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("categroys", categroys);
			return SUCCESS;
		}
		return ERROR;
	}
	public String findByCid(){
	
		
		List<Product> list=service.findByCid(cid);
		return "showProduct_list";
		
	}
}
