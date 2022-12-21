package com.cbfsd.entity;

import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Order {

	@Id
	@Column(name = "adminid")
	private int orderId;

	private String address;

	private BigInteger contact;

	private String email;

	@Column(name = "itemsubtotal")
	private int itemsSubTotal;

	private String name;

	@Column(name = "orderdate")
	private LocalDate orderDate;

	@Column(name = "orderstatus")
	private String orderStatus;

	@Column(name = "paymentmethod")
	private int paymentMethod;
	
	
	@Column(name = "paymentmethodtitle")
	private String paymentMethodTitle;

	@Column(name = "paymentstatus")
	private int paymentStatus;
	
	@Column(name = "paymentstatustitle")
	private String paymentStatusTitle;

	@Column(name = "shipmentcharges")
	private int shipmentCharges;

	@Column(name = "totalamount")
	private int totalAmount;

	@Column(name = "totalitems")
	private int totalItems;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String address, BigInteger contact, String email, int itemsSubTotal, String name,
			LocalDate orderDate, String orderStatus, int paymentMethod, String paymentMethodTitle, int paymentStatus,
			String paymentStatusTitle, int shipmentCharges, int totalAmount, int totalItems) {
		super();
		this.orderId = orderId;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.itemsSubTotal = itemsSubTotal;
		this.name = name;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
		this.paymentMethodTitle = paymentMethodTitle;
		this.paymentStatus = paymentStatus;
		this.paymentStatusTitle = paymentStatusTitle;
		this.shipmentCharges = shipmentCharges;
		this.totalAmount = totalAmount;
		this.totalItems = totalItems;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getContact() {
		return contact;
	}

	public void setContact(BigInteger contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getItemsSubTotal() {
		return itemsSubTotal;
	}

	public void setItemsSubTotal(int itemsSubTotal) {
		this.itemsSubTotal = itemsSubTotal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethodTitle() {
		return paymentMethodTitle;
	}

	public void setPaymentMethodTitle(String paymentMethodTitle) {
		this.paymentMethodTitle = paymentMethodTitle;
	}

	public int getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatusTitle() {
		return paymentStatusTitle;
	}

	public void setPaymentStatusTitle(String paymentStatusTitle) {
		this.paymentStatusTitle = paymentStatusTitle;
	}

	public int getShipmentCharges() {
		return shipmentCharges;
	}

	public void setShipmentCharges(int shipmentCharges) {
		this.shipmentCharges = shipmentCharges;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", address=" + address + ", contact=" + contact + ", email=" + email
				+ ", itemsSubTotal=" + itemsSubTotal + ", name=" + name + ", orderDate=" + orderDate + ", orderStatus="
				+ orderStatus + ", paymentMethod=" + paymentMethod + ", paymentMethodTitle=" + paymentMethodTitle
				+ ", paymentStatus=" + paymentStatus + ", paymentStatusTitle=" + paymentStatusTitle
				+ ", shipmentCharges=" + shipmentCharges + ", totalAmount=" + totalAmount + ", totalItems=" + totalItems
				+ "]";
	}

	
	
	
	
	
}
