/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapws;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Harish Thadka
 */
public class hashMapdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner scan = new Scanner(new File("words.txt"));
        HashMap<String, Integer> freq = new HashMap<>();
        while (scan.hasNext()) {
            String word = scan.next();
            if (freq.containsKey(word)) {
                Integer k;
                k = freq.get(word) + 1;
                freq.put(word, k);
            } else {
                freq.put(word, 1);
            }
        }

        System.out.println(freq);
        System.out.println("Number of distinct words:" + freq.size());
        String k = "";
        Integer i = 0;
        for (Map.Entry<String, Integer> m : freq.entrySet()) {
            if (i < m.getValue()) {
                i = m.getValue();
                k = m.getKey();
            }
        }
        System.out.println("frequent word: "+ k);
    }
}
