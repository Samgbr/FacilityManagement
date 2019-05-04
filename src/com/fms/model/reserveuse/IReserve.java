package com.fms.model.reserveuse;

import com.fms.model.facility.Room;
import com.fms.model.user.UserI;

public interface IReserve {
	
	public String getReserveID();
	public void setReserveID(String reserveID);
	public String getDateFrom();
	public void setDateFrom(String dateFrom);
	public String getDateTo();
	public void setDateTo(String dateTo);
	public String getrStatus();
	public void setrStatus(String rStatus);
	public Room getRoom();
	public void setRoom(Room room);
	public InUse getInUse();
	public void setInUse(InUse inUse);	
	//Observer Pattern
	public UserI getObserver();
	public void setObserver(UserI observer);	

}
