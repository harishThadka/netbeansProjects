/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileOrderFactory;

/**
 * This is a apple storage class implementing storage
 * @author Harish Thadka
 */
public class AppleStorage implements Storage{

    private int storage;

    public AppleStorage(int storage) {
        this.storage = storage;
    }
     
    /**
     * @param storage storage
     */
    @Override
    public void setStorage(int storage) {
        this.storage = storage;
    }
    /**
     * @return Internal storage of apple mobile
     */
    @Override
    public int getStorage() {
        return storage;
    }
    /**
     * 
     * @return Internal storage of apple mobile in a specified manner
     */
    @Override
    public String toString(){
        return "Internal Storage: "+storage+"GB";
    }

    
    
}
