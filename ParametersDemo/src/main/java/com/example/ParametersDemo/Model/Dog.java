package com.example.ParametersDemo.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harish Thadka
 */
public class Dog {
    
    private int dogId;
    private String dogName;
    private String dogBreed;

    /**
     *
     * @return dog Id
     */
    public int getDogId() {
        return dogId;
    }

    /**
     *
     * @param dogId dog Id
     */
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    /**
     *
     * @return dog Name
     */
    public String getDogName() {
        return dogName;
    }

    /**
     *
     * @param dogName dog Name
     */
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    /**
     *
     * @return dog Breed
     */
    public String getDogBreed() {
        return dogBreed;
    }

    /**
     *
     * @param dogBreed dog Breed
     */
    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public String toString() {
        return "dogId=" + dogId + ", dogName=" + dogName + ", dogBreed=" + dogBreed;
    }
    
     
    
    
}
