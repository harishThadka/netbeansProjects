/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Harish Thadka
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Owner owner = new Owner(14, "Owner1");
//        Trainer trainer = new Trainer(1, "Trainer1");
//        Pet pet = new Pet(1, "Pet1", owner, trainer); 
//        System.out.println(owner.toString());
//        System.out.println(trainer.toString());
//        System.out.println(pet.toString());
        System.out.println("Author: Harish Thadka");
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        Pet p = context.getBean("pet", Pet.class);
        Trainer t = context.getBean("trainer", Trainer.class);
        Owner o = context.getBean("owner", Owner.class);

        System.out.println(p);
        System.out.println(t);
        System.out.println(o);

    }

}
