/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Harish Thadka
 */
public class BooksStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        AStack<Book> books = new AStack<>();

        Scanner scan = new Scanner(new File("books.txt"));
        while (scan.hasNext()) {
            String bookName = scan.nextLine();
            String authorName = scan.nextLine();
            Book book = new Book(bookName, authorName);
            books.push(book);
        }
        System.out.println("All books in the stack from top to bottom");
        System.out.println("-------------------------------------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("-------------------------------------");
        }
        Iterator it = books.iterator();// Iterator Created to trace the specified title

        for (Book book : books) {
            if (it.hasNext()) {
                it.next();
                if (book.getTitle().equals("Fantastic Beasts: The Crimes of Grindelwald")) {
                    it.remove();// Removed the book at specified title
                    break;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Stack after removing book with name "
                + "Fantastic Beasts: The Crimes of Grindelwald");
        System.out.println("-------------------------------------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("-------------------------------------");
        }

    }

}
