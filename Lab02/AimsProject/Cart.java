package AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; // Track the quantity of ordered items

    // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("Pham Duy Dong - 5608 - The cart is full, cannot add more items.");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Pham Duy Dong - 5608 - The disc has been added to the cart.");
        }
    }

    // Method to remove a DigitalVideoDisc from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                // Shift the remaining items to the left to remove the disc
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Pham Duy Dong - 5608 - The disc has been removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("Pham Duy Dong - 5608 - The disc was not found in the cart.");
        }
    }

    // Method to calculate the total cost of the cart
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Method to print Cart
    public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Pham Duy Dong - 5608 - Ordered Items:");

    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
    }

    System.out.println("Pham Duy Dong - 5608 - Total cost: " + totalCost() + " $");
    System.out.println("***************************************************");
    }
}
