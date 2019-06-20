/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import java.time.LocalDate;

/**
 *
 * @author jayra
 */
public class PartTimeEmployee extends Employee implements Payable{
    //declaring the variables
    private double hourlyRate;
    private double weeklyHours;
    private double c;
    
    //no argument constructor

    /**
     *
     */
    public PartTimeEmployee(){}
    
    //constructor with arguments that extends the super class as well

    /**
     *
     * @param hourlyRate
     * @param weeklyHours
     * @param id
     * @param name
     * @param day
     * @param month
     * @param year
     * @param Position
     */
    public PartTimeEmployee(double hourlyRate, double weeklyHours, int id, String name, int day, int month, int year, String Position) {
        super(id, name, day, month, year, Position);
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
    }
    // method to get the year of service of the employee

    /**
     *
     * @param dateOfEmployment
     * @return
     */
    public byte yearOfService(LocalDate dateOfEmployment){
        LocalDate currentDate =LocalDate.now();
        byte yos = (byte) ((currentDate.toEpochDay()- dateOfEmployment.toEpochDay())/365);
        return yos;
    }
    //getter method for Hours HourlyRate

    /**
     *
     * @return
     */
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    //getter method for WeeklyHours

    /**
     *
     * @return
     */
    public double getWeeklyHours() {
        return weeklyHours;
    }
    
    //method to get the annualPay

    /**
     *
     * @return
     */
    @Override
    public double annualPay(){
        double b = hourlyRate * weeklyHours * 50;
        return b = Math.round(b*100)/100.0;
        
    }
    
    //overriding the toString Method
    @Override
    public String toString(){
        return "Employee is PartTime; "+ "Id : " +getId()+" , Name : Xyz "  + " , Annual Salary is : $ " + annualPay();
    }

}
//end of code