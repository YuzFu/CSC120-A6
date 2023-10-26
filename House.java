/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{
  /*
  *attributes
  */
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /*
  * constructor
  */
  public House(String name, String address, int nFloors, ArrayList<String> residents, boolean hasDiningRoom) {
    super (name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /* accessor
  *
  */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  public int nResidents() {
    int nResidents = residents.size();
    return nResidents;
  }

  /* methods
  *
  */
  public void moveIn(String name) {
    residents.add(name);
  }

  public String moveOut(String name) {
    if (residents.contains(name)){
      residents.remove(name);
      return name;
    } else {
      throw new RuntimeException("Resident not found");
    }
  }

  public boolean isResident(String person) {
    boolean isResident = residents.contains(person);
    return isResident(person);
  }

  // public static void main(String[] args) {
  //   new House();
  // }

}