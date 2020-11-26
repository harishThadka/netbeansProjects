/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackQueueHash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Harish Thadka
 */
public class CardGame {

    ArrayList<Player> players;

    /**
     * Constructor sets instance variable to new empty array list
     */
    public CardGame() {
        players = new ArrayList<>();
    }

    /**
     * This method is used to pick cards by players. Each player picks 2 cards.
     * Firstly, iterate through for loop 2 times to draw card 2 times by
     * players. Inside for loop, iterate through queue then checks whether card
     * not empty then pop the card from stack and add card to the player.
     * Finally, queue converted to array of list.
     *
     * @param linkQueue link queue
     * @param cards cards
     */
    public void drawCards(Queue<Player> linkQueue, Stack<Integer> cards) {

        System.out.println("************Drawing cards**************");
        for (int i = 0; i < 2; i++) {
            for (Player player : linkQueue) {
                if (!cards.isEmpty()) {
                    int value = cards.pop();
                    System.out.println(player.getName() + " drawn card with value: " + value);
                    player.addCard(value);
                } else {
                    System.out.println("Card is empty");
                    break;
                }
            }
        }

        for (Player p : linkQueue) {
            players.add(p);
        }
    }

    /**
     * This method sort the results of the game. Firstly, it uses
     * collection.sort method . It compares each score with another score player
     * if greater then returns 1 else -1 and if both of each players score is
     * equal then it compares player name using compareTo method. Finally, It
     * sort all the players in descending order of score
     */
    public void sortResults() {

        // Sorting in descending order using collections sort method 
        Collections.sort(players,
                new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {

                if (p2.sumOfCards() > p1.sumOfCards()) {
                    return 1;
                } else if (p2.sumOfCards() < p1.sumOfCards()) {
                    return -1;
                } else {
                    return p2.getName().compareTo(p2.getName());
                }
            }
        }
        );

    }

    /**
     * This method display results of players. Firstly, iterates through players
     * using for-each loop then increase count and printing player details such
     * as ranking, id, name, card list and score.
     */
    public void displayResults() {

        System.out.println("**************Displaying results**************");
        // Initialize count for ranking players
        int count = 0;
        System.out.println("Rank    Player Id   Player Name Cards Score");
        for (Player player : players) {
            count++;
            System.out.println(count + "       " + player.getId() + "  " + player.getName()
                    + "  " + player.getCards() + " " + player.sumOfCards());
        }
    }
}
