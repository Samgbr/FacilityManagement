package com.fms.view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.fms.model.facility.Building;
import com.fms.model.facility.Phone;
import com.fms.model.facility.Room;
import com.fms.model.facility.service.FacilityService;
import com.fms.model.inspection.Inspection;
import com.fms.model.inspection.service.InspectionService;
import com.fms.model.maintenance.Maintenance;
import com.fms.model.maintenance.MaintenanceOrder;
import com.fms.model.maintenance.MaintenanceRequest;
import com.fms.model.maintenance.MaintenanceSchedule;
import com.fms.model.maintenance.service.MaintenanceService;
import com.fms.model.reserveuse.InUse;
import com.fms.model.reserveuse.Reserve;
import com.fms.model.reserveuse.service.ReserveuseService;
import com.fms.model.user.User;
import com.fms.model.user.service.UserService;

public class FMSClient {

	public static void main(String[] args) {
		
		System.out.println("Facility Creation Started... ");
		
		
		Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(10000);
	    String facilityID = "FA" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String phoneID1 = "PH" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String phoneID2 = "PH" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String roomID1 = "RM" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
		String roomID2 = "RM" + randomInt;
	    
		addBuilding(facilityID, phoneID1, phoneID2, roomID1, roomID2);
		
		
		Random randomGen = new Random();
	    int randInt = randomGen.nextInt(10000);
	    String userID = "USR" + randInt;
	    
	    addUser(userID);
	    
	    randomGen = new Random();
	    randInt = randomGen.nextInt(10000);
	    String requestID = "MR" + randInt;
	    
	    Set<MaintenanceRequest> reqsts = addMainReq(requestID, userID, roomID2);
		
	    randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String morderID = "MO" + randInt;
		
		addMaintOrder(morderID, reqsts);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String scheduleID = "SC" + randInt;
		
		addMaintSchedule(scheduleID, morderID);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String maintenanceID = "MN" + randInt;
		
		addMaintenance(maintenanceID, morderID, scheduleID);
		
		OtherMaintMethods(roomID2);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);		
		String inspectionID = "IN" + randInt;
		
