package com.cbfsd.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Product {

	@Id
	private int productId;


	private Date addedOn;

	

	private String images[];

	private int price;

	private String productCode;

	private String productDescription;
	
	private String productTitle;

	private int rating;
	
	private int thumbnailImage;

	
	private List<Cart> carts;

	
	private List<Orderitem> orderitems;


	private Category category;

	private List<Wishlist> whishlists;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, Date addedOn, String[] images, int price, String productCode,
			String productDescription, String productTitle, int rating, int thumbnailImage, List<Cart> carts,
			List<Orderitem> orderitems, Category category, List<Wishlist> whishlists) {
		super();
		this.productId = productId;
		this.addedOn = addedOn;
		this.images = images;
		this.price = price;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productTitle = productTitle;
		this.rating = rating;
		this.thumbnailImage = thumbnailImage;
		this.carts = carts;
		this.orderitems = orderitems;
		this.category = category;
		this.whishlists = whishlists;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(int thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public List<Orderitem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Wishlist> getWhishlists() {
		return whishlists;
	}

	public void setWhishlists(List<Wishlist> whishlists) {
		this.whishlists = whishlists;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", addedOn=" + addedOn + ", images=" + Arrays.toString(images)
				+ ", price=" + price + ", productCode=" + productCode + ", productDescription=" + productDescription
				+ ", productTitle=" + productTitle + ", rating=" + rating + ", thumbnailImage=" + thumbnailImage
				+ ", carts=" + carts + ", orderitems=" + orderitems + ", category=" + category + ", whishlists="
				+ whishlists + "]";
	}
	
	
	
	
}
