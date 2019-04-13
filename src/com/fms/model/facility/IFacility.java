package com.fms.model.facility;

import java.util.Set;

import com.fms.model.inspection.AirConditioning;
import com.fms.model.inspection.HeatingSystem;
import com.fms.model.inspection.MechanicalAndElectrical;
import com.fms.model.lease.Lease;
import com.fms.model.lease.LeaseVisitor;

// Abstraction on Bridge Pattern
public interface IFacility {

	public String getFacilityID();
	public void setFacilityName(String facilityName);
	public String getAddress();
	public void setAddress(String address);
	public String getCity();
	public void setCity(String city);
	public String getState();
	public void setState(String state);
	public String getZipcode();
	public void setZipcode(String zipcode);
	public Set<Phone> getPhones();
	public void setPhones(Set<Phone> phones);
	public Set<Room> getRooms();
	public void setRooms(Set<Room> rooms);
	
	//Inspect Implementation setter
	public void setHeatInspection(HeatingSystem heatInspection);
	public HeatingSystem getHeatInspection();
	public void setAcInspection(AirConditioning acInspection);
	public AirConditioning getAcInspection();
	public void setMechElecInspection(MechanicalAndElectrical mechElecInspection);
	public MechanicalAndElectrical getMechElecInspection();
	
	public void doInspections();
	
	//Lease Implementation setter
	public void setLease(Lease lease);
	public Lease getLease();
	
	//Visitor accept for facility lease
	public void accept(LeaseVisitor visitor);
	 
	
	
}
