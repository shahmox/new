/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import java.time.LocalDate;
//import java.time.Month;

/**
 *
 * @author jayra
 */
public class FullTimeEmployee  extends Employee implements Payable{
    //declaring the variables
    private double salary;
    
    //no argument constructor

    /**
     *
     */
    public FullTimeEmployee(){} 

    //constructor with arguments that extends the super class as well

    /**
     *
     * @param salary
     * @param id
     * @param name
     * @param day
     * @param month
     * @param year
     * @param Position
     */
    public FullTimeEmployee(double salary, int id, String name,int day,int month,int year, String Position) {
        super(id, name,day,month,year,Position);
        this.dateOfEmployment = LocalDate.of(year, day, month);
        this.salary = salary;
    }
    
    // method to get the year of service of the employee

    /**
     *
     * @param dateOfEmployment
     * @return
     */
    public byte yearOfService(LocalDate dateOfEmployment){
        LocalDate currentDate =LocalDate.now();
        byte yos = (byte) ((currentDate.toEpochDay()- dateOfEmployment.toEpochDay())*1.12/365);
        return yos;
    }    
    
    //getter method for Hours HourlyRate

    /**
     *
     * @return
     */
    @Override
    public double annualPay(){
        return salary;
    }
    // overriding toString method
    @Override
    public String toString(){
        return "Employee is FullTime; "+ "Id : " + getId() +" , Name : Xyz " + " , Annual Salary is : $ " + annualPay() ;
    }
}
//end of code