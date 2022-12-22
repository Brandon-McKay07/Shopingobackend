package com.cbfsd.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categoryid")
	private int categoryId;

	private boolean active;

	@Column(name = "addedon")
	private LocalDate addedOn;

	@Column(name = "categorydescription")
	private String categoryDescription;

	@Column(name = "categoryimageurl")
	private String categoryImageUrl;

	@Column(name = "categoryname")
	private String categoryName;


	private List<Product> products;


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(int categoryId, boolean active, LocalDate addedOn, String categoryDescription, String categoryImageUrl,
			String categoryName, List<Product> products) {
		super();
		this.categoryId = categoryId;
		this.active = active;
		this.addedOn = addedOn;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
		this.categoryName = categoryName;
		this.products = products;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public LocalDate getAddedOn() {
		return addedOn;
	}


	public void setAddedOn(LocalDate addedOn) {
		this.addedOn = addedOn;
	}


	public String getCategoryDescription() {
		return categoryDescription;
	}


	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}


	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}


	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", active=" + active + ", addedOn=" + addedOn
				+ ", categoryDescription=" + categoryDescription + ", categoryImageUrl=" + categoryImageUrl
				+ ", categoryName=" + categoryName + ", products=" + products + "]";
	}
	
	
	
	
	
	
}
