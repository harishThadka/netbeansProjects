/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2p3;

import java.util.ArrayList;

/**
 *
 * @author Harish Thadka
 */
public class Exam2p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***************My web domain pattern criteria and solution**************\n"
                + "1. Domain should end with either .com or .net or .edu: (com|net|edu)\n"
                + "2. Before dot, domain should have atleast 10 characters: [a-zA-Z_\\d]{10,30}\n"
                + "3. Before dot, domain should have maximum of 30 characters: [a-zA-Z_\\d]{10,30}\n"
                + "4. Domain should have atleast 3 numbers: (?=(?:.*\\d){3})\n"
                + "5. Domain should have atlest 5 characters(including 3 characters of com/net/edu): (?=(?:.*[a-zA-Z]){5})\n"
                + "6. Domain should not contain any special characters expect underscore: [a-zA-Z_\\d]\n"
                + "7. Domain can be lower case or upper case letters: [a-zA-Z_\\d]");

        // Pattern for my web domain criteria
        String pattern = "(?=(?:.*\\d){3})(?=(?:.*[a-zA-Z]){5})^[a-zA-Z_\\d]{10,30}\\.(com|net|edu)$";

        // Intialising arraylist for adding domain urls
        ArrayList<String> domainUrls = new ArrayList<>();

        // Generating valid domains using randomDomain class generate domain static method and adding to arraylist
        for (int i = 0; i < 10; i++) {
            domainUrls.add(randomDomain.generateDomain());
        }
        
        // Adding invalid domains to arraylist of domain urls.
        domainUrls.add("harish24680");//Not ending with .edu or .com or .net
        domainUrls.add("harishthadka.com");//Domain name don't have atleast 3 numbers
        domainUrls.add("H123456789.net");//Domain name don't have atleast 5 characters
        domainUrls.add("harish24680.in");//Ending with .in is not valid
        domainUrls.add("harish 23456.com");//Domain have special character space is not valid
        domainUrls.add("hari1234.in");//Domain name don't have atleast 10 characters
        domainUrls.add("harish2kcm6kn8AJKCdkkdnkvkavnk90.net");// Exceeded 30 characters is invalid domain
        domainUrls.add("123456789.net");//Don't have characters
        domainUrls.add("Hello harish");// Two words is invalid domain
        domainUrls.add("Harish24680@gmail.com");// Domain have special character @ is not valid

        System.out.println("********************Web domain validation***********************");
        int count = 0;// For counting domains
        for (String domainUrl : domainUrls) {
            count++;
            if (domainUrl.matches(pattern)) {
                System.out.println(count + ". "+domainUrl + " : Valid Domain");
            } else {
                System.out.println(count + ". "+domainUrl + " : Invalid Domain");
            }
        }

    }

}
