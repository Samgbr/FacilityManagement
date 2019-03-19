package com.fms.dal.reserveuse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.fms.dal.DBConnect;
import com.fms.model.reserveuse.InUse;

public class InUseDAO {
	
	//Add Facility Usage
	public InUse insertInUse(String usageID, String rstatus, String reserveID, String roomID, String userID, int usedInInterval) {
		
		InUse inUse=new InUse();
		
		inUse.setUsageID(usageID);
		inUse.setrStatus(rstatus);
		inUse.setUsedInInterval(usedInInterval);
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		try {
			Statement insertStatement = connection.createStatement();
			
			String insertQuery="INSERT INTO inuse(UsageID,Rstatus,ReserveID,RoomID,UserID,UsedInInterval) "
					+"VALUES('"+usageID+"','"+rstatus+"','"+reserveID+"','"+roomID+"','"+userID+"','"+usedInInterval+"')";
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
	
	//Get Facility Usage
			public InUse getFacilityUsage(String uid) {
				String usageID=uid;
				String rStatus="";
				int usedInInterval = 0;
				
				Connection connection = DBConnect.getDatabaseConnection();
				
				
				try {
					Statement selectStatement = connection.createStatement();
					
					String selectQuery = "SELECT * from inuse where UsageID='" + uid +"'";
					ResultSet resultSet = selectStatement.executeQuery(selectQuery);
					resultSet.next();
					rStatus = resultSet.getString("Rstatus");
					usedInInterval = resultSet.getInt("UsedInInterval");
					
				}catch(SQLException se) {
					se.printStackTrace();
				}finally {
					if(connection != null) {
						try {
							connection.close();
						} catch (SQLException e) {}
					}
				}
				
				InUse inUse = new InUse();
				inUse.setUsageID(usageID);
				inUse.setrStatus(rStatus);
				inUse.setUsedInInterval(usedInInterval);
				
				return inUse;	
			}

			public int getFacilityIntervalUsage(String rid) {
				
				Connection connection = DBConnect.getDatabaseConnection();
				
				
				try {
					Statement selectStatement = connection.createStatement();
					
					String selectQuery = "SELECT * from inuse where RoomID='" + rid +"'";
					ResultSet resultSet = selectStatement.executeQuery(selectQuery);
					resultSet.next();
					int usedInInterval = resultSet.getInt("UsedInInterval");
					return usedInInterval;
				}catch(SQLException se) {
					se.printStackTrace();
				}finally {
					if(connection != null) {
						try {
							connection.close();
						} catch (SQLException e) {}
					}
				}
				return 0;
			}
			
			// List Actual Facility Usage
			public InUse getActualFacilityUsage(String rid) {
				String usageID="";
				String rStatus="";
				int usedInInterval = 0;
				
				Connection connection = DBConnect.getDatabaseConnection();
				
				
				try {
					Statement selectStatement = connection.createStatement();
					
					String selectQuery = "SELECT * from inuse where RoomID='" + rid +"'";
					ResultSet resultSet = selectStatement.executeQuery(selectQuery);
					resultSet.next();
					rStatus = resultSet.getString("Rstatus");
					usageID = resultSet.getString("UsageID");
					usedInInterval = resultSet.getInt("UsedInInterval");
				}catch(SQLException se) {
					se.printStackTrace();
				}finally {
					if(connection != null) {
						try {
							connection.close();
						} catch (SQLException e) {}
					}
				}
				
				InUse inUse = new InUse();
				inUse.setUsageID(usageID);
				inUse.setrStatus(rStatus);
				inUse.setUsedInInterval(usedInInterval);
				
				return inUse;
			}
		
			//Vacate Facility
			public void vacateFacility(String roomID) {
				String status = "Vacant";
				Connection connection = DBConnect.getDatabaseConnection();
				try {
					Statement insertStatement = connection.createStatement();
						
						String insertQuery = "UPDATE inuse SET Rstatus='"+status+"'  WHERE RoomID='"+roomID+"'";
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
			
			//Usage Rate
			//SELECT RoomID,COUNT(*) AS UsageRate FROM inuse WHERE RoomID="" GROUP BY RoomID HAVING count(RoomID);
			public Map<String,Integer> facilityUsageRate(String roomID) {
										
					Connection connection = DBConnect.getDatabaseConnection();
					Map<String,Integer> userates = new HashMap<>();
										
					try {
							Statement selectStatement = connection.createStatement();
											
							String selectQuery = "SELECT RoomID,COUNT(*) AS UsageRate from inuse where RoomID='" + roomID +"' GROUP BY RoomID HAVING count(RoomID)";
							ResultSet resultSet = selectStatement.executeQuery(selectQuery);
											
							while(resultSet.next()) {
								String rID = resultSet.getString("RoomID");
								int usagerate = resultSet.getInt("UsageRate");
								if(rID != null) {
									userates.put(rID, usagerate);
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
										
						return userates;
										
					}
}
