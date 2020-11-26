/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileOrderFactory;

/**
 *
 * @author Harish Thadka
 */
public class AppleOS implements OperatingSystem {

    /**
     * Getter method for returning operating system in string
     * @return OS version of apple
     */
    @Override
    public String getOperatingSystem() {
        return "iOS v10";
    }
    /**
     * ToString method for returning operating system
     * @return in specified format 
     */
    @Override
    public String toString(){
       return "Operating System: iOS v10"; 
    }
}
