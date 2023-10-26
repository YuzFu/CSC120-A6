/* This is a stub for the Cafe class */
public class Cafe extends Building{
    /*
     * attributes
     */
    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams;
    private int nCups;

    /*
     * constructor
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
     * methods
     */
    public void sellCoffee(int size, int sugar, int cream) {
        if (nCoffeeOunces >= size && nSugarPackets >= sugar && nCreams >= cream && nCups >= 1) {
            nCoffeeOunces -= size;
            nSugarPackets -= sugar;
            nCreams -= cream;
            nCups -= 1;
        } else {
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
    }

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
