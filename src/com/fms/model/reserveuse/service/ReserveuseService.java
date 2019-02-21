package com.fms.model.reserveuse.service;

import com.fms.dal.reserveuse.InUseDAO;
import com.fms.model.reserveuse.InUse;

public class ReserveuseService {
	//Insert new InUSe
	
	private InUseDAO inUseDAO=new InUseDAO();
	
	public void addInUse(InUse inUse) {
		try {
			inUseDAO.insertInUse(inUse.getUsageID(),inUse.getrStatus(),inUse.getReserveID(),inUse.getrStatus(),inUse.getUserID(),inUse.isUsedInInterval());
		}catch (Exception se) {
		      System.err.println("FacilityMaintenanceService: Threw a Exception adding Maintenance Request.");
		      System.err.println(se.getMessage());
		    }
	}
	

}
