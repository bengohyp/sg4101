package sg.edu.nus.iss.club;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {
	//toString method returns an expected full name
	@Test
	public void testPersonToString() {
    final String realName = "Yee Phing Goh";
		Person p = new Person("Goh", "Yee Phing", "");
    assertEquals(realName, p.toString());
	}

}
