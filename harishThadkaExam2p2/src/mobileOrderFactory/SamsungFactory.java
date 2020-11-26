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
public class SamsungFactory implements MobileFactory {

     private double screenSize;
     private int storage;

    /**
     *
     * @param screenSize ScreenSize
     * @param storage storage
     */
    public SamsungFactory(double screenSize, int storage) {
        this.screenSize = screenSize;
        this.storage = storage;
    }
     
    /**
     *
     * @return OS version  of Samsung mobile
     */
    @Override
    public OperatingSystem getOs() {
        return new SamsungOS();
    }

    /**
     *
     * @return Screen size of Samsung mobile
     */
    @Override
    public ScreenSize getScreenSize() {
        return new SamsungScreenSize(screenSize);
    }

    /**
     *
     * @return internal storage of samsung
     */
    @Override
    public Storage getStorage() {
        return new SamsungStorage(storage);
    }
    
}
