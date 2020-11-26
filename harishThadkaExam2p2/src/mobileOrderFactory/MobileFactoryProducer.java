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
public class MobileFactoryProducer {

    /**
     *
     * @param factoryname factory name
     * @param screenSize Screen size
     * @param storage Internal Storage
     * @return null if doesn't equals to other instances
     */
    public static MobileFactory getFactory(String factoryname,double screenSize,int storage) {
        if (factoryname.equalsIgnoreCase("Apple")) {
            return new AppleFactory(screenSize,storage);
        } else if (factoryname.equalsIgnoreCase("Samsung")) {
            return new SamsungFactory(screenSize,storage);
        } else {
            return null;
        }
    }
}
