package com.cbfsd.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orderitem {

	@Id
	private int orderItemId;

	private int price;

	private String productCategory;

	private String productCode;

	private String productDescription;


	private String productTitle;

	private int quantity;

	private int totalPrice;


	
	private Order order;

	private Product product;

	public Orderitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orderitem(int orderItemId, int price, String productCategory, String productCode, String productDescription,
			String productTitle, int quantity, int totalPrice, Order order, Product product) {
		super();
		this.orderItemId = orderItemId;
		this.price = price;
		this.productCategory = productCategory;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productTitle = productTitle;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.order = order;
		this.product = product;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", price=" + price + ", productCategory=" + productCategory
				+ ", productCode=" + productCode + ", productDescription=" + productDescription + ", productTitle="
				+ productTitle + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", order=" + order
				+ ", product=" + product + "]";
	}

	
	
}
