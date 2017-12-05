/**
 * 
 */
package net.hualisheng.www.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lsy
 *
 */
public class Orders {

	/**
	 * 
	 */
	private double totalPrice;
	private String oid;
	private Date createTime;
	private int status;
	private Set<CartItem> cartItems=new HashSet<>();
	private User user;
	private String address;
	private String name;
	private String telephone;
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Orders [totalPrice=" + totalPrice + ", oid=" + oid + ", createTime=" + createTime + ", status=" + status
				+ ", user=" + user + ", address=" + address + ", name=" + name + ", telephone=" + telephone + "]";
	}
	
	
	public Orders(User user, String address, String name, String telephone) {
		super();
		this.user = user;
		this.address = address;
		this.name = name;
		this.telephone = telephone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	
	
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(double totalPrice, String oid, Date createTime, int status, Set<CartItem> cartItems, User user,
			String address, String name, String telephone) {
		super();
		this.totalPrice = totalPrice;
		this.oid = oid;
		this.createTime = createTime;
		this.status = status;
		this.cartItems = cartItems;
		this.user = user;
		this.address = address;
		this.name = name;
		this.telephone = telephone;
	}
	public Set<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	
	
	
	
	
	
	
	

}
