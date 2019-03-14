package com.fms.model.user;

import com.fms.model.reserveuse.IReserve;

public interface UserI {
	
	public String getUserID();
	public void setUserID(String userID);
	public String getName();
	public void setName(String name);
	public String getPhoneNumber();
	public void setPhoneNumber(String phoneNumber);
	public String getAddress();
	public void setAddress(String address);
	public String getTypeOfUser();
	public void setTypeOfUser(String typeOfUser);
	public IReserve getReserve();
	public void setIReserve(IReserve reserve);

}
