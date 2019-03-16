package com.fms.model.maintenance;

import com.fms.model.facility.Room;

public interface IMaintenanceRequest {

	public String getRequestID();
	public void setRequestID(String requestID);
	public String getDescription();
	public void setDescription(String description);
	public String getUserID();
	public void setUserID(String userID);
	public String getRoomID();
	public void setRoomID(String roomID);
	public Room getRoom();
	public void setRoom(Room room);
	public MaintenanceOrder getMaintenanceOrder();
	public void setMaintenanceOrder(MaintenanceOrder maintenanceOrder);
}
