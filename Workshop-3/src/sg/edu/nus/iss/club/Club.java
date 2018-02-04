package sg.edu.nus.iss.club;

public class Club {
  //Class Attributes
  private int count = 1;
  private Member[] listOfMembers = new Member[count+1];
  
  //Class Constructor
  public void Club() {
    
  }
  
  //Class Getters
  public int getMemberArraySize() {
    return listOfMembers.length;
  }
  
  public Member getMember(int memberNumber) {
      return listOfMembers[memberNumber];
  }
  
  public Member[] getMembers() {
    return listOfMembers.clone();
  }
  
  //Class Methods
  public Member addMember(String surname, String firstName, String secondName) {
    Member newMember = new Member(surname, firstName, secondName, count);
    while (listOfMembers.length < count+1) {
      extendListOfMembers();
    }
    listOfMembers[count] = newMember;
    count++;
    return newMember;
  }
  
  public void extendListOfMembers() {
    int currentSize = listOfMembers.length;
    Member[] newListOfMembers = new Member[currentSize+1];
    for (int i = 0; i < listOfMembers.length; i++) {
      newListOfMembers[i] = listOfMembers[i];
    }
    listOfMembers = newListOfMembers;
  }
  
  public void showMembers() {
    Member[] allMembers = this.getMembers();
    for (int i = 0; i < allMembers.length; i++) {
      if (allMembers[i] != null) {
        System.out.println(allMembers[i].toString());
      }
    }
  }
  
  public void removeMember(int memberNumber) {
    listOfMembers[memberNumber] = null;
  }
}