package com.fms.model.inspection;


import com.fms.model.facility.Building;
import com.fms.model.user.User;

public class Inspection implements IInspection{

	private String inspectionID;
	private String dateFrom;
	private String dateTo;
	private String inspectionType;
	private String userID;
	private String facilityID;
	private User user = new User();
	private Building building = new Building();
	
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(String facilityID) {
		this.facilityID = facilityID;
	}

	public Inspection() {}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getInspectionID() {
		return inspectionID;
	}
	public void setInspectionID(String inspectionID) {
		this.inspectionID = inspectionID;
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
	public String getInspectionType() {
		return inspectionType;
	}
	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}
	
}
