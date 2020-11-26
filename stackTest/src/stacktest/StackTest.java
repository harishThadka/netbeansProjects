/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktest;

import java.util.ListIterator;
import java.util.Stack;

/**
 *
 * @author S538362
 */
public class StackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<String> dogStack = new Stack<>();
        dogStack.push("Bas");
        dogStack.push("Bird");
        dogStack.push("Luci");
        dogStack.pop();
        dogStack.peek();
        dogStack.push("Fudge");
        dogStack.push("Blonkie");
        dogStack.push("Audrey");
        dogStack.push("Zelda");
        dogStack.push("Midge");
        dogStack.push("Carmen");
        dogStack.peek();
//        ListIterator<String> iterator = dogStack.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
        while(!dogStack.empty()){
            System.out.println(dogStack.pop());
        }
        
        
    }
    
}
