package com.fms.model.facility.service;
import java.util.Set;

import com.fms.dal.facility.BuildingDAO;
import com.fms.dal.facility.RoomDAO;
import com.fms.model.facility.Building;
import com.fms.model.facility.Room;

public class FacilityService {
	
	private Building building;
	
	public void setBuilding(Building building) {
	    this.building = building;
	  }
	
	public Building getBuilding() {
		return building;
	}

	private BuildingDAO buildingDAO = new BuildingDAO();
	private RoomDAO roomDAO = new RoomDAO();
	
	//Insert new Building
	public Building addBuilding(Building building) {
		
		try {
			//System.out.println("DAOPhoneID: " + building.getPhones().iterator().next().getPhoneID());
			return buildingDAO.insertBuildingInfo(building.getFacilityID(), building.getFacilityName(), building.getAddress(), building.getCity(), building.getState(), building.getZipcode(), building.getType(), building.getCapacity(), building.getPhones(),building.getRooms());
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception adding Facility.");
	      System.err.println(se.getMessage());
	    }
		return null;
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
	
	//Get Room By IDy
		public Room getRoomByID(String rid) {
			
			try {
				Room room = roomDAO.getRoomByID(rid);
		    	return room;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Room.");
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
	//Remove Facility
	public String removeFacility(String facilityId) {
		
		try {
			buildingDAO.deleteBuilding(facilityId);
	    	return "OK";
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception deleting a Facility.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	
}
