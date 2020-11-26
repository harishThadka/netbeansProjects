/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2p3;

import java.util.Random;

/**
 *
 * @author Harish Thadka
 */
public class randomDomain {

    public static String generateDomain() {
        
        // Intialising random object to generate random numbers
        Random rand = new Random();
        
        // Intilaising string with required letters, numbers and underscore
        String alphaUpper = "abcdefghijklmnopqrstuvwxyz_";
        String alphaLower = alphaUpper.toUpperCase();
        String digitUnderscore = "1234567890";
        // concatenating all here
        String domainLetters = alphaLower+alphaUpper+digitUnderscore;

        // Intialising string builder object to add each random character
        StringBuilder sb = new StringBuilder();
        
        // Intialising domain length should have atleast l0 and maximum of 30 
        // characters which inlcudes atleast 3 numbers(adding 3 numbers below)
        int length = rand.nextInt(17)+10;// Generates random numbers between 10 to 27
        int i = 0;
        while (i < length) {
            // Generating random number up to length using random object
            int randNum = rand.nextInt(domainLetters.length());// Generates random numbers between 0 to length
            // Picks random character from alphanumeric and adds to stringbuilder object
            sb.append(domainLetters.charAt(randNum));
            i++;
        }
        
        //Adding 3 digit random numbers to domain as domain shoud have atleast 3 numbers
        sb.append(rand.nextInt(999)+100);// Generates random numbers between 100 to 999
        
                
        // Intialising an array of ending dots and generating random ending dot then 
        // adding to the end of domain
        String[] domainEnd = {".edu", ".net", ".com"};
        int randomNumber = rand.nextInt(domainEnd.length);
        String domainUrl = sb.toString()+domainEnd[randomNumber];
        
        return domainUrl;
    }

}
