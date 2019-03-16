package com.fms.model.reserveuse;

import com.fms.model.facility.Room;

public class Reserve implements IReserve {

	private String reserveID;
	private String dateFrom;
	private String dateTo;
	private String userID;
	private String rStatus;
	private String roomID;
	private Room room;
	private InUse inUse;
	
	public InUse getInUse() {
		return inUse;
	}
	public void setInUse(InUse inUse) {
		this.inUse = inUse;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public String getReserveID() {
		return reserveID;
	}
	public void setReserveID(String reserveID) {
		this.reserveID = reserveID;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getrStatus() {
		return rStatus;
	}
	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	
	
}
