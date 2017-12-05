package net.hualisheng.www.bean;

public class CartItem {
	private String itemid;
	private Product product;
	private int scalar;
	private double summation;
	private Orders orders;
	public Orders getOrders() {
		return orders;
		
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getScalar() {
		return scalar;
	}
	public void setScalar(int scalar) {
		this.scalar = scalar;
	}
	public double getSummation() {
		return summation;
	}
	public void setSummation(double summation) {
		this.summation = summation;
	}
	@Override
	public String toString() {
		return "CartItem [itemid=" + itemid + ", product=" + product + ", scalar=" + scalar + ", summation=" + summation
				+ ", orders=" + orders + "]";
	}
	
	
	
	
	
	
}
