/* This is a stub for the Cafe class */

/*
 * a class which keeps track of cafe inventory
 */
public class Cafe extends Building{
    /*
     * an attribute which is the number of ounces of coffee remaining in inventory
     */
    private int nCoffeeOunces; 
    /*
     * an attribute which is the number of sugar packets remaining in inventory
     */
    private int nSugarPackets; 
    /*
     * an attribute which is number of "splashes" of cream remaining in inventory
     */
    private int nCreams;
    /*
     * an attribute which is the number of cups remaining in inventory
     */
    private int nCups;

    /*
     * a constructor to set the starting values of each of the stocked items (coffee, sugar, cream, and cups)
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /*
     * a method to decrease the remaining inventory when the Cafe sells a cup of coffee
     */
    public void sellCoffee(int size, int sugar, int cream) {
        if (nCoffeeOunces >= size && nSugarPackets >= sugar && nCreams >= cream && nCups >= 1) {
            nCoffeeOunces -= size;
            nSugarPackets -= sugar;
            nCreams -= cream;
            nCups -= 1;
        } else {
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
            nCoffeeOunces -= size;
            nSugarPackets -= sugar;
            nCreams -= cream;
            nCups -= 1;
        }
    }

    /*
     * a method to restock when necessary
     */
    private void restock(int size, int sugar, int cream, int cup) {
        nCoffeeOunces += size;
        nSugarPackets += sugar;
        nCreams += cream;
        nCups += cup;
    }
    // public static void main(String[] args) {
    //     new Cafe();
    // }
    
}
