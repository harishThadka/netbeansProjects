/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 *
 * @author Harish Thadka
 * @param <E>
 */
public class AStack<E> implements Iterable<E>{
    
    private ArrayDeque<E> myStack;

    /**
     * Constructor sets instance variable to new empty of arrayDeque
     */
    public AStack() {
        myStack = new  ArrayDeque<E>();
    }
    
    /**
     * This method adds an element to the top of the stack
     * @param element Element
     */
    public void push(E element){
       myStack.push(element);
    }

    /**
     * This method removes and returns the top element
     * @return Removed element
     */
    public E pop(){
        return myStack.pop();
    }

    /**
     * This method returns,but does not remove, the top element
     * @return Top element
     */
    public E peek(){
        return myStack.peek();
    }

    /**
     * This method returns the current size of the stack
     * @return size of myStack
     */
    public int size(){
        return myStack.size();
    }
    
    /**
     * This method returns true if the stack is empty;false otherwise
     * @return true or false
     */
    public boolean isEmpty(){
        return myStack.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        
        return myStack.iterator();
    }

    
    

    
}
