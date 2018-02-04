package sg.edu.nus.iss.club;

public class Person {
  //Class Attributes
  private String surname;
  private String firstName;
  private String secondName;
  
  //Class Constructor
  public Person(String surname, String firstName, String secondName) {
    this.surname = surname;
    this.firstName = firstName;
    this.secondName = secondName;
  }
  
  //Getters
  public String getSurname() {
    return surname;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getSecondName() {
    return secondName;
  }
  
  //Class Methods
  public static boolean checkString(String s) {
    if (s==""||s==null) {
      return true;
    }
    return false;
  }
  
  @Override
  public String toString() {
    String fullName = firstName;
    if (!(checkString(getSecondName()))) {
      fullName += " " + secondName;
    }
    fullName += " " + surname;
    return fullName;
  }
  
  //Output
  public void show() {
    System.out.println(this.toString());
  }
}