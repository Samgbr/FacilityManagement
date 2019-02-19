package com.fms.view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.fms.model.facility.Building;
import com.fms.model.facility.Phone;
import com.fms.model.facility.Room;
import com.fms.model.facility.service.FacilityService;
import com.fms.model.maintenance.Maintenance;
import com.fms.model.maintenance.MaintenanceOrder;
import com.fms.model.maintenance.MaintenanceRequest;
import com.fms.model.maintenance.MaintenanceSchedule;
import com.fms.model.maintenance.service.MaintenanceService;
import com.fms.model.user.User;
import com.fms.model.user.service.UserService;

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
		
		fService.removeFacility("FA001");
		
		Random randomGen = new Random();
	    int randInt = randomGen.nextInt(10000);
	    String userID = "USR" + randInt;
	    
	    System.out.println("Adding a new User.");
		//Add User
		User user = new User();
		user.setUserID(userID);
		user.setName("Peter");
		user.setAddress("3510 North Street, Chicago,IL");
		user.setPhoneNumber("7735581010");
		user.setTypeOfUser("Employee");
		
		UserService userService = new UserService();
		userService.addUser(user);
		
		System.out.println("Adding Maintenance Request");
		//Add Maintenance request
		MaintenanceRequest request = new MaintenanceRequest();
		Set<MaintenanceRequest> requests = new HashSet<>();
		
		randomGen = new Random();
	    randInt = randomGen.nextInt(10000);
	    String requestID = "MR" + randInt;
	    
		request.setRequestID(requestID);
		request.setDescription("Chair Broken");
		request.setRequestDate("2019/02/18");
		request.setRoomID(roomID);
		request.setUserID(userID);
		request.setRoomID(roomID);
		
		requests.add(request);
		System.out.println("Adding Maintenance order for the requests");
		//Add Maintenance Order
		MaintenanceOrder morder = new MaintenanceOrder();
				
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String morderID = "MO" + randInt;
		
		morder.setMorderID(morderID);
		morder.setOrderDate("2019/02/18");
		morder.setmStatus("Filled");
		morder.setMaintRequests(requests);
		
		MaintenanceService mService = new MaintenanceService();
		mService.addMaintenanceRequest(request);
		mService.addMaintenanceOrder(morder);
		
		for(MaintenanceRequest r: requests) {
			mService.UpdateRequest(r.getRequestID(),morderID);
		}
		System.out.println("Adding Maintenance Schedule");
		//Maintenance Schedule
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String scheduleID = "SC" + randInt;
		
		
		MaintenanceSchedule schedule =  new MaintenanceSchedule();
		schedule.setScheduleID(scheduleID);
		schedule.setDateFrom("2019/03/01");
		schedule.setDateTo("2019/03/15");
		schedule.setMorderID(morderID);
		
		mService.addMaintenanceSchedule(schedule);
		System.out.println("Adding Maintenance Activity");
		//Insert Maintenance Activity
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String maintenanceID = "MN" + randInt;
		
		Maintenance maintenance = new Maintenance();
		maintenance.setMaintenanceID(maintenanceID);
		maintenance.setType("Engineering");
		maintenance.setMaintenanceStart("2019/03/02");
		maintenance.setMaintenanceEnd("2019/03/16");
		maintenance.setCost(10004.75);
		maintenance.setSStatus("InProcess");
		maintenance.setScheduleID(scheduleID);
		maintenance.setMOrderID(morderID);
		
		mService.addMaintenance(maintenance);
		System.out.println("Success");
		
	}
}
