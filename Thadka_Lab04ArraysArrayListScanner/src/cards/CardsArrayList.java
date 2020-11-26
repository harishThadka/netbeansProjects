/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 * Cards of Array List class
 *
 * @author Harish Thadka
 */
public class CardsArrayList {

    private ArrayList<Card> clubs;
    private ArrayList<Card> diamonds;
    private ArrayList<Card> hearts;
    private ArrayList<Card> spades;

    /**
     * No argument constructor
     */
    public CardsArrayList() {
        clubs = new ArrayList<Card>();
        diamonds = new ArrayList<Card>();
        hearts = new ArrayList<Card>();
        spades = new ArrayList<Card>();

    }

    /**
     * Returns clubs of clubs array list
     *
     * @return clubs
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**
     * Returns diamond of diamond array list
     *
     * @return diamonds
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**
     * Return heart of heart array list
     *
     * @return hearts
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**
     * Returns spades of spade array list
     *
     * @return spades
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }

    /**
     * Adds card to specified array list
     *
     * @param c object of Card
     */
    public void addCardToList(Card c) {
        if ("club".equals(c.getSuit())) {
            clubs.add(c);
        } else if ("diamond".equals(c.getSuit())) {
            diamonds.add(c);
        } else if ("heart".equals(c.getSuit())) {
            hearts.add(c);
        } else {
            spades.add(c);
        }

    }

    /**
     * Removes the element in specified array
     *
     * @param position position of specified array list
     * @param suit suit of card
     */
    public void removeCardFromList(int position, String suit) {
        if ("club".equals(suit)) {
            if (!(position < 0 || position >= clubs.size())) {
                clubs.remove(position);
            }

        } else if ("diamond".equals(suit)) {
            if (!(position < 0 || position >= diamonds.size())) {
                diamonds.remove(position);
            }

        } else if ("heart".equals(suit)) {
            if (!(position < 0 || position >= hearts.size())) {
                hearts.remove(position);
            }
        } else {
            if (!(position < 0 || position >= spades.size())) {
                spades.remove(position);
            }

        }

    }

    @Override
    public String toString() {

        return "Hearts ArrayList: " + hearts.toString()
                + "\nDiamonds ArrayList: " + diamonds.toString()
                + "\nSpades ArrayList: " + spades.toString()
                + "\nClubs ArrayList: " + clubs.toString();
    }

}
