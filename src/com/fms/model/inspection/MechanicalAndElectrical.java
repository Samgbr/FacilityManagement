package com.fms.model.inspection;

import com.fms.model.facility.Building;


// Concrete Implementation 3 for a bridge design pattern
public class MechanicalAndElectrical implements IInspection{

	private String inspectionID;
	private String dateFrom;
	private String dateTo;
	private String inspectionType;
	private String inspectedBy;
	//private Building building;
	
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
	public String getInspectedBy() {
		return inspectedBy;
	}
	public void setInspectedBy(String inspectedBy) {
		this.inspectedBy = inspectedBy;
	}
	
	/*
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	} */
	
	@Override
	public void inspect() {
		System.out.println("Mechanical and Electrical Inspection Performed.\n"); 
	}
	
	
}
