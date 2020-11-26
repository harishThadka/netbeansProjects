/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author S538362
 */
public class Sampleproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//
//        Scanner input = new Scanner(new File("Movie data.txt"));
//        int rank;
//        String movieName;
//        String yearStr;
//        int year;
//        String data;
//        LinkedList link = new LinkedList<String>();
//            rank = input.nextInt();
//            movieName = input.next()+ " "+input.next();
//            yearStr = input.next();
//            year = input[]
//            data = input.nextLine();
////            link.add(input.nextLine());
//        
//            System.out.println(rank);
//            System.out.println(movieName);
//            System.out.println(year);
//           
//            System.out.println(data);
//            
//            link.add(extractName(movieName));
//
//       Scanner input = new Scanner(new File("duplicatewords.txt"));
//       TreeSet tree = new TreeSet<String>();
//       while(input.hasNext()){
//        
//        tree.add(input.next());
//       }
//        System.out.println(tree);
//        
////        13, 24, 35, 17, 44, 31, 54, 14, 98, 46)
//        HashSet hash = new HashSet<Integer>();
//        hash.add(13);
//        hash.add(24);
//        hash.add(35);
//        hash.add(17);
//        System.out.println(hash);
        HashSet<String> dogSet = new HashSet<String>();
        dogSet.add("Midge");
        dogSet.add("Zelda");
        dogSet.add("Eve");
        dogSet.add("Carmen");
        dogSet.add("Leonard");
        dogSet.add("Zelda");
        System.out.println("Dog set contains " + dogSet.size() + " elements: " + dogSet);
        System.out.println("Midge is in set: " + dogSet.contains("Midge"));
        System.out.println("Odie is in set: " + dogSet.contains("Odie"));
        dogSet.remove("Midge");
        System.out.println("Dog set contains " + dogSet.size() + " elements: " + dogSet);
        System.out.println("Midge is in set: " + dogSet.contains("Midge"));
        TreeSet<String> catSet = new TreeSet<>();
        catSet.add("Maude");
        catSet.add("Garfield");
        catSet.add("Button");
        catSet.add("Moskowitz");
        catSet.add("Albert");
        System.out.println();
        System.out.println(catSet);
        System.out.println();
        System.out.println("Maude is in set: " + catSet.contains("Maude"));
        System.out.println();
        for (String cat : catSet) {
            System.out.println(cat);
        }
        System.out.println();
        Iterator<String> iter = catSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
