package com.fms.model.maintenance;

import com.fms.model.facility.Room;

public class MaintenanceRequest implements IMaintenanceRequest{

	private String requestID;
	private String description;
	private String requestDate;
	private Room room;
	private MaintenanceOrder maintenanceOrder;
	
	public MaintenanceOrder getMaintenanceOrder() {
		return maintenanceOrder;
	}
	public void setMaintenanceOrder(MaintenanceOrder maintenanceOrder) {
		this.maintenanceOrder = maintenanceOrder;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
