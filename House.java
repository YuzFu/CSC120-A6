/* This is a stub for the House class */

import java.util.ArrayList;

/*
 * a place where students live, work, and sometimes eat (if the House has a dining room)
 */
public class House extends Building{
  /*
   * an attribute to store residents in the class
   */
  private ArrayList<String> residents;
  /*
   * an attribute to indicate whether the house has a dining room
   */
  private boolean hasDiningRoom;

  /*
   * a constructor to initialize residents to a new ArrayList<String>(), as well as to set hasDiningRoom to indicate whether or not the house has a dining room
   */
  public House(String name, String address, int nFloors, ArrayList<String> residents, boolean hasDiningRoom) {
    super (name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /* 
   * an accessor to retreive whether the house has a dining room
   * @return hasDiningRoom
   */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }
  /* 
   * an accessor to return number of residents in the house
   * @return nResidents
   */
  public int nResidents() {
    return residents.size();
  }

  /*
   * a method to update the ArrayList of residents every time someone moves in
   */
  public void moveIn(String name) {
    if (residents.contains(name)) {
      throw new RuntimeException("Resident already moved in");
    } else {
      residents.add(name);
    }
  }

  /*
   * a method to update the ArrayList of residents every time someone moves out
   * @return name the name of the person who moved out
   */
  public String moveOut(String name) {
    if (residents.contains(name)){
      residents.remove(name);
      return name;
    } else {
      throw new RuntimeException("Resident not found");
    }
  }

  /*
   * a boolean method that tells us whether or not a given person is a resident of the House
   * @return isResident
   */
  public boolean isResident(String person) {
    boolean isResident = residents.contains(person);
    return isResident;
  }

  // public static void main(String[] args) {
  //   new House();
  // }

}