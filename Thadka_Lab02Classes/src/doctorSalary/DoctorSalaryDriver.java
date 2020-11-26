/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorSalary;
import java.util.Scanner;
/**
 * @author Harish Thadka
 */
public class DoctorSalaryDriver {

    /**
     * Main method for DoctorSalary package
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner scan = new Scanner(System.in); // Creating new object for scanner
//        System.out.println("Testing the DoctorSalary class:");
//        System.out.print("Enter the hourly pay rate of the Doctor: $");
//        double hourlyRate = scan.nextDouble(); // Reads the value of hourly rate
//        System.out.print("Enter the insurance rate of the Doctor in percentage: ");
//        double insuranceRate = scan.nextDouble(); // Reads the value of insurance percentage
//        System.out.print("Enter the tax rate of the doctor in percnetage: ");
//        double taxRate = scan.nextDouble(); // Reads the value of tax percentage
//        System.out.print("Enter the bonus of the doctor: ");
//        double bonus = scan.nextDouble(); // Reads the value of bonus
        DoctorSalary docSalObj1 = new DoctorSalary(45.0,55.0,89.0); // Creating object for DoctorSalary class
        System.out.println("The details of docSalObj1 object are as follows:");
        docSalObj1.setHourlyRate(60.0);
        System.out.println(docSalObj1.getHourlyRate());
        System.out.println(docSalObj1.toString());
        System.out.println("The monthly salary of the doctor is: $"+docSalObj1.calcMonthlySalary());
        System.out.println("The monthly insurance of the doctor is: $"+docSalObj1.calcMonthlyInsurance());
        System.out.println("The annual gross salary of the doctor is: $"+docSalObj1.calcAnnualGrossSalary(bonus));
        System.out.println("The gross annual net pay of the doctor is: $"+docSalObj1.calcAnnualNetPay(bonus));
        System.out.println("**************************************************");
        DoctorSalary docSalObj2 = new DoctorSalary(); // Creating object for DoctorSalary class
        System.out.println("The details of docSalObj2 object are as follows:");
        System.out.println(""+docSalObj2.toString());
        System.out.println("The monthly salary of the doctor is: $"+docSalObj2.calcMonthlySalary());
        System.out.println("The monthly insurance of the doctor is: $"+docSalObj2.calcMonthlyInsurance());
        System.out.println("The annual gross salary of the doctor is: $"+docSalObj2.calcAnnualGrossSalary(bonus));
        System.out.println("The gross annual net pay of the doctor is: $"+docSalObj2.calcAnnualNetPay(bonus));
        docSalObj2.setHourlyRate(42.85);
        docSalObj2.setInsuranceRate(15.30);
        docSalObj2.setTaxRate(11.55);
        System.out.print("Enter the new bonus of the doctor: ");
        double newBonus = scan.nextDouble(); // Reads the  new value of bonus
        System.out.println(""+docSalObj2.toString());
        System.out.println("The monthly salary of the doctor is: $"+docSalObj2.calcMonthlySalary());
        System.out.println("The monthly insurance of the doctor is: $"+docSalObj2.calcMonthlyInsurance());
        System.out.println("The annual gross salary of the doctor is: $"+docSalObj2.calcAnnualGrossSalary(newBonus));
        System.out.println("The annual net pay of the doctor is: $"+docSalObj2.calcAnnualNetPay(newBonus));
    }
    
}
