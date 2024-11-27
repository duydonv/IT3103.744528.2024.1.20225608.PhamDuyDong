package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;


public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore; 

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>();
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            System.out.println("Pham Duy Dong - 5608 - DVD \"" + dvd.getTitle() + "\" is already in the store.");
        } else {
            itemsInStore.add(dvd);
            System.out.println("Pham Duy Dong - 5608 - DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("Pham Duy Dong - 5608 - DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("Pham Duy Dong - 5608 - DVD \"" + dvd.getTitle() + "\" was not found in the store.");
        }
    }

    // Method to display all DVDs in the store
    public void printStore() {
        System.out.println("*******************STORE*******************");
        if (itemsInStore.isEmpty()) {
            System.out.println("Pham Duy Dong - 5608 - The store is currently empty.");
        } else {
            System.out.println("Pham Duy Dong - 5608 - Items in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("*******************************************");
    }
}

