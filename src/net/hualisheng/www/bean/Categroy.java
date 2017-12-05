package net.hualisheng.www.bean;

import java.util.HashSet;
import java.util.Set;

public class Categroy {
	private String cid;
	private String cname;
	private Set<Product> products=new HashSet<>();
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Categroy [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
