/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileOrderFactory;

/**
 * This is a storage interface
 * @author Harish Thadka
 */
public interface Storage {
    
    /**
     * Setter method for parameter storage
     * @param storage Storage
     */
    void setStorage(int storage);

    /**
     * Getter method for internal storage of mobile
     * @return internal storage of mobile
     */
    int getStorage();
}
