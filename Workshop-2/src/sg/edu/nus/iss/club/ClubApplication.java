package sg.edu.nus.iss.club;

public class ClubApplication {
  public static void main(String[] args) {
    //Persons
    Person p1 = new Person("Goh","Yee Phing","");
    Person p2 = new Person("Hamilton","Ian","David");
    Person p3 = new Person("Soh","Chong Wee", null);
    
    p1.show();
    p2.show();
    p3.show();
    
    //Facilities
    Facility f1 = new Facility("Conference Room");
    Facility f2 = new Facility("Function Room", "This function room can be used for meetings/gatherings");
    
    f1.show();
    f2.show();
  }
}