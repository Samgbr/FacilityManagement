package com.fms.model.lease;

import java.util.Date;

import com.fms.model.customer.Customer;

public class Lease {

	private String leaseNumber;
	private Customer customer;
	private double rate; //per day
	private Date dateOfLease;
	private Date dateFrom;
	private Date dateTo;
	
	public String getLeaseNumber() {
		return leaseNumber;
	}
	public void setLeaseNumber(String leaseNumber) {
		this.leaseNumber = leaseNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Date getDateOfLease() {
		return dateOfLease;
	}
	public void setDateOfLease(Date dateOfLease) {
		this.dateOfLease = dateOfLease;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	
}
