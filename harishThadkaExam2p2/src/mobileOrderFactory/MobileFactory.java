/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileOrderFactory;

/**
 * This is a mobile factory interface
 * @author Harish Thadka
 */
public interface MobileFactory {

    /**
     * Getter method for operating system
     * @return OS of apple
     */
    OperatingSystem getOs();

    /**
     * Getter method for screen size of apple
     * @return Screen size of apple mobile
     */
    ScreenSize getScreenSize();

    /**
     * Getter method for internal storage of apple
     * @return internal storage of apple
     */
    Storage getStorage();
}
