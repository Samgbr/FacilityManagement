package com.fms.model.lease.decorator;

import java.util.Date;

import com.fms.model.facility.Building;
import com.fms.model.facility.Warehouse;
import com.fms.model.lease.Lease;
/**
 * This class is responsible for Decorator pattern to set lease discount on the Facility instances if eligible
 * @author samzi
 *
 */
public class LeaseDiscountDecorator implements ILeaseDiscountDecorator {
	
	private Building building;
	private Warehouse warehouse;
	public static final double BUILDING_LEASE_DISCOUNT = 0.10;
	public static final double WAREHOUSE_LEASE_DISCOUNT = 0.15;
	
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
		//If lease contract is more than a month get discount
		if (dys>=30) {
			lease.setDiscount(BUILDING_LEASE_DISCOUNT);
			System.out.println("Building lease Special discount offered: decorator pattern " + BUILDING_LEASE_DISCOUNT*100 + "% on the actual Rate discounted.");
		}
	}
	
	private void setLeaseDiscountWarehouse(Warehouse warehouse) {
			long days=0;
			Lease lease = warehouse.getLease();
			Date dateFrom = lease.getDateFrom();
			Date dateTo = lease.getDateTo();
			days = dateTo.getTime() - dateFrom.getTime();
			long dys = days/ (1000 * 60 * 60 * 24);
			//If lease contract is more than a month get discount
			if (dys>=30) {
				lease.setDiscount(WAREHOUSE_LEASE_DISCOUNT);
				System.out.println("Warehouse lease Special discount offered: decorator pattern " + WAREHOUSE_LEASE_DISCOUNT*100 + "% on the actual Rate discounted.");
			}
	}
	
}
