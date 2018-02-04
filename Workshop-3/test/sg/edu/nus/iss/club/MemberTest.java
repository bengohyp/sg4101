package sg.edu.nus.iss.club;

import static org.junit.Assert.*;
import org.junit.Test;

public class MemberTest {
	//a member's memberNumber must not be null
	@Test
	public void testMemberNumber() {
		Member m = new Member("Goh", "Yee Phing", "", 0);
		assertNotNull(m.getMemberNumber());
	}
	
	//toString produces full name + membership number
	@Test
	public void testMemberToString() {
		final String nameAndMemberNumber = "Yee Phing Goh 1";
		Member m = new Member("Goh", "Yee Phing", "", 1);
		assertEquals(nameAndMemberNumber,m.toString());
	}
}