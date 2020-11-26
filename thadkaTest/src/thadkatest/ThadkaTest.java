/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thadkatest;

import java.util.*;
import java.io.*;

/**
 *
 * @author S538362
 */
public class ThadkaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        TreeMap<Character, TreeSet<String>> myMap = new TreeMap<>();
        Scanner scan = new Scanner(new File("myMap.txt"));

        for (char i = 'a'; i <= 'z'; i++) {
            myMap.put(i, new TreeSet<>());
        }
        
        while(scan.hasNext()){
            String word = scan.next();
            for (char c : myMap.keySet()){
                if (c == word.charAt(0)){
                    myMap.get(c).add(word);
                }
            }
        }
        System.out.println(myMap);
                
                
        
        
    }

}
