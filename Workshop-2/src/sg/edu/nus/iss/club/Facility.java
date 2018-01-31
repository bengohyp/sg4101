package sg.edu.nus.iss.club;

import static sg.edu.nus.iss.club.Person.checkString;

public class Facility {  
  //Class Attributes
  private String name;
  private String description;
  
  //Class Constructors
  public Facility (String name) {
    this.name = name;
  }
  
  public Facility (String name, String description) {
    this(name);
    this.description = description;
  }
  
  //Getters
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  //Output
  public void show() {
    String facilityName = name;
    if (!(checkString(description))) {
      facilityName += " (" + description + ")";
    }
    System.out.println(facilityName);
  }
}