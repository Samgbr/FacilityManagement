package com.fms.model.reserveuse;

import com.fms.model.facility.Room;

public interface IInUse {
	
	public String getUsageID();
	public void setUsageID(String usageID);
	public String getrStatus();
	public void setrStatus(String rStatus);
	public String getReserveID();
	public void setReserveID(String reserveID);
	public String getRoomID();
	public void setRoomID(String roomID);
	public Room getRoom();
	public void setRoom(Room room);	
	public String getUserID();
	public void setUserID(String userID);

}
