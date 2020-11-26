/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackQueueHash;

import java.util.ArrayList;

/**
 *
 * @author Harish Thadka
 */
public class Player {

    private String name;
    private int id;
    private ArrayList<Integer> cards = new ArrayList<>();

    /**
     * Constructor sets player name to below parameter and player to hash code 
     * using Hashifier class.
     * @param name Player name
     */
    public Player(String name) {
        this.name = name;
        this.id = new Hashifier(name).hash();
    }

    /**
     * Method return player name
     * @return player name
     */
    public String getName() {
        return name;
    }

    /**
     * Method sets player name to below parameter
     * @param name player name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method returns player id
     * @return player id
     */
    public int getId() {
        return id;
    }

    /**
     * Method sets player id to below parameter
     * @param id player id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method returns array list of cards.
     * @return card
     */
    public ArrayList<Integer> getCards() {
        return cards;
    }

    /**
     * Method sets card list with below parameter
     * @param cards array list of cards
     */
    public void setCards(ArrayList<Integer> cards) {
        this.cards = cards;
    }

    /**
     * This method add below parameter to cards list
     * @param value value
     */
    public void addCard(int value){
        cards.add(value);
    }

    /**
     * This method used to sum of card values.
     * @return sum of cards
     */
    public int sumOfCards(){
        int sum =0;
        for(int c :cards){
            sum += c;
        }
        return sum;
    }
    
       
}
