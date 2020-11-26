/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncBooking;

/**
 *
 * @author Harish Thadka
 */
public class syncBookingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // My screnario: Two users buying 10 movie tickets from 10 total tickets 
        //simultanesously from same website
        // Using synchronized get total 10 tickets for one user and other user gets nothing

        Tickets ticket = new Tickets();

        User1 user1 = new User1(ticket);
        User2 user2 = new User2(ticket);

        user1.start();
        user2.start();
    }

}

class Tickets {

    private int totalTickets = 10;

    /** 
     *This method is to buy tickets
     * @param tickets tickets
     * @param user users
     */
    void buyTickets(int tickets, String user) {
        for (int i = 1; i <= tickets; i++) {
            if (totalTickets <= 0) {
                System.out.println("Tickets are sold out for " + user);
            } else {
                totalTickets = totalTickets - 1;
                System.out.println(user + " bought 1 ticket and remaining tickets are " + totalTickets);
            }
        }
    }
}

class User1 extends Thread {

    Tickets ticket;

    /**
     * This constructor used to set instance variables
     * @param ticket ticket
     */
    public User1(Tickets ticket) {
        this.ticket = ticket;
    }

    /**
     * This method to buy tickets
     */
    @Override
    public void run() {
        synchronized (ticket) {
            ticket.buyTickets(10, "User-1");
        }
    }

}

class User2 extends Thread {

    Tickets ticket;
/**
 * This constructor sets instance variable
 * @param ticket ticket
 */
    public User2(Tickets ticket) {
        this.ticket = ticket;
    }
/**
 * This method is to buy tickets
 */
    @Override
    public void run() {
        synchronized (ticket) {
            ticket.buyTickets(10, "User-2");
        }
    }

}
