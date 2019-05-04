package com.fms.model.facility;

import java.util.Set;

import com.fms.model.inspection.AirConditioning;
import com.fms.model.inspection.HeatingSystem;
import com.fms.model.inspection.MechanicalAndElectrical;
import com.fms.model.lease.Lease;
import com.fms.model.lease.LeaseVisitor;

public class Warehouse extends Facility implements IFacility {

	private String type;
	private int capacity;
	private Set<Phone> phones;
	private Set<Room> rooms;
	
	//Facility Lease visitor pattern
	private Lease lease;
		
	public Lease getLease() {
		return lease;
	}
	public void setLease(Lease lease) {
		this.lease = lease;
	}

	//Inspect Implementation instance for setter injection
	private HeatingSystem heatInspection;
	private AirConditioning acInspection;
	private MechanicalAndElectrical mechElecInspection;
	
	public HeatingSystem getHeatInspection() {
		return heatInspection;
	}
	public void setHeatInspection(HeatingSystem heatInspection) {
		this.heatInspection = heatInspection;
	}
	public AirConditioning getAcInspection() {
		return acInspection;
	}
	public void setAcInspection(AirConditioning acInspection) {
		this.acInspection = acInspection;
	}
	public MechanicalAndElectrical getMechElecInspection() {
		return mechElecInspection;
	}
	public void setMechElecInspection(MechanicalAndElectrical mechElecInspection) {
		this.mechElecInspection = mechElecInspection;
	}
	public Set<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	public Set<Room> getRooms() {
		return rooms;
	}
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public void doInspections() {
		System.out.println("\nWarehouse Inspections: Bidge Pattern");
		heatInspection.inspect();
		System.out.println();
	}
	
	@Override
	public void accept(LeaseVisitor visitor) {
		visitor.visit(this);
	}
	
}
