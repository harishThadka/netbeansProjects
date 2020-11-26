/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.io.*;
import java.util.Scanner;

/**
 * Main class for cards package
 * @author Harish Thadka
 */
public class CardDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException Not file found error Exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner input = new Scanner(new File("inputFile.txt"));

        PrintWriter out = new PrintWriter(new File("outputFile.txt"));

        CardsArray cardsArray = new CardsArray();
        CardsArrayList cardsArrayList = new CardsArrayList();

        while (input.hasNext()) {
            int number = input.nextInt();
            input.nextLine();
            String suit = input.nextLine();
            Card card = new Card(number, suit);
            cardsArray.addCardToArray(card);
            cardsArrayList.addCardToList(card);
        }
        System.out.println("Array Data:");
        out.println("Array Data:");
        System.out.println(cardsArray);
        out.println(cardsArray);
        System.out.println("******************************");
        out.println("******************************");
        System.out.println("ArrayList Data:");
        out.println("ArrayList Data:");
        System.out.println(cardsArrayList);
        out.println(cardsArrayList);
        System.out.println("****************************** ");
        out.println("****************************** ");
        System.out.println("Remove at position 0 from hearts array");
        out.println("Remove at position 0 from hearts array");
        cardsArray.removeCardFromArray(0, "heart");
        System.out.println("Remove at position 4 from spades array");
        out.println("Remove at position 4 from spades array");
        cardsArray.removeCardFromArray(4, "spade");
        System.out.println("Remove at position 5 from clubs array");
        out.println("Remove at position 5 from clubs array");
        cardsArray.removeCardFromArray(5, "club");
        System.out.println("Remove at position 3 from hearts array list");
        out.println("Remove at position 3 from hearts array list");
        cardsArrayList.removeCardFromList(3, "heart");
        System.out.println("Remove at position 2 from spades array list");
        out.println("Remove at position 2 from spades array list");
        cardsArrayList.removeCardFromList(2, "spade");
        System.out.println("Remove at position 1 from clubs array list");
        out.println("Remove at position 1 from clubs array list");
        cardsArrayList.removeCardFromList(1, "club");
        System.out.println("******************************");
        out.println("******************************");
        System.out.println("Array Data after removing elements:");
        out.println("Array Data after removing elements:");
        System.out.println(cardsArray);
        out.println(cardsArray);
        System.out.println("******************************");
        out.println("******************************");
        System.out.println("ArrayList Data after removing elements:");
        out.println("ArrayList Data after removing elements:");
        System.out.println(cardsArrayList);
        out.println(cardsArrayList);
        out.close();
        input.close();

    }

}
