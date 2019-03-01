package com.fms.model.facility;

import java.util.HashSet;
import java.util.Set;

import com.fms.model.inspection.Inspection;

public class Building extends Facility implements IBuilding{

	private String type;
	private int capacity;
	private Set<Phone> phones = new HashSet<Phone>();
	private Set<Room> rooms = new HashSet<Room>();
	private Set<Inspection> inspections = new HashSet<>();
	
	public Set<Inspection> getInspections() {
		return inspections;
	}
	public void setInspections(Set<Inspection> inspections) {
		this.inspections = inspections;
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
	
	
}
