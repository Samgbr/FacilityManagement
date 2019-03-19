package com.fms.model.maintenance;

import com.fms.model.facility.Room;

public interface IMaintenanceRequest {

	public String getRequestID();
	public void setRequestID(String requestID);
	public String getDescription();
	public void setDescription(String description);
	public Room getRoom();
	public void setRoom(Room room);
	public MaintenanceOrder getMaintenanceOrder();
	public void setMaintenanceOrder(MaintenanceOrder maintenanceOrder);
}
