/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;
import java.util.Scanner;

/**
 * @author Harish Thadka
 */
public class StoreDriver {

    /**
     * Main method for Stores package
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************Testing the Store Class ************************");
        Store store1 = new Store("Timmy Tommy Enterprises", 1000,  "3127869900", "311 Jarvis Square", 
     "Chicago", "Illinois", "60018"); // creating object for store class with all arguments
        System.out.println("******************************************************");
        System.out.println("Testing the Getter methods or Accessors of Store Class");
        System.out.println("******************************************************");
        System.out.println("Store Name: "+store1.getStoreName());
        System.out.println("Store ID: "+store1.getStoreID());
        System.out.println("Street of the Store: "+store1.getStreet());
        System.out.println("City of the Store: "+store1.getCity());
        System.out.println("State of the Store: "+store1.getState());
        System.out.println("Zip code of the Store: "+store1.getZipCode());
        System.out.println("Phone number of the Store: "+store1.getPhoneNumber());
        System.out.println("*****************************************");
        System.out.println("Testing the toString method");
        System.out.println("*****************************************");
        System.out.println(store1.toString());
        System.out.println("*****************************************");
        System.out.println("Testing the user defined methods");
        System.out.println("*****************************************");
        System.out.println("First word of store name: "+store1.getFirstWordOfStoreName());
        System.out.println("Middle word of store name: "+store1.getMiddleWordOfStoreName());
        System.out.println("Last word of store name: "+store1.getLastWordOfStoreName());
        store1.replaceStoreName("JC Penny Store");
        System.out.println("*****************************************");
        System.out.println("Printing the store1 object after invoking the replace method");
        System.out.println("*****************************************");
        System.out.println(store1.toString());
        Store store2 = new Store(); // creating object for store class with no arguments
        System.out.println("*****************************************");
        System.out.println("Testing the Getter methods or Accessors of Store Class with no-arg constructor");
        System.out.println("*****************************************");
        System.out.println("Store Name: "+store2.getStoreName());
        System.out.println("Store ID: "+store2.getStoreID());
        System.out.println("Street of the Store: "+store2.getStreet());
        System.out.println("City of the Store: "+store2.getCity());
        System.out.println("State of the Store: "+store2.getState());
        System.out.println("Zip code of the Store: "+store2.getZipCode());
        System.out.println("Phone number of the Store: "+store2.getPhoneNumber());
        store2.setStoreName("KC India Mart");
        store2.setStoreID(1001);
        store2.setPhoneNumber("9136818080");
        store2.setStreet("8542 w 133rd Street");
        store2.setCity("Overland Park");
        store2.setState("Kansas");
        store2.setZipCode("66213");
        System.out.println("******************************************************");
        System.out.println("Testing the store class using toString after invoking the Setter methods or Mutators");
        System.out.println("******************************************************");
        System.out.println(store2.toString());
        Store store3 = new Store(1391); // creating object for store class with one argument
        System.out.println("******************************************************");
        System.out.println("Testing the Getter methods or Accessors of Store Class with one argument constructor");
        System.out.println("******************************************************");
        System.out.println("Store Name: "+store3.getStoreName());
        System.out.println("Store ID: "+store3.getStoreID());
        System.out.println("Street of the Store: "+store3.getStreet());
        System.out.println("City of the Store: "+store3.getCity());
        System.out.println("State of the Store: "+store3.getState());
        System.out.println("Zip code of the Store: "+store3.getZipCode());
        System.out.println("Phone number of the Store: "+store3.getPhoneNumber());
        store3.replaceStoreName("Buffalo Wild Wings");
        store3.setPhoneNumber("8163878320");
        store3.setStreet("5403 N Belt Hwy");
        store3.setCity("St Joseph");
        store3.setState("Missouri");
        store3.setZipCode("64506");
        System.out.println("******************************************************");
        System.out.println("Testing the store class using toString after invoking the Setter methods or Mutators");
        System.out.println("******************************************************");
        System.out.println(store3.toString());
        System.out.println("******************************************************");
        System.out.println("Testing the scanner class to take input from the console");
        System.out.println("******************************************************");
        Scanner scannerObject = new Scanner(System.in); // creating  new object for scanner
        System.out.println("Enter the store details");
        System.out.println("Enter the store name:");
        String storeName= scannerObject.nextLine();
        System.out.println("Enter the store ID:");
        int storeID = scannerObject.nextInt();
        scannerObject.nextLine();
        System.out.println("Enter the store phone number:");
        String phoneNumber = scannerObject.nextLine();
        System.out.println("Enter the street name of the store:");
        String streetName = scannerObject.nextLine();
        System.out.println("Enter the city name, state name, zip code of the store in one line without any commas:");
        String address = scannerObject.nextLine();
        String city = address.substring(0,address.indexOf(" "));
        String state = address.substring(address.indexOf(" ")+1,address.lastIndexOf(" "));
        String zipCode = address.substring(address.lastIndexOf(" ")+1);
        Store store4 = new Store(storeName,storeID,phoneNumber,streetName,city,state,zipCode);
        System.out.println("******************************************************");
        System.out.println("Testing the toString method without invoking the method");
        System.out.println("******************************************************");
        System.out.println(store4);
    }
    
}
