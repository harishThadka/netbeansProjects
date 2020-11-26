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
public class SamsungScreenSize implements ScreenSize {

    private double size;

    /**
     *
     * @param size size
     */
    public SamsungScreenSize(double size) {
        this.size = size;
    }
    
    /**
     *
     * @param size size
     */
    @Override
    public void setScreensize(double size) {
        this.size = size;
    }
    
    /**
     *
     * @return Screen size of Samsung mobile
     */
    @Override
    public double getScreenSize() {
        return size;
    }
    /**
     * 
     * @return Screen size
     */
    @Override
    public String toString(){
        return "Screen Size: "+size+" inches";
    }
    
}
