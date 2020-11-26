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
public class SamsungStorage implements Storage{

   private int storage;

    /**
     *
     * @param storage Storage
     */
    public SamsungStorage(int storage) {
        this.storage = storage;
    }
     
    /**
     *
     * @param storage Storage
     */
    @Override
    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    /**
     *
     * @return internal storage of Samsung
     */
    @Override
    public int getStorage() {
        return storage;
    }
    /**
     * 
     * @return Internal storage of Samsung mobile
     */
    @Override
    public String toString(){
        return "Internal Storage: "+storage+"GB";
    }

    
}
