/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * Card Class
 * @author Harish Thadka
 */
public class Card {

    private int number;
    private String suit;

    /**
     * Constructor with 2 parameters
     * @param number number of suit
     * @param suit Suit name
     */
    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    /**
     * returns the number of card
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * sets the number of suit
     * @param number number of suit
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns the suit of the card
     * @return suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Sets the suit of the card
     * @param suit Suit of the Card
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        String s;
        switch (number) {
            case 1:
                s = "A";
                break;
            case 11:
                s = "J";
                break;
            case 12:
                s = "Q";
                break;
            case 13:
                s = "K";
                break;
            default:
                s = String.valueOf(number);
                break;
        }
        return s;

    }

}
