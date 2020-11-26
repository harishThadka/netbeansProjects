/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

/**
 *
 * @author Harish Thadka
 */
public class Book {

    private String title;
    private String author;

    /**
     * This constructor sets instance variables
     *
     * @param title Title of the book
     * @param author Author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * This method returns title of the book
     *
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method returns author of the book
     *
     * @return Author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method returns in below specified format
     *
     * @return Formatted String
     */
    @Override
    public String toString() {
        return title + "\n" + author;
    }

}
