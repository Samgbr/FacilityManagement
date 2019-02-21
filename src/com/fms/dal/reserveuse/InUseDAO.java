package com.fms.dal.reserveuse;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.DBConnect;
import com.fms.model.reserveuse.InUse;

public class InUseDAO {
	
	public InUse insertInUse(String usageID, String rstatus, String reserveID, String roomID, Boolean usedInInterval) {
		
		InUse inUse=new InUse();
		
		inUse.setUsageID(usageID);
		inUse.setrStatus(rstatus);
		inUse.setReserveID(reserveID);
		inUse.setRoomID(roomID);
		inUse.setUsedInInterval(usedInInterval);
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		try {
			Statement insertStatement = connection.createStatement();
			
			String insertQuery="INSERT INTO inuse(UsageID,Rstatus,ReserveID,RoomID,UserID,UsedInInterval)"
					+"VALUES('"+usageID+"','"+rstatus+"'+'"+reserveID+"','"+roomID+"','"+usedInInterval+"')";
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
		
		return inUse;
	}

}
