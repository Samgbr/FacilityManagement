package com.fms.dal.facility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.fms.dal.DBConnect;
import com.fms.model.facility.Building;
import com.fms.model.facility.Phone;
import com.fms.model.facility.Room;


public class BuildingDAO {

	private PhoneDAO phoneDAO = new PhoneDAO();
	private RoomDAO roomDAO = new RoomDAO();
	// Insert Building data
	public Building insertBuildingInfo(String facilityID, String facilityName, String address, String city, String state, String zipcode, String type, int capacity, Set<Phone> phones, Set<Room> rooms) {
		
		Building building = new Building();
		building.setFacilityID(facilityID);
		building.setFacilityName(facilityName);
		building.setAddress(address);
		building.setCity(city);
		building.setState(state);
		building.setZipcode(zipcode);
		building.setType(type);
		building.setCapacity(capacity);
		building.setPhones(phones);
		building.setRooms(rooms);
		
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
				
				String insertQuery = "INSERT INTO building(FacilityID, FacilityName, Address,City,State,ZipCode,Type,Capacity) "
						+ "VALUES('"+facilityID+"','"+facilityName+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+type+"','"+capacity+"')";
				insertStatement.executeUpdate(insertQuery);	
				
				
				phoneDAO.insertPhoneInfos(building.getPhones());
				roomDAO.insertRoomInfos(building.getRooms());
				
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		return building;		
	}
	
	//Get all Facilities
	public Set<Building> listFacilities() {
		
		Connection connection = DBConnect.getDatabaseConnection();
		Set<Building> buildings = new HashSet<>();
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from building";
			ResultSet resultSet = selectStatement.executeQuery(selectQuery);
			
			while(resultSet.next()) {
				String facilityID = resultSet.getString("FacilityID");
				Building building = getFacility(facilityID);
				if(building != null) {
					buildings.add(building);
				}
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
		return buildings;
		
	}
	
	// Get a Facility
	public Building getFacility(String fid) {
		String facilityID=fid;
		String facilityName="";
		String address = "";
		String city = "";
		String state = "";
		String zipcode = "";
		String type="";
		int capacity=0;
		Set<Phone> phones = new HashSet<>();
		Set<Room> rooms = new HashSet<>();
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from building where FacilityID='" + fid +"'";
			ResultSet resultSet = selectStatement.executeQuery(selectQuery);
			resultSet.next();
			facilityName= resultSet.getString("FacilityName");
			address = resultSet.getString("Address");
			city = resultSet.getString("City");
			state = resultSet.getString("State");
			zipcode = resultSet.getString("ZipCode");
			type = resultSet.getString("Type");
			capacity = resultSet.getInt("Capacity");
			
			phones = phoneDAO.getBuildingPhones(fid);
			rooms  = roomDAO.getBuildingRooms(fid);
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
		Building building = new Building();
		building.setFacilityID(facilityID);
		building.setFacilityName(facilityName);
		building.setAddress(address);
		building.setCity(city);
		building.setState(state);
		building.setZipcode(zipcode);
		building.setType(type);
		building.setCapacity(capacity);
		building.setPhones(phones);
		building.setRooms(rooms);
		return building;	
	}
	
	//Remove a Facility
	public void deleteBuilding(String fid) {
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement deleteStatement = connection.createStatement();
			
			phoneDAO.deletePhone(fid);
			roomDAO.deleteRooms(fid);
			
			String deleteQuery = "DELETE FROM building WHERE FacilityID='"+fid+"'";
			deleteStatement.executeUpdate(deleteQuery);	
						
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
	}
	
	
	
	//Get available capacity for a facility
	public int getAvailableCapacity(String fid) {
		Building building = getFacility(fid);
		return building.getCapacity();
	}
}
