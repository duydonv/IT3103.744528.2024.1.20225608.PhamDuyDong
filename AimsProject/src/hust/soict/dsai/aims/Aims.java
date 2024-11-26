package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args){
    // Create a new cart
    Cart anOrder = new Cart();

    // Create new dvd objects and add them to the cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
    anOrder.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
    anOrder.addDigitalVideoDisc(dvd3);

    // Print total cost of the items in the cart
    System.out.println("Pham Duy Dong - 5608 - Total Cost is: " + anOrder.totalCost());

    // Test removing a disc that exists in the cart
    System.out.println("Pham Duy Dong - 5608 - Removing 'Star Wars' from the cart.");
    anOrder.removeDigitalVideoDisc(dvd2);

    // Print total cost after removal
    System.out.println("Pham Duy Dong - 5608 - Total Cost after removal is: " + anOrder.totalCost());

    // Test removing a disc that does not exist in the cart
    DigitalVideoDisc dvd4 = new DigitalVideoDisc("Nonexistent Movie", "Genre", "Director", 100, 10.0f);
    System.out.println("Pham Duy Dong - 5608 - Attempting to remove a disc not in the cart.");
    anOrder.removeDigitalVideoDisc(dvd4);
    }
}
