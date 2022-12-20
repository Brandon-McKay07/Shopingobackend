package com.cbfsd.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Shipment {

	
	@Id
	private int shipmentId;
	

	private Date expectedDeliveryDate;

	private String shipmentCompany;


	private Date shipmentDate;
	
	private String shipmentMethod;
	
	private int shipmentStatus;

	private String shipmentTitle;

	
	private Order order;


	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Shipment(int shipmentId, Date expectedDeliveryDate, String shipmentCompany, Date shipmentDate,
			String shipmentMethod, int shipmentStatus, String shipmentTitle, Order order) {
		super();
		this.shipmentId = shipmentId;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.shipmentCompany = shipmentCompany;
		this.shipmentDate = shipmentDate;
		this.shipmentMethod = shipmentMethod;
		this.shipmentStatus = shipmentStatus;
		this.shipmentTitle = shipmentTitle;
		this.order = order;
	}


	public int getShipmentId() {
		return shipmentId;
	}


	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}


	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}


	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}


	public String getShipmentCompany() {
		return shipmentCompany;
	}


	public void setShipmentCompany(String shipmentCompany) {
		this.shipmentCompany = shipmentCompany;
	}


	public Date getShipmentDate() {
		return shipmentDate;
	}


	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}


	public String getShipmentMethod() {
		return shipmentMethod;
	}


	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}


	public int getShipmentStatus() {
		return shipmentStatus;
	}


	public void setShipmentStatus(int shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}


	public String getShipmentTitle() {
		return shipmentTitle;
	}


	public void setShipmentTitle(String shipmentTitle) {
		this.shipmentTitle = shipmentTitle;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", expectedDeliveryDate=" + expectedDeliveryDate
				+ ", shipmentCompany=" + shipmentCompany + ", shipmentDate=" + shipmentDate + ", shipmentMethod="
				+ shipmentMethod + ", shipmentStatus=" + shipmentStatus + ", shipmentTitle=" + shipmentTitle
				+ ", order=" + order + "]";
	}

	
	
	
	
	
	
}
