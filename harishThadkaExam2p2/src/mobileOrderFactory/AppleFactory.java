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
public class AppleFactory implements MobileFactory {

    private double screenSize;
    private int storage;

    /**
     * Constructor for apple factory with two parameters as screenSize and storage
     * @param screenSize screen size
     * @param storage Internal Storage
     */
    public AppleFactory(double screenSize, int storage) {
        this.screenSize = screenSize;
        this.storage = storage;
    }
    
    /**
     * Getter method for operating system of apple
     * @return operating system of apple
     */
    @Override
    public OperatingSystem getOs() {
        return new AppleOS();
    }

    /**
     * Getter method for screen size of apple
     * @return Screen Size of apple
     */
    @Override
    public ScreenSize getScreenSize() {
        return new AppleScreenSize(screenSize);
    }

    /**
     * returns storage of apple
     * @return Internal Storage of Apple mobile
     */
    @Override
    public Storage getStorage() {
        return new AppleStorage(storage);
    }
    
}
