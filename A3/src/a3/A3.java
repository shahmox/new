/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import java.util.*;

/**
 *
 * @author jayra
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //created an array list to add the objects of randomly generated employees
        ArrayList<Employee> g = new ArrayList<>(); 
        
        // ana array of 100 elements
        A3[] arr=new A3[100];
        
        //for loop
        for(int i=1; i<=arr.length; i++) // for loop
        {
            
            arr[0] = new A3();
            int ranf = (int) (Math.random()*10 + 1);
            double rands = Math.random()*36000 + 24000;// generating random salary
            rands = Math.round(rands*100)/100.0;
            
            double randsh = Math.random()*16 + 14;// generating random pay per hour
            double randsw = Math.random()*24 + 20;// generating random hours
            randsh = Math.round(randsh*100)/100.0;
            randsw = Math.round(randsw*100)/100.0;
            
            if(ranf>=6){
            Employee ft = new FullTimeEmployee(rands,i,"Xyz",06,06,2019,"xyz");
            // adding fulltimeemployee object in arraylist g
            g.add(ft);
            }
            
            if(ranf<=5){
            Employee pt = new PartTimeEmployee(randsh,randsw,i,"Xyz",06,06,2019,"xyz");
            // adding parttimeemployee object in arraylist g
            g.add(pt);
            }
        }
        Collections.sort(g, new EmployeeComparator()); // sorting the arraylist
          
        for(Employee d : g){
           System.out.println(d); // printing the employees after sorting them by salary
        }      
    }
}
// end of code