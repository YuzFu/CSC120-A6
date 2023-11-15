/* This is a stub for the Library class */
import java.util.Hashtable;

/*
 * a class which has a collection of titles
 */
public class Library extends Building {
  /* 
   * an attribute in which we will store each book's title and author
   */ 
  private Hashtable<String, Boolean> collection;

  /* 
   * a constructor
   */ 
  public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean> ();
    System.out.println("You have built a library: 📖");
  }
  
  /* 
   * a method to update the Hashtable containing the collection every time we add a title
   */ 
  public void addTitle(String title) {
    collection.put(title, true);
  }

  /*
   * a method to update the Hashtable containing the collection every time we remove a title
   * @return title
   */
  public String removeTitle(String title) {
    if (collection.contains(title)) {
      collection.remove(title);
      return title;
    } else {
      throw new RuntimeException("Book not found");
    }
  } 

  /*
   * a method to check out a book
   */
  public void checkOut(String title) {
    if (collection.get(title)) {
      collection.replace(title, true, false);
   } else {
    throw new RuntimeException("Book not found");
   }
  }

  /*
   * a method to return a book
   */
  public void returnBook(String title) {
    Boolean value = collection.get(title);
    Boolean t = true;
    if (!value) {
      collection.replace(title, value, t);
    }
  }

  /*
   * a method to return true if the title appears as a key in the Libary's collection, false otherwise
   * @return boolean
   */
  public boolean containsTitle(String title) {
    return collection.containsKey(title);
  } 
  
  /*
   * a method to return true if the title is currently available, false otherwise
   * @return boolean
   */
  public boolean isAvailable(String title) {
    Boolean value = collection.get(title);
    return value;
  }
  
  /*
   * a method that prints out the entire collection in an easy-to-read way (including checkout status)
   * @return collection
   */
  public void printCollection() {
    for (String title : collection.keySet()) {
      System.out.println(title);
      System.out.println(isAvailable(title));
    }
  }
    
  // public static void main(String[] args) {
  //   new Library();
  // }

}