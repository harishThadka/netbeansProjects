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
public class Trainer {
    private int trainerID;
    private String trainerName;

    public Trainer() {
    }

    public Trainer(int trainerID, String trainerName) {
        this.trainerID = trainerID;
        this.trainerName = trainerName;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    @Override
    public String toString() {
        return "Trainer{" + "trainerID=" + trainerID + ", trainerName=" + trainerName + '}';
    }
    
    
    
}
