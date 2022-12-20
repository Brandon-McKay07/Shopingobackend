package com.cbfsd.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Admins {
	@Id
	private int adminId;
	private Date addedOn;
	private String email;

	private String fullName;
	
	private int loginType;

	private String password;

	
	
	public Admins() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Admins(int adminId, Date addedOn, String email, String fullName, int loginType, String password) {
		super();
		this.adminId = adminId;
		this.addedOn = addedOn;
		this.email = email;
		this.fullName = fullName;
		this.loginType = loginType;
		this.password = password;
	}



	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public Date getAddedOn() {
		return addedOn;
	}



	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
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



	public int getLoginType() {
		return loginType;
	}



	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Admins [adminId=" + adminId + ", addedOn=" + addedOn + ", email=" + email + ", fullName=" + fullName
				+ ", loginType=" + loginType + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
