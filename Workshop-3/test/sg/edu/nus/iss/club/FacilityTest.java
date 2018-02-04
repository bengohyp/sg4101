package sg.edu.nus.iss.club;

import static org.junit.Assert.*;
import org.junit.Test;

public class FacilityTest {	
	//toString produces full name + membership number
	@Test
	public void testFacilityToString() {
		final String facilityName = "Swimming Pool (Olympic sized swimming pool)";
		Facility f = new Facility("Swimming Pool", "Olympic sized swimming pool");
		assertEquals(facilityName,f.toString());
	}
}