/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.Stack;

/**
 *
 * @author Harish Thadka
 */
public class GreetingsStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AStack<Character> greeting = new AStack<>();
        String s = "Happy New Year";
        for(int i =0;i<s.length();i++){
            greeting.push(s.charAt(i));
        }
        Stack<Character> temp = new Stack<>();// Creating temporary stack to display the output
        while(!greeting.isEmpty()){
            temp.push(greeting.pop()); // pushing elements from greeting stack in reverse order to temporary stack
        }
         while(!temp.isEmpty()){
             System.out.print(temp.pop());
        }
         System.out.println();
        
    }
    
}
