package test.java;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fms.model.facility.Building;
import com.fms.model.facility.Phone;
import com.fms.model.facility.service.FacilityService;

public class FacilityServiceTest {	

	private static Building building;
	private static Building newBuilding;
	private static FacilityService fService;
	
	 /**
     * Initialise the class instance for testing
     */
    @BeforeClass
    public static void init() {
    	
    	Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(10000);
	    String facilityID = "FA" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String phoneID1 = "PH" + randomInt;
	    
	    randomInt = randomGenerator.nextInt(10000);
	    String phoneID2 = "PH" + randomInt;
	    
        building = new Building();
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
    }
    
    /**
     * Parse the Aup before test
     */
    @Before
    public void beforeEachTest(){
        fService = new FacilityService();
    }
	
	@Test
	public void testAddBuilding() {
		newBuilding = fService.addBuilding(building);
		assertEquals("Branch", newBuilding.getFacilityName());
		assertEquals("1804 South Ave.", newBuilding.getAddress());
		assertEquals("Wheathon", newBuilding.getCity());
		assertEquals("IL", newBuilding.getState());
		assertEquals("60603", newBuilding.getZipcode());
		assertEquals("Office", newBuilding.getType());
		assertEquals(20, newBuilding.getCapacity());
	}

	@Test
	public void testListFacilities() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFacility() {
		assertEquals("1804 South Ave.", fService.getFacility("FA12461").getAddress());
	}

	@Test
	public void testGetAvailableCapacity() {
		assertEquals(30, fService.getFacility("FA12461").getCapacity());
	}

	@Test
	public void testRemoveFacility() {
		fail("Not yet implemented");
	}

}
