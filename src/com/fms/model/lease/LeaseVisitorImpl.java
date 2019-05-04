package com.fms.model.lease;

import java.util.Date;

import com.fms.model.facility.Building;
import com.fms.model.facility.Warehouse;

/**
 * This is a class used for handling Facilities that are on lease and it is a concrete visitor
 * @author samzi
 *
 */
public class LeaseVisitorImpl implements LeaseVisitor {

	@Override
	public double visit(Building building) {
		//Calculate the total lease amount
		System.out.println("Calculate the total lease amount for building - use visitor pattern");
		long days=0;
		double leaseTotal = 0.0;
		Lease lease = building.getLease();
		Date dateFrom = lease.getDateFrom();
		Date dateTo = lease.getDateTo();
		days = dateTo.getTime() - dateFrom.getTime();
		long dys = days/ (1000 * 60 * 60 * 24);
		double discount=0.0, discountTotal=0.0;
		if (dys>=30) {
			discount = lease.getRate() * lease.getDiscount();  // Getting discount from decorator
			discountTotal = lease.getRate() * lease.getDiscount() * dys;
			leaseTotal = dys * (lease.getRate() - discount);
		} else {
			leaseTotal = dys * lease.getRate();
		}
		System.out.println("Days: " + dys + " * lease rate per day: $" + lease.getRate());
		System.out.println("Total lease amount: $" + leaseTotal + " discount total: $"+ discountTotal + " = "+ dys + " * "+ discount+ "\n");
		return leaseTotal;
	}
	
	@Override
	public double visit(Warehouse warehouse) {
		//Calculate the total lease amount
		System.out.println("Calculate the total lease amount for warehouse - use visitor pattern");
		long days=0;
		double leaseTotal = 0.0;
		Lease lease = warehouse.getLease();
		Date dateFrom = lease.getDateFrom();
		Date dateTo = lease.getDateTo();
		days = dateTo.getTime() - dateFrom.getTime();
		long dys = days/ (1000 * 60 * 60 * 24);
		double discount=0.0, discountTotal =0.0;
		if (dys>=30) {
			discount = lease.getRate() * lease.getDiscount();  // Get discount from the decorator
			discountTotal = lease.getRate() * lease.getDiscount() * dys;
			leaseTotal = dys * (lease.getRate() - discount);
		} else {
			leaseTotal = dys * lease.getRate();
		}
		System.out.println("Days: " + dys + " * lease rate per day: $" + lease.getRate());
		System.out.println("Total lease amount: $" + leaseTotal + " discount total: $" + discountTotal +" = "+ dys + " * "+ discount+"\n");
		return leaseTotal;
	}
	
	
}
