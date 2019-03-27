package com.fms.view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fms.model.facility.Building;
import com.fms.model.facility.IFacility;
import com.fms.model.facility.Phone;
import com.fms.model.facility.Room;
import com.fms.model.facility.Warehouse;
import com.fms.model.facility.service.FacilityService;
import com.fms.model.inspection.AirConditioning;
import com.fms.model.inspection.HeatingSystem;
import com.fms.model.inspection.MechanicalAndElectrical;
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
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
		
		
		Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(10000);
	    String facilityID = "FA" + randomInt;
	    System.out.println("FacilityID: " + facilityID);
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String phoneID1 = "PH" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String phoneID2 = "PH" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String roomID1 = "RM" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
		String roomID2 = "RM" + randomInt;
	    
		Building building = addBuilding(facilityID, phoneID1, phoneID2, roomID1, roomID2, context);
		Warehouse warehouse = addWarehouse(facilityID, phoneID1, phoneID2, roomID1, roomID2, context);
		
		Random randomGen = new Random();
	    int randInt = randomGen.nextInt(10000);
	    String userID = "USR" + randInt;
	    
	    randomGen = new Random();
	    randInt = randomGen.nextInt(10000);
	    String requestID = "MR" + randInt;
	    
	    User user = addUser(userID, context);
	    
	    MaintenanceRequest reqst = addMainReq(requestID, user, roomID2, context);
		
	    randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String morderID = "MO" + randInt;
		
		MaintenanceOrder order = addMaintOrder(morderID, reqst, context);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String scheduleID = "SC" + randInt;
		
		MaintenanceSchedule schedule = addMaintSchedule(scheduleID, order, context);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);
		String maintenanceID = "MN" + randInt;
		
		addMaintenance(maintenanceID, order, schedule, context);
		
		OtherMaintMethods(roomID2);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);		
		String inspectionID = "IN" + randInt;
		
		addInspections(inspectionID, building, warehouse, context);
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);		
		String reserveID = "RE" + randInt;
		
		randomGen = new Random();
		randInt = randomGen.nextInt(10000);		
		String usageID = "US" + randInt;
		
		addReservationUse(reserveID, user, roomID2, usageID);
		
		System.out.println("Finished Successfully");
		
	}

	private static Warehouse addWarehouse(String facilityID, String phoneID1, String phoneID2, String roomID1,
			String roomID2, ApplicationContext context) {
		
		System.out.println("Warehouse FacilityID Created.");
		
		System.out.println("Warehouse FacilityID instance Creation started using Spring...");
		
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");
		
		Warehouse warehouse = facilityService.getWarehouse();
		
		//Create a Facility
		warehouse.setFacilityID(facilityID);
		warehouse.setFacilityName("Branch");
		warehouse.setAddress("1804 South Ave.");
		warehouse.setCity("Wheathon");
		warehouse.setState("IL");
		warehouse.setZipcode("60603");
		warehouse.setType("Office");
		warehouse.setCapacity(20);
		
		//We have tried to use the building.getPhones(); but not works it needs new Object using the new operator
		Set<Phone> phones = new HashSet<>();
		
		Phone phone = (Phone) context.getBean("phone");
		//Create facility phone numbers
		phone.setPhoneID(phoneID1);
		phone.setDescription("VP Office phone number");
		phone.setPhoneNumber("304");
		phones.add(phone);
		
		phone = (Phone) context.getBean("phone");
		phone.setPhoneID(phoneID2);
		phone.setDescription("Reception phone number");
		phone.setPhoneNumber("504");
		phones.add(phone);
		
		warehouse.setPhones(phones);
		
		//System.out.println(building.getPhones().iterator().next().getFacilityID());
		
		System.out.println("Warehouse Facility Phones Created.");
		
		//We have tried to use the building.getRooms(); but not works it needs new Object using the new operator
		Set<Room> rooms = new HashSet<>();
		
		Room room = (Room) context.getBean("room");
		//List of rooms inside the building		
		room.setRoomID(roomID1);
		room.setType("Conference");
		rooms.add(room);
		
		room = (Room) context.getBean("room");
		room.setRoomID(roomID2);
		room.setType("Training Room");
		rooms.add(room);
		
		warehouse.setRooms(rooms);
		
		System.out.println("Warehouse Facility Rooms Created.");
		
		System.out.println("Facility data inserted successfully.");
		
		return warehouse;
		
	}

	private static void addReservationUse(String reserveID, User user, String roomID2, String usageID) {
		
		Reserve reserve = user.getReserve();
		reserve.setReserveID(reserveID);
		reserve.setDateFrom("2019/03/01");
		reserve.setDateTo("2019/03/15");
		reserve.setrStatus("Reserved");
		
		ReserveuseService ruService = new ReserveuseService();
		FacilityService fService = new FacilityService();
		Room room = fService.getRoomByID(roomID2);
		
		ruService.addReservation(reserve, user, room);
		
		InUse inUse = reserve.getInUse();
		inUse.setUsageID(usageID);
		inUse.setrStatus("Occupied");
		inUse.setUsedInInterval(0);
		
		ruService.assignFacilityToUse(inUse, reserve, user, room);
		System.out.println("Facility Used In Interval: 0-false 1-true ");
		System.out.println(ruService.getFacilityIntervalUsage(roomID2));
		System.out.println("Facility Actual Usage: UsageIS's ");
		System.out.println(ruService.getActualFacilityUsage(roomID2).getUsageID());
		System.out.println("Facility Usage Rate: ");
		System.out.println(ruService.facilityUsageRate(roomID2));
		System.out.println("Facility Vacated");
		ruService.vacateFacility(roomID2);
		
	}

	private static void addInspections(String inspectionID, Building building, Warehouse warehouse, ApplicationContext context) {
		
		//InspectionService inspectionService = (InspectionService) context.getBean("inspectionService");
		
		//HeatingSystem inspection = inspectionService.getInspection();
		
		Set<HeatingSystem> inspections = new HashSet<>();
		
		//Building iBuilding = inspection.getBuilding();
		//iBuilding = building;
		
		//Bridge Pattern Demo for Inspection of heat System for a Building
		HeatingSystem inspection = building.getHeatInspection();
		inspection.setInspectionID(inspectionID);
		
		inspection.setDateFrom("2019/03/01");
		inspection.setDateTo("2019/03/15");
		inspection.setInspectedBy("Namipp Corp.");
		//inspection.setBuilding(iBuilding);
		inspection.setInspectionType("Heat");
		
		inspections.add(inspection);
		
		AirConditioning acinspection = building.getAcInspection();
		
		acinspection.setDateFrom("2019/03/01");
		acinspection.setDateTo("2019/03/15");
		acinspection.setInspectedBy("Namipp Corp.");
		//inspection.setBuilding(iBuilding);
		acinspection.setInspectionType("AC and Ventilation");
		
		MechanicalAndElectrical maeinspection = building.getMechElecInspection();
		
		maeinspection.setDateFrom("2019/03/01");
		maeinspection.setDateTo("2019/03/15");
		maeinspection.setInspectedBy("Namipp Corp.");
		//inspection.setBuilding(iBuilding);
		maeinspection.setInspectionType("Electrical");
		
		InspectionService inspectionService = new InspectionService();
		inspectionService.addInspections(inspections,building.getFacilityID());
		
		building.doInspections();
		
		//Warehouse Inspection Bridge Pattern
		HeatingSystem hinspection = warehouse.getHeatInspection();
		
		hinspection.setDateFrom("2019/03/01");
		hinspection.setDateTo("2019/03/15");
		hinspection.setInspectedBy("Namipp Corp.");
		hinspection.setInspectionType("Heat");
		
		warehouse.doInspections();
		
		/*
		System.out.println("Inspections: ");
		for(Inspection i: inspectionService.listInspections()) {
			System.out.println("InspectionID: " + i.getInspectionID());
			System.out.println("InspectionType: " + i.getInspectionType());
		} */
		
	}

	private static void OtherMaintMethods(String roomID2) {
		
		MaintenanceService mService = new MaintenanceService();
		System.out.println("Problem Rate Occurance by Facility: ");
		System.out.println(mService.listMaintenanceRequestIssuesRate(roomID2));
		System.out.println("Total Cost of the Facility: " + mService.MaintenanceCostForFacility(roomID2));
		System.out.println("Down time for Facility: " + mService.MaintenanceDownTimeFacility(roomID2) + " " + "days.");	
	}

	private static void addMaintenance(String maintenanceID, MaintenanceOrder order, MaintenanceSchedule schedule, ApplicationContext context) {
		
		MaintenanceService maintenanceService = new MaintenanceService();
		
		System.out.println("Adding Maintenance Activity");
		
		//Insert Maintenance Activity
		Maintenance maintenance = schedule.getMaintenance();
		maintenance.setMaintenanceID(maintenanceID);
		maintenance.setType("Engineering");
		maintenance.setMaintenanceStart("2019/03/02");
		maintenance.setMaintenanceEnd("2019/03/16");
		maintenance.setCost(10004.75);
		maintenance.setSStatus("InProcess");
		
		maintenanceService.addMaintenance(maintenance, order, schedule);
		
	}

	private static MaintenanceSchedule addMaintSchedule(String scheduleID, MaintenanceOrder order, ApplicationContext context) {
		
		MaintenanceService maintenanceService = new MaintenanceService();
		System.out.println("Adding Maintenance Schedule");
		
		//Maintenance Schedule
		MaintenanceSchedule schedule = order.getMaintenanceSchedule(); 
		schedule.setScheduleID(scheduleID);
		schedule.setDateFrom("2019/03/01");
		schedule.setDateTo("2019/03/15");
		
		maintenanceService.addMaintenanceSchedule(schedule, order);
		
		return schedule;
		
	}

	private static MaintenanceOrder addMaintOrder(String morderID, MaintenanceRequest request, ApplicationContext context) {
		
		MaintenanceService maintenanceService = new MaintenanceService();
		//Add Maintenance Order
		MaintenanceOrder morder = request.getMaintenanceOrder();
				
		morder.setMorderID(morderID);
		morder.setOrderDate("2019/02/18");
		morder.setmStatus("Filled");
				
		maintenanceService.addMaintenanceOrder(morder);
		maintenanceService.UpdateRequest(request.getRequestID(), morderID);
		/*
		for(MaintenanceRequest r: requests) {
			mService.UpdateRequest(r.getRequestID(),morderID);
		} */
		return morder;
	}
	
	private static MaintenanceRequest addMainReq(String requestID, User user, String roomID2, ApplicationContext context) {
		
		System.out.println("Adding Maintenance Request");
		
		//Add Maintenance request
		MaintenanceRequest request = user.getMaintenanceRequest();
		
		FacilityService fService = new FacilityService();
		Room room = fService.getRoomByID(roomID2);
	    
		request.setRequestID(requestID);
		request.setDescription("Chair Broken");
		request.setRequestDate("2019/02/18");
		
		MaintenanceService mService = new MaintenanceService();
		mService.addMaintenanceRequest(request, user, room);
		System.out.println("RoomID: " + roomID2);
		System.out.println("Adding Maintenance order for the requests");
		
		return request;
	}  

	private static User addUser(String userID, ApplicationContext context) {
		 	System.out.println("Adding a new User.");
		 	UserService userService = (UserService) context.getBean("userService");
			//Add User
		 	User user = userService.getUser();
			user.setUserID(userID);
			user.setName("Peter");
			user.setAddress("3510 North Street, Chicago,IL");
			user.setPhoneNumber("7735581010");
			user.setTypeOfUser("Employee");
			
			userService.addUser(user);
			System.out.println("UserID: " + user.getUserID());
			
			System.out.println("Adding Maintenance Request");
			
			return user;
		
	}

	private static Building addBuilding(String facilityID, String phoneID1, String phoneID2, String roomID1, String roomID2, ApplicationContext context) {
		
		
		
		System.out.println("Building FacilityID Created.");
		
		System.out.println("Building FacilityID instance Creation started using Spring...");
		
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");
		
		Building building = facilityService.getBuilding();
		
		//Create a Facility
		building.setFacilityID(facilityID);
		building.setFacilityName("Branch");
		building.setAddress("1804 South Ave.");
		building.setCity("Wheathon");
		building.setState("IL");
		building.setZipcode("60603");
		building.setType("Office");
		building.setCapacity(20);
		
		//We have tried to use the building.getPhones(); but not works it needs new Object using the new operator
		Set<Phone> phones = new HashSet<>();
		
		Phone phone = (Phone) context.getBean("phone");
		//Create facility phone numbers
		phone.setPhoneID(phoneID1);
		phone.setDescription("VP Office phone number");
		phone.setPhoneNumber("304");
		phones.add(phone);
		
		phone = (Phone) context.getBean("phone");
		phone.setPhoneID(phoneID2);
		phone.setDescription("Reception phone number");
		phone.setPhoneNumber("504");
		phones.add(phone);
		
		building.setPhones(phones);
		
		//System.out.println(building.getPhones().iterator().next().getFacilityID());
		
		System.out.println("Building Facility Phones Created.");
		
		//We have tried to use the building.getRooms(); but not works it needs new Object using the new operator
		Set<Room> rooms = new HashSet<>();
		
		Room room = (Room) context.getBean("room");
		//List of rooms inside the building		
		room.setRoomID(roomID1);
		room.setType("Conference");
		rooms.add(room);
		
		room = (Room) context.getBean("room");
		room.setRoomID(roomID2);
		room.setType("Training Room");
		rooms.add(room);
		
		building.setRooms(rooms);
		
		System.out.println("Building Facility Rooms Created.");
	
		facilityService.addBuilding(building);
		//System.out.println("PhoneID: " + building.getPhones().iterator().next().getPhoneID());
		//System.out.println("RoomID: " + building.getRooms().iterator().next().getRoomID());
		
		System.out.println("Facility data inserted successfully.");
		
		facilityService.removeFacility("FA001");  //Tested
		
		return building;
		
	}
}