		addInspections(inspectionID, userID, facilityID);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);		
		String reserveID = "RE" + randInt;
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);		
		String usageID = "US" + randInt;
		
		addReservationUse(reserveID, userID, roomID2, usageID);
		
		System.out.println("Finished Successfully");
		
	}

	private static void addReservationUse(String reserveID, String userID, String roomID2, String usageID) {
		
		Reserve reserve = new Reserve();
		reserve.setReserveID(reserveID);
		reserve.setDateFrom("2019/03/01");
		reserve.setDateTo("2019/03/15");
		reserve.setUserID(userID);
		reserve.setRoomID(roomID2);
		reserve.setrStatus("Reserved");
		
		ReserveuseService ruService = new ReserveuseService();
		ruService.addReservation(reserve);
		
		InUse inUse = new InUse();
		inUse.setUsageID(usageID);
		inUse.setReserveID(reserveID);
		inUse.setRoomID(roomID2);
		inUse.setUserID(userID);
		inUse.setrStatus("Occupied");
		inUse.setUsedInInterval(0);
		
		ruService.assignFacilityToUse(inUse);
		System.out.println("Facility Used In Interval: 0-false 1-true ");
		System.out.println(ruService.getFacilityIntervalUsage(roomID2));
		System.out.println("Facility Actual Usage: UsageIS's ");
		System.out.println(ruService.getActualFacilityUsage(roomID2).getUsageID());
		System.out.println("Facility Usage Rate: ");
		System.out.println(ruService.facilityUsageRate(roomID2));
		System.out.println("Facility Vacated");
		ruService.vacateFacility(roomID2);
		
	}

	private static void addInspections(String inspectionID,String userID, String facilityID) {
		
		Set<Inspection> inspections = new HashSet<>();
		Inspection inspection = new Inspection();
		
		inspection.setInspectionID(inspectionID);
		inspection.setDateFrom("2019/03/01");
		inspection.setDateTo("2019/03/15");
		inspection.setUserID(userID);
		inspection.setFacilityID(facilityID);
		inspection.setInspectionType("Room");
		
		inspections.add(inspection);
		
		InspectionService iService = new InspectionService();
		iService.addInspections(inspections);
		System.out.println("Inspections: ");
		for(Inspection i: iService.listInspections()) {
			System.out.println("InspectionID: " + i.getInspectionID());
			System.out.println("InspectionType: " + i.getInspectionType());
		}
		
	}

	private static void OtherMaintMethods(String roomID2) {
		
		MaintenanceService mService = new MaintenanceService();
		System.out.println("Problem Rate Occurance by Facility: ");
		System.out.println(mService.listMaintenanceRequestIssuesRate(roomID2));
		System.out.println("Total Cost of the Facility: " + mService.MaintenanceCostForFacility(roomID2));
		System.out.println("Down time for Facility: " + mService.MaintenanceDownTimeFacility(roomID2) + " " + "days.");	
	}

	private static void addMaintenance(String maintenanceID, String morderID, String scheduleID) {
		System.out.println("Adding Maintenance Activity");
		
		//Insert Maintenance Activity
		Maintenance maintenance = new Maintenance();
		maintenance.setMaintenanceID(maintenanceID);
		maintenance.setType("Engineering");
		maintenance.setMaintenanceStart("2019/03/02");
		maintenance.setMaintenanceEnd("2019/03/16");
		maintenance.setCost(10004.75);
		maintenance.setSStatus("InProcess");
		maintenance.setScheduleID(scheduleID);
		maintenance.setMOrderID(morderID);
		
		MaintenanceService mService = new MaintenanceService();
		mService.addMaintenance(maintenance);
		
	}

	private static void addMaintSchedule(String scheduleID, String morderID) {
		
		System.out.println("Adding Maintenance Schedule");
		
		//Maintenance Schedule
		MaintenanceSchedule schedule =  new MaintenanceSchedule();
		schedule.setScheduleID(scheduleID);
		schedule.setDateFrom("2019/03/01");
		schedule.setDateTo("2019/03/15");
		schedule.setMorderID(morderID);
		
		MaintenanceService mService = new MaintenanceService();
		mService.addMaintenanceSchedule(schedule);
		
	}

	private static void addMaintOrder(String morderID, Set<MaintenanceRequest> requests) {
		//Add Maintenance Order
		MaintenanceOrder morder = new MaintenanceOrder();
				
		morder.setMorderID(morderID);
		morder.setOrderDate("2019/02/18");
		morder.setmStatus("Filled");
		morder.setMaintRequests(requests);
				
		MaintenanceService mService = new MaintenanceService();
		mService.addMaintenanceOrder(morder);
		
		for(MaintenanceRequest r: requests) {
			mService.UpdateRequest(r.getRequestID(),morderID);
		}
		
	}

	private static Set<MaintenanceRequest> addMainReq(String requestID, String userID, String roomID2) {
		
		System.out.println("Adding Maintenance Request");
		
		//Add Maintenance request
		MaintenanceRequest request = new MaintenanceRequest();
		Set<MaintenanceRequest> requests = new HashSet<>();
	    
		request.setRequestID(requestID);
		request.setDescription("Chair Broken");
		request.setRequestDate("2019/02/18");
		request.setUserID(userID);
		request.setRoomID(roomID2);
		
		requests.add(request);
		
		MaintenanceService mService = new MaintenanceService();
		mService.addMaintenanceRequest(request);
		System.out.println("Adding Maintenance order for the requests");
		
		return requests;
	}

	private static void addUser(String userID) {
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
		
	}

	private static void addBuilding(String facilityID, String phoneID1, String phoneID2, String roomID1, String roomID2) {
		
		
		
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
		
		Phone phone = new Phone();
		phone.setPhoneID(phoneID1);
		phone.setDescription("VP Office phone number");
		phone.setPhoneNumber("304");
		phone.setFacilityID(building.getFacilityID());
		phones.add(phone);
		
		phone = new Phone();
		phone.setPhoneID(phoneID2);
		phone.setDescription("Reception phone number");
		phone.setPhoneNumber("504");
		phone.setFacilityID(building.getFacilityID());
		phones.add(phone);
		
		building.setPhones(phones);
		
		System.out.println("Building Facility Phones Created.");
		
		//List of rooms inside the building
		Set<Room> rooms = new HashSet<>();
		
		Room room = new Room();
		room.setRoomID(roomID1);
		room.setType("Conference");
		room.setFacilityID(building.getFacilityID());
		rooms.add(room);
		
		room = new Room();
		room.setRoomID(roomID2);
		room.setType("Training Room");
		room.setFacilityID(building.getFacilityID());
		rooms.add(room);
		
		building.setRooms(rooms);
		
		System.out.println("Building Facility Rooms Created.");
		
		FacilityService fService = new FacilityService();
		fService.addBuilding(building);
		
		System.out.println("Facility data inserted successfully.");
		
		fService.removeFacility("FA001");  //Tested
		
	}
}
