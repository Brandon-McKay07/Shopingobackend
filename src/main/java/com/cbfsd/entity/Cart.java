package com.cbfsd.entity;

public class Cart {


	private int cartId;
	
	private int quantity;


	private Product product;


	
	private User user;



	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cart(int cartId, int quantity, Product product, User user) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.product = product;
		this.user = user;
	}



	public int getCartId() {
		return cartId;
	}



	public void setCartId(int cartId) {
		this.cartId = cartId;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", quantity=" + quantity + ", product=" + product + ", user=" + user + "]";
	}
	
	
	
	
}
