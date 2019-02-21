package com.fms.model.inspection.service;

import java.util.Set;

import com.fms.dal.inspection.InspectionDAO;
import com.fms.model.inspection.Inspection;

public class InspectionService {
	private InspectionDAO inspectionDAO=new InspectionDAO();
	
	//insert inspections
	public void addInspection(Set<Inspection> inspection) {
		try {
			inspectionDAO.insertInspectionInfo()
		}
		
	}
	
	public Set<Inspection> listInspections(String fid){
		try {
			Set<Inspection> inspections=inspectionDAO.getBuildingInspections(fid);
			return inspections;
			
		}catch(Exception se){
			 System.err.println("inspectionService: Threw a Exception retrieving Facility.");
		      System.err.println(se.getMessage());
		}
		return null;
	}

}
