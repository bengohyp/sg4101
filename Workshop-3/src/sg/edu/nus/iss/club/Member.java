package sg.edu.nus.iss.club;

public class Member extends Person {
  //Class Attributes
  private int memberNumber;
  
  //Class Constructors
  public Member(String surname, String firstName, String secondName, int memberNumber) {
    super(surname, firstName, secondName);
    this.memberNumber = memberNumber;
  }
  
  //Getters
  public int getMemberNumber() {
    return memberNumber;
  }
    
  //Class Methods
  @Override
  public String toString() {
    return super.toString() + " " + this.getMemberNumber();    
  }
  
  public boolean equals(Member m) {
    if (super.getSurname() != m.getSurname()) {
      return false;
    }
    if (super.getFirstName() != m.getFirstName()) {
      return false;
    }
    if (super.getSecondName() != m.getSecondName()) {
      return false;
    }
    if (getMemberNumber() != m.getMemberNumber()) {
      return false;
    }
    return true;
  }
}