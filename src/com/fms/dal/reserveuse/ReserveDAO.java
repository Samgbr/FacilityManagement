package com.fms.dal.reserveuse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.DBConnect;
import com.fms.model.reserveuse.Reserve;

public class ReserveDAO {
	
	// Add Reservation
	public Reserve insertReservation(String reserveID, String dateFrom, String dateTo, String userID, String rStatus, String roomID) {
		
		Reserve reserve=new Reserve();
		
		reserve.setReserveID(reserveID);
		reserve.setDateFrom(dateFrom);
		reserve.setDateTo(dateTo);
		reserve.setrStatus(rStatus);
		reserve.setRoomID(roomID);
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		try {
			Statement insertStatement = connection.createStatement();
			
			String insertQuery="INSERT INTO reserve(ReserveID,DateFrom,DateTo,UserID,Rstatus,RoomID) "
					+"VALUES('"+reserveID+"','"+dateFrom+"','"+dateTo+"','"+userID+"','"+rStatus+"','"+roomID+"')";
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
		
		return reserve;
	}
	
	//Get Facility Reservation
	public Reserve getFacilityReservation(String rid) {
		String reserveID=rid;
		String dateFrom="";
		String dateTo = "";
		String roomID = "";
		String userID = "";
		String rStatus = "";
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from reserve where ReserveID='" + rid +"'";
			ResultSet resultSet = selectStatement.executeQuery(selectQuery);
			resultSet.next();
			rStatus = resultSet.getString("Rstatus");
			reserveID = resultSet.getString("ReserveID");
			roomID = resultSet.getString("RoomID");
			userID = resultSet.getString("UserID");
			rStatus = resultSet.getString("DateTo");
			dateFrom = resultSet.getString("DateFrom");
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
		Reserve reserve = new Reserve();
		reserve.setReserveID(reserveID);
		reserve.setDateFrom(dateFrom);
		reserve.setDateTo(dateTo);
		reserve.setRoomID(roomID);
		reserve.setrStatus(rStatus);
		reserve.setUserID(userID);
		
		return reserve;	
	}
	
	//Cancel Reservation
	public void cancelReservation(String roomID) {
		String status = "Cancelled";
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
				
				String insertQuery = "UPDATE reserve SET Rstatus='"+status+"'  WHERE RoomID='"+roomID+"'";
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
	}

}
