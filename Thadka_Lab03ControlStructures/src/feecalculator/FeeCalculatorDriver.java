/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feecalculator;

import java.util.Scanner;

/**
 * Main class for fee calculator package
 * @author Harish Thadka
 */
public class FeeCalculatorDriver {

    /**
     * Main method for fee calculator package
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String calculateAgain;
        System.out.println("*******************************\n"
                + "***Northwest Cost Calculator***\n"
                + "*******************************\n");
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter the full name (Firstname Lastname): ");
            String stuName = input.nextLine();
            // String should not be empty
            while (stuName.isEmpty()||stuName==null) {
                System.out.print("Please enter the full name (Firstname Lastname): ");
                stuName = input.nextLine();
            }
            System.out.print("Please enter the number of pre-requisites: ");
            // Prereq value should be in between 0 and 2
            int preq = input.nextInt();
            while (!(preq == 0 || preq == 1 || preq == 2)) {
                System.out.print("You have entered invalid number, please re-enter either 0 or 1 or 2: ");
                preq = input.nextInt();
            }
            System.out.print("Please enter the number of semesters you want to calculate the cumulative fee: ");
            int sem = input.nextInt();
            // Semester value should be in between 1 and 4;
            while (!(sem == 1 || sem == 2 || sem == 3 || sem == 4)) {
                System.out.print("You have entered invalid number, please re-enter either 1 or 2 or 3 or 4: ");
                sem = input.nextInt();
            }
            System.out.print("Enter the cumulative GPA: ");
            double GPA = input.nextDouble();
            // GPA value should be in between 0 and 4
            while (!(GPA > 0 && GPA <= 4)) {
                System.out.print("The GPA value should be in between 0 and 4, please re-enter: ");
                GPA = input.nextDouble();
            }
            input.nextLine();
            System.out.println("\n****************************************");
            FeeCalculator feecalc = new FeeCalculator(stuName);
            System.out.println("* Hello, " + feecalc.getNameInitials());
            System.out.println("*------------------------------------\n"
                    + "* Your Account Summary\n"
                    + "*------------------------------------\n"
                    + "*__________________________________");
            for (int i = 1; i <= sem; i++) {
                System.out.printf("* Semester %d fee is:    $ %.2f * %n", i, feecalc.calcSemCost(i, preq, GPA));
            }
            System.out.printf("*----------------------------------    %n* Total cost:           $ %.2f%n*----------------------------------    %n", feecalc.calcTotalCost(sem, preq, GPA));
            System.out.printf("*%n* USD to INR: Rs. %.2f%n", feecalc.exchUSDToINR(feecalc.calcTotalCost(sem, preq, GPA)));
            System.out.printf("* USD to Euro: € %.2f%n", feecalc.exchUSDToEuro(feecalc.calcTotalCost(sem, preq, GPA)));
            System.out.println("****************************************");
            System.out.println(feecalc.printReceipt(sem, preq, GPA));
            System.out.println();
            System.out.print("Do you want to calculate again?(Y/N): ");
            calculateAgain = input.nextLine().toUpperCase();
            while (!("Y".equals(calculateAgain) || "N".equals(calculateAgain))) {
                System.out.print("Do you want to calculate again?(Y/N): ");
                calculateAgain = input.nextLine().toUpperCase();
            }
            System.out.println();

        } while ("Y".equals(calculateAgain));
        input.close();
        System.out.println("Thank You!");

    }

}
