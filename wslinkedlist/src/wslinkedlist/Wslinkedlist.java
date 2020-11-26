/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wslinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author S538362
 */
public class Wslinkedlist {

    /**
     * @param args the command line arguments
     */
    private static LinkedList<Integer> myList;

    public static void main(String[] args) {
        // TODO code application logic here

        myList = new LinkedList<>();
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addLast(6);
        myList.addLast(8);
        myList.addFirst(15);
        myList.add(3, 17);
        myList.add(5, 25);
        myList.add(myList.indexOf(2) + 1, 34);
        myList.set(4, 100);
        printList();
        System.out.println(myList.contains(34));
        System.out.println(myList.contains(27));
        System.out.println(myList.size());
        System.out.println(myList.removeFirst());
        System.out.println(myList.removeLast());
        printList();
        myList.addFirst(45);
        myList.addFirst(30);
        myList.addLast(75);
        myList.addLast(93);
        myList.addFirst(37);
        myList.add(5,110);
        myList.add(9,46);
        printList();
        removeOddNumbers();
        System.out.println(" odd numbers");
        printList();
        System.out.println(myList);
    }

    private static void printList() {
        ListIterator<Integer> myIterator = myList.listIterator();
        while(myIterator.hasNext()){
            System.out.print(myIterator.next()+" ");
        }
    }
    
    private static void removeOddNumbers(){
        ListIterator<Integer> myIterator = myList.listIterator();
        int a;
        while(myIterator.hasNext()){
            a = myIterator.next();
            if(a%2 != 0){
                myIterator.remove();
            }
        }
    }

}
