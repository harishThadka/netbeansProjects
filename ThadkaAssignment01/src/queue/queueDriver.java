/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Harish Thadka
 */
public class queueDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        try {
            LinkedBlockingQueue<String> linkQueue = new LinkedBlockingQueue<>(5);
            linkQueue.add("avengers");
            System.out.println("Capacity after insertion: " + linkQueue.remainingCapacity());
            linkQueue.add("spiderman");
            System.out.println("Capacity after insertion: " + linkQueue.remainingCapacity());
            linkQueue.add("ironman");
            System.out.println("Capacity after insertion: " + linkQueue.remainingCapacity());
            linkQueue.add("infinitywar");
            System.out.println("Capacity after insertion: " + linkQueue.remainingCapacity());
            linkQueue.add("avengers");
            System.out.println("Capacity after insertion: " + linkQueue.remainingCapacity());
            linkQueue.offer("theend", 5, TimeUnit.SECONDS);
//            linkQueue.add("theend");
            System.out.println("while using offer method, even if linkQueue "
                    + "capacity exceeds it doesn't throw any exception and flow"
                    + " of program not interuppted but using add method it "
                    + "thorws an IllegalStateException");

            String s = "";
            HashSet<String> duplicates = new HashSet<>();// Hash set created to find duplicates
            for (String link : linkQueue) {
                int count = 0;
                for (String link2 : linkQueue) {
                    if (link.equals(link2)) {
                        count++;// If element found once again then increasing count
                    }
                }
                if (count > 1) {// If count of elements found greater than 1 then it is duplicate element
                    duplicates.add(link);//Adding duplicate elements to set
                }
            }
            System.out.println("Duplicate Elements:");
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
            linkQueue.removeAll(linkQueue);

            System.out.println("Poll method: " + linkQueue.poll());
//            System.out.println("Remove method: "+linkQueue.remove());
            System.out.println("poll and remove method retrieves and removes the head "
                    + "of the queue but remove method throws NoSuchElementException if queue is empty "
                    + "whereas poll method doesn't throw exception and returns null");
            System.out.println("Peek Method: " + linkQueue.peek());
//            System.out.println("Element method: " + linkQueue.element());
            System.out.println("peek and element method retrieves the head of "
                    + "the queue but element method throws an NoSuchElementException"
                    + " if queue is empty whereas peek method doesn't throws "
                    + "exception and returns null");

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

}
