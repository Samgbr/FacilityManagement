package com.fms.view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.fms.model.facility.Building;
import com.fms.model.facility.Phone;
import com.fms.model.facility.Room;
import com.fms.model.facility.service.FacilityService;

public class FMSClient {

	public static void main(String[] args) {
		
		System.out.println("Building Facility Creation Started... ");
		Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(10000);
	    String facilityID = "FA" + randomInt;
		
		System.out.println("Building FacilityID Created.");
		
		System.out.println("Building FacilityID instance Creation started...");
		//Create a Facility
		Building building = new Building();
		building.setFacilityID(facilityID);
		building.setFacilityName("Branch");
		building.setAddress("1804 South Ave.");
		building.setCity("Wheathon");
		building.setState("IL");
		building.setZipcode("60603");
		building.setType("Office");
		building.setCapacity(20);
		
		//Create facility phone numbers
		Set<Phone> phones = new HashSet<>();
		
		randomInt = randomGenerator.nextInt(10000);
	    String phoneID = "PH" + randomInt;
		
		Phone phone = new Phone();
		phone.setPhoneID(phoneID);
		phone.setDescription("VP Office phone number");
		phone.setPhoneNumber("304");
		phone.setFacilityID(building.getFacilityID());
		phones.add(phone);
		
		randomInt = randomGenerator.nextInt(10000);
	    phoneID = "PH" + randomInt;
		
		phone = new Phone();
		phone.setPhoneID(phoneID);
		phone.setDescription("Reception phone number");
		phone.setPhoneNumber("504");
		phone.setFacilityID(building.getFacilityID());
		phones.add(phone);
		
		building.setPhones(phones);
		
		System.out.println("Building Facility Phones Created.");
		
		//List of rooms inside the building
		Set<Room> rooms = new HashSet<>();
		
		randomInt = randomGenerator.nextInt(10000);
	    String roomID = "RM" + randomInt;
		
		Room room = new Room();
		room.setRoomID(roomID);
		room.setType("Conference");
		room.setFacilityID(building.getFacilityID());
		rooms.add(room);
		
		randomInt = randomGenerator.nextInt(10000);
		roomID = "RM" + randomInt;
		
		room = new Room();
		room.setRoomID(roomID);
		room.setType("Training Room");
		room.setFacilityID(building.getFacilityID());
		rooms.add(room);
		
		building.setRooms(rooms);
		
		System.out.println("Building Facility Rooms Created.");
		
		FacilityService fService = new FacilityService();
		fService.addBuilding(building);
		
		System.out.println("Facility data inserted successfully.");
	}
}
