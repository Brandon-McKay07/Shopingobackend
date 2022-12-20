package com.cbfsd.entity;

public class Wishlist {

	private int wishListId;

	
	private Product product;

	private User user;

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWishListId() {
		return wishListId;
	}

	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
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
		return "Wishlist [wishListId=" + wishListId + ", product=" + product + ", user=" + user + "]";
	}
	
	
	
	
}
