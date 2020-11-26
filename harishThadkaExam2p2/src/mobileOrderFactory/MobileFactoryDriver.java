/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileOrderFactory;

import java.util.Scanner;

/**
 *
 * @author Harish Thadka
 */
public class MobileFactoryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scenario: Mobile factroy to order apple or samsung mobiles with given
        // specifications such as operating system, screen size and Internal 
        // storage of mobile.
     
        // Intialising factory
        MobileFactoryProducer factoryProducer = new MobileFactoryProducer();
        System.out.println("Welcome to Mobile order company!");
        Scanner input = new Scanner(System.in);
        String quit = "";
        do {
            
            System.out.println("Enter the mobile company either Apple or Samsung:");
            String company = input.nextLine();
            System.out.println("Enter screen size in inches(E.g.: 5.5):");
            double screenSize = input.nextDouble();
            System.out.println("Enter internal storage in GB(E.g.: 2):");
            int storage = input.nextInt();
            
            // Creating specified factory with the given specifications
            MobileFactory mobileFactory = factoryProducer.getFactory(company, screenSize, storage);
            if (mobileFactory instanceof AppleFactory) {
                System.out.println("Apple Mobile specifiactions: ");
                OperatingSystem os = mobileFactory.getOs();
                System.out.println("1. " + os.toString());
                ScreenSize ss = mobileFactory.getScreenSize();
                System.out.println("2. " + ss.toString());
                Storage store = mobileFactory.getStorage();
                System.out.println("3. " + store.toString());

            } else if (mobileFactory instanceof SamsungFactory) {
                System.out.println("Samsung Mobile specifiactions: ");
                OperatingSystem os = mobileFactory.getOs();
                System.out.println("1. " + os.toString());
                ScreenSize ss = mobileFactory.getScreenSize();
                System.out.println("2. " + ss.toString());
                Storage store = mobileFactory.getStorage();
                System.out.println("3. " + store.toString());
            } else {
                System.out.println("Entered wrong information");
            }

            System.out.println("Do you want to order another mobile? Enter yes or no: ");
            input.nextLine();// To move scanner cursor to next line
            quit = input.nextLine();
        } while (quit.equalsIgnoreCase("yes"));

        System.out.println("Order successfully placed! Thank you!");
    }

}
