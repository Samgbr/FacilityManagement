package com.fms.model.reserveuse;

import com.fms.model.facility.Room;

public class InUse implements IInUse {

	private String usageID;
	private String rStatus;
	private	String reserveID;
	private String roomID;
	private Room room;
	private String userID;
	
	
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	private int usedInInterval;
	
	public String getUsageID() {
		return usageID;
	}
	public void setUsageID(String usageID) {
		this.usageID = usageID;
	}
	public String getrStatus() {
		return rStatus;
	}
	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}
	public String getReserveID() {
		return reserveID;
	}
	public void setReserveID(String reserveID) {
		this.reserveID = reserveID;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getUsedInInterval() {
		return usedInInterval;
	}
	public void setUsedInInterval(int usedInInterval) {
		this.usedInInterval = usedInInterval;
	}
	
	
}
