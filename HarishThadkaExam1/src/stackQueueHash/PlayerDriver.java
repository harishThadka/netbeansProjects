/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackQueueHash;

import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Harish Thadka
 */
public class PlayerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Creating instance of Queue interface
        Queue<Player> linkQueue = new LinkedBlockingQueue<>(10);
        // Adding 10 players to queue
        linkQueue.add(new Player("Hari"));
        linkQueue.add(new Player("Nick"));
        linkQueue.add(new Player("Sandy"));
        linkQueue.add(new Player("Gilson"));
        linkQueue.add(new Player("Jonas"));
        linkQueue.add(new Player("Danial"));
        linkQueue.add(new Player("Goodwin"));
        linkQueue.add(new Player("Randy"));
        linkQueue.add(new Player("Davis"));
        linkQueue.add(new Player("Arley"));

        Stack<Integer> cards = new Stack<>();
        // create instance of Random class 
        Random rand = new Random();
        for (int i = 1; i < 30; i++) {
            // Generate random integers in range 0 to 100 and adding to stack
            cards.add(rand.nextInt(100));
        }

        // Creating instance of card game to start the game
        CardGame game = new CardGame();

        // Drawing cards by passing players and cards
        game.drawCards(linkQueue, cards);
        // After drew cards sorting the results
        game.sortResults();
        // Printind results of players
        game.displayResults();

    }

}
