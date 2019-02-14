package com.fms.model.facility.service;
import java.util.Set;

import com.fms.dal.facility.BuildingDAO;
import com.fms.model.facility.Building;

public class FacilityService {

	private BuildingDAO buildingDAO = new BuildingDAO();
	
	//Insert new Building
	public void addBuilding(Building building) {
		
		try {
			buildingDAO.insertBuildingInfo(building.getFacilityID(), building.getFacilityName(), building.getAddress(), building.getCity(), building.getState(), building.getZipcode(), building.getType(), building.getCapacity(), building.getPhones(),building.getRooms());
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception adding Facility.");
	      System.err.println(se.getMessage());
	    }
	}
	
	//List All Facilities
	public Set<Building> listFacilities() {
				
			try {
				Set<Building> buildings = buildingDAO.listFacilities();
		    	return buildings;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Facilities.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
	
	//Get Facility
	public Building getFacility(String facilityId) {
		
		try {
			Building building = buildingDAO.getFacility(facilityId);
	    	return building;
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception retrieving Facility.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//Get Facility Available Capacity
	public int getAvailableCapacity(String facilityId) {
			
			try {
				int capacity = buildingDAO.getAvailableCapacity(facilityId);
		    	return capacity;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Facility Capacity.");
		      System.err.println(se.getMessage());
		    }
			return 0;
		}
	
}
