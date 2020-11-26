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
public class SamsungOS implements OperatingSystem {

    /**
     * Getter method for operating system in string
     * @return OS of android
     */
    @Override
    public String getOperatingSystem() {
        return "Android v10.0";
    }
    /**
     * ToString method for returning operating system 
     * @return Operating system of android
     */
    @Override
    public String toString() {
        return "Operating System: Android v10.0";
    }

}
