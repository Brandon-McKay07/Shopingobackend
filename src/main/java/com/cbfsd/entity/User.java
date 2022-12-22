package com.cbfsd.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userids")
	private int userId;

	@Column(name = "addedon")
	private Date addedOn;

	private String city;

	private BigInteger contact;

	private String country;

	private String email;
	
	
	@Column(name = "fullname")
	private String fullName;

	private String image;

	private String password;

	private int pincode;

	private String state;

	private String street;

	
	private List<Cart> carts;

	
	private List<Order> orders;


	private List<Wishlist> wishlists;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Date getAddedOn() {
		return addedOn;
	}


	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public BigInteger getContact() {
		return contact;
	}


	public void setContact(BigInteger contact) {
		this.contact = contact;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public List<Cart> getCarts() {
		return carts;
	}


	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	public List<Wishlist> getWishlists() {
		return wishlists;
	}


	public void setWishlists(List<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", addedOn=" + addedOn + ", city=" + city + ", contact=" + contact
				+ ", country=" + country + ", email=" + email + ", fullName=" + fullName + ", image=" + image
				+ ", password=" + password + ", pincode=" + pincode + ", state=" + state + ", street=" + street
				+ ", carts=" + carts + ", orders=" + orders + ", whishlists=" + wishlists + "]";
	}
	
	
	
	
	
	
}
