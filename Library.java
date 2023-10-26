/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  /* 
  * attributes
  */ 
  private Hashtable<String, Boolean> collection;

  /* 
  * constructor
  */ 
  public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean> ();
    System.out.println("You have built a library: 📖");
  }
  
  /* 
  * methods
  */ 
  public void addTitle(String title) {
    boolean t = true;
    collection.put(title, t);
  }

  public String removeTitle(String title) {
    if (collection.contains(title)) {
      collection.remove(title);
      return title;
    } else {
      throw new RuntimeException("Resident not found");
    }
  } 

  public void checkOut(String title) {
    Boolean value = collection.get(title);
    Boolean f = false;
    if (value) {
      collection.replace(title, value, f);
    }
  }

  public void returnBook(String title) {
    Boolean value = collection.get(title);
    Boolean t = true;
    if (!value) {
      collection.replace(title, value, t);
    }
  }

  public boolean containsTitle(String title) {
    Boolean value = collection.containsKey(title);
    return value;
  } 
  
  public boolean isAvailable(String title) {
    Boolean value = collection.get(title);
    return value;
  }
  
  public void printCollection() {
    System.out.println(collection.values());
  }
    
  // public static void main(String[] args) {
  //   new Library();
  // }

}