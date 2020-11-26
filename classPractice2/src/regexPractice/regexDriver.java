/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Harish Thadka
 */
public class regexDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        System.out.println("Author: Harish Thadka");
        String[] emailId = {"harish@gmail.com", "s538362@nwmissouri.edu", "jklalfek.com", "@gmail.com", "Harish thadka", "1234567890"};
        String pattern = "^[\\w]+@[\\w]++.[\\w]++$";
        for (String email : emailId) {
            if (email.matches(pattern)) {
                System.out.println(email + " is a valid email id");
            } else {
                System.out.println(email + " is not a valid email id");
            }
        }
        System.out.println("");
//        System.out.println("Password regex: Minimum eight characters, at least one uppercase letter,"
//                + " one lowercase letter, one number and one special character:");
//         String[] passwords = {"Tony@4567", "hari.com", "maRtin&3478", "hello", "harish@9876", "Hari1234"};
//        String pattern2 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
//        for (String pass : passwords) {
//            if (pass.matches(pattern2)) {
//                System.out.println(pass + " is a valid password");
//            } else {
//                System.out.println(pass + " is not a valid password");
//            }
//        }
        
         String[] websites = {"www.google.com","http://www.facebook.com","https://website.com/org","ht://google.com",
         "htt:/google.com"};
        String pattern3 = "^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$";
        for (String web : websites) {
            if (web.matches(pattern3)) {
                System.out.println(web + " is a valid website url");
            } else {
                System.out.println(web + " is not a valid website url");
            }
        }
    }
}

