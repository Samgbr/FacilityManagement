package com.fms.model.reserveuse;

import com.fms.model.facility.Room;
import com.fms.model.user.User;

public interface IReserve {
	public User getUser();
	public void setUser(User user);
	public Room getRoom();
	public void setRoom(Room room);
	
	

}
