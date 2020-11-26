/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorSalary;

/**
 * @author Harish Thadka
 */
public class DoctorSalary {
    
    /**
     * Declaring instance variables
     */
    private double hourlyRate;
    private double insuranceRate;
    private double taxRate;
    private static final int HOURS = 40;
    
    /**
     * Constructor with three parameters
     * @param hourlyRate Hourly pay rate of the doctor
     * @param insuranceRate Insurance percentage
     * @param taxRate Tax percentage
     */
    public DoctorSalary(double hourlyRate, double insuranceRate, double taxRate){
       this.hourlyRate = hourlyRate;
       this.insuranceRate = insuranceRate;
       this.taxRate = taxRate;
      
        
    }

    /**
     * No argument constructor with no body
     */
    public DoctorSalary(){
        
    }

    /**
     * Returns hourly pay rate of the doctor
     * @return hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets hourly pay rate of the doctor
     * @param hourlyRate Hourly pay rate
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Returns Insurance percentage of the doctor
     * @return insuranceRate
     */
    public double getInsuranceRate() {
        return insuranceRate;
    }

    /**
     * Sets Insurance percentage of the doctor
     * @param insuranceRate Insurance percentage
     */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    /**
     * Returns Tax percentage of the doctor
     * @return taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets Tax percentage of the doctor
     * @param taxRate Tax percentage
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * Returns total hours of work per week
     * @return HOURS
     */
    public int getHOURS() {
        return HOURS;
    }
    /**
     *  Calculates monthly salary of the doctor and returns the value
     * @return Monthly salary
     */
    public double calcMonthlySalary(){ 
       return hourlyRate*HOURS*4;
       
    }
    /**
     *  Calculates Monthly insurance of the doctor and returns the value
     * @return monthly Insurance of the doctor 
     */
    public double calcMonthlyInsurance(){
        return calcMonthlySalary()*insuranceRate/100;
    }
    /**
     * Calculates Annual Gross salary of the doctor and returns the value
     * @param bonus Bonus of the doctor
     * @return annual gross salary
     */
    public double calcAnnualGrossSalary(double bonus){
        return calcMonthlySalary()*12 + bonus;
    }
    /**
     * Calculates Annual net pay of the doctor and returns the value
     * @param bonus Bonus of the doctor
     * @return Annual net pay
     */
    public double calcAnnualNetPay(double bonus){
        return calcAnnualGrossSalary(bonus)-(taxRate*calcAnnualGrossSalary(bonus)/100)-(calcMonthlyInsurance()*12);
    }
    /**
     * Overrides the toString method and returns in specified pattern
     * @return Instance variables with values
     */
    @Override
    public String toString(){
        return "Hourly pay rate: $"+hourlyRate+", insurance rate: "+insuranceRate+
                "%, tax: "+ taxRate+"%, Hours per week: "+ HOURS;
    }
       
}
