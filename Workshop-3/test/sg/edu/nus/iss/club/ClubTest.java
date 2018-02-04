package sg.edu.nus.iss.club;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClubTest {
  //addMember method returns a Member with correct attributes
  @Test
  public void testAddMember() {
    System.out.println("[Running] testAddMember");
    Club c = new Club();
    Member testMember = new Member ("Goh", "Yee Phing", "", 1);
    Member clubMember = c.addMember("Goh", "Yee Phing", "");
    assertTrue(testMember.equals(clubMember));
  }
  
  //addMember method should increment the member number automatically
  @Test
  public void testAddMemberNumber() {
    System.out.println("[Running] testAddMemberNumber");
    Club c = new Club();
    Member testMember = new Member ("Ho", "Cui Yun", "", 2);
    c.addMember("Goh", "Yee Phing", "");
    Member clubMember = c.addMember("Ho", "Cui Yun","");
    assertTrue(testMember.equals(clubMember));
  }
  
  //initial size of listOfMembers array should be 2
  @Test
  public void testListOfMembersInitialSize() {
    System.out.println("[Running] testListOfMembersInitialSize");
    Club c = new Club();
    final int initialArraySize = 2;
    assertEquals(initialArraySize,c.getMemberArraySize());
  }
  
  //member should be placed at listOfMembers[memberNumber] location in array
  @Test
  public void testAddMemberToArray() {
    System.out.println("[Running] testAddMemberToArray");
    Club c = new Club();
    Member testMember = c.addMember("Goh", "Yee Phing", "");
    assertEquals(testMember,c.getMember(1));
  }
  
  //listOfMembers array should hold correct member references
  @Test
  public void testListOfMembersArray() {
    System.out.println("[Running] testListOfMembersArray");
    Club c = new Club();
    Member testMember1 = c.addMember("Goh", "Yee Phing", "");
    Member testMember2 = c.addMember("Ho", "Cui Yun", "");
    assertTrue(testMember1.equals(c.getMember(1)));
    assertTrue(testMember2.equals(c.getMember(2)));
  }
  
  //modifying the getMembers array should not affect the data inside the Club class
  @Test
  public void testModifyingGetMembersArray() {
    System.out.println("[Running] testModifyingGetMembersArray");
    Club c = new Club();
    c.addMember("Goh", "Yee Phing", "");
    c.addMember("Ho", "Cui Yun", "");
    Member[] listOfMembersClone = c.getMembers();
    listOfMembersClone[1] = new Member("Ho", "Mei Xuan", "", 1);
    assertFalse(listOfMembersClone[1].equals(c.getMember(1)));
  }
  
  //getting a member which doesn't exist should return a null member
  @Test
  public void testGetRemovedMember() {
    System.out.println("[Running] testGetRemovedMember");
    Club c = new Club();
    c.addMember("Goh", "Yee Phing", "");
    Member testMember = c.addMember("Ho", "Cui Yun", "");
    c.addMember("Ho", "Meixuan", "");
    c.removeMember(2);
    assertNull(c.getMember(2));
  }
}