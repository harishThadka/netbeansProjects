/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketBooking;

/**
 *
 * @author Harish Thadka
 */
public class BookingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // My screnario: Two users buying 10 movie tickets from 10 total tickets 
        //simultanesously from same website
        // Using race condition get 5 tickets for each user 
        
        
        Tickets ticket = new Tickets();

        User1 user1 = new User1(ticket);
        User2 user2 = new User2(ticket);

        user1.start();
        user2.start();
    }

}

class Tickets {
/**
 * This method is to buy tickets
 */
    private int totalTickets = 10;

    void buyTickets(int tickets, String user) {
        for (int i = 1; i <= tickets; i++) {
            if(totalTickets<=0){
                System.out.println("Tickets are sold out for "+ user);
            }else{
            totalTickets = totalTickets - 1;
            System.out.println(user+" bought 1 ticket and remaining tickets are " + totalTickets);
            }
        }
    }
}

class User1 extends Thread {

    Tickets ticket;
/**
 * This constructor is to set instance variables
 * @param ticket 
 */
    public User1(Tickets ticket) {
        this.ticket = ticket;
    }
/**
 * This method is to run buy tickets
 */
    @Override
    public void run() {
        ticket.buyTickets(10,"user-1");

    }

}

class User2 extends Thread {

    Tickets ticket;
/**
 * This method is to set instance variables
 * @param ticket 
 */
    public User2(Tickets ticket) {
        this.ticket = ticket;
    }
/**
 * This constructor is to buy tickets
 */
    @Override
    public void run() {
        ticket.buyTickets(10,"User-2");

    }

}
