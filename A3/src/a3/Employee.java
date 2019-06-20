/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import java.time.*;

/**
 *
 * @author jayra
 */
//abstract class
public abstract class Employee {

    /**
     *
     */
    public int id;
    private String name;

    /**
     *
     */
    public LocalDate dateOfEmployment;
    private String Position;
    
    //no argument constructor

    /**
     *
     */
    public Employee(){}
    
    //constructor with arguments

    /**
     *
     * @param id
     * @param name
     * @param day
     * @param month
     * @param year
     * @param Position
     */
    public Employee(int id, String name,int day,int month,int year, String Position) {
        this.id = id;
        this.name = name;
        this.dateOfEmployment = LocalDate.of(year, day, month);
        this.Position = Position;
        
    }
    
    //getting Id

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }
    
    //getting name

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    //getting position

    /**
     *
     * @return
     */
    public String getPosition() {
        return Position;
    }
    
    //annualPay method

    /**
     *
     * @return
     */
    public abstract double annualPay();
    
    //overriding the toString method
    @Override
        public String toString(){
        return "Name : " + name + ", Id : "+ id + ", Position : " + Position+", Salary=" + annualPay() ;
    }
}
