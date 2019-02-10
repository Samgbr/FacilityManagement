package com.fms.dal.facility;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.DBConnect;
import com.fms.model.facility.Building;


public class BuildingDAO {

	
	public Building insertBuildingInfo(String facilityID, String facilityName, String address, String city, String state, String zipcode, String type, int capacity) {
		Building building = new Building();
		building.setFacilityID(facilityID);;
		building.setFacilityName(facilityName);
		building.setAddress(address);
		building.setCity(city);
		building.setState(state);
		building.setZipcode(zipcode);
		building.setType(type);
		building.setCapacity(capacity);
		
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
				/*
				Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10000);
			    String addressID = "AD" + randomInt; */
				
				String insertQuery = "INSERT INTO building(FacilityID, FacilityName, Address,City,State,ZipCode,Capacity) "
						+ "VALUES('"+facilityID+"','"+facilityName+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+capacity+"')";
				insertStatement.executeUpdate(insertQuery);	
			
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
}
