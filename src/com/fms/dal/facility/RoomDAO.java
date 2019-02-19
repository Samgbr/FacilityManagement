package com.fms.dal.facility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fms.dal.DBConnect;
import com.fms.model.facility.Room;

public class RoomDAO {

	public Set<Room> insertRoomInfos(Set<Room> rooms) {
		
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
			
			Iterator<Room> roomIterator = rooms.iterator();
			
			while(roomIterator.hasNext()) {
				/*
				Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10000);
			    String phoneID = "PH" + randomInt; */
				
				Room currentRoom = roomIterator.next(); 
				
				String insertQuery = "INSERT INTO room(RoomID, RoomType, FacilityID) "
						+ "VALUES('"+currentRoom.getRoomID()+"','"+currentRoom.getType()+"','"+currentRoom.getFacilityID()+"')";
				insertStatement.executeUpdate(insertQuery);
				
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
		return rooms;		
	}
	
	//Get all rooms for a Facility
	
	public Set<Room> getBuildingRooms(String fid) {
		
		Connection connection = DBConnect.getDatabaseConnection();
		Set<Room> rooms = new HashSet<>();
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from room WHERE FacilityID='"+fid+"'";
			ResultSet resultSet = selectStatement.executeQuery(selectQuery);
			
			while(resultSet.next()) {
				String roomID= resultSet.getString("RoomID");
				String type = resultSet.getString("RoomType");
				String facilityID = resultSet.getString("FacilityID");
				
				Room room = new Room();
				room.setRoomID(roomID);
				room.setType(type);
				room.setFacilityID(facilityID);
				rooms.add(room);
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
		
		return rooms;
	}
	
	public void deleteRooms(String fid) {
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement deleteStatement = connection.createStatement();
			
			String deleteQuery = "DELETE FROM room WHERE FacilityID='"+fid+"'";
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

}
