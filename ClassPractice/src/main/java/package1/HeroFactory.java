/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Harish Thadka
 */
public class HeroFactory {
    
    public Hero createHero(String universe){
        Hero hero= new Hero();
        if(universe.equalsIgnoreCase("Marvel")){
            hero = new Marvel();
        }
            return hero;
    }
    
    
}
