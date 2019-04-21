package com.fms.model.lease.decorator;

import java.util.Date;

import com.fms.model.facility.Building;
import com.fms.model.facility.Warehouse;
import com.fms.model.lease.Lease;
/**
 * This class is responsible for Decorator pattern
 * @author samzi
 *
 */
public class LeaseDiscountDecorator implements ILeaseDiscountDecorator {
	
	private Building building;
	private Warehouse warehouse;
	
	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
		setLeaseDiscountWarehouse(warehouse);
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
		setLeaseDiscountBuilding(building);
	}
	
	private void setLeaseDiscountBuilding(Building building) {
		long days=0;
		Lease lease = building.getLease();
		Date dateFrom = lease.getDateFrom();
		Date dateTo = lease.getDateTo();
		days = dateTo.getTime() - dateFrom.getTime();
		long dys = days/ (1000 * 60 * 60 * 24);
		if (dys>=30) {
			double discount  = 0.10;
			lease.setDiscount(discount);
			System.out.println("Building lease Special discount offered: decorator pattern " + discount*100 + "% on the actual Rate discounted.");
		}
	}
	
	private void setLeaseDiscountWarehouse(Warehouse warehouse) {
			long days=0;
			Lease lease = warehouse.getLease();
			Date dateFrom = lease.getDateFrom();
			Date dateTo = lease.getDateTo();
			days = dateTo.getTime() - dateFrom.getTime();
			long dys = days/ (1000 * 60 * 60 * 24);
			if (dys>=30) {
				double discount  = 0.15;
				lease.setDiscount(discount);
				System.out.println("Warehouse lease Special discount offered: decorator pattern " + discount*100 + "% on the actual Rate discounted.");
			}
	}
	
}
