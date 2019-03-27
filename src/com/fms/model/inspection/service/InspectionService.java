package com.fms.model.inspection.service;

import java.util.Set;

import com.fms.dal.inspection.InspectionDAO;
import com.fms.model.inspection.HeatingSystem;

public class InspectionService {
	/*
	private HeatingSystem inspection;
	
	public HeatingSystem getInspection() {
		return inspection;
	}

	public void setInspection(HeatingSystem inspection) {
		this.inspection = inspection;
	} */

	private InspectionDAO inspectionDAO = new InspectionDAO();
	
	//Insert inspections
	public void addInspections(Set<HeatingSystem> inspections, String facilityID) {
		try {
			
			inspectionDAO.insertInspectionInfo(inspections,facilityID);
			
		}catch(Exception se){
			 System.err.println("InspectionAddService: Threw a Exception Adding Facility Inspections.");
		      System.err.println(se.getMessage());
		}
		
	}
	
	public Set<HeatingSystem> listInspections(){
		try {
			Set<HeatingSystem> inspections = inspectionDAO.getBuildingInspections();
			return inspections;
			
		}catch(Exception se){
			 System.err.println("InspectionService: Threw a Exception retrieving Facility Inspections.");
		      System.err.println(se.getMessage());
		}
		return null;
	}

}
