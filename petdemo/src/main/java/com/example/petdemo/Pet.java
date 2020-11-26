/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petdemo;

/**
 *
 * @author Harish Thadka
 */
public class Pet {
    private int petID;
    private String petName;
    private Trainer trainer;
    private Owner owner;

    public Pet() {
        trainer  = new Trainer();
        owner = new Owner();
    }

    public Pet(int petID, String petName,Owner owner, Trainer trainer) {
        this.petID = petID;
        this.petName = petName;
        this.trainer = trainer;
        this.owner = owner;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" + "petID=" + petID + ", petName=" + petName + ", trainer=" + trainer + ", owner=" + owner + '}';
    }
    
    
    
    
    
}
