package com.cbfsd.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Admins {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adminid")
	private int adminId;
	@Column(name = "addedon")
	private LocalDate addedOn;
	private String email;
	@Column(name = "fullname")
	private String fullName;
	@Column(name = "logintype")
	private int loginType;

	private String password;

	
	
	public Admins() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Admins(int adminId, LocalDate addedOn, String email, String fullName, int loginType, String password) {
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



	public LocalDate getAddedOn() {
		return addedOn;
	}



	public void setAddedOn(LocalDate addedOn) {
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
