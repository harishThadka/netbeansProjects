/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 * @author Harish Thadka
 */
public class Store {

    /**
     * Declaring instance variables
     */
    
    private String storeName;
    private int storeID;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    
    /**
     * No-argument constructor with no body
     */
    public Store(){
    
    }
    
    /**
     * This constructor used to set the value of storeID and other instance variables
     * @param storeID Unique identifier of the store
     */
    public Store(int storeID){
        this.storeID = storeID;
        storeName = "unknown";
        street = "NA";
        city = "NA";
        state = "NA";
        zipCode = "zzzzzz";
        phoneNumber = "dddddddddd";   
    }
    
    /**
     *
     * This constructor used to set the values of the instance variables
     * @param storeName Name of the store 
     * @param storeID Unique identifier of the store
     * @param phoneNumber This is a ten-digit phone number with only numerical values
     * @param street street name of the store
     * @param city City name of the store
     * @param state State name of the store
     * @param zipCode zipCode of the store
     */
    public Store(String storeName,int storeID,String phoneNumber,String street,
            String city,String state,String zipCode){
        this.storeName = storeName;
        this.storeID = storeID;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;   
    }
    
    /**
     * Returns the name of the store
     * @return storeName
     */
    public String getStoreName() {
          return storeName;
    }

    /**
     * Removes leading and trailing spaces of store name and sets the value
     * @param storeName Name of the store
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName.trim().replaceAll(" +", " ");
    }

    /**
     * Returns the unique identifier of the store
     * @return storeID
     */
    public int getStoreID() {
        return storeID;
    }

    /**
     * Sets unique identifier of the store
     * @param storeID unique identifier
     */
    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    /**
     * Returns the phone number of the store
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number of the store
     * @param phoneNumber Phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns street name of the store
     * @return street Street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street name of the store
     * @param street Street name
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns city name of the store
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city name of the store
     * @param city City name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns state name of the store
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state name of the store
     * @param state State name 
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns zip code of the store 
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets Zip Code of the store
     * @param zipCode Zip Code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    /**
     * Returns the formatted address of the store
     * @return Formatted Address
     */
    public String getFormattedAddress(){
        
        return street + "\n" + city + ", " + state + "-" + zipCode;
        
    }
    /**
     * Returns the phoneNumber in this format (ddd)ddd-ddd
     * @return Formatted Phone Number
     */
    public String getFormattedPhoneNumber(){
        return "(" +phoneNumber.substring(0,3)+")"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);
    }
    /**
     * This method replace the store name with new name
     * @param newName New name of the store
     */
    public void replaceStoreName(String newName){
        this.storeName = newName;
    }
    /**
     * Returns first word in the store name
     * @return First word in store name
     */
    public String getFirstWordOfStoreName(){
        return storeName.substring(0,storeName.indexOf(" "));
    }
    /**
     * Returns  middle word in the store name
     * @return Middle word in store name
     */
    public String getMiddleWordOfStoreName(){
        return storeName.substring(storeName.indexOf(" ") + 1,storeName.lastIndexOf(" "));
    }
    /**
     * Returns last word in the store name
     * @return Last word in store name
     */
    public String getLastWordOfStoreName(){
        return storeName.substring(storeName.lastIndexOf(" ")+1);
    }
    /**
     * Overrides the toString method and returns in specified pattern
     * @return override toString method
     */
    @Override
    public String toString(){
        return storeName + " (" +storeID+")\n"+ getFormattedAddress() + "\n" +
                getFormattedPhoneNumber();
    }
       
}
