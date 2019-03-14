package com.fms.model.user;

import com.fms.model.reserveuse.IReserve;

public class User implements UserI {
	
	private String userID;
	private String Name;
	private String phoneNumber;
	private String address;
	private String typeOfUser;
	private IReserve reserve;
	
	public User() {}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	
	public IReserve getReserve() {
		return reserve;
	}


	public void setIReserve(IReserve reserve) {
		this.reserve=reserve;
		
	}
	
	
	
}
