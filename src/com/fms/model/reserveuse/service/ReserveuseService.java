package com.fms.model.reserveuse.service;

import java.util.Map;

import com.fms.dal.reserveuse.InUseDAO;
import com.fms.dal.reserveuse.ReserveDAO;
import com.fms.model.reserveuse.InUse;
import com.fms.model.reserveuse.Reserve;

public class ReserveuseService {
	
	//Insert new InUSe
	private InUseDAO inUseDAO = new InUseDAO();
	private ReserveDAO reserveDAO = new ReserveDAO();
	
		
	public void assignFacilityToUse(InUse inUse) {
			
		try {
				inUseDAO.insertInUse(inUse.getUsageID(),inUse.getrStatus(),inUse.getReserveID(), inUse.getRoomID(),inUse.getUserID(),inUse.getUsedInInterval());
			}catch (Exception se) {
			      System.err.println("FacilityFacilityUsageService: Threw a Exception adding Facility Usage.");
			      System.err.println(se.getMessage());
			}
	}
	
	//Insert facility reservation
	public void addReservation(Reserve reserve) {
		
		try {
				reserveDAO.insertReservation(reserve.getReserveID(), reserve.getDateFrom(), reserve.getDateTo(),reserve.getUserID(), reserve.getrStatus(), reserve.getRoomID());
			}catch (Exception se) {
			      System.err.println("FacilityReservationService: Threw a Exception Reserving Facility.");
			      System.err.println(se.getMessage());
			}
	}
	
	//List Reservation
		public Reserve getReservation(String rid) {
				
				try {
					Reserve reserve = reserveDAO.getFacilityReservation(rid);
			    	return reserve;
			    } catch (Exception se) {
			      System.err.println("FacilityReservationService: Threw a Exception retrieving Facility Reservation.");
			      System.err.println(se.getMessage());
			    }
				return null;
		}
		
		
		//List Facility Usage
				public InUse getFacilityUsage(String uid) {
						
						try {
							InUse inUse = inUseDAO.getFacilityUsage(uid);
					    	return inUse;
					    } catch (Exception se) {
					      System.err.println("FacilityUsageService: Threw a Exception retrieving Facility Usage.");
					      System.err.println(se.getMessage());
					    }
						return null;
				}
				
		//Is Facility used during interval
			public int getFacilityIntervalUsage(String rid) {
					
					try {
						return inUseDAO.getFacilityIntervalUsage(rid);
				    } catch (Exception se) {
				      System.err.println("FacilityintervalUsageService: Threw a Exception retrieving Facility Interval Usage.");
				      System.err.println(se.getMessage());
				    }
					return 0;
			}
			
			//List Actual Facility Usage
			public InUse getActualFacilityUsage(String rid) {
				
				try {
					InUse inUse = inUseDAO.getActualFacilityUsage(rid);
			    	return inUse;
			    } catch (Exception se) {
			      System.err.println("FacilityActualUsageService: Threw a Exception retrieving Actual Facility Usage.");
			      System.err.println(se.getMessage());
			    }
				return null;
			}
			
			
			//Vacate Facility
			public void vacateFacility(String rid) {
				
				try {
					inUseDAO.vacateFacility(rid);
					reserveDAO.cancelReservation(rid);
			    } catch (Exception se) {
			      System.err.println("VacateFacilityService: Threw a Exception retrieving Vacate Facility.");
			      System.err.println(se.getMessage());
			    }
			}
			
			
			//Calculate Usage Rate
			public Map<String, Integer> facilityUsageRate(String rid) {
				
				try {
					return inUseDAO.facilityUsageRate(rid);
			    } catch (Exception se) {
			      System.err.println("FacilityUsageRateService: Threw a Exception retrieving Facility Usage Rate.");
			      System.err.println(se.getMessage());
			    }
				
				return null;
			}
		
}
