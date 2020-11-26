/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackQueueHash;


/**
 *
 * @author Harish Thadka
 */
public class Hashifier {
    
    private String seed;

    /**
     * Constructor sets instance variable to below parameter.
     * @param seed seed
     */
    public Hashifier(String seed) {
        this.seed = seed;
    }

    /**
     * This method return has code for given computation.
     * @return hash code
     */
    public int hash() {
        int hash = 7;
        hash = 31 * hash + seed.hashCode();
        return hash;
    }  
    
}
